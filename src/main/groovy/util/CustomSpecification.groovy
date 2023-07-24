package util

import antlr4.CurlVisitor
import antlr4.ValidationVisitor
import model.ApiRequest
import model.TestCase
import model.CsvTestRow
import kong.unirest.HttpResponse
import spock.lang.Shared
import spock.lang.Specification

class CustomSpecification extends Specification {

    @Shared
    TestDataProcessor testDataProcessor
    @Shared
    FileUtils fileUtils
    @Shared
    def jsonBodyCurl
    @Shared
    PropertiesData propertiesData = new PropertiesData()
    @Shared
    String classname


    def setupSpec() {
        propertiesData.init()
        testDataProcessor = new TestDataProcessor(propertiesData)
        fileUtils = new FileUtils()
        // fileUtils.prepareFilePath(["TestUserGet.csv"])
        classname = this.getClass().getSimpleName()
        fileUtils.getFile(classname)
    }


    def "#csvTestRow.row.test_case_no: #csvTestRow.row.description - expected status #csvTestRow.row.response_status"(CsvTestRow csvTestRow) {
        given: "API request parameters"
        TestCase testCase = testDataProcessor.processTestCase(csvTestRow)

        when: "Send API request"
        ApiRequest apiRequest = testCase.apiRequest
        println apiRequest
        HttpResponse httpResponse = RequestExecutor.executeRequest(apiRequest)
        def jsonBody = JsonParser.toJson(httpResponse.getBody())

        if (testCase.requestCurl != "" && testCase.requestCurl != null) {
            ApiRequest curlRequest = CurlVisitor.parseCurl(testCase.requestCurl)
            HttpResponse curlResponse = RequestExecutor.executeRequest(curlRequest)
            jsonBodyCurl = JsonParser.toJson(curlResponse.getBody())
        }

        then: "Validate response"
        httpResponse.status == testCase.expectedStatus
        if (testCase.validation != null && testCase.validation != "") {
            if (testCase.requestCurl != "" && testCase.requestCurl != null)
                ValidationVisitor.validate(testCase.validation, jsonBody, jsonBodyCurl)
            else ValidationVisitor.validate(testCase.validation, jsonBody)
        }
        if (testCase.expectedResponseBody != null && testCase.expectedResponseBody != "")
            httpResponse.body == testCase.expectedResponseBody

        where:
        csvTestRow << fileUtils.readFile()
    }
}

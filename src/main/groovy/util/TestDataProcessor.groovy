package util

import model.ApiRequest
import model.TestCase
import model.CsvTestRow
import com.xlson.groovycsv.PropertyMapper
import org.apache.commons.lang3.StringUtils

class TestDataProcessor {
    private def headers
    PropertiesData propertiesData

    TestDataProcessor(PropertiesData propertiesData) {
        this.propertiesData = propertiesData
    }

    TestCase processTestCase(CsvTestRow csvTestRow) {
        headers = csvTestRow.headers
        PropertyMapper row = csvTestRow.row

        ApiRequest apiRequest = ApiRequest.builder()
                .url(getRowValue(row, "url"))
                .endPoint(getRowValue(row, "endpoint"))
                .method(getRowValue(row, "http_method"))
                .headerParams(getCellValueAsMap(getRowValue(row, "header_params")))
                .queryParams(getCellValueAsMap(getRowValue(row, "query_params")))
                .requestBody(getRowValue(row, "request_body"))
                .build()


        TestCase testCase = TestCase.builder()
                .testNo(getRowValue(row, "test_case_no"))
                .testDescription(getRowValue(row, "description"))
                .apiRequest(apiRequest)
                .expectedStatus(Integer.parseInt(getRowValue(row, "response_status")))
                .expectedResponseBody(getRowValue(row, "expected_response_body"))
                .validation(getRowValue(row, "validation"))
                .requestCurl(getRowValue(row, "request_curl"))
                .build()


        testCase
    }

    def getIgnore(CsvTestRow csvTestRow) {
        return getRowValue(csvTestRow.row, "ignore")
    }


    static def getRowValue(def row, String property) {
        try {
            row.propertyMissing(property)
        }
        catch (MissingPropertyException e) {
            null
        }
    }

    Map getCellValueAsMap(String input) {
        Map map = [:]
        if (StringUtils.isNotEmpty(input) && input != null) {
            String[] keys = input.split("\n|,")
            String key, value
            keys.each {
                if (it?.trim()) {
                    try {
                        if (it.endsWith(":")) {
                            key = it - ":"
                            map.put(key, StringUtils.EMPTY)
                        } else {
                            (key, value) = it.split(":", 2)
                            value = value.trim()
                            if ((value instanceof String) && value.startsWith("\$"))
                                value = replaceVariableWithValue(value)
                            map.put(key, value)
                        }
                    } catch (Exception ex) {
                        throw new Exception("Key mapping syntax error near :" + it)
                    }
                }
            }
        }
        map
    }


    def replaceVariableWithValue(String variable) {
        variable = variable.replaceAll("[{}\$]", "")
        propertiesData.getDataByKey(variable)
    }
}
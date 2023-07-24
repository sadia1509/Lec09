package  model

import groovy.transform.builder.Builder

@Builder
class TestCase {
    String testNo, testDescription, expectedResponseBody,
            validation, requestCurl
    ApiRequest apiRequest
    int expectedStatus
}

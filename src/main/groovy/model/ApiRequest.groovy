package model

import groovy.transform.builder.Builder

@Builder
class ApiRequest {
    String method, url, requestBody, endPoint
    Map headerParams, queryParams


    @Override
    String toString() {
        return "ApiRequest{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", requestBody='" + requestBody + '\'' +
                ", endPoint='" + endPoint + '\'' +
                ", headerParams=" + headerParams +
                ", queryParams=" + queryParams +
                '}';
    }
}

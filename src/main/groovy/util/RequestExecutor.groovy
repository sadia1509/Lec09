package util

import model.ApiRequest
import kong.unirest.HttpResponse
import kong.unirest.Unirest
import kong.unirest.UnirestInstance

class RequestExecutor {
    static HttpResponse executeRequest(ApiRequest apiRequest) {
        String url = apiRequest.getUrl(),
               method = apiRequest.getMethod(),
               requestBody = apiRequest.getRequestBody(),
               endPoint = apiRequest.getEndPoint()
        Map requestHeaders = apiRequest.getHeaderParams(),
            queryParameters = apiRequest.getQueryParams()

        HttpResponse httpResponse
        UnirestInstance unirestInstance = Unirest.spawnInstance()
        switch (method.toLowerCase()) {
            case 'get':
                httpResponse = get(unirestInstance, url, endPoint, requestHeaders, queryParameters)
                break
            case 'post':
                httpResponse = post(unirestInstance, url, requestHeaders, queryParameters, requestBody)
                break
            case 'put':
                httpResponse = put(unirestInstance, url, requestHeaders, queryParameters, requestBody)
                break
            case 'delete':
                httpResponse = delete(unirestInstance, url, requestHeaders, queryParameters)
                break
            default:
                throw new Exception("invalid request method: ${method}")
        }
        unirestInstance.shutDown()
        httpResponse
    }


    private static HttpResponse post(UnirestInstance unirestInstance, String url, Map requestHeaders,
                                     Map queryParameters, String requestBody) throws IOException {
        def response = unirestInstance.post(url)
                .headers(requestHeaders)
                .queryString(queryParameters)
                .body(requestBody)
                .asString()

        response
    }

    private static HttpResponse put(UnirestInstance unirestInstance, String url, Map requestHeaders,
                                    Map queryParameters, String requestBody) throws IOException {
        def response = unirestInstance.put(url)
                .headers(requestHeaders)
                .queryString(queryParameters)
                .body(requestBody)
                .asString()

        response
    }

    private static HttpResponse get(UnirestInstance unirestInstance, String url, String endPoint,
                                    Map requestHeaders, Map queryParameters) throws IOException {
        def response = unirestInstance.get(endPoint == null ? url : url + endPoint)
                .headers(requestHeaders)
                .queryString(queryParameters)
                .asString()

        response
    }

    private static HttpResponse delete(UnirestInstance unirestInstance, String url,
                                       Map requestHeaders, Map queryParameters) throws IOException {
        def response = unirestInstance.delete(url)
                .headers(requestHeaders)
                .queryString(queryParameters)
                .asString()

        response
    }
}

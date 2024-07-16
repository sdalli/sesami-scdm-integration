package com.sesami.sesamiscdmintegration.bank.bean;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

public class BankApiCustomResponse<T> {
    private ResponseEntity<T> responseEntity;
    private int statusCode;
    private HttpHeaders headers;
    private String request;
    private String body;

    public BankApiCustomResponse(int statusCode, HttpHeaders headers, String request, String body, ResponseEntity<T> responseEntity) {
        this.statusCode = statusCode;
        this.headers = headers;
        this.request = request;
        this.body = body;
        this.responseEntity = responseEntity;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public HttpHeaders getHeaders() {
        return headers;
    }

    public void setHeaders(HttpHeaders headers) {
        this.headers = headers;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ResponseEntity<T> getResponseEntity() {
        return responseEntity;
    }

    public void setResponseEntity(ResponseEntity<T> responseEntity) {
        this.responseEntity = responseEntity;
    }
}


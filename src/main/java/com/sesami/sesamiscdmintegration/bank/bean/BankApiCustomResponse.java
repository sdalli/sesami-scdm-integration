package com.sesami.sesamiscdmintegration.bank.bean;

import org.springframework.http.HttpHeaders;

public class BankApiCustomResponse {
    private int statusCode;
    private HttpHeaders headers;
    private String request;
    private String body;
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
	public BankApiCustomResponse(int statusCode, HttpHeaders httpHeaders, String request, String body) {
		super();
		this.statusCode = statusCode;
		this.headers = httpHeaders;
		this.request = request;
		this.body = body;
	}
	@Override
	public String toString() {
		return "BankApiCustomResponse [statusCode=" + statusCode + ", headers=" + headers + ", request=" + request
				+ ", body=" + body + "]";
	}
    

  


}

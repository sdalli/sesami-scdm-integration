package com.sesami.sesamiscdmintegration.bank.bean;

import java.util.List;


public class BankMasterListResponse {

	private List<BankMasterBean> bankMasterBeans;
    private String responseStatusCode;
    private String responseStatusMessage;
	public List<BankMasterBean> getBankMasterBeans() {
		return bankMasterBeans;
	}
	public void setBankMasterBeans(List<BankMasterBean> bankMasterBeans) {
		this.bankMasterBeans = bankMasterBeans;
	}
	public String getResponseStatusCode() {
		return responseStatusCode;
	}
	public void setResponseStatusCode(String responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}
	public String getResponseStatusMessage() {
		return responseStatusMessage;
	}
	public void setResponseStatusMessage(String responseStatusMessage) {
		this.responseStatusMessage = responseStatusMessage;
	}
	
    
    
}

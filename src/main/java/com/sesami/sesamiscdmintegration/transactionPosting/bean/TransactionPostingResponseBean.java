package com.sesami.sesamiscdmintegration.transactionPosting.bean;

public class TransactionPostingResponseBean {

	
	private String requestUniqueNumber;
	private String deviceId;
    private String bankCode;
	private String accountNumber;
    private String bankUniqueTransactionNumber;
    private String bankErrorCode;
    private String bankErrorDesc;
    private String bankApiResponseMessage;
    private int cdmApiCode;
    private String cdmCustomerErrorMessage;
    
    
    private String extraField1;
    private String extraField2;
    private String extraField3;
    private String extraField4;
    private String extraField5;
	public String getRequestUniqueNumber() {
		return requestUniqueNumber;
	}
	public void setRequestUniqueNumber(String requestUniqueNumber) {
		this.requestUniqueNumber = requestUniqueNumber;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankUniqueTransactionNumber() {
		return bankUniqueTransactionNumber;
	}
	public void setBankUniqueTransactionNumber(String bankUniqueTransactionNumber) {
		this.bankUniqueTransactionNumber = bankUniqueTransactionNumber;
	}
	public String getBankErrorCode() {
		return bankErrorCode;
	}
	public void setBankErrorCode(String bankErrorCode) {
		this.bankErrorCode = bankErrorCode;
	}
	public String getBankErrorDesc() {
		return bankErrorDesc;
	}
	public void setBankErrorDesc(String bankErrorDesc) {
		this.bankErrorDesc = bankErrorDesc;
	}
	public String getBankApiResponseMessage() {
		return bankApiResponseMessage;
	}
	public void setBankApiResponseMessage(String bankApiResponseMessage) {
		this.bankApiResponseMessage = bankApiResponseMessage;
	}
	public int getCdmApiCode() {
		return cdmApiCode;
	}
	public void setCdmApiCode(int cdmApiCode) {
		this.cdmApiCode = cdmApiCode;
	}
	public String getCdmCustomerErrorMessage() {
		return cdmCustomerErrorMessage;
	}
	public void setCdmCustomerErrorMessage(String cdmCustomerErrorMessage) {
		this.cdmCustomerErrorMessage = cdmCustomerErrorMessage;
	}
	public String getExtraField1() {
		return extraField1;
	}
	public void setExtraField1(String extraField1) {
		this.extraField1 = extraField1;
	}
	public String getExtraField2() {
		return extraField2;
	}
	public void setExtraField2(String extraField2) {
		this.extraField2 = extraField2;
	}
	public String getExtraField3() {
		return extraField3;
	}
	public void setExtraField3(String extraField3) {
		this.extraField3 = extraField3;
	}
	public String getExtraField4() {
		return extraField4;
	}
	public void setExtraField4(String extraField4) {
		this.extraField4 = extraField4;
	}
	public String getExtraField5() {
		return extraField5;
	}
	public void setExtraField5(String extraField5) {
		this.extraField5 = extraField5;
	}
	
	
	public TransactionPostingResponseBean() {
		super();
	}
	public TransactionPostingResponseBean(String requestUniqueNumber, String deviceId, String bankCode,
			String accountNumber, String bankUniqueTransactionNumber, String bankErrorCode, String bankErrorDesc,
			String bankApiResponseMessage, int cdmApiCode, String cdmCustomerErrorMessage, String extraField1,
			String extraField2, String extraField3, String extraField4, String extraField5) {
		super();
		this.requestUniqueNumber = requestUniqueNumber;
		this.deviceId = deviceId;
		this.bankCode = bankCode;
		this.accountNumber = accountNumber;
		this.bankUniqueTransactionNumber = bankUniqueTransactionNumber;
		this.bankErrorCode = bankErrorCode;
		this.bankErrorDesc = bankErrorDesc;
		this.bankApiResponseMessage = bankApiResponseMessage;
		this.cdmApiCode = cdmApiCode;
		this.cdmCustomerErrorMessage = cdmCustomerErrorMessage;
		this.extraField1 = extraField1;
		this.extraField2 = extraField2;
		this.extraField3 = extraField3;
		this.extraField4 = extraField4;
		this.extraField5 = extraField5;
	}
	
	
}

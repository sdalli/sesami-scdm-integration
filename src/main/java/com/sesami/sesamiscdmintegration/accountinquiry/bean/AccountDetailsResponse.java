package com.sesami.sesamiscdmintegration.accountinquiry.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter
//@Getter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class AccountDetailsResponse {
    
	private String requestUniqueNumber;
	private String accountNumber;
    private String accountHolderName;
    private String accountType;
    private String dailyDepositLimit;
    private String monthtlyTransactionLimit;
    private String currencyCode;
    private String accountStatus;
    private Boolean depositAllowed;
    private String bankErrorCode;
    private String bankErrorDesc;
    private String bankApiResponseMessage;
    private int cdmApiCode;
    private String cdmCustomerErrorMessage;
    
    
	public String getRequestUniqueNumber() {
		return requestUniqueNumber;
	}
	public void setRequestUniqueNumber(String requestUniqueNumber) {
		this.requestUniqueNumber = requestUniqueNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getDailyDepositLimit() {
		return dailyDepositLimit;
	}
	public void setDailyDepositLimit(String dailyDepositLimit) {
		this.dailyDepositLimit = dailyDepositLimit;
	}
	public String getMonthtlyTransactionLimit() {
		return monthtlyTransactionLimit;
	}
	public void setMonthtlyTransactionLimit(String monthtlyTransactionLimit) {
		this.monthtlyTransactionLimit = monthtlyTransactionLimit;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public Boolean getDepositAllowed() {
		return depositAllowed;
	}
	public void setDepositAllowed(Boolean depositAllowed) {
		this.depositAllowed = depositAllowed;
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
	@Override
	public String toString() {
		return "AccountDetailsResponse [requestUniqueNumber=" + requestUniqueNumber + ", accountNumber=" + accountNumber
				+ ", accountHolderName=" + accountHolderName + ", accountType=" + accountType + ", dailyDepositLimit="
				+ dailyDepositLimit + ", monthtlyTransactionLimit=" + monthtlyTransactionLimit + ", currencyCode="
				+ currencyCode + ", accountStatus=" + accountStatus + ", depositAllowed=" + depositAllowed
				+ ", bankErrorCode=" + bankErrorCode + ", bankErrorDesc=" + bankErrorDesc + ", bankApiResponseMessage="
				+ bankApiResponseMessage + ", cdmApiCode=" + cdmApiCode + ", cdmCustomerErrorMessage="
				+ cdmCustomerErrorMessage + "]";
	}
	public AccountDetailsResponse(String requestUniqueNumber, String accountNumber, String accountHolderName,
			String accountType, String dailyDepositLimit, String monthtlyTransactionLimit, String currencyCode,
			String accountStatus, Boolean depositAllowed, String bankErrorCode, String bankErrorDesc,
			String bankApiResponseMessage, int cdmApiCode, String cdmCustomerErrorMessage) {
		super();
		this.requestUniqueNumber = requestUniqueNumber;
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.dailyDepositLimit = dailyDepositLimit;
		this.monthtlyTransactionLimit = monthtlyTransactionLimit;
		this.currencyCode = currencyCode;
		this.accountStatus = accountStatus;
		this.depositAllowed = depositAllowed;
		this.bankErrorCode = bankErrorCode;
		this.bankErrorDesc = bankErrorDesc;
		this.bankApiResponseMessage = bankApiResponseMessage;
		this.cdmApiCode = cdmApiCode;
		this.cdmCustomerErrorMessage = cdmCustomerErrorMessage;
	}
	public AccountDetailsResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}


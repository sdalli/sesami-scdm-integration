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
    private String yearlyTransactionLimit;
    private String cifNumber;
    private String bankPaymentId;
    private String currencyCode;
    private String accountStatus;
    private Boolean depositAllowed;
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
	public String getYearlyTransactionLimit() {
		return yearlyTransactionLimit;
	}
	public void setYearlyTransactionLimit(String yearlyTransactionLimit) {
		this.yearlyTransactionLimit = yearlyTransactionLimit;
	}
	public String getCifNumber() {
		return cifNumber;
	}
	public void setCifNumber(String cifNumber) {
		this.cifNumber = cifNumber;
	}
	public String getBankPaymentId() {
		return bankPaymentId;
	}
	public void setBankPaymentId(String bankPaymentId) {
		this.bankPaymentId = bankPaymentId;
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
	@Override
	public String toString() {
		return "AccountDetailsResponse [requestUniqueNumber=" + requestUniqueNumber + ", accountNumber=" + accountNumber
				+ ", accountHolderName=" + accountHolderName + ", accountType=" + accountType + ", dailyDepositLimit="
				+ dailyDepositLimit + ", monthtlyTransactionLimit=" + monthtlyTransactionLimit
				+ ", yearlyTransactionLimit=" + yearlyTransactionLimit + ", cifNumber=" + cifNumber + ", bankPaymentId="
				+ bankPaymentId + ", currencyCode=" + currencyCode + ", accountStatus=" + accountStatus
				+ ", depositAllowed=" + depositAllowed + ", bankErrorCode=" + bankErrorCode + ", bankErrorDesc="
				+ bankErrorDesc + ", bankApiResponseMessage=" + bankApiResponseMessage + ", cdmApiCode=" + cdmApiCode
				+ ", cdmCustomerErrorMessage=" + cdmCustomerErrorMessage + ", extraField1=" + extraField1
				+ ", extraField2=" + extraField2 + ", extraField3=" + extraField3 + ", extraField4=" + extraField4
				+ ", extraField5=" + extraField5 + "]";
	}
	public AccountDetailsResponse(String requestUniqueNumber, String accountNumber, String accountHolderName,
			String accountType, String dailyDepositLimit, String monthtlyTransactionLimit,
			String yearlyTransactionLimit, String cifNumber, String bankPaymentId, String currencyCode,
			String accountStatus, Boolean depositAllowed, String bankErrorCode, String bankErrorDesc,
			String bankApiResponseMessage, int cdmApiCode, String cdmCustomerErrorMessage, String extraField1,
			String extraField2, String extraField3, String extraField4, String extraField5) {
		super();
		this.requestUniqueNumber = requestUniqueNumber;
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.dailyDepositLimit = dailyDepositLimit;
		this.monthtlyTransactionLimit = monthtlyTransactionLimit;
		this.yearlyTransactionLimit = yearlyTransactionLimit;
		this.cifNumber = cifNumber;
		this.bankPaymentId = bankPaymentId;
		this.currencyCode = currencyCode;
		this.accountStatus = accountStatus;
		this.depositAllowed = depositAllowed;
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
	public AccountDetailsResponse() {
		super();
	}
    
    
    
   
}


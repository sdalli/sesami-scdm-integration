package com.sesami.sesamiscdmintegration.transactionPosting.bean;

public class TransactionPostingRequestBean {

	
	private String requestUniqueNumber;
	private String deviceId;
    private String bankCode;
    private String glAccountNumber;
    
	private String accountNumber;
    private String accountHolderName;
    private String accountType;
    private String dailyDepositLimit;
    private String monthtlyTransactionLimit;
    private String yearlyTransactionLimit;
    private String cifNumber;
    private String bankPaymentId;
   
    private String accountStatus;
    private String customerNarration;
    private String eidNo;
    private String eidName;
    private String eidExpiryDate;
    private String eiddateofBirth;
    private String nationality;
    
    private String currencyCode;
    private String depositAmount;
    private String currencyDenominationDetails;
    
	
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
	public String getGlAccountNumber() {
		return glAccountNumber;
	}
	public void setGlAccountNumber(String glAccountNumber) {
		this.glAccountNumber = glAccountNumber;
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
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getCustomerNarration() {
		return customerNarration;
	}
	public void setCustomerNarration(String customerNarration) {
		this.customerNarration = customerNarration;
	}
	public String getEidNo() {
		return eidNo;
	}
	public void setEidNo(String eidNo) {
		this.eidNo = eidNo;
	}
	public String getEidName() {
		return eidName;
	}
	public void setEidName(String eidName) {
		this.eidName = eidName;
	}
	public String getEidExpiryDate() {
		return eidExpiryDate;
	}
	public void setEidExpiryDate(String eidExpiryDate) {
		this.eidExpiryDate = eidExpiryDate;
	}
	public String getEiddateofBirth() {
		return eiddateofBirth;
	}
	public void setEiddateofBirth(String eiddateofBirth) {
		this.eiddateofBirth = eiddateofBirth;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}
	public String getCurrencyDenominationDetails() {
		return currencyDenominationDetails;
	}
	public void setCurrencyDenominationDetails(String currencyDenominationDetails) {
		this.currencyDenominationDetails = currencyDenominationDetails;
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
		return "TransactionPostingRequestBean [requestUniqueNumber=" + requestUniqueNumber + ", deviceId=" + deviceId
				+ ", bankCode=" + bankCode + ", glAccountNumber=" + glAccountNumber + ", accountNumber=" + accountNumber
				+ ", accountHolderName=" + accountHolderName + ", accountType=" + accountType + ", dailyDepositLimit="
				+ dailyDepositLimit + ", monthtlyTransactionLimit=" + monthtlyTransactionLimit
				+ ", yearlyTransactionLimit=" + yearlyTransactionLimit + ", cifNumber=" + cifNumber + ", bankPaymentId="
				+ bankPaymentId + ", accountStatus=" + accountStatus + ", customerNarration=" + customerNarration
				+ ", eidNo=" + eidNo + ", eidName=" + eidName + ", eidExpiryDate=" + eidExpiryDate + ", eiddateofBirth="
				+ eiddateofBirth + ", nationality=" + nationality + ", currencyCode=" + currencyCode
				+ ", depositAmount=" + depositAmount + ", currencyDenominationDetails=" + currencyDenominationDetails
				+ ", extraField1=" + extraField1 + ", extraField2=" + extraField2 + ", extraField3=" + extraField3
				+ ", extraField4=" + extraField4 + ", extraField5=" + extraField5 + "]";
	}
	public TransactionPostingRequestBean(String requestUniqueNumber, String deviceId, String bankCode,
			String glAccountNumber, String accountNumber, String accountHolderName, String accountType,
			String dailyDepositLimit, String monthtlyTransactionLimit, String yearlyTransactionLimit, String cifNumber,
			String bankPaymentId, String accountStatus, String customerNarration, String eidNo, String eidName,
			String eidExpiryDate, String eiddateofBirth, String nationality, String currencyCode, String depositAmount,
			String currencyDenominationDetails, String extraField1, String extraField2, String extraField3,
			String extraField4, String extraField5) {
		super();
		this.requestUniqueNumber = requestUniqueNumber;
		this.deviceId = deviceId;
		this.bankCode = bankCode;
		this.glAccountNumber = glAccountNumber;
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.dailyDepositLimit = dailyDepositLimit;
		this.monthtlyTransactionLimit = monthtlyTransactionLimit;
		this.yearlyTransactionLimit = yearlyTransactionLimit;
		this.cifNumber = cifNumber;
		this.bankPaymentId = bankPaymentId;
		this.accountStatus = accountStatus;
		this.customerNarration = customerNarration;
		this.eidNo = eidNo;
		this.eidName = eidName;
		this.eidExpiryDate = eidExpiryDate;
		this.eiddateofBirth = eiddateofBirth;
		this.nationality = nationality;
		this.currencyCode = currencyCode;
		this.depositAmount = depositAmount;
		this.currencyDenominationDetails = currencyDenominationDetails;
		this.extraField1 = extraField1;
		this.extraField2 = extraField2;
		this.extraField3 = extraField3;
		this.extraField4 = extraField4;
		this.extraField5 = extraField5;
	}
	public TransactionPostingRequestBean() {
		super();
	}
	
	
}

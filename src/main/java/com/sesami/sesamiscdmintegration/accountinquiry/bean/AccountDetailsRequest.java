package com.sesami.sesamiscdmintegration.accountinquiry.bean;

//import lombok.*;

//@Setter
//@Getter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class AccountDetailsRequest {
    private String accountNumber;
    private String deviceId;
    private String bankCode;
    private String glAccountNumber;
    private String extraField1;
    private String extraField2;
    private String extraField3;
    private String extraField4;
    private String extraField5;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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
		return "AccountDetailsRequest [accountNumber=" + accountNumber + ", deviceId=" + deviceId + ", bankCode="
				+ bankCode + ", glAccountNumber=" + glAccountNumber + ", extraField1=" + extraField1 + ", extraField2="
				+ extraField2 + ", extraField3=" + extraField3 + ", extraField4=" + extraField4 + ", extraField5="
				+ extraField5 + "]";
	}
	public AccountDetailsRequest() {
		super();
	}
	public AccountDetailsRequest(String accountNumber, String deviceId, String bankCode, String glAccountNumber,
			String extraField1, String extraField2, String extraField3, String extraField4, String extraField5) {
		super();
		this.accountNumber = accountNumber;
		this.deviceId = deviceId;
		this.bankCode = bankCode;
		this.glAccountNumber = glAccountNumber;
		this.extraField1 = extraField1;
		this.extraField2 = extraField2;
		this.extraField3 = extraField3;
		this.extraField4 = extraField4;
		this.extraField5 = extraField5;
	}
    
	

  
}


package com.sesami.sesamiscdmintegration.accountinquiry.bean;

import lombok.*;

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
	@Override
	public String toString() {
		return "AccountDetailsRequest [accountNumber=" + accountNumber + ", deviceId=" + deviceId + ", bankCode="
				+ bankCode + ", glAccountNumber=" + glAccountNumber + "]";
	}
	public AccountDetailsRequest(String accountNumber, String deviceId, String bankCode, String glAccountNumber) {
		super();
		this.accountNumber = accountNumber;
		this.deviceId = deviceId;
		this.bankCode = bankCode;
		this.glAccountNumber = glAccountNumber;
	}
	public AccountDetailsRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

  
}


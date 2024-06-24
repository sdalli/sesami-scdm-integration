package com.sesami.sesamiscdmintegration.cbd.accountInquiryBean;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AcctType {
	@JsonProperty("AcctTypeCode")
    private String AcctTypeCode;
	@JsonProperty("AcctTypeValue")
    private String AcctTypeValue;

    // Getters and Setters
    public String getAcctTypeCode() {
        return AcctTypeCode;
    }

    public void setAcctTypeCode(String acctTypeCode) {
        this.AcctTypeCode = acctTypeCode;
    }

    public String getAcctTypeValue() {
        return AcctTypeValue;
    }

    public void setAcctTypeValue(String acctTypeValue) {
        this.AcctTypeValue = acctTypeValue;
    }
}


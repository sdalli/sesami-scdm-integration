package com.sesami.sesamiscdmintegration.cbd.accountInquiryBean;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CurCode {
	@JsonProperty("CurCodeType")
    private String CurCodeType;
	@JsonProperty("CurCodeValue")
    private String CurCodeValue;

    // Getters and Setters
    public String getCurCodeType() {
        return CurCodeType;
    }

    public void setCurCodeType(String curCodeType) {
        this.CurCodeType = curCodeType;
    }

    public String getCurCodeValue() {
        return CurCodeValue;
    }

    public void setCurCodeValue(String curCodeValue) {
        this.CurCodeValue = curCodeValue;
    }
}

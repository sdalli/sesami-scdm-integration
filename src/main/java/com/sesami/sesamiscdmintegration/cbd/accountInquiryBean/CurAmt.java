package com.sesami.sesamiscdmintegration.cbd.accountInquiryBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurAmt {
	@JsonProperty("Amt")
    private String Amt;
    @JsonProperty("CurCode")
    private CurCode CurCode;

    // Getters and Setters
    public String getAmt() {
        return Amt;
    }

    public void setAmt(String amt) {
        this.Amt = amt;
    }

    public CurCode getCurCode() {
        return CurCode;
    }

    public void setCurCode(CurCode curCode) {
        this.CurCode = curCode;
    }
}


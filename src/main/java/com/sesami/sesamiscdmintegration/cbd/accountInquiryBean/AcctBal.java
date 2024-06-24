package com.sesami.sesamiscdmintegration.cbd.accountInquiryBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AcctBal {
	@JsonProperty("BalType")
    private String BalType;
	@JsonProperty("CurAmt")
    private CurAmt CurAmt;

    // Getters and Setters
    public String getBalType() {
        return BalType;
    }

    public void setBalType(String balType) {
        this.BalType = balType;
    }

    public CurAmt getCurAmt() {
        return CurAmt;
    }

    public void setCurAmt(CurAmt curAmt) {
        this.CurAmt = curAmt;
    }
}

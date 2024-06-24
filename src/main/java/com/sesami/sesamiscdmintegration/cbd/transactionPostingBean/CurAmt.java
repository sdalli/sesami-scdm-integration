package com.sesami.sesamiscdmintegration.cbd.transactionPostingBean;


import com.fasterxml.jackson.annotation.JsonProperty;

public class CurAmt {
    @JsonProperty("Amt")
    private double amt;

    @JsonProperty("CurCode")
    private String curCode;

    // Getters and Setters
    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    public String getCurCode() {
        return curCode;
    }

    public void setCurCode(String curCode) {
        this.curCode = curCode;
    }
}

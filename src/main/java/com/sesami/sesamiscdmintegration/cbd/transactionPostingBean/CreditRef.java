package com.sesami.sesamiscdmintegration.cbd.transactionPostingBean;


import com.fasterxml.jackson.annotation.JsonProperty;

public class CreditRef {
    @JsonProperty("CurAmt")
    private CurAmt curAmt;

    // Getters and Setters
    public CurAmt getCurAmt() {
        return curAmt;
    }

    public void setCurAmt(CurAmt curAmt) {
        this.curAmt = curAmt;
    }
}


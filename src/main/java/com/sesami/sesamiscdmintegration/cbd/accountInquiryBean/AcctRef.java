package com.sesami.sesamiscdmintegration.cbd.accountInquiryBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AcctRef {
	@JsonProperty("AcctKeys")
    private AcctKeys AcctKeys;
	@JsonProperty("AcctRec")
    private AcctRec AcctRec;
	@JsonProperty("AcctInfo")
    private AcctInfo AcctInfo;

    // Getters and Setters
    public AcctKeys getAcctKeys() {
        return AcctKeys;
    }

    public void setAcctKeys(AcctKeys acctKeys) {
        this.AcctKeys = acctKeys;
    }

    public AcctRec getAcctRec() {
        return AcctRec;
    }

    public void setAcctRec(AcctRec acctRec) {
        this.AcctRec = acctRec;
    }

    public AcctInfo getAcctInfo() {
        return AcctInfo;
    }

    public void setAcctInfo(AcctInfo acctInfo) {
        this.AcctInfo = acctInfo;
    }
}


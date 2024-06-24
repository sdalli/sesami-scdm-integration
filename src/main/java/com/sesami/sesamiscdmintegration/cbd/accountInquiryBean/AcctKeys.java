package com.sesami.sesamiscdmintegration.cbd.accountInquiryBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AcctKeys {
	@JsonProperty("AcctId")
    private String AcctId;

    // Getters and Setters
    public String getAcctId() {
        return AcctId;
    }

    public void setAcctId(String acctId) {
        this.AcctId = acctId;
    }
}


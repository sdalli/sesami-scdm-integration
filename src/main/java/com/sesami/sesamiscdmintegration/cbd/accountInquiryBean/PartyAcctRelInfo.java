package com.sesami.sesamiscdmintegration.cbd.accountInquiryBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PartyAcctRelInfo {
	@JsonProperty("AcctRef")
    private AcctRef AcctRef;

    // Getters and Setters
    public AcctRef getAcctRef() {
        return AcctRef;
    }

    public void setAcctRef(AcctRef acctRef) {
        this.AcctRef = acctRef;
    }
}


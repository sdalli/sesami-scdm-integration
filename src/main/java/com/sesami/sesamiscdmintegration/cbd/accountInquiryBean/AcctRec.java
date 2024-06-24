package com.sesami.sesamiscdmintegration.cbd.accountInquiryBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AcctRec {
	@JsonProperty("AcctStatus")
    private AcctStatus AcctStatus;

    // Getters and Setters
    public AcctStatus getAcctStatus() {
        return AcctStatus;
    }

    public void setAcctStatus(AcctStatus acctStatus) {
        this.AcctStatus = acctStatus;
    }
}

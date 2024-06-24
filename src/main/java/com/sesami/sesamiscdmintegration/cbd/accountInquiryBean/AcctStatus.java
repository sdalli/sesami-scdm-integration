package com.sesami.sesamiscdmintegration.cbd.accountInquiryBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AcctStatus {
	@JsonProperty("AcctStatusCode")
    private String AcctStatusCode;

    // Getters and Setters
    public String getAcctStatusCode() {
        return AcctStatusCode;
    }

    public void setAcctStatusCode(String acctStatusCode) {
        this.AcctStatusCode = acctStatusCode;
    }
}


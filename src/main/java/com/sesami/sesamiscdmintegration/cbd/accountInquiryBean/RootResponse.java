package com.sesami.sesamiscdmintegration.cbd.accountInquiryBean;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RootResponse {
	 @JsonProperty("PartyAcctRelInqRs")
    private PartyAcctRelInqRs PartyAcctRelInqRs;

    // Getters and Setters
    public PartyAcctRelInqRs getPartyAcctRelInqRs() {
        return PartyAcctRelInqRs;
    }

    public void setPartyAcctRelInqRs(PartyAcctRelInqRs partyAcctRelInqRs) {
        this.PartyAcctRelInqRs = partyAcctRelInqRs;
    }
}


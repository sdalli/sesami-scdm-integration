package com.sesami.sesamiscdmintegration.cbd.accountInquiryBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PartyAcctRelRec {
	@JsonProperty("PartyAcctRelInfo")
	private PartyAcctRelInfo PartyAcctRelInfo;

	// Getters and Setters
	public PartyAcctRelInfo getPartyAcctRelInfo() {
		return PartyAcctRelInfo;
	}

	public void setPartyAcctRelInfo(PartyAcctRelInfo partyAcctRelInfo) {
		this.PartyAcctRelInfo = partyAcctRelInfo;
	}
}

package com.sesami.sesamiscdmintegration.cbd.accountInquiryBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PartyAcctRelInqRs {
	@JsonProperty("Status")
	private Status Status;
	@JsonProperty("RqUID")
	private String RqUID;

	@JsonProperty("PartyAcctRelRec")
	private PartyAcctRelRec PartyAcctRelRec;

	// Getters and Setters
	public Status getStatus() {
		return Status;
	}

	public void setStatus(Status status) {
		this.Status = status;
	}

	public String getRqUID() {
		return RqUID;
	}

	public void setRqUID(String rqUID) {
		this.RqUID = rqUID;
	}

	public PartyAcctRelRec getPartyAcctRelRec() {
		return PartyAcctRelRec;
	}

	public void setPartyAcctRelRec(PartyAcctRelRec partyAcctRelRec) {
		this.PartyAcctRelRec = partyAcctRelRec;
	}
}

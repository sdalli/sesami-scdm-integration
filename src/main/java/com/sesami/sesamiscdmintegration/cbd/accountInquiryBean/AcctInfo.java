package com.sesami.sesamiscdmintegration.cbd.accountInquiryBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AcctInfo {
	@JsonProperty("CurCode")
    private CurCode CurCode;
	@JsonProperty("AcctType")
    private AcctType AcctType;
	@JsonProperty("AcctTitle")
    private String AcctTitle;
	@JsonProperty("AcctBal")
    private AcctBal AcctBal;
	@JsonProperty("Segmentation")
    private Segmentation Segmentation;

    // Getters and Setters
    public CurCode getCurCode() {
        return CurCode;
    }

    public void setCurCode(CurCode curCode) {
        this.CurCode = curCode;
    }

    public AcctType getAcctType() {
        return AcctType;
    }

    public void setAcctType(AcctType acctType) {
        this.AcctType = acctType;
    }

    public String getAcctTitle() {
        return AcctTitle;
    }

    public void setAcctTitle(String acctTitle) {
        this.AcctTitle = acctTitle;
    }

    public AcctBal getAcctBal() {
        return AcctBal;
    }

    public void setAcctBal(AcctBal acctBal) {
        this.AcctBal = acctBal;
    }

    public Segmentation getSegmentation() {
        return Segmentation;
    }

    public void setSegmentation(Segmentation segmentation) {
        this.Segmentation = segmentation;
    }
}


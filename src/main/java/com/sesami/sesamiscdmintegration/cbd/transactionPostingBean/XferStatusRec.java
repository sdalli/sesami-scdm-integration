package com.sesami.sesamiscdmintegration.cbd.transactionPostingBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class XferStatusRec {
    @JsonProperty("XferStatusCode")
    private String xferStatusCode;

    @JsonProperty("XferStatusDesc")
    private String xferStatusDesc;

    // Getters and Setters
    public String getXferStatusCode() {
        return xferStatusCode;
    }

    public void setXferStatusCode(String xferStatusCode) {
        this.xferStatusCode = xferStatusCode;
    }

    public String getXferStatusDesc() {
        return xferStatusDesc;
    }

    public void setXferStatusDesc(String xferStatusDesc) {
        this.xferStatusDesc = xferStatusDesc;
    }
}


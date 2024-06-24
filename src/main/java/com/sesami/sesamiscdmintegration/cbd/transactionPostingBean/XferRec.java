package com.sesami.sesamiscdmintegration.cbd.transactionPostingBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class XferRec {
    @JsonProperty("XferInfo")
    private XferInfo xferInfo;

    // Getters and Setters
    public XferInfo getXferInfo() {
        return xferInfo;
    }

    public void setXferInfo(XferInfo xferInfo) {
        this.xferInfo = xferInfo;
    }
}


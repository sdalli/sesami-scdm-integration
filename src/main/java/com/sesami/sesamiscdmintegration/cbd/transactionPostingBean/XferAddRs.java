package com.sesami.sesamiscdmintegration.cbd.transactionPostingBean;


import com.fasterxml.jackson.annotation.JsonProperty;

public class XferAddRs {
    @JsonProperty("Status")
    private Status status;

    @JsonProperty("RqUID")
    private String rqUID;

    @JsonProperty("XferRec")
    private XferRec xferRec;

    @JsonProperty("XferStatusRec")
    private XferStatusRec xferStatusRec;

    // Getters and Setters
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getRqUID() {
        return rqUID;
    }

    public void setRqUID(String rqUID) {
        this.rqUID = rqUID;
    }

    public XferRec getXferRec() {
        return xferRec;
    }

    public void setXferRec(XferRec xferRec) {
        this.xferRec = xferRec;
    }

    public XferStatusRec getXferStatusRec() {
        return xferStatusRec;
    }

    public void setXferStatusRec(XferStatusRec xferStatusRec) {
        this.xferStatusRec = xferStatusRec;
    }
}


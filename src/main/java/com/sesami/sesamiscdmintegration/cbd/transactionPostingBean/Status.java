package com.sesami.sesamiscdmintegration.cbd.transactionPostingBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {
    @JsonProperty("StatusCode")
    private int statusCode;

    @JsonProperty("Severity")
    private String severity;

    @JsonProperty("StatusDesc")
    private String statusDesc;

    // Getters and Setters
    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }
}


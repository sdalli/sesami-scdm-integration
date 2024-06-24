package com.sesami.sesamiscdmintegration.cbd.accountInquiryBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {
	@JsonProperty("StatusCode")
    private String StatusCode;
	@JsonProperty("Severity")
    private String Severity;
	@JsonProperty("StatusDesc")
    private String StatusDesc;

    // Getters and Setters
    public String getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(String statusCode) {
        this.StatusCode = statusCode;
    }

    public String getSeverity() {
        return Severity;
    }

    public void setSeverity(String severity) {
        this.Severity = severity;
    }

    public String getStatusDesc() {
        return StatusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.StatusDesc = statusDesc;
    }
}


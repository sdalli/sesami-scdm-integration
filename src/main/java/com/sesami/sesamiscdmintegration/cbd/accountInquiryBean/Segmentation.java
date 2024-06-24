package com.sesami.sesamiscdmintegration.cbd.accountInquiryBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Segmentation {
	@JsonProperty("SegmentCode")
    private String SegmentCode;
	@JsonProperty("SegmentDesc")
    private String SegmentDesc;

    // Getters and Setters
    public String getSegmentCode() {
        return SegmentCode;
    }

    public void setSegmentCode(String segmentCode) {
        this.SegmentCode = segmentCode;
    }

    public String getSegmentDesc() {
        return SegmentDesc;
    }

    public void setSegmentDesc(String segmentDesc) {
        this.SegmentDesc = segmentDesc;
    }
}


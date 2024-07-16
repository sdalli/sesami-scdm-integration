package com.sesami.sesamiscdmintegration.cbd.transactionPostingBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CbdTransactionPostServiceRootResponse {
    @JsonProperty("XferAddRs")
    private XferAddRs xferAddRs;

    // Getters and Setters
    public XferAddRs getXferAddRs() {
        return xferAddRs;
    }

    public void setXferAddRs(XferAddRs xferAddRs) {
        this.xferAddRs = xferAddRs;
    }
}

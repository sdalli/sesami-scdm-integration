package com.sesami.sesamiscdmintegration.cbd.transactionPostingBean;


import com.fasterxml.jackson.annotation.JsonProperty;

public class XferInfo {
    @JsonProperty("DebitRef")
    private DebitRef debitRef;

    @JsonProperty("CreditRef")
    private CreditRef creditRef;

    @JsonProperty("RefData")
    private RefData refData;

    // Getters and Setters
    public DebitRef getDebitRef() {
        return debitRef;
    }

    public void setDebitRef(DebitRef debitRef) {
        this.debitRef = debitRef;
    }

    public CreditRef getCreditRef() {
        return creditRef;
    }

    public void setCreditRef(CreditRef creditRef) {
        this.creditRef = creditRef;
    }

    public RefData getRefData() {
        return refData;
    }

    public void setRefData(RefData refData) {
        this.refData = refData;
    }
}


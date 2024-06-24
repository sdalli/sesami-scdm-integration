package com.sesami.sesamiscdmintegration.accountinquiry.bean;

import java.util.ArrayList;

public class BankMasterBean {

	 	public String name;
	    public String logo;
	    public boolean enableAccountDeposit;
	    public boolean enableCreditCardBillPayment;
	    public boolean enableManualAccountEntry;
	    public boolean enableAccountFromDebitCard;
	    public boolean enableEIDValidation;
	    public boolean enableEIDOnlineValidation;
	    public boolean enableNarrationEntry;
	    public boolean enablePayinAmountEntry;
	    public boolean enableCardBasedCreditCard;
	    public boolean enableManualCreditCardEntry;
	    public boolean checkAccountNumberLength;
	    public int accountNumberLength;
	    public ArrayList<AdditionalInputBean> additionalInputs;
}

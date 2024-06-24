package com.sesami.sesamiscdmintegration.bank.bean;


public class BankMasterBean {


	private String bankName;
	private String bankCode;
	
	private boolean isBankEnable;
	private String bankGlAccountNo;
	// Account deposit service
	public boolean enableAccountDeposit;
	
	public boolean enableManualAccountEntry;
	private boolean accountNumberLengthValidationRequired;
	private String accountNumberManualInput;
	
	// EIDA 
	private boolean eidValidationRequired;
	private int eidGracePeriodInNoOfDays;
	private boolean eidOnlineValidationRequired;
	private boolean eidValidationConfirmationScreenRequired;
	//
	
	private boolean accountNumberReadFromDebitCardOnlineRequired;
	// Narration
	private boolean customerNarrationRequired;
	private String customerNarrationLabelName;
	private boolean isCustomerNarrationInputAlphaNumerice;
	
	// Credit Card 
	private boolean creditCardPaymentServiceRequired;
	private boolean isCreditCardNumberReadFromCardReaderRequired;

	private boolean isBankLogoRequired;
	public String logoFileName;
	private String bankLogoHeaderValue;
	private String bankLogoFooterValue;
	
	private String extraField1;
	private String extraField2;
	private String extraField3;
	private String extraField4;
	private String extraField5;
	
	
	
	



}

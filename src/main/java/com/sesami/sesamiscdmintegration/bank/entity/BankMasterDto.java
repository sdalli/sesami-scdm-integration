package com.sesami.sesamiscdmintegration.bank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cc_bank_master")
public class BankMasterDto {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bankMasterId;
	// Bank details
	private String bankName;
	private String bankCode;
	private String isBankEnable;
	private String bankGlAccountNo;
	
	// Bank Branch Master details
	
	private String deviceId;
	
	private long locationId;
	
	private long glAccountNumber;
	
	
	// Account deposit service
	public String enableAccountDeposit;
	
	public String enableManualAccountEntry;
	private String accountNumberLengthValidationRequired;
	private String accountNumberManualInput;
	
	//  Bank account setup master
	private int minimum;
	
	private int maximum;
	
	private int accountLength;
	
	
	// EIDA 
	private String eidValidationRequired;
	private int eidGracePeriodInNoOfDays;
	private String eidOnlineValidationRequired;
	private String eidValidationConfirmationScreenRequired;
	//
	
	private String accountNumberReadFromDebitCardOnlineRequired;
	// Narration
	private String customerNarrationRequired;
	private String customerNarrationLabelName;
	private String isCustomerNarrationInputAlphaNumerice;
	
	// Credit Card 
	private String creditCardPaymentServiceRequired;
	private String isCreditCardNumberReadFromCardReaderRequired;

	private String isBankLogoRequired;
	public String logoFileName;
	private String bankLogoHeaderValue;
	private String bankLogoFooterValue;
	
	private String extraField1;
	private String extraField2;
	private String extraField3;
	private String extraField4;
	private String extraField5;
	public Long getBankMasterId() {
		return bankMasterId;
	}
	public void setBankMasterId(Long bankMasterId) {
		this.bankMasterId = bankMasterId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getIsBankEnable() {
		return isBankEnable;
	}
	public void setIsBankEnable(String isBankEnable) {
		this.isBankEnable = isBankEnable;
	}
	public String getBankGlAccountNo() {
		return bankGlAccountNo;
	}
	public void setBankGlAccountNo(String bankGlAccountNo) {
		this.bankGlAccountNo = bankGlAccountNo;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public long getLocationId() {
		return locationId;
	}
	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}
	public long getGlAccountNumber() {
		return glAccountNumber;
	}
	public void setGlAccountNumber(long glAccountNumber) {
		this.glAccountNumber = glAccountNumber;
	}
	public String getEnableAccountDeposit() {
		return enableAccountDeposit;
	}
	public void setEnableAccountDeposit(String enableAccountDeposit) {
		this.enableAccountDeposit = enableAccountDeposit;
	}
	public String getEnableManualAccountEntry() {
		return enableManualAccountEntry;
	}
	public void setEnableManualAccountEntry(String enableManualAccountEntry) {
		this.enableManualAccountEntry = enableManualAccountEntry;
	}
	public String getAccountNumberLengthValidationRequired() {
		return accountNumberLengthValidationRequired;
	}
	public void setAccountNumberLengthValidationRequired(String accountNumberLengthValidationRequired) {
		this.accountNumberLengthValidationRequired = accountNumberLengthValidationRequired;
	}
	public String getAccountNumberManualInput() {
		return accountNumberManualInput;
	}
	public void setAccountNumberManualInput(String accountNumberManualInput) {
		this.accountNumberManualInput = accountNumberManualInput;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getAccountLength() {
		return accountLength;
	}
	public void setAccountLength(int accountLength) {
		this.accountLength = accountLength;
	}
	public String getEidValidationRequired() {
		return eidValidationRequired;
	}
	public void setEidValidationRequired(String eidValidationRequired) {
		this.eidValidationRequired = eidValidationRequired;
	}
	public int getEidGracePeriodInNoOfDays() {
		return eidGracePeriodInNoOfDays;
	}
	public void setEidGracePeriodInNoOfDays(int eidGracePeriodInNoOfDays) {
		this.eidGracePeriodInNoOfDays = eidGracePeriodInNoOfDays;
	}
	public String getEidOnlineValidationRequired() {
		return eidOnlineValidationRequired;
	}
	public void setEidOnlineValidationRequired(String eidOnlineValidationRequired) {
		this.eidOnlineValidationRequired = eidOnlineValidationRequired;
	}
	public String getEidValidationConfirmationScreenRequired() {
		return eidValidationConfirmationScreenRequired;
	}
	public void setEidValidationConfirmationScreenRequired(String eidValidationConfirmationScreenRequired) {
		this.eidValidationConfirmationScreenRequired = eidValidationConfirmationScreenRequired;
	}
	public String getAccountNumberReadFromDebitCardOnlineRequired() {
		return accountNumberReadFromDebitCardOnlineRequired;
	}
	public void setAccountNumberReadFromDebitCardOnlineRequired(String accountNumberReadFromDebitCardOnlineRequired) {
		this.accountNumberReadFromDebitCardOnlineRequired = accountNumberReadFromDebitCardOnlineRequired;
	}
	public String getCustomerNarrationRequired() {
		return customerNarrationRequired;
	}
	public void setCustomerNarrationRequired(String customerNarrationRequired) {
		this.customerNarrationRequired = customerNarrationRequired;
	}
	public String getCustomerNarrationLabelName() {
		return customerNarrationLabelName;
	}
	public void setCustomerNarrationLabelName(String customerNarrationLabelName) {
		this.customerNarrationLabelName = customerNarrationLabelName;
	}
	public String getIsCustomerNarrationInputAlphaNumerice() {
		return isCustomerNarrationInputAlphaNumerice;
	}
	public void setIsCustomerNarrationInputAlphaNumerice(String isCustomerNarrationInputAlphaNumerice) {
		this.isCustomerNarrationInputAlphaNumerice = isCustomerNarrationInputAlphaNumerice;
	}
	public String getCreditCardPaymentServiceRequired() {
		return creditCardPaymentServiceRequired;
	}
	public void setCreditCardPaymentServiceRequired(String creditCardPaymentServiceRequired) {
		this.creditCardPaymentServiceRequired = creditCardPaymentServiceRequired;
	}
	public String getIsCreditCardNumberReadFromCardReaderRequired() {
		return isCreditCardNumberReadFromCardReaderRequired;
	}
	public void setIsCreditCardNumberReadFromCardReaderRequired(String isCreditCardNumberReadFromCardReaderRequired) {
		this.isCreditCardNumberReadFromCardReaderRequired = isCreditCardNumberReadFromCardReaderRequired;
	}
	public String getIsBankLogoRequired() {
		return isBankLogoRequired;
	}
	public void setIsBankLogoRequired(String isBankLogoRequired) {
		this.isBankLogoRequired = isBankLogoRequired;
	}
	public String getLogoFileName() {
		return logoFileName;
	}
	public void setLogoFileName(String logoFileName) {
		this.logoFileName = logoFileName;
	}
	public String getBankLogoHeaderValue() {
		return bankLogoHeaderValue;
	}
	public void setBankLogoHeaderValue(String bankLogoHeaderValue) {
		this.bankLogoHeaderValue = bankLogoHeaderValue;
	}
	public String getBankLogoFooterValue() {
		return bankLogoFooterValue;
	}
	public void setBankLogoFooterValue(String bankLogoFooterValue) {
		this.bankLogoFooterValue = bankLogoFooterValue;
	}
	public String getExtraField1() {
		return extraField1;
	}
	public void setExtraField1(String extraField1) {
		this.extraField1 = extraField1;
	}
	public String getExtraField2() {
		return extraField2;
	}
	public void setExtraField2(String extraField2) {
		this.extraField2 = extraField2;
	}
	public String getExtraField3() {
		return extraField3;
	}
	public void setExtraField3(String extraField3) {
		this.extraField3 = extraField3;
	}
	public String getExtraField4() {
		return extraField4;
	}
	public void setExtraField4(String extraField4) {
		this.extraField4 = extraField4;
	}
	public String getExtraField5() {
		return extraField5;
	}
	public void setExtraField5(String extraField5) {
		this.extraField5 = extraField5;
	}
	public BankMasterDto(Long bankMasterId, String bankName, String bankCode, String isBankEnable,
			String bankGlAccountNo, String deviceId, long locationId, long glAccountNumber, String enableAccountDeposit,
			String enableManualAccountEntry, String accountNumberLengthValidationRequired,
			String accountNumberManualInput, int minimum, int maximum, int accountLength, String eidValidationRequired,
			int eidGracePeriodInNoOfDays, String eidOnlineValidationRequired,
			String eidValidationConfirmationScreenRequired, String accountNumberReadFromDebitCardOnlineRequired,
			String customerNarrationRequired, String customerNarrationLabelName,
			String isCustomerNarrationInputAlphaNumerice, String creditCardPaymentServiceRequired,
			String isCreditCardNumberReadFromCardReaderRequired, String isBankLogoRequired, String logoFileName,
			String bankLogoHeaderValue, String bankLogoFooterValue, String extraField1, String extraField2,
			String extraField3, String extraField4, String extraField5) {
		super();
		this.bankMasterId = bankMasterId;
		this.bankName = bankName;
		this.bankCode = bankCode;
		this.isBankEnable = isBankEnable;
		this.bankGlAccountNo = bankGlAccountNo;
		this.deviceId = deviceId;
		this.locationId = locationId;
		this.glAccountNumber = glAccountNumber;
		this.enableAccountDeposit = enableAccountDeposit;
		this.enableManualAccountEntry = enableManualAccountEntry;
		this.accountNumberLengthValidationRequired = accountNumberLengthValidationRequired;
		this.accountNumberManualInput = accountNumberManualInput;
		this.minimum = minimum;
		this.maximum = maximum;
		this.accountLength = accountLength;
		this.eidValidationRequired = eidValidationRequired;
		this.eidGracePeriodInNoOfDays = eidGracePeriodInNoOfDays;
		this.eidOnlineValidationRequired = eidOnlineValidationRequired;
		this.eidValidationConfirmationScreenRequired = eidValidationConfirmationScreenRequired;
		this.accountNumberReadFromDebitCardOnlineRequired = accountNumberReadFromDebitCardOnlineRequired;
		this.customerNarrationRequired = customerNarrationRequired;
		this.customerNarrationLabelName = customerNarrationLabelName;
		this.isCustomerNarrationInputAlphaNumerice = isCustomerNarrationInputAlphaNumerice;
		this.creditCardPaymentServiceRequired = creditCardPaymentServiceRequired;
		this.isCreditCardNumberReadFromCardReaderRequired = isCreditCardNumberReadFromCardReaderRequired;
		this.isBankLogoRequired = isBankLogoRequired;
		this.logoFileName = logoFileName;
		this.bankLogoHeaderValue = bankLogoHeaderValue;
		this.bankLogoFooterValue = bankLogoFooterValue;
		this.extraField1 = extraField1;
		this.extraField2 = extraField2;
		this.extraField3 = extraField3;
		this.extraField4 = extraField4;
		this.extraField5 = extraField5;
	}
	@Override
	public String toString() {
		return "BankMasterDto [bankMasterId=" + bankMasterId + ", bankName=" + bankName + ", bankCode=" + bankCode
				+ ", isBankEnable=" + isBankEnable + ", bankGlAccountNo=" + bankGlAccountNo + ", deviceId=" + deviceId
				+ ", locationId=" + locationId + ", glAccountNumber=" + glAccountNumber + ", enableAccountDeposit="
				+ enableAccountDeposit + ", enableManualAccountEntry=" + enableManualAccountEntry
				+ ", accountNumberLengthValidationRequired=" + accountNumberLengthValidationRequired
				+ ", accountNumberManualInput=" + accountNumberManualInput + ", minimum=" + minimum + ", maximum="
				+ maximum + ", accountLength=" + accountLength + ", eidValidationRequired=" + eidValidationRequired
				+ ", eidGracePeriodInNoOfDays=" + eidGracePeriodInNoOfDays + ", eidOnlineValidationRequired="
				+ eidOnlineValidationRequired + ", eidValidationConfirmationScreenRequired="
				+ eidValidationConfirmationScreenRequired + ", accountNumberReadFromDebitCardOnlineRequired="
				+ accountNumberReadFromDebitCardOnlineRequired + ", customerNarrationRequired="
				+ customerNarrationRequired + ", customerNarrationLabelName=" + customerNarrationLabelName
				+ ", isCustomerNarrationInputAlphaNumerice=" + isCustomerNarrationInputAlphaNumerice
				+ ", creditCardPaymentServiceRequired=" + creditCardPaymentServiceRequired
				+ ", isCreditCardNumberReadFromCardReaderRequired=" + isCreditCardNumberReadFromCardReaderRequired
				+ ", isBankLogoRequired=" + isBankLogoRequired + ", logoFileName=" + logoFileName
				+ ", bankLogoHeaderValue=" + bankLogoHeaderValue + ", bankLogoFooterValue=" + bankLogoFooterValue
				+ ", extraField1=" + extraField1 + ", extraField2=" + extraField2 + ", extraField3=" + extraField3
				+ ", extraField4=" + extraField4 + ", extraField5=" + extraField5 + "]";
	}
	public BankMasterDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

		
}

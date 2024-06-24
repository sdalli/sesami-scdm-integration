package com.sesami.sesamiscdmintegration.bank.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "cc_bank_branch_master")
public class BankBranchMaster  extends CommonDBDto{

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long BankBranchMasterId;
	
	private String branchCode;
	
	
	private String branchDeviceId;
	
	private String branchGlAccountNumber;
	
	private String branchLocationName;
	
	private int locationId;

	public Long getBankBranchMasterId() {
		return BankBranchMasterId;
	}

	public void setBankBranchMasterId(Long bankBranchMasterId) {
		BankBranchMasterId = bankBranchMasterId;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}


	public String getBranchDeviceId() {
		return branchDeviceId;
	}

	public void setBranchDeviceId(String branchDeviceId) {
		this.branchDeviceId = branchDeviceId;
	}

	public String getBranchGlAccountNumber() {
		return branchGlAccountNumber;
	}

	public void setBranchGlAccountNumber(String branchGlAccountNumber) {
		this.branchGlAccountNumber = branchGlAccountNumber;
	}

	public String getBranchLocationName() {
		return branchLocationName;
	}

	public void setBranchLocationName(String branchLocationName) {
		this.branchLocationName = branchLocationName;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	@Override
	public String toString() {
		return "BankBranchMaster [BankBranchMasterId=" + BankBranchMasterId + ", branchCode=" + branchCode
				+ ", bankMasterPkid="  + ", branchDeviceId=" + branchDeviceId
				+ ", branchGlAccountNumber=" + branchGlAccountNumber + ", branchLocationName=" + branchLocationName
				+ ", locationId=" + locationId + "]";
	}

	public BankBranchMaster(StatusEnum status, String createdBy, Date createdDate, Long bankBranchMasterId,
			String branchCode,  String branchDeviceId, String branchGlAccountNumber,
			String branchLocationName, int locationId) {
		super(status, createdBy, createdDate);
		BankBranchMasterId = bankBranchMasterId;
		this.branchCode = branchCode;
		
		this.branchDeviceId = branchDeviceId;
		this.branchGlAccountNumber = branchGlAccountNumber;
		this.branchLocationName = branchLocationName;
		this.locationId = locationId;
	}

	

	
	
	
}



	
	
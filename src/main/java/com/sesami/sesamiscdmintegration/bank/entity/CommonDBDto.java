package com.sesami.sesamiscdmintegration.bank.entity;

import java.util.Date;

public class CommonDBDto {

	
	private StatusEnum status;
	
	private String createdBy;
	
	private Date createdDate;

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public CommonDBDto(StatusEnum status, String createdBy, Date createdDate) {
		super();
		this.status = status;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "CommonDBDto [status=" + status + ", createdBy=" + createdBy + ", createdDate=" + createdDate + "]";
	}

	

	
	
}

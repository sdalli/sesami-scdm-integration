package com.sesami.sesamiscdmintegration.accountinquiry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesami.sesamiscdmintegration.accountinquiry.entity.Account;

public interface AccountInquiryRepository extends JpaRepository<Account, Long> {
	
	
	

}

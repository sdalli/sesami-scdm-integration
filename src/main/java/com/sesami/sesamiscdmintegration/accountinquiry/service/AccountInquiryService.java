package com.sesami.sesamiscdmintegration.accountinquiry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesami.sesamiscdmintegration.accountinquiry.entity.Account;
import com.sesami.sesamiscdmintegration.accountinquiry.repository.AccountInquiryRepository;

@Service
public class AccountInquiryService {

	
	 @Autowired
	 private AccountInquiryRepository accountRepository;
	 
	 
	 public Account getAccountById(Long id) {
	        return accountRepository.findById(id).orElse(null);
	    }

	    public Account createAccount(Account account) {
	        return accountRepository.save(account);
	    }
	    

	    public Account updateAccount(Long id, Account accountDetails) {
	        Account account = accountRepository.findById(id).orElse(null);
	        if (account != null) {
	            account.setAccountNumber(accountDetails.getAccountNumber());
	            account.setAccountType(accountDetails.getAccountType());
	            return accountRepository.save(account);
	        }
	        return null;
	    }

	    public boolean deleteAccount(Long id) {
	        if (accountRepository.existsById(id)) {
	            accountRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }
	 
	 
	 
	 
	 
	 
	 
	 
	 
}

package com.sesami.sesamiscdmintegration.accountinquiry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesami.sesamiscdmintegration.accountinquiry.entity.Account;
import com.sesami.sesamiscdmintegration.accountinquiry.service.AccountInquiryService;

@RestController
@RequestMapping("/api/accounts")
public class AccountInquiryController {

	
	
    @Autowired
    private AccountInquiryService accountInquiryService;
	
	
    
//    @GetMapping("/{id}")
//    public ResponseEntity<Account> getAccountById(@PathVariable Long id) {
//        Account account = accountInquiryService.getAccountById(id);
//        if (account != null) {
//            return ResponseEntity.ok(account);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @PostMapping("/create")
//    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
//        Account createdAccount = accountInquiryService.createAccount(account);
//        return ResponseEntity.status(HttpStatus.CREATED).body(createdAccount);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Account> updateAccount(@PathVariable Long id, @RequestBody Account accountDetails) {
//        Account updatedAccount = accountInquiryService.updateAccount(id, accountDetails);
//        if (updatedAccount != null) {
//            return ResponseEntity.ok(updatedAccount);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteAccount(@PathVariable Long id) {
//        boolean deleted = accountInquiryService.deleteAccount(id);
//        if (deleted) {
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
    
    
}

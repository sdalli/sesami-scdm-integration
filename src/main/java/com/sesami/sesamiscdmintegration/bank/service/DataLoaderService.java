package com.sesami.sesamiscdmintegration.bank.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sesami.sesamiscdmintegration.bank.entity.Bank;
import com.sesami.sesamiscdmintegration.bank.repository.BankRepository;

import jakarta.annotation.PostConstruct;

@Service
public class DataLoaderService {

 private final BankRepository bankRepository;

 public DataLoaderService(BankRepository bankRepository) {
     this.bankRepository = bankRepository;
 }

 @PostConstruct
 public void loadData() {
     ObjectMapper mapper = new ObjectMapper();
     try {
    	 mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         List<Bank> banks = mapper.readValue(new File("src/main/resources/banks.json"), new TypeReference<>() {});
         bankRepository.saveAll(banks);
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}

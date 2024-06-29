package com.sesami.sesamiscdmintegration.bank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesami.sesamiscdmintegration.bank.entity.Bank;
import com.sesami.sesamiscdmintegration.bank.repository.BankRepository;
import com.sesami.sesamiscdmintegration.bank.service.BankSetupMasterService;

@RestController
@RequestMapping("/api/bank-setup-master")
public class BankSetupMasterController {

	//@Autowired
	//private BankSetupMasterService bankSetupMasterService;
	
	
	

	@Autowired
	private BankRepository bankRepository;
	
	

	public BankSetupMasterController(BankSetupMasterService bankSetupMasterService, BankRepository bankRepository) {
		super();
		//this.bankSetupMasterService = bankSetupMasterService;
		this.bankRepository = bankRepository;
	}

	
	
	
	
	@GetMapping("/fetchBanks")
	public ResponseEntity<List<Bank>> getAllBanks() {
		List<Bank> banks = bankRepository.findAll();
		
//		  ObjectMapper mapper = new ObjectMapper();
		  
		 // mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//	         List<Bank> banks  = null;
//			try {
//				banks = mapper.readValue(new File("src/main/resources/banks.json"), new TypeReference<>() {});
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		  
		return new ResponseEntity<>(banks, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Bank> getBankById(@PathVariable Long id) {
		Optional<Bank> bank = bankRepository.findById(id);
		if (bank.isPresent()) {
			return new ResponseEntity<>(bank.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

//	@PostMapping
//	public ResponseEntity<Bank> createBank(@RequestBody Bank bank) {
//		Bank savedBank = bankRepository.save(bank);
//		return new ResponseEntity<>(savedBank, HttpStatus.CREATED);
//	}

//	@PutMapping("/{id}")
//	public ResponseEntity<Bank> updateBank(@PathVariable Long id, @RequestBody Bank bankDetails) {
//		Optional<Bank> bankOptional = bankRepository.findById(id);
//		if (bankOptional.isPresent()) {
//			Bank bank = bankOptional.get();
//			bank.setName(bankDetails.getName());
//			bank.setLogo(bankDetails.getLogo());
//			bank.setEnableAccountDeposit(bankDetails.isEnableAccountDeposit());
//			bank.setEnableCreditCardBillPayment(bankDetails.isEnableCreditCardBillPayment());
//			bank.setEnableManualAccountEntry(bankDetails.isEnableManualAccountEntry());
//			bank.setEnableAccountFromDebitCard(bankDetails.isEnableAccountFromDebitCard());
//			bank.setEnableEIDValidation(bankDetails.isEnableEIDValidation());
//			bank.setEnableEIDOnlineValidation(bankDetails.isEnableEIDOnlineValidation());
//			bank.setEnableNarrationEntry(bankDetails.isEnableNarrationEntry());
//			bank.setEnablePayinAmountEntry(bankDetails.isEnablePayinAmountEntry());
//			bank.setEnableCardBasedCreditCard(bankDetails.isEnableCardBasedCreditCard());
//			bank.setEnableManualCreditCardEntry(bankDetails.isEnableManualCreditCardEntry());
//			bank.setCheckAccountNumberLength(bankDetails.isCheckAccountNumberLength());
//			bank.setAccountNumberLength(bankDetails.getAccountNumberLength());
//			bank.setAdditionalInputs(bankDetails.getAdditionalInputs());
//
//			Bank updatedBank = bankRepository.save(bank);
//			return new ResponseEntity<>(updatedBank, HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}

//	@DeleteMapping("/{id}")
//	public ResponseEntity<Void> deleteBank(@PathVariable Long id) {
//		Optional<Bank> bank = bankRepository.findById(id);
//		if (bank.isPresent()) {
//			bankRepository.delete(bank.get());
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		} else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}

//	@GetMapping("/retrive-bank-master-configuration")
//	public BankMasterListResponse retriveBankMasterSetupConfiguration() {
//
//	//	BankMasterListResponse response = null;
//
//		return null;
//	}

}

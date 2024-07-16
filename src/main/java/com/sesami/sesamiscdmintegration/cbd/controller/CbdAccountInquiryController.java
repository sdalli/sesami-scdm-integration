package com.sesami.sesamiscdmintegration.cbd.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sesami.sesamiscdmintegration.accountinquiry.bean.AccountDetailsRequest;
import com.sesami.sesamiscdmintegration.accountinquiry.bean.AccountDetailsResponse;
import com.sesami.sesamiscdmintegration.cbd.accountInquiryBean.CbdAccountInquiryServiceRootResponse;
import com.sesami.sesamiscdmintegration.cbd.service.CbdAccountInquiryClientService;
import com.sesami.sesamiscdmintegration.common.util.SesamiParsingUtil;

@RequestMapping("/api/client/accountInquiry")
@RestController
public class CbdAccountInquiryController {


    private final CbdAccountInquiryClientService clientService;
    
   
    
    

    @Autowired
    public CbdAccountInquiryController(CbdAccountInquiryClientService clientService ) {
        this.clientService = clientService;
       // this.transactionService = transactionService;
        
    }

//    @PostMapping("/party-account-relation")
//    public ResponseEntity<String> getPartyAccountRelation(@RequestBody String requestBody,
//                                                          @RequestHeader("x-correlation-id") String correlationId) {
//        return clientService.getPartyAccountRelation(requestBody, correlationId);
//    }
    // TODO ::  OLD CODE
//    @PostMapping("/fetch-account-details-by-account-number")
//    public ResponseEntity<String> getPartyAccountRelation(@RequestParam String accountNumber , @RequestParam String deviceId , @RequestParam String bankCode) {
//        return clientService.getPartyAccountRelation_AccountNumber(accountNumber);
//    }
    
    @PostMapping("/fetch-account-details-by-account-number")
    public ResponseEntity<AccountDetailsResponse> getPartyAccountRelation(@RequestBody AccountDetailsRequest request) {
    	AccountDetailsResponse responseObject =null;

    	// ResponseEntity<String> response = clientService.getPartyAccountRelation_AccountNumber(request);
    	ResponseEntity<String> response = clientService.getPartyAccountRelation_AccountNumber_mock(request);
    	if(response!= null && response.getStatusCode() == HttpStatus.OK) {

    		 CbdAccountInquiryServiceRootResponse rootResponse = SesamiParsingUtil.convertJsonStringResponseToClassObject(response.getBody(), CbdAccountInquiryServiceRootResponse.class);
    		
    		
    		responseObject = new AccountDetailsResponse();
    		responseObject.setRequestUniqueNumber(SesamiParsingUtil.generateUniqueRequestNumber(request.getDeviceId()));
    		if(rootResponse.getPartyAcctRelInqRs()!=null) {
    			responseObject.setAccountNumber(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctKeys().getAcctId());
        		responseObject.setAccountHolderName(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctTitle());
        		responseObject.setAccountType(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctType().getAcctTypeValue());
        		responseObject.setDailyDepositLimit(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctBal().getCurAmt().getAmt());
        		responseObject.setMonthtlyTransactionLimit(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctBal().getCurAmt().getAmt());
        		responseObject.setCurrencyCode(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctBal().getCurAmt().getCurCode().getCurCodeValue());
        		responseObject.setAccountStatus(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctRec().getAcctStatus().getAcctStatusCode());
        		responseObject.setDepositAllowed(Boolean.TRUE);
	    		responseObject.setBankWebServiceCode(String.valueOf(rootResponse.getPartyAcctRelInqRs().getStatus().getStatusCode()));
	            responseObject.setBankWebServiceDesc(rootResponse.getPartyAcctRelInqRs().getStatus().getStatusDesc());
	            responseObject.setCdmApiCode(1);
	            responseObject.setCdmCustomerErrorMessage("Account is valid");
    		}else {
    			 responseObject = SesamiParsingUtil.handleNotFoundResponse(response, request);
    		}
    		
    	}else if(response!= null && response.getStatusCode() == HttpStatus.NOT_FOUND) {
    		
             responseObject = SesamiParsingUtil.handleNotFoundResponse(response, request);
           
    	}
        
        return ResponseEntity.ok(responseObject);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

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
import com.sesami.sesamiscdmintegration.cbd.accountInquiryBean.RootResponse;
import com.sesami.sesamiscdmintegration.cbd.service.CbdAccountInquiryClientService;

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

    		 RootResponse rootResponse = convertJsonStringResponseToClassObject(response.getBody(), RootResponse.class);
    		
    		
    		responseObject = new AccountDetailsResponse();
    		responseObject.setRequestUniqueNumber(generateUniqueRequestNumber(request.getDeviceId()));
    		if(rootResponse.getPartyAcctRelInqRs()!=null) {
    			responseObject.setAccountNumber(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctKeys().getAcctId());
        		responseObject.setAccountHolderName(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctTitle());
        		responseObject.setAccountType(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctType().getAcctTypeValue());
        		responseObject.setDailyDepositLimit(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctBal().getCurAmt().getAmt());
        		responseObject.setMonthtlyTransactionLimit(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctBal().getCurAmt().getAmt());
        		responseObject.setCurrencyCode(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctBal().getCurAmt().getCurCode().getCurCodeValue());
        		responseObject.setAccountStatus(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctRec().getAcctStatus().getAcctStatusCode());
        		responseObject.setDepositAllowed(Boolean.TRUE);
	    		responseObject.setBankErrorCode(String.valueOf(rootResponse.getPartyAcctRelInqRs().getStatus().getStatusCode()));
	            responseObject.setBankErrorDesc(rootResponse.getPartyAcctRelInqRs().getStatus().getStatusDesc());
	           // responseObject.setCdmApiCode(customPropertiesMap.get("possible").getCode());
	          //  responseObject.setCdmCustomerErrorMessage(customPropertiesMap.get("possible").getMessage());
    		}else {
    			 responseObject = handleNotFoundResponse(response, request);
    		}
    		
    	}else if(response!= null && response.getStatusCode() == HttpStatus.NOT_FOUND) {
    		
             responseObject = handleNotFoundResponse(response, request);
           
    	}
        
        return ResponseEntity.ok(responseObject);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static StringBuilder dateToString(String format, Date fromdate){	
		Date dateNow = fromdate;
		SimpleDateFormat dateformatMMDDYYYY = new SimpleDateFormat(format);
		StringBuilder nowMMDDYYYY = new StringBuilder( dateformatMMDDYYYY.format( dateNow ) );

		return nowMMDDYYYY;
	}
    
    public static <T> T convertJsonStringResponseToClassObject(String bodyJsonStringBody, Class<T> clazz)
           {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
			return objectMapper.readValue(bodyJsonStringBody, clazz);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
 }

    private String generateUniqueRequestNumber(String deviceId) {
        return deviceId + dateToString("yyyyMMddHHmmss", new Date());
    }
    
    private AccountDetailsResponse handleNotFoundResponse(ResponseEntity<String> response, AccountDetailsRequest request) {
        ObjectMapper objectMapper = new ObjectMapper();
       

        try {
            JsonNode rootNode = objectMapper.readTree(response.getBody());
            JsonNode partyAcctRelInqRsNode = rootNode.path("PartyAcctRelInqRs");
            JsonNode statusNode = partyAcctRelInqRsNode.path("Status");
            JsonNode additionalStatusNode = statusNode.path("AdditionalStatus");

            int additionalStatusCode = additionalStatusNode.path("StatusCode").asInt();
            String additionalStatusDesc = additionalStatusNode.path("StatusDesc").asText();
            // String rqUID = partyAcctRelInqRsNode.path("RqUID").asText();

            AccountDetailsResponse responseObject = new AccountDetailsResponse();
            responseObject.setRequestUniqueNumber(generateUniqueRequestNumber(request.getDeviceId()));
            responseObject.setAccountNumber(request.getAccountNumber());
            responseObject.setAccountHolderName("NA");
            responseObject.setAccountType("NA");
            responseObject.setDailyDepositLimit("1");
            responseObject.setMonthtlyTransactionLimit("1");
            responseObject.setCurrencyCode("AED");
            responseObject.setAccountStatus("INACTIVE");
            responseObject.setBankErrorCode(String.valueOf(additionalStatusCode));
            responseObject.setBankErrorDesc(additionalStatusDesc);
          //  responseObject.setCdmApiCode(customPropertiesMap.get("cdm.deposit.not.possible.account.inactive").getCode());
           // responseObject.setCdmCustomerErrorMessage(customPropertiesMap.get("cdm.deposit.not.possible.account.inactive").getMessage());

            return responseObject;
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error processing JSON response", e);
        }
    }

}

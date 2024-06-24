package com.sesami.sesamiscdmintegration.cbd.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sesami.sesamiscdmintegration.accountinquiry.bean.AccountDetailsRequest;
import com.sesami.sesamiscdmintegration.accountinquiry.bean.AccountDetailsResponse;
import com.sesami.sesamiscdmintegration.cbd.accountInquiryBean.RootResponse;
import com.sesami.sesamiscdmintegration.cbd.service.CbdAccountInquiryClientService;

@RequestMapping("/api/client")
@RestController
public class CbdAccountInquiryController {


    private final CbdAccountInquiryClientService clientService;

    @Autowired
    public CbdAccountInquiryController(CbdAccountInquiryClientService clientService) {
        this.clientService = clientService;
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
    	ResponseEntity<String> response = clientService.getPartyAccountRelation_AccountNumber(request);
    	if(response!= null ) {
    		 RootResponse rootResponse = convertJsonStringResponseToClassObject(response.getBody(), RootResponse.class);
    		
    		
    		responseObject = new AccountDetailsResponse();
    		responseObject.setRequestUniqueNumber(request.getDeviceId()+dateToString("yyyyMMddHHmmss",new Date()).toString());
    		responseObject.setAccountNumber(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctKeys().getAcctId());
    		responseObject.setAccountHolderName(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctTitle());
    		responseObject.setAccountType(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctType().getAcctTypeValue());
    		responseObject.setDailyDepositLimit(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctBal().getCurAmt().getAmt());
    		responseObject.setMonthtlyTransactionLimit(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctBal().getCurAmt().getAmt());
    		responseObject.setCurrencyCode(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctBal().getCurAmt().getCurCode().getCurCodeValue());
    		responseObject.setAccountStatus(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctRec().getAcctStatus().getAcctStatusCode());
    		responseObject.setDepositAllowed(Boolean.TRUE);
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


}
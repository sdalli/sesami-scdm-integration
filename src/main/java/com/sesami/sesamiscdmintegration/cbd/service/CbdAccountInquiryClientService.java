package com.sesami.sesamiscdmintegration.cbd.service;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sesami.sesamiscdmintegration.accountinquiry.bean.AccountDetailsRequest;
import com.sesami.sesamiscdmintegration.bank.bean.BankApiCustomResponse;
import com.sesami.sesamiscdmintegration.bank.bean.Transaction;



@Service
public class CbdAccountInquiryClientService {
	Logger logger = LoggerFactory.getLogger(CbdAccountInquiryClientService.class);

	@Value("${server.ssl.keyStoreJksPath}")
    private String keyStoreJksPath;
	
	@Value("${server.ssl.keyStoreJksPassword}")
    private String keyStoreJksPassword;
	
	
	@Value("${cbd.client.webendpoint.url}")
    private String cbdWebEndPointURL;
	
	@Value("${cbd.client.service.url}")
    private String serviceUrl;

    @Value("${cbd.client.service.clientId}")
    private String clientId;

    @Value("${cbd.client.service.clientSecret}")
    private String clientSecret;
    
    @Value("${cbd.client.service.SvcProviderName}")
    private String svcProviderName;
    
    @Value("${cbd.client.service.SvcProviderId}")
    private String svcProviderId;
    
    @Value("${cbd.client.service.SvcName.PartyAcctRelInqSCDMAcctVal}")
    private String partyAcctRelInqSCDMAcctVal;
    
    @Value("${cbd.client.service.SvcName.PartyAcctRelInqSCDMAcctInq}")
    private String partyAcctRelInqSCDMAcctInq;
    
    
    private final RestTemplate restTemplate;
    
    

    public CbdAccountInquiryClientService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        
        
    }

    public ResponseEntity<String> getPartyAccountRelation(String requestBody, String correlationId) {
       
		/*
		 * System.setProperty("javax.net.ssl.trustStore",keyStoreJksPath.trim());
		 * System.setProperty("javax.net.ssl.trustStorePassword",
		 * keyStoreJksPassword.trim()); System.setProperty("javax.net.ssl.keyStore",
		 * keyStoreJksPath.trim()); System.setProperty("javax.net.ssl.keyStorePassword",
		 * keyStoreJksPassword.trim());
		 */ 

		HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.set("client-id", clientId);
        headers.set("client-secret", clientSecret);
        headers.set("x-correlation-id", correlationId);
	        
        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);

        return restTemplate.exchange(cbdWebEndPointURL+serviceUrl, HttpMethod.POST, entity, String.class);
    }
    
    
    public ResponseEntity<String> getPartyAccountRelation_AccountNumber(AccountDetailsRequest accountDetailsRequest) {
    	
    	
    	String cbdaccountInquiryRequest = null; 
		/*
		 * System.setProperty("javax.net.ssl.trustStore",keyStoreJksPath.trim());
		 * System.setProperty("javax.net.ssl.trustStorePassword",
		 * keyStoreJksPassword.trim()); System.setProperty("javax.net.ssl.keyStore",
		 * keyStoreJksPath.trim()); System.setProperty("javax.net.ssl.keyStorePassword",
		 * keyStoreJksPassword.trim());
		 */
		

		if ( accountDetailsRequest.getAccountNumber().startsWith("1")) {
			cbdaccountInquiryRequest = "{\"PartyAcctRelInqRq\":{\"RqUID\":\""+UUID.randomUUID().toString()+"\",\"MsgRqHdr\":{\"SvcIdent\":{\"SvcProviderName\":\""+svcProviderName+"\","
					+ "\"SvcProviderId\":\""+svcProviderId+"\",\"SvcName\":\""+partyAcctRelInqSCDMAcctVal+"\"}},\"PartyAcctRelSel\":[{\"AcctKeys\":{\"AcctId\":\""+accountDetailsRequest.getAccountNumber().trim()+"\"}}]}}";
		} else {
			
			cbdaccountInquiryRequest = "{\"PartyAcctRelInqRq\":{\"RqUID\":\""+UUID.randomUUID().toString()+"\",\"MsgRqHdr\":{\"SvcIdent\":{\"SvcProviderName\":\""+svcProviderName+"\","
					+ "\"SvcProviderId\":\""+svcProviderId+"\",\"SvcName\":\""+partyAcctRelInqSCDMAcctInq+"\"}},\"PartyAcctRelSel\":[{\"AcctKeys\":{\"VirAcctId\":\""+accountDetailsRequest.getAccountNumber().trim()+"\"}}]}}";
		}
		
    	
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.set("client-id", clientId);
        headers.set("client-secret", clientSecret);
        headers.set("x-correlation-id", UUID.randomUUID().toString());

        HttpEntity<String> entity = new HttpEntity<>(cbdaccountInquiryRequest, headers);

        ResponseEntity<String> responseString =  restTemplate.exchange(cbdWebEndPointURL+serviceUrl, HttpMethod.POST, entity, String.class);
        
        logger.debug("Response Status Code: {}", responseString.getStatusCode().value());
        logger.debug("Response Headers: {}", responseString.getHeaders());
        logger.debug("Response Body: {}", responseString.getBody());
            
        logger.debug("Response JSON String ::: "+responseString);
        
        
        return responseString; 
    }
 
    
    
    private BankApiCustomResponse  sendCashDepositTxnRequest(Transaction deposit )
			throws Exception {

    	System.setProperty("javax.net.ssl.trustStore",keyStoreJksPath.trim());
   		System.setProperty("javax.net.ssl.trustStorePassword", keyStoreJksPassword.trim());
   		System.setProperty("javax.net.ssl.keyStore", keyStoreJksPath.trim());
   		System.setProperty("javax.net.ssl.keyStorePassword", keyStoreJksPassword.trim());  
		
		final RestTemplate restTemplate = new RestTemplate();
		String transactionPostingServiceUrl = "https://tgscdmtest.cbd.dev/exp-currentaccount-svcs-api/Services/CurrentAccount/Xfer/XferAdd";

		String cbdTxnPostingRequest = """ 
				{
				"XferAddRq": {
				        "RqUID": "{{$guid}}",
				        "MsgRqHdr": {
				            "SvcIdent": {
				                "SvcProviderName": "ET",
				                "SvcProviderId": "29",
				                "SvcName": "Transfer-Posting",
				                "SvcId": "156",
				                "OriginatorID": "533"
				            }
				        },
				        "XferInfo": {
				            "FromAcctRef": {
				                "AcctKeys": {
				                    "AcctId": "1010003539",
				                    "AcctType": "CK",
				                    "CurCode": {
				                        "CurCodeType": "ISO 4217",
				                        "CurCodeValue": "AED"
				                    }
				                }
				            },
				            "ToAcctRef": {
				                "AcctKeys": {
				                    "AcctId": "1000125581",
				                    "AcctType": "CK",
				                    "CurCode": {
				                        "CurCodeType": "ISO 4217",
				                        "CurCodeValue": "AED"
				                    }
				                }
				            },
				            "CurAmt": {
				                "Amt": 30
				            },
				            "ExpediteInd": false,
				            "ReversalInd": false,
				            "DebitInd": true,
				            "RefData": {
				                "RefIdent": "ATP-06929688",
				                "CreditRefDesc": "Etisalat PAYMENT for 0502910613 via AUTOPAY REF_NO-ATP-06929688",
				                "DebitRefDesc": "Etisalat PAYMENT for 0502910613 via AUTOPAY REF_NO-ATP-06929688"
				            }
				        }
				    }
				} """;
		
		

		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.set("client-id", "586eef2adb7f422fbf5ed842e614dea4");
		headers.set("client-secret", "bd24bC7C68F54a5F89Eb7f33199bc096");
		headers.set("x-correlation-id", UUID.randomUUID().toString());

		HttpEntity<String> entity = new HttpEntity<>(cbdTxnPostingRequest, headers);
		logger.debug("Request URL: {}", transactionPostingServiceUrl);
		logger.debug("Request Headers: {}", headers);
		logger.debug("Request Body: {}", cbdTxnPostingRequest);

		logger.debug("Request JSON String ::: " + cbdTxnPostingRequest);
		System.out.println("Request JSON String ::: " + cbdTxnPostingRequest);
		
		ResponseEntity<String> responseString = restTemplate.exchange(transactionPostingServiceUrl, HttpMethod.POST, entity,
				String.class);
		logger.debug("Response Status Code: {}", responseString.getStatusCode());
		logger.debug("Response Headers: {}", responseString.getHeaders());
		logger.debug("Response Body: {}", responseString.getBody());
            
		logger.debug("Response JSON String ::: "+responseString);
		System.out.println(responseString);
		// System.out.println("Result ::::::::::: " + result.toString());

		
		
		
		return new BankApiCustomResponse(responseString.getStatusCode().value(), responseString.getHeaders(),cbdTxnPostingRequest, responseString.getBody());
	}
    
    
 
 
    
}

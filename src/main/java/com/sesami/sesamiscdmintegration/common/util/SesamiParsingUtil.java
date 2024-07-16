package com.sesami.sesamiscdmintegration.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sesami.sesamiscdmintegration.accountinquiry.bean.AccountDetailsRequest;
import com.sesami.sesamiscdmintegration.accountinquiry.bean.AccountDetailsResponse;

public class SesamiParsingUtil {

	
	

    
    
    
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

    public static String generateUniqueRequestNumber(String deviceId) {
        return deviceId + dateToString("yyyyMMddHHmmss", new Date());
    }
    
    public static AccountDetailsResponse handleNotFoundResponse(ResponseEntity<String> response, AccountDetailsRequest request) {
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
            responseObject.setDepositAllowed(Boolean.FALSE);
            responseObject.setBankWebServiceCode(String.valueOf(additionalStatusCode));
            responseObject.setBankWebServiceDesc(additionalStatusDesc);
            responseObject.setInternalWebServiceCode("400");
            responseObject.setInternalWebServiceDesc("FAILED");
            responseObject.setCdmApiCode(2);
            responseObject.setCdmCustomerErrorMessage("Account does not exist");

            return responseObject;
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error processing JSON response", e);
        }
    }
}

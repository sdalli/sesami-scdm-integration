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
import org.springframework.web.client.HttpClientErrorException;
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

//	public ResponseEntity<String> getPartyAccountRelation(String requestBody, String correlationId) {
//		HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);
//
//        return restTemplate.exchange(cbdWebEndPointURL+serviceUrl, HttpMethod.POST, entity, String.class);
//    }
    
    
//	public ResponseEntity<String> getPartyAccountRelation_AccountNumber(AccountDetailsRequest accountDetailsRequest) {
//
//		String cbdaccountInquiryRequest = null;
//
//		/*
//		 * System.setProperty("javax.net.ssl.trustStore",keyStoreJksPath.trim());
//		 * System.setProperty("javax.net.ssl.trustStorePassword",
//		 * keyStoreJksPassword.trim()); System.setProperty("javax.net.ssl.keyStore",
//		 * keyStoreJksPath.trim()); System.setProperty("javax.net.ssl.keyStorePassword",
//		 * keyStoreJksPassword.trim());
//		 */
//
//
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("Content-Type", "application/json");
//		headers.set("client-id", clientId);
//		headers.set("client-secret", clientSecret);
//		headers.set("x-correlation-id", correlationId);
//
//		HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);
//
//		return restTemplate.exchange(cbdWebEndPointURL + serviceUrl, HttpMethod.POST, entity, String.class);
//	}

	public ResponseEntity<String> getPartyAccountRelation_AccountNumber(AccountDetailsRequest accountDetailsRequest) {

		String cbdaccountInquiryRequest = null;
		/*
		 * System.setProperty("javax.net.ssl.trustStore",keyStoreJksPath.trim());
		 * System.setProperty("javax.net.ssl.trustStorePassword",
		 * keyStoreJksPassword.trim()); System.setProperty("javax.net.ssl.keyStore",
		 * keyStoreJksPath.trim()); System.setProperty("javax.net.ssl.keyStorePassword",
		 * keyStoreJksPassword.trim());
		 */


		if (accountDetailsRequest.getAccountNumber().startsWith("1")) {
			cbdaccountInquiryRequest = "{\"PartyAcctRelInqRq\":{\"RqUID\":\"" + UUID.randomUUID().toString()
					+ "\",\"MsgRqHdr\":{\"SvcIdent\":{\"SvcProviderName\":\"" + svcProviderName + "\","
					+ "\"SvcProviderId\":\"" + svcProviderId + "\",\"SvcName\":\"" + partyAcctRelInqSCDMAcctVal
					+ "\"}},\"PartyAcctRelSel\":[{\"AcctKeys\":{\"AcctId\":\""
					+ accountDetailsRequest.getAccountNumber().trim() + "\"}}]}}";
		} else {

			cbdaccountInquiryRequest = "{\"PartyAcctRelInqRq\":{\"RqUID\":\"" + UUID.randomUUID().toString()
					+ "\",\"MsgRqHdr\":{\"SvcIdent\":{\"SvcProviderName\":\"" + svcProviderName + "\","
					+ "\"SvcProviderId\":\"" + svcProviderId + "\",\"SvcName\":\"" + partyAcctRelInqSCDMAcctInq
					+ "\"}},\"PartyAcctRelSel\":[{\"AcctKeys\":{\"VirAcctId\":\""
					+ accountDetailsRequest.getAccountNumber().trim() + "\"}}]}}";
		}

		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.set("client-id", clientId);
		headers.set("client-secret", clientSecret);
		headers.set("x-correlation-id", UUID.randomUUID().toString());


		HttpEntity<String> entity = new HttpEntity<>(cbdaccountInquiryRequest, headers);

		ResponseEntity<String> responseString = restTemplate.exchange(cbdWebEndPointURL + serviceUrl, HttpMethod.POST,
				entity, String.class);

		logger.debug("Response Status Code: {}", responseString.getStatusCode().value());
		logger.debug("Response Headers: {}", responseString.getHeaders());
		logger.debug("Response Body: {}", responseString.getBody());

		logger.debug("Response JSON String ::: " + responseString);

		return responseString;
	}

	public ResponseEntity<String> getPartyAccountRelation_AccountNumber_mock(
			AccountDetailsRequest accountDetailsRequest) {
		String cbdaccountInquiryRequest;

		if (accountDetailsRequest.getAccountNumber().startsWith("1")) {
			cbdaccountInquiryRequest = "{\"PartyAcctRelInqRq\":{\"RqUID\":\"" + UUID.randomUUID().toString()
					+ "\",\"MsgRqHdr\":{\"SvcIdent\":{\"SvcProviderName\":\"" + svcProviderName + "\","
					+ "\"SvcProviderId\":\"" + svcProviderId + "\",\"SvcName\":\"" + partyAcctRelInqSCDMAcctVal
					+ "\"}},\"PartyAcctRelSel\":[{\"AcctKeys\":{\"AcctId\":\""
					+ accountDetailsRequest.getAccountNumber().trim() + "\"}}]}}";
		} else {
			cbdaccountInquiryRequest = "{\"PartyAcctRelInqRq\":{\"RqUID\":\"" + UUID.randomUUID().toString()
					+ "\",\"MsgRqHdr\":{\"SvcIdent\":{\"SvcProviderName\":\"" + svcProviderName + "\","
					+ "\"SvcProviderId\":\"" + svcProviderId + "\",\"SvcName\":\"" + partyAcctRelInqSCDMAcctInq
					+ "\"}},\"PartyAcctRelSel\":[{\"AcctKeys\":{\"VirAcctId\":\""
					+ accountDetailsRequest.getAccountNumber().trim() + "\"}}]}}";
		}

		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.set("client-id", clientId);
		headers.set("client-secret", clientSecret);
		headers.set("x-correlation-id", UUID.randomUUID().toString());

		HttpEntity<String> entity = new HttpEntity<>(cbdaccountInquiryRequest, headers);

		// Random response generation
		int randomResp = (int) Math.floor(Math.random() * 2);
		String response;
		switch (randomResp) {
		case 0:
			response = """
										   {
					  "PartyAcctRelInqRs": {
					    "Status": {
					      "StatusCode": "0",
					      "Severity": "Info",
					      "StatusDesc": "Success"
					    },
					    "RqUID": "5fc5aaad-0c30-47a8-b101-e3256d433976",
					    "PartyAcctRelRec": {
					      "PartyAcctRelInfo": {
					        "AcctRef": {
					          "AcctKeys": {
					            "AcctId": "1000068898"
					          },
					          "AcctRec": {
					            "AcctStatus": {
					              "AcctStatusCode": "Active"
					            }
					          },
					          "AcctInfo": {
					            "CurCode": {
					              "CurCodeType": "ISO 4217",
					              "CurCodeValue": "AED"
					            },
					            "AcctType": {
					              "AcctTypeCode": "CBD ApplicationType",
					              "AcctTypeValue": "CK"
					            },
					            "AcctTitle": "RIM NO 959",
					            "AcctBal": {
					              "BalType": "DepLmtBal",
					              "CurAmt": {
					                "Amt": "250000.000000",
					                "CurCode": {
					                  "CurCodeType": "ISO 4217",
					                  "CurCodeValue": "AED"
					                }
					              }
					            },
					            "Segmentation": {
					              "SegmentCode": "22",
					              "SegmentDesc": "Small Business"
					            }
					          }
					        }
					      }
					    }
					  }
					}
										""";
			break;
		case 1:
			response = """
					        	 		{
					    "PartyAcctRelInqRs": {
					        "Status": {
					            "StatusCode": 0,
					            "Severity": "Info",
					            "StatusDesc": "Success",
					            "AdditionalStatus": {
					                "StatusCode": 750,
					                "Severity": "Info",
					                "StatusDesc": "Account is not eligible for transaction."
					            }
					        },
					        "RqUID": "9f46aec4-2d07-46ec-8138-ee6d4e60b846"
					    }
					}
					        	 		""";
			break;

//			{
//				  "PartyAcctRelInqRs": {
//				    "Status": {
//				      "StatusCode": "0",
//				      "Severity": "Info",
//				      "StatusDesc": "Success",
//				      "AdditionalStatus": {
//				        "StatusCode": "1120",
//				        "Severity": "Info",
//				        "StatusDesc": "No records match the selection criteria of the request."
//				      }
//				    }

		default:
			response = """
					             		{
					    "PartyAcctRelInqRs": {
					        "Status": {
					            "StatusCode": "200",
					            "Severity": "Warning",
					            "StatusDesc": "One or more of the elements in the request is either invalid or is inconsistent with other elements.",
					            "AdditionalStatus": {
					                "StatusCode": "200",
					                "Severity": "Warning",
					                "StatusDesc": "AcctID should not be '' or null"
					            }
					        },
					        "RqUID": "a9c59581-fad8-4b3e-8b81-2fc1a3c841dc"
					    }
					}
					""";
			break;
		}
		ResponseEntity<String> responseString = null;
		try {

			responseString = restTemplate.exchange(cbdWebEndPointURL + serviceUrl,
					HttpMethod.POST, entity, String.class);


			logger.debug("Response Status Code: {}", responseString.getStatusCode().value());
			logger.debug("Response Headers: {}", responseString.getHeaders());
			logger.debug("Response Body: {}", responseString.getBody());

			logger.debug("Response JSON String ::: " + responseString);

		} catch (HttpClientErrorException e) {
			logger.error("HttpClientErrorException: {}", e.getMessage());
			String errorResponse = e.getResponseBodyAsString();
			logger.error("Error Response Body: {}", errorResponse);

			// You can create a mock response or return the error response directly
			responseString = new ResponseEntity<>(errorResponse, e.getStatusCode());
		}

		return responseString;
	}


	public BankApiCustomResponse sendCashDepositTxnRequest(Transaction deposit) throws Exception {

		System.setProperty("javax.net.ssl.trustStore", keyStoreJksPath.trim());
		System.setProperty("javax.net.ssl.trustStorePassword", keyStoreJksPassword.trim());
		System.setProperty("javax.net.ssl.keyStore", keyStoreJksPath.trim());
		System.setProperty("javax.net.ssl.keyStorePassword", keyStoreJksPassword.trim());

 

		final RestTemplate restTemplate = new RestTemplate();
		String transactionPostingServiceUrl = "https://tgscdmtest.cbd.dev/exp-currentaccount-svcs-api/Services/CurrentAccount/Xfer/XferAdd";

//		String cbdTxnPostingRequest = """ 
//				{
//				"XferAddRq": {
//				        "RqUID": "{{$guid}}",
//				        "MsgRqHdr": {
//				            "SvcIdent": {
//				                "SvcProviderName": "ET",
//				                "SvcProviderId": "29",
//				                "SvcName": "Transfer-Posting",
//				                "SvcId": "156",
//				                "OriginatorID": "533"
//				            }
//				        },
//				        "XferInfo": {
//				            "FromAcctRef": {
//				                "AcctKeys": {
//				                    "AcctId": "1010003539",
//				                    "AcctType": "CK",
//				                    "CurCode": {
//				                        "CurCodeType": "ISO 4217",
//				                        "CurCodeValue": "AED"
//				                    }
//				                }
//				            },
//				            "ToAcctRef": {
//				                "AcctKeys": {
//				                    "AcctId": "1000125581",
//				                    "AcctType": "CK",
//				                    "CurCode": {
//				                        "CurCodeType": "ISO 4217",
//				                        "CurCodeValue": "AED"
//				                    }
//				                }
//				            },
//				            "CurAmt": {
//				                "Amt": 30
//				            },
//				            "ExpediteInd": false,
//				            "ReversalInd": false,
//				            "DebitInd": true,
//				            "RefData": {
//				                "RefIdent": "ATP-06929688",
//				                "CreditRefDesc": "Etisalat PAYMENT for 0502910613 via AUTOPAY REF_NO-ATP-06929688",
//				                "DebitRefDesc": "Etisalat PAYMENT for 0502910613 via AUTOPAY REF_NO-ATP-06929688"
//				            }
//				        }
//				    }
//				} """;

		String cbdTxnPostingRequest = """
				{
				    "XferAddRq": {
				        "RqUID": "%s",
				        "MsgRqHdr": {
				            "SvcIdent": {
				                "SvcProviderName": "%s",
				                "SvcProviderId": "%s",
				                "SvcName": "Transfer-Posting",
				                "SvcId": "156",
				                "OriginatorID": "533"
				            }
				        },
				        "XferInfo": {
				            "FromAcctRef": {
				                "AcctKeys": {
				                    "AcctId": "%s",
				                    "AcctType": "CK",
				                    "CurCode": {
				                        "CurCodeType": "ISO 4217",
				                        "CurCodeValue": "AED"
				                    }
				                }
				            },
				            "ToAcctRef": {
				                "AcctKeys": {
				                    "AcctId": "%s",
				                    "AcctType": "CK",
				                    "CurCode": {
				                        "CurCodeType": "ISO 4217",
				                        "CurCodeValue": "AED"
				                    }
				                }
				            },
				            "CurAmt": {
				                "Amt": %s
				            },
				            "ExpediteInd": false,
				            "ReversalInd": false,
				            "DebitInd": true,
				            "RefData": {
				                "RefIdent": "%s",
				                "CreditRefDesc": "%s",
				                "DebitRefDesc": "%s"
				            }
				        }
				    }
				}
				""".formatted(UUID.randomUUID().toString(), svcProviderName, svcProviderId, deposit.glAccountNumber(),
				deposit.AccountNumber(), deposit.depositCashAmount(), deposit.uniqueTransactionId(),
				generateCreditRefDesc(deposit), generateCreditRefDesc(deposit));

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

		ResponseEntity<String> responseString = restTemplate.exchange(transactionPostingServiceUrl, HttpMethod.POST,
				entity, String.class);
		logger.debug("Response Status Code: {}", responseString.getStatusCode());
		logger.debug("Response Headers: {}", responseString.getHeaders());
		logger.debug("Response Body: {}", responseString.getBody());

		logger.debug("Response JSON String ::: " + responseString);
		System.out.println(responseString);
		// System.out.println("Result ::::::::::: " + result.toString());

		return new BankApiCustomResponse(responseString.getStatusCode().value(), responseString.getHeaders(),
				cbdTxnPostingRequest, responseString.getBody());
	}

	public String generateCreditRefDesc(Transaction deposit) { // ,String customerNarration, String locationName, String
																// accountHolderName , String accountNumber , String
																// ccTxnId, String deviceId) {
		String narrationDesc = "";
		String customData1 = null;

		if (deposit.customerNarration() != null && !deposit.customerNarration().isBlank()) {
			customData1 = deposit.customerNarration().toString().replaceAll("[^a-zA-Z0-9\\s\\/\\#\\-]", "");
			customData1 = customData1.substring(0, Math.min(customData1.length(), 16));
		}

		if (deposit.locationName() != null && !deposit.locationName().isBlank()) {
			String sanitizedLocation = deposit.locationName().toString().replaceAll("[^a-zA-Z0-9\\s]+", "");
			sanitizedLocation = sanitizedLocation.substring(0, Math.min(sanitizedLocation.length(), 16));

			if (deposit.AccountHolderName() != null && !deposit.AccountHolderName().isBlank()) {
				String sanitizedAccountHolder = deposit.AccountHolderName().toString().replaceAll("[^a-zA-Z0-9\\s]+",
						"");
				sanitizedAccountHolder = sanitizedAccountHolder.substring(0,
						Math.min(sanitizedAccountHolder.length(), 33));

				if (deposit.AccountNumber() != null && (deposit.AccountNumber().toString().startsWith("1")
						|| deposit.AccountNumber().toString().startsWith("2"))) {
					narrationDesc = (customData1 != null && !customData1.isBlank())
							? "CBD SCDM %s %s %d %s %s".formatted(sanitizedLocation, deposit.DeviceId().toString(),
									deposit.ccTxnId().toString(), customData1)
							: "CBD SCDM %s %s %d %s".formatted(sanitizedLocation, deposit.DeviceId().toString(),
									deposit.ccTxnId().toString());
				} else {
					narrationDesc = "Cash Dep SCDM %s %s %s".formatted(deposit.AccountNumber().toString(),
							sanitizedAccountHolder, customData1);
				}
			} else {
				narrationDesc = "CBD SCDM %s %s %d %s".formatted(sanitizedLocation, deposit.DeviceId().toString(),
						deposit.ccTxnId().toString(), customData1);
			}
		} else {
			narrationDesc = "CBD SCDM %s %d %s".formatted(deposit.locationName().toString(),
					deposit.DeviceId().toString(), customData1);
		}

		return narrationDesc;
	}

}

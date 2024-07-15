package com.sesami.sesamiscdmintegration.cbd.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sesami.sesamiscdmintegration.cbd.webServiceClient.CbdWebServiceClient;

public class CbdTransactionPostingService {

	@Autowired
	private CbdWebServiceClient cbdWebServiceClient;
	
	
	// Java 22 
	
//	String cbdTxnPostingRequest = """
//		{
//		    "XferAddRq": {
//		        "RqUID": "%s",
//		        "MsgRqHdr": {
//		            "SvcIdent": {
//		                "SvcProviderName": "%s",
//		                "SvcProviderId": "%s",
//		                "SvcName": "Transfer-Posting",
//		                "SvcId": "156",
//		                "OriginatorID": "533"
//		            }
//		        },
//		        "XferInfo": {
//		            "FromAcctRef": {
//		                "AcctKeys": {
//		                    "AcctId": "%s",
//		                    "AcctType": "CK",
//		                    "CurCode": {
//		                        "CurCodeType": "ISO 4217",
//		                        "CurCodeValue": "AED"
//		                    }
//		                }
//		            },
//		            "ToAcctRef": {
//		                "AcctKeys": {
//		                    "AcctId": "%s",
//		                    "AcctType": "CK",
//		                    "CurCode": {
//		                        "CurCodeType": "ISO 4217",
//		                        "CurCodeValue": "AED"
//		                    }
//		                }
//		            },
//		            "CurAmt": {
//		                "Amt": %s
//		            },
//		            "ExpediteInd": false,
//		            "ReversalInd": false,
//		            "DebitInd": true,
//		            "RefData": {
//		                "RefIdent": "%s",
//		                "CreditRefDesc": "%s",
//		                "DebitRefDesc": "%s"
//		            }
//		        }
//		    }
//		}
//		""".formatted(
//		    UUID.randomUUID().toString(),
//		    cbdSvcProviderName,
//		    cbdSvcProviderId,
//		    deposit.getGlDebitAccount(),
//		    deposit.getAccountNumber(),
//		    deposit.getDepositedCashAmount(),
//		    deposit.getTransactionId(),
//		    generateCreditRefDesc(deposit),
//		    generateCreditRefDesc(deposit)
//		);
	
	
	
	
	
	
	
	
	
	
}

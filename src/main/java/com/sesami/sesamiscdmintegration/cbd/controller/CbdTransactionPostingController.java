package com.sesami.sesamiscdmintegration.cbd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesami.sesamiscdmintegration.accountinquiry.bean.AccountDetailsRequest;
import com.sesami.sesamiscdmintegration.accountinquiry.bean.AccountDetailsResponse;
import com.sesami.sesamiscdmintegration.cbd.accountInquiryBean.RootResponse;
import com.sesami.sesamiscdmintegration.cbd.service.CbdAccountInquiryClientService;
import com.sesami.sesamiscdmintegration.cbd.service.CbdTransactionPostingService;
import com.sesami.sesamiscdmintegration.transactionPosting.bean.TransactionPostingRequestBean;
import com.sesami.sesamiscdmintegration.transactionPosting.bean.TransactionPostingResponseBean;

@RestController
@RequestMapping("/api/client/transactionPosting")
public class CbdTransactionPostingController {
	
	
	
	
	

    private final CbdTransactionPostingService cbdTransactionPostingService;
    
   
    
    

    @Autowired
    public CbdTransactionPostingController(CbdTransactionPostingService cbdTransactionPostingService ) {
        this.cbdTransactionPostingService = cbdTransactionPostingService;
       // this.transactionService = transactionService;
        
    }
    

	@PostMapping("/mock-api/transaction")
	public ResponseEntity<String> mockTransactionEndpoint(@RequestBody String request) {

		int randomResp = (int) Math.floor(Math.random() * 2);
		String mockResponse;
		switch (randomResp) {
		case 0:
			mockResponse = """
										{
					    "XferAddRs": {
					        "Status": {
					            "StatusCode": 0,
					            "Severity": "Info",
					            "StatusDesc": "Success"
					        },
					        "RqUID": "37896641-ca7b-412b-bcfb-e62fcb5872bc",
					        "XferRec": {
					            "XferInfo": {
					                "DebitRef": {
					                    "CurAmt": {
					                        "Amt": 30.000000,
					                        "CurCode": "AED"
					                    }
					                },
					                "CreditRef": {
					                    "CurAmt": {
					                        "Amt": 30.000000,
					                        "CurCode": "AED"
					                    }
					                },
					                "RefData": {
					                    "RefIdent": "ATP-06929688"
					                }
					            }
					        },
					        "XferStatusRec": {
					            "XferStatusCode": "0",
					            "XferStatusDesc": "TRANSACTION POSTED SUCCESSFULLY"
					        }
					    }
					}
					""";
			break;
		case 1:
			mockResponse = """
									       {
				    "XferAddRs": {
				        "Status": {
				            "StatusCode": 0,
				            "Severity": "Info",
				            "StatusDesc": "Success"
				        },
				        "RqUID": "f7f9bbcf-ff69-4810-8724-122631963213",
				        "XferRec": {
				            "XferInfo": {
				                "RefData": {
				                    "RefIdent": "ATP-06929688"
				                }
				            }
				        },
				        "XferStatusRec": {
				            "XferStatusCode": "-120",
				            "XferStatusDesc": "TRANSACTION POSTING FAILED ERR(70)"
				        }
				    }
				} 	 		
					""";
			break;



		default:
			mockResponse = """
					
					""";
			break;
		}

		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");

		return new ResponseEntity<>(mockResponse, headers, HttpStatus.OK);
	}
	
	
	
	
	 @PostMapping("/transactionPostingService")
	    public ResponseEntity<TransactionPostingResponseBean> transactionPostingService(@RequestBody TransactionPostingRequestBean transactionPostingRequestBean) {
		 TransactionPostingResponseBean responseObject =null;

	    	// ResponseEntity<String> response = clientService.getPartyAccountRelation_AccountNumber(request);
	    	ResponseEntity<String> response = cbdTransactionPostingService.getPartyAccountRelation_AccountNumber_mock(request);
	    	if(response!= null && response.getStatusCode() == HttpStatus.OK) {

	    		//  RootResponse rootResponse = convertJsonStringResponseToClassObject(response.getBody(), RootResponse.class);
	    		
	    		
	    		responseObject = new TransactionPostingResponseBean();
	    		responseObject.setRequestUniqueNumber(transactionPostingRequestBean.getRequestUniqueNumber());
//	    		if(rootResponse.getPartyAcctRelInqRs()!=null) {
//	    			responseObject.setAccountNumber(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctKeys().getAcctId());
//	        		responseObject.setAccountHolderName(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctTitle());
//	        		responseObject.setAccountType(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctType().getAcctTypeValue());
//	        		responseObject.setDailyDepositLimit(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctBal().getCurAmt().getAmt());
//	        		responseObject.setMonthtlyTransactionLimit(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctBal().getCurAmt().getAmt());
//	        		responseObject.setCurrencyCode(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctInfo().getAcctBal().getCurAmt().getCurCode().getCurCodeValue());
//	        		responseObject.setAccountStatus(rootResponse.getPartyAcctRelInqRs().getPartyAcctRelRec().getPartyAcctRelInfo().getAcctRef().getAcctRec().getAcctStatus().getAcctStatusCode());
//	        		responseObject.setDepositAllowed(Boolean.TRUE);
//		    		responseObject.setBankErrorCode(String.valueOf(rootResponse.getPartyAcctRelInqRs().getStatus().getStatusCode()));
//		            responseObject.setBankErrorDesc(rootResponse.getPartyAcctRelInqRs().getStatus().getStatusDesc());
//		           // responseObject.setCdmApiCode(customPropertiesMap.get("possible").getCode());
//		          //  responseObject.setCdmCustomerErrorMessage(customPropertiesMap.get("possible").getMessage());
//	    		}else {
//	    			 responseObject = handleNotFoundResponse(response, request);
//	    		}
	    		
	    	}else if(response!= null && response.getStatusCode() == HttpStatus.NOT_FOUND) {
	    		
	          //    responseObject = handleNotFoundResponse(response, request);
	           
	    	}
	        
	        return ResponseEntity.ok(responseObject);
	    }
	
	
	
	
	
	
	

}

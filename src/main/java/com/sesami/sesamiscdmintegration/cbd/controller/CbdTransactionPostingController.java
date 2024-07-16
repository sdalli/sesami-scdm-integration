package com.sesami.sesamiscdmintegration.cbd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

		 

		 TransactionPostingResponseBean transactionPostingResponseBean = cbdTransactionPostingService.sendCashDepositTxnRequest(transactionPostingRequestBean);
		 
		 
		 

	        
	      return ResponseEntity.ok(transactionPostingResponseBean);
	    }
	
	
	
	
	
	

}

package com.sesami.sesamiscdmintegration.cbd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sesami.sesamiscdmintegration.bank.bean.BankApiCustomResponse;
import com.sesami.sesamiscdmintegration.cbd.transactionPostingBean.CbdTransactionPostServiceRootResponse;
import com.sesami.sesamiscdmintegration.cbd.webServiceClient.CbdWebServiceClient;
import com.sesami.sesamiscdmintegration.common.util.SesamiParsingUtil;
import com.sesami.sesamiscdmintegration.transactionPosting.bean.TransactionPostingRequestBean;
import com.sesami.sesamiscdmintegration.transactionPosting.bean.TransactionPostingResponseBean;
@Service
public class CbdTransactionPostingService {

	@Autowired
	private CbdWebServiceClient cbdWebServiceClient;
	
	
	@Value("${cdmCustomerSuccessMessage}")
	private String cdmCustomerSuccessMessage;
	
	@Value("${cdmCustomerFailureMessage}")
	private String cdmCustomerFailureMessage;
	
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
	
	
	
	

	
	public TransactionPostingResponseBean sendCashDepositTxnRequest(TransactionPostingRequestBean transactionPostingRequestBean) {
		
		TransactionPostingResponseBean transactionPostingResponseBean = new TransactionPostingResponseBean();
		
		try {
			//BankApiCustomResponse bankApiCustomResponse = cbdWebServiceClient.sendCashDepositTxnRequest(transactionPostingRequestBean);
			BankApiCustomResponse<?> bankApiCustomResponse = cbdWebServiceClient.sendCashDepositTxnRequest_mock(transactionPostingRequestBean);
			if(bankApiCustomResponse!=null && bankApiCustomResponse.getStatusCode() == 200) {
				CbdTransactionPostServiceRootResponse transactionPostServiceRootResponse =  SesamiParsingUtil.convertJsonStringResponseToClassObject(bankApiCustomResponse.getBody(), CbdTransactionPostServiceRootResponse.class);
				transactionPostingResponseBean.setBankCode(transactionPostingRequestBean.getBankCode());
				transactionPostingResponseBean.setAccountNumber(transactionPostingRequestBean.getAccountNumber());
				transactionPostingResponseBean.setRequestUniqueNumber(transactionPostingRequestBean.getRequestUniqueNumber());
				transactionPostingResponseBean.setBankUniqueTransactionNumber(transactionPostingRequestBean.getRequestUniqueNumber());
				if(transactionPostServiceRootResponse!= null && transactionPostServiceRootResponse.getXferAddRs().getXferStatusRec().getXferStatusCode().equalsIgnoreCase("0") ) {
					
					transactionPostingResponseBean.setBankWebServiceCode(transactionPostServiceRootResponse.getXferAddRs().getXferStatusRec().getXferStatusCode());
					transactionPostingResponseBean.setBankWebServiceDesc(transactionPostServiceRootResponse.getXferAddRs().getXferStatusRec().getXferStatusDesc());
					transactionPostingResponseBean.setInternalWebServiceCode("200");
					transactionPostingResponseBean.setInternalWebServiceDesc("SUCCESS");
					transactionPostingResponseBean.setCdmCustomerErrorMessage(String.format(cdmCustomerSuccessMessage, transactionPostingRequestBean.getBankCode(), transactionPostingRequestBean.getRequestUniqueNumber()));
				}else {
					
					transactionPostingResponseBean.setBankWebServiceCode(transactionPostServiceRootResponse.getXferAddRs().getXferStatusRec().getXferStatusCode());
					transactionPostingResponseBean.setBankWebServiceDesc(transactionPostServiceRootResponse.getXferAddRs().getXferStatusRec().getXferStatusDesc());
					transactionPostingResponseBean.setInternalWebServiceCode("400");
					transactionPostingResponseBean.setInternalWebServiceDesc("FAILED");
					transactionPostingResponseBean.setCdmCustomerErrorMessage(String.format(cdmCustomerFailureMessage, transactionPostingRequestBean.getBankCode(), transactionPostingRequestBean.getRequestUniqueNumber()));
					
				}
				
				System.out.println(transactionPostServiceRootResponse);
			}
			if(bankApiCustomResponse!=null) {
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return transactionPostingResponseBean;
	}
	
	
	
	
	
}

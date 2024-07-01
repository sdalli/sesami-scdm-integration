package com.sesami.sesamiscdmintegration;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.sesami.sesamiscdmintegration.bank.bean.BankApiCustomResponse;
import com.sesami.sesamiscdmintegration.bank.bean.Transaction;
import com.sesami.sesamiscdmintegration.cbd.service.CbdAccountInquiryClientService;

@SpringBootTest
public class TransactionServiceTest {

    @MockBean
    private RestTemplate restTemplate;

    @InjectMocks
    private CbdAccountInquiryClientService cbdAccountInquiryClientService;

    @Value("${mock-api-url}")
    private String mockApiUrl;

    @Test
    public void testSendCashDepositTxnRequest() throws Exception {
        // Mock response
        String mockResponse = """
                {
                    "XferAddRs": {
                        "RqUID": "mock-uid",
                        "MsgRqHdr": {
                            "SvcIdent": {
                                "SvcProviderName": "MockProvider",
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
                                "CreditRefDesc": "Mock Payment",
                                "DebitRefDesc": "Mock Payment"
                            }
                        }
                    }
                }
                """;

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        ResponseEntity<String> responseEntity = new ResponseEntity<>(mockResponse, headers, HttpStatus.OK);

        // Mock the RestTemplate exchange method
        when(restTemplate.exchange(eq(mockApiUrl), eq(HttpMethod.POST), any(HttpEntity.class), eq(String.class)))
                .thenReturn(responseEntity);

        // Create a sample Transaction object
        Transaction deposit = new Transaction("100010000022", "100-200-1254", "100000001", "Account holder name" ,"100.00","CBD Test Branch","CBD Narration","100100","1");

        // Call the method to test
        BankApiCustomResponse response = cbdAccountInquiryClientService.sendCashDepositTxnRequest(deposit);

        // Assertions to verify the response
        // Add your assertions here based on the expected behavior
    }
}

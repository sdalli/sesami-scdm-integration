package com.sesami.sesamiscdmintegration;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.sesami.sesamiscdmintegration.cbd.service.CbdAccountInquiryClientService;

@ExtendWith(MockitoExtension.class)
public class ClientServiceTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private CbdAccountInquiryClientService clientService;

    @Test
    public void testGetPartyAccountRelation() {
        String requestBody = "{ \"PartyAcctRelInqRq\": { \"RqUID\": \"12345\", \"MsgRqHdr\": { \"SvcIdent\": { \"SvcProviderName\": \"WBG\", \"SvcProviderId\": \"105\", \"SvcName\": \"PartyAcctRelInq-SCDMAcctVal\" } }, \"PartyAcctRelSel\": [{ \"AcctKeys\": { \"AcctId\": \"1000060002\" } }] } }";
        String correlationId = "test-correlation-id";

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.set("client-id", "586eef2adb7f422fbf5ed842e614dea4");
        headers.set("client-secret", "bd24bC7C68F54a5F89Eb7f33199bc096");
        headers.set("x-correlation-id", correlationId);

        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);

        ResponseEntity<String> expectedResponse = ResponseEntity.ok("response");

        when(restTemplate.exchange(
                eq("https://mwuatrtf.cbd.dev/exp-customer-profile-api/Services/CustomerProfile/PartyAcctRelInq"),
                eq(HttpMethod.POST),
                eq(entity),
                eq(String.class)
        )).thenReturn(expectedResponse);

        ResponseEntity<String> response = clientService.getPartyAccountRelation(requestBody, correlationId);

        assertEquals(expectedResponse, response);
    }
}

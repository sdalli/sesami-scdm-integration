package com.sesami.sesamiscdmintegration;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParsingExample {

    public static void main(String[] args) {
        String jsonResponse = "{"
            + "\"Status\": {"
            + "  \"StatusCode\": \"0\","
            + "  \"Severity\": \"Info\","
            + "  \"StatusDesc\": \"Success\""
            + "},"
            + "\"RqUID\": \"e9109cc7-956f-4090-be5c-0f5229109524\","
            + "\"PartyAcctRelRec\": {"
            + "  \"PartyAcctRelInfo\": {"
            + "    \"AcctRef\": {"
            + "      \"AcctKeys\": {"
            + "        \"AcctId\": \"1000068898\""
            + "      },"
            + "      \"AcctRec\": {"
            + "        \"AcctStatus\": {"
            + "          \"AcctStatusCode\": \"Active\""
            + "        }"
            + "      },"
            + "      \"AcctInfo\": {"
            + "        \"CurCode\": {"
            + "          \"CurCodeType\": \"ISO 4217\","
            + "          \"CurCodeValue\": \"AED\""
            + "        },"
            + "        \"AcctType\": {"
            + "          \"AcctTypeCode\": \"CBD ApplicationType\","
            + "          \"AcctTypeValue\": \"CK\""
            + "        },"
            + "        \"AcctTitle\": \"RIM NO 959\","
            + "        \"AcctBal\": {"
            + "          \"BalType\": \"DepLmtBal\","
            + "          \"CurAmt\": {"
            + "            \"Amt\": \"250000.000000\","
            + "            \"CurCode\": {"
            + "              \"CurCodeType\": \"ISO 4217\","
            + "              \"CurCodeValue\": \"AED\""
            + "            }"
            + "          }"
            + "        },"
            + "        \"Segmentation\": {"
            + "          \"SegmentCode\": \"22\","
            + "          \"SegmentDesc\": \"Small Business\""
            + "        }"
            + "      }"
            + "    }"
            + "  }"
            + "}"
            + "}";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(jsonResponse);

            // Access individual elements
            JsonNode statusNode = rootNode.path("Status");
            String statusCode = statusNode.path("StatusCode").asText();
            String severity = statusNode.path("Severity").asText();
            String statusDesc = statusNode.path("StatusDesc").asText();

            String rqUID = rootNode.path("RqUID").asText();

            JsonNode acctKeysNode = rootNode.path("PartyAcctRelRec")
                                            .path("PartyAcctRelInfo")
                                            .path("AcctRef")
                                            .path("AcctKeys");
            String acctId = acctKeysNode.path("AcctId").asText();

            // Print the values
            System.out.println("Status Code: " + statusCode);
            System.out.println("Severity: " + severity);
            System.out.println("Status Description: " + statusDesc);
            System.out.println("RqUID: " + rqUID);
            System.out.println("Account ID: " + acctId);

            // You can access more fields similarly
            // JsonNode otherNode = rootNode.path("otherField");
            // String otherValue = otherNode.asText();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


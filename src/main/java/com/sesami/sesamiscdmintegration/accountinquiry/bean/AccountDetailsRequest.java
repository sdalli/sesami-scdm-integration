package com.sesami.sesamiscdmintegration.accountinquiry.bean;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountDetailsRequest {
    private String accountNumber;
    private String deviceId;
    private String bankCode;
    private String glAccountNumber;

  
}


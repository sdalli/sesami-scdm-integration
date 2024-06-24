package com.sesami.sesamiscdmintegration.accountinquiry.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountDetailsResponse {
    
	private String requestUniqueNumber;
	private String accountNumber;
    private String accountHolderName;
    private String accountType;
    private String dailyDepositLimit;
    private String monthtlyTransactionLimit;
    private String currencyCode;
    private String accountStatus;
    private Boolean depositAllowed;

    
}


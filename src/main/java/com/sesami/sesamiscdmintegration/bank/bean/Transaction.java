package com.sesami.sesamiscdmintegration.bank.bean;

public record Transaction (String uniqueTransactionId,  String glAccountNumber, String AccountNumber,String AccountHolderName, String depositCashAmount, String locationName, String customerNarration, String DeviceId, String ccTxnId ){
	
}

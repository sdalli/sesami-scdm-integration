package com.sesami.sesamiscdmintegration.bank.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String logo;
	private boolean enableAccountDeposit;
	private boolean enableCreditCardBillPayment;
	private boolean enableManualAccountEntry;
	private boolean enableAccountFromDebitCard;
	private boolean enableEIDValidation;
	private boolean enableEIDOnlineValidation;
	private boolean enableNarrationEntry;
	private boolean enablePayinAmountEntry;
	private boolean enableCardBasedCreditCard;
	private boolean enableManualCreditCardEntry;
	private boolean checkAccountNumberLength;
	private int accountNumberLength;

	//new
//	@OneToMany(mappedBy = "bank",  fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
//	@JsonManagedReference
//	private List<AdditionalInput> additionalInputs;


//	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<Book> books = new ArrayList<>();

//old
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "bank")
	@JsonManagedReference
	private List<AdditionalInput> additionalInputs;
}

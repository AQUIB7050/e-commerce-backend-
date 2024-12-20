package com.ecommerce.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PaymentInformation {
	
	@Column(name="cardholder_name")
	private String cardHolderName;
	
	@Column(name="card_number")
	private String cardNumber;
	
	@Column(name="expiration_date")
	private LocalDate expirationDate;
	
	private String cvv;

}

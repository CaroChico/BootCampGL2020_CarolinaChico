package com.globallogic.bootcamp.patterns;

public class Order {

	private static final String NAME = "Pesos";

	private String description;
	private String count;
	private Currency currency;


	public Order() {
		currency = Currency.getInstance(NAME);

	}

	public Currency getCurrency() {
		return currency;
	}
	
	
}

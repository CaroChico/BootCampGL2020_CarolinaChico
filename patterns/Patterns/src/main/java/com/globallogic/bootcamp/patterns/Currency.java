package com.globallogic.bootcamp.patterns;

public class Currency {

	private String name;

	private static Currency instance;

	public static Currency getInstance(String name) {
		if (instance == null) {
			instance = new Currency(name);
		}
		return instance;
		
	}

	private Currency(String name) {
		this.name = "ARS";
	}

}

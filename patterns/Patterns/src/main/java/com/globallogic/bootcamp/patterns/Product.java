package com.globallogic.bootcamp.patterns;

public class Product {

	private String name = "Clavos";
	private static Product nombre;

	public static Product getNombre(String name) {

		if (nombre == null) {
			nombre = new Product(name);
		}
		return nombre;

	}

	private Product(String name) {
		this.name = name;
	}

}

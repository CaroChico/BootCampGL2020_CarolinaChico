package com.globallogic.app;

public class Cafetera extends Electrodomestico {

	double litros;

	@Override
	public void encender() {
		System.out.println("Encendiendo Cafetera");
	}

	public void elegirSabor(String sabor) {
		System.out.println("Sabor elegido: " + sabor);

	}

}

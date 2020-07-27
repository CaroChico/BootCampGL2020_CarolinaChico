package com.globallogic.app;

public class Televisor extends Electrodomestico {
	
	double pulgadas;
	String resolucion;
	
	
	@Override
	public void encender() {
		System.out.println("Encendiendo televisor");
	}
	
	
	public void cambiarCanal(int canal) {
		System.out.println("Cambiando canal: " + canal);
		
	}
	

}

package com.globallogic.app;

public class Heladera extends Electrodomestico {

	double capacidad;
	boolean tieneFreezer;
	double capacidadFreezer;
	
	@Override
	public void encender() {
		System.out.println("Encendiendo la Heladera");
	}

	
	public void guardarElemento(String elemento) {
		System.out.println("Guardando " + elemento);
		
	}
	
	public void extraerElemento(String elemento) {
		System.out.println("Extrayendo " + elemento);
		
		
	}
	
}

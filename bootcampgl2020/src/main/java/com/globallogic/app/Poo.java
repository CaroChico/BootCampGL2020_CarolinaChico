package com.globallogic.app;

import java.util.ArrayList;
import java.util.List;

public class Poo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomestico e1 = new Electrodomestico();

		System.out.println("Marca: " + e1.marca);
		System.out.println("Peso: " + e1.peso);
		System.out.println("Consumo: " + e1.consumo);
		System.out.println("Color: " + e1.color);

		e1.encender();
		e1.apagar();

		Heladera h1 = new Heladera();

		System.out.println("Capacidad: " + h1.capacidad);
		System.out.println("Tiene freezer: " + h1.tieneFreezer);
		System.out.println("Capacidad freezer: " + h1.capacidadFreezer);

		h1.extraerElemento("Queso");
		h1.guardarElemento("Queso");
		h1.encender();
		h1.apagar();
		
		Televisor t1 = new Televisor();
		
		Cafetera c1 = new Cafetera();
		
		List<Electrodomestico> listaE = new ArrayList<Electrodomestico>();
		listaE.add(h1);
		listaE.add(t1);
		listaE.add(c1);
		
		
	for (Electrodomestico e : listaE) {
		
		e.encender();
	}
		
	}

}

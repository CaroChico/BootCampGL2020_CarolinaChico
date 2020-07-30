package com.globallogic.app.Ejercicios.ej7;

public class Hombre implements Animal, Persona {

	public static void main(String[] args) {

		Hombre h1 = new Hombre();
		h1.comeh();
		h1.dormir();
		h1.sonidoAnimal();
		h1.hablar();		
		
	}

	@Override
	public void dormir() {
		System.out.println("El hombre duerme muchas horas");

	}

	@Override
	public void hablar() {
		System.out.println("Las personas hablan mucho");

	}

	@Override
	public void sonidoAnimal() {
		System.out.println("El hombre no hace sonido animal");

	}

}
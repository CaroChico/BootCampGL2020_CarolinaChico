package com.globallogic.app.Ejercicios.ej7;

public class MainAnimal {

	private static final String TIPO_ANIMAL = "perro";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Perro dog = new Perro();
		dog.sonidoAnimal();
		dog.dormir();
		dog.come(TIPO_ANIMAL);
		Perro.camina(TIPO_ANIMAL);

	}

}

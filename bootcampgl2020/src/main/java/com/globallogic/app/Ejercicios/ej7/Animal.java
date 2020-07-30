package com.globallogic.app.Ejercicios.ej7;

public interface Animal {

	void dormir();

	void sonidoAnimal();

	default void come(String s) {
		System.out.println("El " + s + " se alimenta");
	}

}

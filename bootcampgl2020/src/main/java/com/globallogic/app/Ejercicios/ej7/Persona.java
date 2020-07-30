package com.globallogic.app.Ejercicios.ej7;

public interface Persona {

	void hablar();

	void dormir();

	default void comeh() {
		System.out.println("Se ejecuta método de la clase Hombre");

	}
}

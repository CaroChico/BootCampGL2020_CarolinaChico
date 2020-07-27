package com.globallogic.app;

public class Gato1 extends Gato {

	public static void main(String[] args) {

		Gato g1 = new Gato("Pedro", 4);

		System.out.println("Nombre: " + g1.getNombre());
		System.out.println("Cantidad de patas: " + g1.getPatas());

	}

}

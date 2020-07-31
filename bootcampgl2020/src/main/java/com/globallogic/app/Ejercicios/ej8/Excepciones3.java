package com.globallogic.app.Ejercicios.ej8;

public class Excepciones3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

		try {
			String atito = cars[4];
		} catch (Exception ex) {
			System.out.println("Excepción: índice de array fuera de límites");

		}
	}

}

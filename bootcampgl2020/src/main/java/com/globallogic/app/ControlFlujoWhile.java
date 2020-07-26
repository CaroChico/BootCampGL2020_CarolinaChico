package com.globallogic.app;

public class ControlFlujoWhile {

	public static void main(String[] args) {

		/*
		 * int i = 1;
		 * 
		 * while (i<=10) { System.out.println("Numero iterado: " + i); i++;
		 * 
		 * }
		 */

		int i = 1;

		while (i <= 50) {

			if (i % 2 == 0) {

				System.out.println("Valor iterado: " + i + " es par");
			} else {

				System.out.println("Valor iterado: " + i + " es impar");
			}
			i++;
		}

	}
}

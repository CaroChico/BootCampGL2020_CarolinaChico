package com.globallogic.app;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class ContolFlujoIf {

	public static void main(String[] args) throws IOException {

		/*
		 * int a = 3; int b = 10; int c = a + b;
		 * 
		 * if (c <= 10) {
		 * 
		 * System.out.println("La suma de los numeros es: " + c); } else {
		 * System.out.println("La suma de los numeros es mayor a 10");
		 * 
		 * }
		 * 
		 * char letra;
		 * 
		 * System.out.println("Ingrese una letra: "); letra = (char) System.in.read();
		 * System.in.read();
		 * 
		 * if (Character.isLowerCase(letra)) {
		 * System.out.println("No es una letra mayuscula");
		 * 
		 * } else { System.out.println("La letra es Mayuscula"); }
		 * 
		 */

		int compra;

		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el monto de la compra: ");
		compra = scan.nextInt();
		scan.close();

		if (compra < 300) {
			System.out.println("Sin descuentos. El total es: " + compra);

		} else if (compra > 300) {

			System.out.println("El descuento es: " + (compra * 0.25));

		} else {

			System.out.println("El descuento es: " + (compra * 0.2));

		}

	}

}

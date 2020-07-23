package com.globallogic.app;

import java.io.IOException;

public class ContolFlujoIf {

	public static void main(String[] args) throws IOException {

		int a = 3;
		int b = 10;
		int c = a + b;

		if (c <= 10) {

			System.out.println("La suma de los numeros es: " + c);
		} else {
			System.out.println("La suma de los numeros es mayor a 10");

		}

		char letra;

		System.out.println("Ingrese una letra: ");
		letra = (char) System.in.read();
		System.in.read();

		if (Character.isLowerCase(letra)) {
			System.out.println("No es una letra mayuscula");

		} else {
			System.out.println("La letra es Mayuscula");
		}

		
		
		
		
		
		
		
		
		
		
		
		
	}

}

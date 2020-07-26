package com.globallogic.app;

public class ControlFlujosForEach {

	public static void main(String[] args) {

//		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//
//		for (int num : numeros) {
//			System.out.println("Valor iterado: " + num);
//		}

//		String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
//
//		for (String dia : diasSemana) {
//
//			System.out.println("Dia de la semana: " + dia);
//		}
//
//	}

		String nombre = "BootCamp 2020";
			
		for (char letra : nombre.toCharArray()) {

			System.out.println("Letra: " + letra);
		}
	}
}

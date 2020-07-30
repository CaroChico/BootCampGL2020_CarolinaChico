package com.globallogic.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Persona {

	static List<EmpleadoEj6> empleados = new ArrayList<EmpleadoEj6>();

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		int id;
		String nombre;
		int sueldoBase;
		int horasExtras;
		boolean casado;
		int cantidadHijos;
		int contador = 0;

		Scanner scan = new Scanner(System.in);

		while (contador < 20) {

			try {
				System.out.println("Ingrese el ID: ");
				id = scan.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Valor incorrecto. ");
			} finally {
				System.out.println("Ingrese nuevamente el ID: ");
				id = scan.nextInt();
			}

			if (id == 0) {
				break;
			}

			System.out.println("Ingrese el Nombre: ");
			nombre = scan.next();

			System.out.println("Ingrese el Sueldo base: ");
			sueldoBase = scan.nextInt();

			System.out.println("Ingrese las Horas Extras: ");
			horasExtras = scan.nextInt();

			System.out.println("¿Es casado?: ");
			casado = scan.nextBoolean();

			System.out.println("Ingrese la cantidad de hijos: ");
			cantidadHijos = scan.nextInt();

			empleados.add(new EmpleadoEj6(id, nombre, sueldoBase, horasExtras, casado, cantidadHijos));

			contador++;
		}

		System.out.println("Ingrese el valor de la Hora Extra: ");
		EmpleadoEj6.valorHoraExtra = scan.nextInt();

		scan.close();

		EmpleadoEj6 mayorSueldo = empleados.get(0);
		EmpleadoEj6 menorSueldo = empleados.get(0);
		EmpleadoEj6 mayorSueldoBruto = empleados.get(0);
		EmpleadoEj6 menorSueldoBruto = empleados.get(0);

		for (EmpleadoEj6 e : empleados) {
			if (e.getSueldoBase() > mayorSueldo.getSueldoBase()) {
				mayorSueldo = e;
			}

			if (e.getSueldoBase() < menorSueldo.getSueldoBase()) {
				menorSueldo = e;
			}
			if (e.sueldoBruto(e.complemento()) > mayorSueldoBruto.sueldoBruto(mayorSueldoBruto.complemento())) {
				mayorSueldoBruto = e;
			}
			if (e.sueldoBruto(e.complemento()) < menorSueldoBruto.sueldoBruto(menorSueldoBruto.complemento())) {
				menorSueldoBruto = e;
			}
		}

		System.out.println("El emplado con mayor sueldo: " + mayorSueldo.getNombre());
		System.out.println("El emplado con menor sueldo: " + menorSueldo.getNombre());

		System.out.println("El emplado con mayor sueldo Bruto: " + mayorSueldoBruto.getNombre());
		System.out.println("El emplado con menor sueldo Bruto: " + menorSueldoBruto.getNombre());

		Collections.sort(empleados, new Comparator<EmpleadoEj6>() {

			public int compare(EmpleadoEj6 e1, EmpleadoEj6 e2) {
				// TODO Auto-generated method stub
				return new Integer(e1.getSueldoBase()).compareTo(new Integer(e2.getSueldoBase()));
			}

		});
		StringBuilder str = new StringBuilder("Los empleados de menor a mayor sueldo son: ");
		for (EmpleadoEj6 e : empleados) {

			str.append(e.getNombre());
			str.append(" ");
		}

		System.out.println(str.toString());
	}
}

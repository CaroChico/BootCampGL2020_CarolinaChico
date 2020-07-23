package com.globallogic.app;

public class EmpleadoDemo {
	
	public static void main(String [] args) {
		
		Empleado e1 = new Empleado();
		
		e1.salario = 1000;
		
		
		System.out.println(Empleado.nombre + " " + "tiene un salario promedio de : " + e1.salario );
	}

}

package com.globallogic.app.Ejercicios.ej8;

public class PropiaClaseExcepcion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new MiExcepcion("Esto es una Excepción");
		} catch (MiExcepcion ex) {
			System.out.println(ex.devolucion());
		}
		
	}

}

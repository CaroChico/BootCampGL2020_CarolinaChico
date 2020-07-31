package com.globallogic.app.Ejercicios.ej8;

public class Excepciones1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throw new Exception("Esto es una Excepción");
			
		}
		catch (Exception ex) {
			System.out.println("Se produjo una excepción: " + ex.getMessage());
		}
		finally {
			System.out.println("Esto se ejecuta sin importar si se presentan errores");
		}

	}

}

package com.globallogic.app.Ejercicios.ej8;

public class MiExcepcion extends Exception {
	
	String ref;
	
	public MiExcepcion(String msg) {
		this.ref = msg;
	}
	
	public String devolucion() {
		return ref;
	}
}

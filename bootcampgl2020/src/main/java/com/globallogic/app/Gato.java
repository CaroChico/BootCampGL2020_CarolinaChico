package com.globallogic.app;

public class Gato {

	private String nombre;
	private int patas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;

	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int numeroPatas) {
		this.patas = numeroPatas;

	}

	public Gato() {
		this.nombre = "";
		this.patas = 0;

	}

	public Gato(String nombre, int patas) {
		this.nombre = nombre;
		this.patas = patas;

	}
}

package com.globallogic.app;

public class EmpleadoEj6 {

	private int id;
	private String nombre;
	private int sueldoBase;
	private int horasExtras;
	private int retenciones;
	private boolean casado;
	private int cantidadHijos;
	public static int valorHoraExtra;
	private double porcentajeIrpf;

	public int getId() {
		return id;
	}

	public void setId(int Id) {
		this.id = Id;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String Nombre) {
		this.nombre = Nombre;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBse(int SueldoBase) {
		this.sueldoBase = SueldoBase;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int HorasExtras) {
		this.horasExtras = HorasExtras;
	}

	public int getRetenciones() {
		return retenciones;
	}

	public void setRetenciones(int Retenciones) {
		this.retenciones = Retenciones;
	}

	public boolean getCasado() {
		return casado;
	}

	public void setCasado(boolean Casado) {
		this.casado = Casado;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int CantidadHijos) {
		this.cantidadHijos = CantidadHijos;
	}

	public EmpleadoEj6() {
		this.id = 0;
		this.nombre = "";
		this.sueldoBase = 0;
		this.horasExtras = 0;
		this.casado = false;
		this.cantidadHijos = 0;
	}

	public EmpleadoEj6(int id, String nombre, int sueldoBase, int horasExtras, boolean casado, int cantidadHijos) {
		this.id = id;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.horasExtras = horasExtras;
		this.casado = casado;
		this.cantidadHijos = cantidadHijos;

	}

	public int complemento() {

		return horasExtras * valorHoraExtra;

	}

	public int sueldoBruto(int complemento) {

		return sueldoBase + complemento;
	}

	public double irpf(int sueldoBruto) {

		porcentajeIrpf = cantidadHijos * 0.01;

		if (casado) {
			porcentajeIrpf += 0.02;
		}

		double irpf = sueldoBruto * porcentajeIrpf;

		return irpf;

	}

	@Override
	public String toString() {

		StringBuilder str = new StringBuilder(id);
		str.append(" ");
		str.append(nombre);
		str.append("/n");
		str.append("Sueldo Base: ");
		str.append(sueldoBase);
		str.append("/n");
		str.append("Horas Extras: ");
		str.append(horasExtras);
		str.append("/n");
		str.append("tipo IRPF: ");
		str.append(porcentajeIrpf);
		str.append("/n");
		str.append("Casado: ");
		str.append("si");
		str.append("/n");
		str.append("Numero de Hijos: ");
		str.append("2");

		return str.toString();

	}

}

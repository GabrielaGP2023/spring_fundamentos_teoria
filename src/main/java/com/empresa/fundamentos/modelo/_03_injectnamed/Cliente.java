package com.empresa.fundamentos.modelo._03_injectnamed;

public  class Cliente {
	
	private String numNIF;
	private String nombre;
	
	@Override
	public String toString() {
		return "Cliente [numNIF=" + numNIF + ", nombre=" + nombre + "]";
	}
	
	public final String calcularFacturacion() {
		return "Su factura ...";
	}
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String numNIF, String nombre) {
		super();
		this.numNIF = numNIF;
		this.nombre = nombre;
	}

	public String getNumNIF() {
		return numNIF;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNumNIF(String numNIF) {
		this.numNIF = numNIF;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}

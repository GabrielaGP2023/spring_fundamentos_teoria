package com.empresa.fundamentos.modelo._02_primaryqualifier;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Data
@Component
public class SeguroCoche {
	//1. Atributos
	@Autowired
	@Qualifier("miTallerPintura")
	private ITaller taller;
	private String aseguradora;
	//2. M�todos
	public String reparar(Coche c) {
		return taller.reparar(c);
	}
	@Override
	public String toString() {
		return "SeguroCoche [taller=" + taller + ", aseguradora=" + aseguradora + "]";
	}
	
	//3. Constructores
	public SeguroCoche() {
		// TODO Auto-generated constructor stub
	}
	public SeguroCoche(ITaller taller, String aseguradora) {
		super();
		this.taller = taller;
		this.aseguradora = aseguradora;
	}
	//4. Setters y Getters
	public ITaller getTaller() {
		return taller;
	}
	public void setTaller(ITaller taller) {
		this.taller = taller;
	}
	public String getAseguradora() {
		return aseguradora;
	}
	public void setAseguradora(String aseguradora) {
		this.aseguradora = aseguradora;
	}
	
	

}

package com.empresa.fundamentos.modelo._02_primaryqualifier;

import org.springframework.stereotype.Component;

@Component("miTallerMecanica")
public class TallerMecanica implements ITaller {

	@Override
	public String reparar(Coche c) {
		// TODO Auto-generated method stub
		return "El coche con la matricula " + c.getMatricula() + " se esta reparando en el sistema mec�nico";
	}

}

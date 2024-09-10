package com.empresa.fundamentos.modelo._03_injectnamed;

import jakarta.inject.Named;

@Named("aD")
public class AccesoDesarrollo implements IDAO {

	@Override
	public String insertar(Cliente c) {
		// TODO Auto-generated method stub
		return "Se ha insertado en la BBDD de desarrollo el cliente con nif " + c.getNumNIF();
	}

}

package com.empresa.fundamentos.modelo._03_injectnamed;

import jakarta.inject.Named;

@Named("aP")
public class AccesoProduccion implements IDAO {

	@Override
	public String insertar(Cliente c) {
		// TODO Auto-generated method stub
		return "Se ha insertado en la BBDD de produccion el cliente con nif " + c.getNumNIF();
	}

}

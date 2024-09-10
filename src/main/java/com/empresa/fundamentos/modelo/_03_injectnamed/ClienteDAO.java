package com.empresa.fundamentos.modelo._03_injectnamed;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Qualifier;

@Named("dao")
public class ClienteDAO {
	//1. Atributos
	@Inject
	@Qualifier("aD")
	private IDAO conexion;
	
	//2. M�todos
	public String insertar(Cliente c) {
		return conexion.insertar(c);
	}
	
	public ClienteDAO() {
		// TODO Auto-generated constructor stub
	}

	public ClienteDAO(IDAO conexion) {
		super();
		this.conexion = conexion;
	}

	public IDAO getConexion() {
		return conexion;
	}

	public void setConexion(IDAO conexion) {
		this.conexion = conexion;
	}
	
	

}

package com.empresa.fundamentos;


import com.empresa.fuera.paquete.pordefecto.modelo.Fuera;
import com.empresa.fundamentos.modelo._01componentautowired.Saludo;
import com.empresa.fundamentos.modelo._02_primaryqualifier.Coche;
import com.empresa.fundamentos.modelo._02_primaryqualifier.SeguroCoche;
import com.empresa.fundamentos.modelo._03_injectnamed.Cliente;
import com.empresa.fundamentos.modelo._03_injectnamed.ClienteDAO;
import com.empresa.fundamentos.modelo._04_ciclovida.CicloVida;
import com.empresa.fundamentos.modelo._05_resource.Bicicleta;
import com.empresa.fundamentos.modelo._06_value.Configuracion;
import jakarta.annotation.Resource;
import jakarta.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = "com.empresa")
public class FundamentosApplication implements CommandLineRunner {
	@Autowired
/*
 Spring realiza primero la inyección de dependencias basada en anotaciones
 (por ejemplo, usando @Autowired), y luego realiza la inyección externa de propiedades
 si se usan configuraciones externas como XML. Esto significa que si usas ambos enfoques
 (anotaciones y XML), Spring da prioridad a las anotaciones primero.
 */
	private Saludo s1;

	@Autowired
	private SeguroCoche miSeguro;

	@Inject
	private ClienteDAO dao;

	@Autowired
	private CicloVida cicloVida;

	@Autowired
	private Fuera fuera;

	@Resource(name="b1")
	private Bicicleta b1;

	@Autowired
	private Configuracion miConfiguracion;


	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		_06_value();
	}

	private void _06_value() {
		System.out.println(miConfiguracion.toString());
	}

	private void _05_resource() {
		System.out.println(b1.avanzar());
	}

	private void _03InjectNamed() {
		Cliente cliente = new Cliente("12345678A", "Juan López");
		System.out.println(dao.insertar(cliente));

	}

	private void _02PrimaryQualifier() {
		Coche coche = new Coche("1234ABC","Auris");
		System.out.println(miSeguro.reparar(coche));
	}

	private void _01ComponentAutowired() {
		System.out.println(s1.saludar());
	}

}

package com.empresa.fundamentos.modelo._04_ciclovida;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CicloVida {
    @PostConstruct
    public void inicializacion() {
        // Lógica de inicialización después de que el bean ha sido creado
        System.out.println("Bean inicializado");
    }

    @PreDestroy
    public void limpieza() {
        // Lógica de limpieza antes de que el bean sea destruido
        System.out.println("Bean destruido");
    }
}

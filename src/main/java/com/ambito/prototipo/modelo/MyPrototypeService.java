package com.ambito.prototipo.modelo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class MyPrototypeService {
    public MyPrototypeService() {
        System.out.println("Prototype bean creado");
    }

    public void doSomething() {
        System.out.println("Ejecutando método del Prototype");

    }

    @PostConstruct
    public void init() {
        System.out.println("Inicialización del bean Prototype");
    }
    /*
    Un detalle importante es que Spring no gestiona el ciclo de vida completo de los beans prototype.
    Spring solo los crea, pero no los destruye automáticamente, por lo que si necesitas limpieza
    (como cerrar conexiones o liberar recursos), deberás gestionarlo manualmente.
     */
    @PreDestroy
    public void destroy() {
        System.out.println("Destrucción del bean Prototype");
    }
}

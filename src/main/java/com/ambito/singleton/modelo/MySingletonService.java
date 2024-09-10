package com.ambito.singleton.modelo;

public class MySingletonService {
    public MySingletonService() {
        System.out.println("Singleton bean creado");
    }

    public void doSomething() {
        System.out.println("Ejecutando método del Singleton");
    }
}

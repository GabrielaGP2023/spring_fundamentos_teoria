package com.empresa.fundamentos.modelo._01componentautowired;

import org.springframework.stereotype.Component;

@Component
public class Saludo {
    public String saludar(){

        return ("Bienvenidos al curso de Java");
    }
}

package com.empresa.fundamentos.modelo._05_resource;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component("electrico2")
@NoArgsConstructor
public class MotorElectrico2 implements IMotor{
    @Override
    public String arrancar() {
        return "Arrancando con motor 2";
    }

    @Override
    public String cargar() {
        return "Cargando el motor 2";
    }

    @Override
    public String cambiarPotencia() {
        return "Cambiando la potencia del motor 2";
    }
}

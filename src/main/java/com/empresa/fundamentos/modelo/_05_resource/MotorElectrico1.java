package com.empresa.fundamentos.modelo._05_resource;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component("electrico1")
@NoArgsConstructor
public class MotorElectrico1 implements IMotor{
    private String tipoBateria;

    @Override
    public String arrancar() {
        return "Arrancando con motor 1";
    }

    @Override
    public String cargar() {
        return "Se está cargando el motor 1";
    }

    @Override
    public String cambiarPotencia() {
        return "Cambiando potencia del motor 1";
    }
}

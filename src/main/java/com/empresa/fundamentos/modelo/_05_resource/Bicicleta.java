package com.empresa.fundamentos.modelo._05_resource;

import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component("b1")
public class Bicicleta {
    private String color;
    @Resource(name = "electrico1")
    private IMotor motor;

    public Bicicleta(IMotor m1) {
        motor = m1;
    }

    public String avanzar(){
        return motor.arrancar();
    }
}

package com.empresa.fundamentos.modelo._06_value;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Data
@NoArgsConstructor
public class Configuracion {
    @Value("${app.name}") // Inyecta el valor de la propiedad "app.name" desde el archivo de configuración
    private String appName;

    @Value("${app.timeout:5000}") // Inyecta un valor por defecto si no está definido
    private int timeout;

}

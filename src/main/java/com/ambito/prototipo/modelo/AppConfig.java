package com.ambito.prototipo.modelo;

import com.ambito.singleton.modelo.MySingletonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
    public MyPrototypeService myPrototypeService() {

        return new MyPrototypeService();
    }
}

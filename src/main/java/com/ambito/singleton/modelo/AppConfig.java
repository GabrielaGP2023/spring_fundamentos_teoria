package com.ambito.singleton.modelo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MySingletonService mySingletonService() {
        return new MySingletonService();
    }
}

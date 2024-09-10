package com.ambito.singleton.presentacion;

import com.ambito.singleton.modelo.AppConfig;
import com.ambito.singleton.modelo.MySingletonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Obtener el bean singleton
        MySingletonService service1 = context.getBean(MySingletonService.class);
        MySingletonService service2 = context.getBean(MySingletonService.class);

        // Verificar que ambos beans son la misma instancia
        System.out.println("¿Es la misma instancia? " + (service1 == service2));

        service1.doSomething();

    }
}

package com.ambito.prototipo.presentacion;

import com.ambito.prototipo.modelo.AppConfig;
import com.ambito.prototipo.modelo.MyPrototypeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Obtener el bean prototype
        MyPrototypeService service1 = context.getBean(MyPrototypeService.class);
        MyPrototypeService service2 = context.getBean(MyPrototypeService.class);

        // Verificar que ambos beans NO son la misma instancia
        System.out.println("¿Es la misma instancia? " + (service1 == service2));

        service1.doSomething();
        service2.doSomething();


    }
}

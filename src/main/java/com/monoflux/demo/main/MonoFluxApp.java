package com.monoflux.demo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = "com.monoflux.demo")
public class MonoFluxApp {

    public static void main(String[] args) {
        SpringApplication.run(MonoFluxApp.class, args);
    }

}

package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.text.ParseException;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws ParseException {
        ConfigurableApplicationContext atx = SpringApplication.run(Main.class, args);
        PersonManager personManager = atx.getBean(PersonManager.class);
        personManager.start();
    }
}

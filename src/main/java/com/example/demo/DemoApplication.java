package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    /**
     * Точка входа в Java приложение.
     *
     * @param args аргументы командной строки
     */
	public static void main(String[] args) {
		new SpringApplication(DemoApplication.class).run(args);
	}

}

package com.estudos.estudo_dto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.estudos.estudo_dto.controller"})
@SpringBootApplication
public class Estudo_dtoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Estudo_dtoApplication.class, args);
	}

}

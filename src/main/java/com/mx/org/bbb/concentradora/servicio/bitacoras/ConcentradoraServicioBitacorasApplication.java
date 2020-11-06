package com.mx.org.bbb.concentradora.servicio.bitacoras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConcentradoraServicioBitacorasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcentradoraServicioBitacorasApplication.class, args);
	}

}

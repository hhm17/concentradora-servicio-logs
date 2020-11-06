package com.mx.org.bbb.concentradora.servicio.logs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConcentradoraServicioLogsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcentradoraServicioLogsApplication.class, args);
	}

}

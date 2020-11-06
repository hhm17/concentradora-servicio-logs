package com.mx.org.bbb.concentradora.servicio.bitacoras;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.mx.org.bbb.concentradora.servicio.bitacoras.models.entity.Bitacora;


@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Bitacora.class);
	}

	
	
}

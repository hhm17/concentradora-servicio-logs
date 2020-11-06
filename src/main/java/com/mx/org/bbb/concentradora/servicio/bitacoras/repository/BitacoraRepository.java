package com.mx.org.bbb.concentradora.servicio.bitacoras.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.mx.org.bbb.concentradora.servicio.bitacoras.models.entity.Bitacora;

@RepositoryRestResource(path = "bitacoras")
public interface BitacoraRepository extends PagingAndSortingRepository<Bitacora, Long> {

	@RestResource(path = "buscar-folio")
	public Bitacora findByFolio(@Param("folio") String folio);

}

package com.mx.org.bbb.concentradora.servicio.logs.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mx.org.bbb.concentradora.servicio.logs.models.entity.Log;

@RepositoryRestResource(path = "logs")
public interface LogRepository extends PagingAndSortingRepository<Log, Long> {

}

package com.guillermo.pccomponents.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "computers")
public interface ComputerRepository extends CrudRepository<Computer, Long>{
	
	List<Computer> findByPrice(@Param("price")double price);
	
	List<Computer> findByOs(@Param("os")String os);

}

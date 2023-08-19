package com.guillermo.pccomponents.domain;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SellerRepository extends CrudRepository<Seller, Long>{
	
	Optional<Seller> findByUsername(String username);

}

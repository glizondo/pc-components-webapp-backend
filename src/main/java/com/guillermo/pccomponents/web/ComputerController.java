package com.guillermo.pccomponents.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guillermo.pccomponents.domain.Computer;
import com.guillermo.pccomponents.domain.ComputerRepository;

@RestController
public class ComputerController {
	
	@Autowired
	private ComputerRepository repository;
	
	@RequestMapping("/computers")
	public Iterable<Computer> getComputers(){
		return repository.findAll();
	}


}

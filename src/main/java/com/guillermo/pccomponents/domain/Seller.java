package com.guillermo.pccomponents.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Seller {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name, lastname, username;

	public Seller() {

	}

	public Seller(String name, String lastname, String username) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.username = username;
	}

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "seller")
	private List<Computer> computers;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}

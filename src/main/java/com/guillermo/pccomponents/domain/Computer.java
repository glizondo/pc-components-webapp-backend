package com.guillermo.pccomponents.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Computer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private double price;
	private String type, processor, hardDrive, memory, os, screen, videoCard;

	public Computer() {

	}

	public Computer(double price, String type, String processor, String hardDrive, String memory, String os,
			String screen, String videoCard, Seller seller) {
		super();
		this.price = price;
		this.type = type;
		this.processor = processor;
		this.hardDrive = hardDrive;
		this.memory = memory;
		this.os = os;
		this.screen = screen;
		this.videoCard = videoCard;
		this.seller = seller;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seller")
	private Seller seller;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(String hardDrive) {
		this.hardDrive = hardDrive;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getVideoCard() {
		return videoCard;
	}

	public void setVideoCard(String videoCard) {
		this.videoCard = videoCard;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

}

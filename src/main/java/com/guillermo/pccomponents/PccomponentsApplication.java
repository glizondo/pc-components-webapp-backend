package com.guillermo.pccomponents;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.guillermo.pccomponents.domain.Computer;
import com.guillermo.pccomponents.domain.ComputerRepository;
import com.guillermo.pccomponents.domain.Seller;
import com.guillermo.pccomponents.domain.SellerRepository;
import com.guillermo.pccomponents.domain.User;
import com.guillermo.pccomponents.domain.UserRepository;

@SpringBootApplication
public class PccomponentsApplication implements CommandLineRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(PccomponentsApplication.class);
	@Autowired
	private ComputerRepository repository;
	@Autowired
	private SellerRepository srepository;
	@Autowired
	private UserRepository urepository;

	public static void main(String[] args) {
		SpringApplication.run(PccomponentsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Seller seller1 = new Seller("John", "Johnson", "JohnsonJ");
		Seller seller2 = new Seller("Mary", "Robinson", "RobinsonM");
		srepository.saveAll(Arrays.asList(seller1, seller2));

		repository
				.save(new Computer(150, "Laptop", "i5", "256 GB", "8 GB", "Windows 10", "15 in", "GTX 1650", seller1));
		repository
				.save(new Computer(450, "Laptop", "i7", "256 GB", "16 GB", "Windows 11", "16 in", "GTX 1660", seller1));
		repository.save(
				new Computer(320.20, "Laptop", "i5", "256 GB", "8 GB", "Windows 10", "15 in", "GTX 1650", seller1));
		repository.save(
				new Computer(550.20, "Desktop", "i3", "256 GB", "16 GB", "Windows 11", null, "RTX 3660", seller1));
		repository
				.save(new Computer(440.99, "Laptop", "i5", "500 GB", "16 GB", "Mac OS", "15 in", "RTX 3660", seller2));
		repository.save(
				new Computer(550.20, "Desktop", "i3", "256 GB", "16 GB", "Windows 11", null, "RTX 3660", seller2));

		for (Computer computer : repository.findAll()) {
			logger.info(computer.getOs() + "" + computer.getType());
		}
		
		
		urepository.save(new User("user", "$2a$10$NVM0n8ElaRgg7zWO1CxUdei7vWoPg91Lz2aYavh9.f9q0e4bRadue", "USER"));
		urepository.save(new User("admin","$2a$10$8cjz47bjbR4Mn8GMg9IZx.vyjhLXR/SKKMSZ9.mP9vpMu0ssKi8GW","ADMIN"));

	}

}

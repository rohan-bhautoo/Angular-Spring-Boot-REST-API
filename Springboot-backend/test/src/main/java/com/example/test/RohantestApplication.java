package com.example.test;

import com.example.test.model.User;
import com.example.test.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RohantestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RohantestApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Rohan", "Bhautoo", "rohan.bhautoo@lacooperativewelcoop.com"));
		this.userRepository.save(new User("Nehal", "Bhautoo", "nehal.bhautoo@lacooperativewelcoop.com"));
		this.userRepository.save(new User("Bernard", "Celine", "bernard.celine@lacooperativewelcoop.com"));
	}

}

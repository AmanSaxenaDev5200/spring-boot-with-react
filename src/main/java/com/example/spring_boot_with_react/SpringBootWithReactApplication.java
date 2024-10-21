package com.example.spring_boot_with_react;

import com.example.spring_boot_with_react.model.User;
import com.example.spring_boot_with_react.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithReactApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithReactApplication.class, args);

	}

	@Autowired
	private UserRepo userRepo;

	@Override
	public void run(String... args) throws Exception {
		this.userRepo.save(new User("aman", "saxena", "amansaxena5200@gmail.com"));
		this.userRepo.save(new User("sam", "sundar", "sam@gmail.com"));
		this.userRepo.save(new User("vinod", "kumar", "vinod@gmail.com"));
		this.userRepo.save(new User("jay", "prakash", "prakash@gmail.com"));
		this.userRepo.save(new User("shruti", "deshmuk", "deshmuk@gmail.com"));
	}
}

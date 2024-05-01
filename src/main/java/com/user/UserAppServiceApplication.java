package com.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserAppServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAppServiceApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Welcome to kubernetes!!";
	}
	
	@GetMapping("/users")
	public List<User> getUsers(){
		
		return Arrays.asList(
								new User(1,  "Birudeo"),
								new User(2,  "Abinash"),
								new User(3,  "Ajay"),
								new User(4,  "Saatvik"),
								new User(5,  "Dipali"),
								new User(6,  "Suresh"),
								new User(7,  "Suraj")
				);
	}
	
	

}


record User(Integer id, String name) {}
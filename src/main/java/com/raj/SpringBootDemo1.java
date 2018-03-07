package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootDemo1 {

	@RequestMapping(value="/getHome")
	public String getHome() {
		return "Hello World Spring";
	}
	
	
	public static void main(String[] args) {
		System.out.println("prudhviraj");
		SpringApplication.run(SpringBootDemo1.class, args);

	}

}

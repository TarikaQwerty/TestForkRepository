package com.testforkproject.example.TestForkProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestForkProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestForkProjectApplication.class, args);
	}
	
	public void testFork(){
	
		 System.out.println("Testing fork repository:");
	
	}

}

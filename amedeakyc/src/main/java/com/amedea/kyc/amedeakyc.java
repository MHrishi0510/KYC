package com.amedea.kyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.amedea.kyc")
public class amedeakyc {

	public static void main(String[] args) {
		SpringApplication.run(amedeakyc.class, args);
	}

}

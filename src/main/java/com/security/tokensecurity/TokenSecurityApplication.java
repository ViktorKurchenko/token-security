package com.security.tokensecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.security"})
public class TokenSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(TokenSecurityApplication.class, args);
	}
}

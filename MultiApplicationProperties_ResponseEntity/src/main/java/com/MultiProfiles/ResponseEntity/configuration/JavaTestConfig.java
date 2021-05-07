package com.MultiProfiles.ResponseEntity.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("test")
@Configuration
@RestController
public class JavaTestConfig {
	@GetMapping("Greetings")
	public String Hello() {
		return "hello im a test profile";
		
	}
	

}


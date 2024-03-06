package com.microservice.biometric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@SpringBootApplication
public class BiometricApplication {

	@GetMapping("/ruta_de_prueba")
	public String getMessage(){
		return "Hola mundo";
	}
	public static void main(String[] args) {
		SpringApplication.run(BiometricApplication.class, args);
	}

}

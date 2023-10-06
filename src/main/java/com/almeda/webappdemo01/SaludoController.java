package com.almeda.webappdemo01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

	@GetMapping("/mensaje")
	public String mensaje() {
		return "Bienvenido a Java App for Azure";
	}
}

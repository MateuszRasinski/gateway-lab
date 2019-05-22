package com.github.mateuszrasinski.microservices.udemy.gateway;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class SentenceController {

	@GetMapping("/")
	public String sentence() {
		return "sentence";
	}
}

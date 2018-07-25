package com.HealthCareSystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
	/**
	 * This is going to routing about page.
	 * @return about
	 */
	@GetMapping("/about")
	public String showPage() {
		
		return "about";  
	}
}

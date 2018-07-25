package com.HealthCareSystem.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ContactController {
	
	/**
	 * This will displays contact info of the application.
	 * @return contacts
	 */
	@GetMapping("/contactus")
	public String showPage() {
		
		return "contactus";  
	}
}

package com.HealthCareSystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
	
	/**
	 * This will display home page 
	 * @return index
	 */
	@GetMapping("/home")
	public String showIndexPage() {
		
		return "index";  
	}
	/**
	 * User can login to see their task info.
	 * @return loginForm
	 */
	@GetMapping("/login")
	public String showLoginForm() {
		
		return "views/loginForm";  
	}
	
	
}

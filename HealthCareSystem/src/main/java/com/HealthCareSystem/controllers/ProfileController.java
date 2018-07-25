package com.HealthCareSystem.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.HealthCareSystem.entities.User;
import com.HealthCareSystem.services.TaskService;
import com.HealthCareSystem.services.UserService;

@Controller
public class ProfileController {
	@Autowired
	private TaskService taskService;
	@Autowired
	private UserService userService;
	/**
	 * This is going to take to you profile page of users.
	 * @param model
	 * @param principal
	 * @return profile
	 */
	@GetMapping("/profile")
	public String showProfilePage(Model model, Principal principal) {
		
		String email = principal.getName();
		User user = userService.findOne(email);
		
		model.addAttribute("tasks", taskService.findUserTask(user));
		
		
		return "views/profile";
	}

}

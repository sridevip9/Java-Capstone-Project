/**
 * This is full stack java EE application. This application will able to register as well as authenticate users.
 * There are two kind of users - Administrator, normal User(staff).
 * Administrator will able to assign tasks to normal user.
 * Normal user logs in to see the task to perform.
 */
package com.HealthCareSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.HealthCareSystem.entities.User;
import com.HealthCareSystem.services.UserService;

@SpringBootApplication
public class HealthCareSystemApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;
	/**
	 * This is main application 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(HealthCareSystemApplication.class, args);
	}
	/**
	 * If something goes wrong throws exception.
	 */
	@Override
	public void run(String... args ) throws Exception{
		{
			User newAdmin = new User("admin@mail.com","Admin","123456");
			userService.createAdmin(newAdmin);
		}
	}
}

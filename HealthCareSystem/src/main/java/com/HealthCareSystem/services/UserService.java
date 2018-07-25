package com.HealthCareSystem.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.HealthCareSystem.entities.Role;
import com.HealthCareSystem.entities.User;
import com.HealthCareSystem.repositories.UserRepository;


	
	
	
	

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	/**
	 * This creates new user
	 * @param user
	 */
	public void createUser(User user) {
		BCryptPasswordEncoder  encoder = new  BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword())); 
		Role userRole = new Role("USER");
		List<Role> roles = new ArrayList<>();
		roles.add(userRole);
		user.setRoles(roles);
		userRepository.save(user);
	}
	/**
	 * This creates a administrator
	 * @param user
	 */
	public void createAdmin(User user) {
		BCryptPasswordEncoder  encoder = new  BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword())); 
		Role userRole = new Role("ADMIN");
		List<Role> roles = new ArrayList<>();
		roles.add(userRole);
		user.setRoles(roles);
		userRepository.save(user);
	}
	/**
	 * 
	 * @param email
	 * @return userRepository
	 */

	public User findOne(String email) {
		
		return userRepository.findByEmail(email);
	}
   /**
    * 
    * @param email
    * @return
    */
	public boolean isUserPresent(String email) {
		// TODO Auto-generated method stub
	User user = userRepository.findByEmail(email);
	if(user != null) {
		return true;
	}else {
		return false;
	}
 }
	/**
	 * 
	 * @return
	 */
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
    /**
     * 
     * @param name
     * @return
     */
	public List<User> findByName(String name) {
		// TODO Auto-generated method stub
		return  userRepository.findByNameLike("%"+name+"%");
	}
	
}
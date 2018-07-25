package com.HealthCareSystem.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.HealthCareSystem.entities.User;

public interface UserRepository extends JpaRepository<User,String>{

	User findByEmail(String email);

	List<User> findByNameLike(String name);

	

	

}

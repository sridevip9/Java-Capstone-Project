package com.HealthCareSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HealthCareSystem.entities.Role;

public interface RoleRepository extends JpaRepository<Role,String>{

}

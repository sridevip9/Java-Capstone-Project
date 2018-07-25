package com.HealthCareSystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HealthCareSystem.entities.Task;
import com.HealthCareSystem.entities.User;

public interface TaskRepository extends JpaRepository<Task, Long>{

	List<Task> findByUser(User user);

}

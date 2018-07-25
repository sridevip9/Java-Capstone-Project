package com.HealthCareSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HealthCareSystem.entities.Task;
import com.HealthCareSystem.entities.User;
import com.HealthCareSystem.repositories.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	/**
	 * 
	 * @param task
	 * @param user
	 */
	public void addTask(Task task, User user) {
		task.setUser(user);
		taskRepository.save(task);
	}
	/**
	 * 
	 * @param user
	 * @return taskRepository
	 */
	
	public List<Task>  findUserTask(User user){
		
		return taskRepository.findByUser(user);
	}
}

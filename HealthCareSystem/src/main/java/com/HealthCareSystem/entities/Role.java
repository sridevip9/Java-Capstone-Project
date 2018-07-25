package com.HealthCareSystem.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Role {
	
	@Id
	private String name;
	@ManyToMany(mappedBy="roles")
	private List<User> users;
	
	/**
	 *  Getter for name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return Users
	 */
	public List<User> getUsers() {
		return users;
	}
	/**
	 * 
	 * @param users
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public Role() {
		
	}
	/**
	 * 
	 * @param name
	 * @param users
	 */
	public Role(String name, List<User> users) {
		
		this.name = name;
		this.users = users;
	}
	/**
	 * 
	 * @param name
	 */
	public Role(String name) {
		
		this.name = name;
	}
	
	
}

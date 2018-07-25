/**
 * All the domain objects will be in this package.
 */

package com.HealthCareSystem.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class User {

 @Id	
 @Email
 @NotEmpty
 @Column(unique=true)
 private String email;
 @NotEmpty
 private String name;
 @Size(min=4)
 private String password;
 @OneToMany(mappedBy="user", cascade=CascadeType.ALL)
 private List<Task> tasks;
 @ManyToMany( cascade=CascadeType.ALL)
 @JoinTable(name = "USER_ROLES", joinColumns={
			@JoinColumn(name = "USER_EMAIL", referencedColumnName = "email") }, inverseJoinColumns = {
					@JoinColumn(name = "ROLE_NAME", referencedColumnName = "name") })
 
 private List<Role> roles;
 /**
  * Getter for email
  * @return email
  */
public String getEmail() {
	return email;
}

/**
 * Setter for email
 * @param email
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * Getter for name
 * @return name
 */
public String getName() {
	return name;
}
/**
 * Setter for name
 * @param name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * Getter for password
 * @return password
 */
public String getPassword() {
	return password;
}
/**
 * Setter for password
 * @param password to set
 */
public void setPassword(String password) {
	this.password = password;
}
/**
 * Getter for task
 * @return tasks
 */
public List<Task> getTask() {
	return tasks;
}
/**
 * Setter for task
 * @param task to set
 */
public void setTask(List<Task> task) {
	this.tasks = task;
}
/**
 * Getter for Roles
 * @return roles
 */
public List<Role> getRoles() {
	return roles;
}
/**
 * Setter for Roles
 * @param roles
 */
public void setRoles(List<Role> roles) {
	this.roles = roles;
}
/**
 * 
 * @param email
 * @param name
 * @param password
 */
public User(String email, String name, String password) {
	
	this.email = email;
	this.name = name;
	this.password = password;
}

public User() {
	
}
 
}

/**
 * All the domain objects will be in this package.
 */


package com.HealthCareSystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;


import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Task {
  @Id
  @GeneratedValue
  private Long id;

  @NotEmpty
  private String date;
  @NotEmpty
  private String startTime;
  @NotEmpty
  private String stopTime;
  @NotEmpty
  @Column(length=1000)
  private String description;
  @ManyToOne
  @JoinColumn(name="User_Email")
  private User user;
  

public Task() {
	
}
/**
 * 
 * To assign Task information
 * @param date
 * @param startTime
 * @param stopTime
 * @param description
 * @param user
 */
 
public Task(String date, String startTime, String stopTime, String description, User user) {
	
	this.date = date;
	this.startTime = startTime;
	this.stopTime = stopTime;
	this.description = description;
	this.user = user;
}

public Task(String date, String startTime, String stopTime, String description) {
	
	this.date = date;
	this.startTime = startTime;
	this.stopTime = stopTime;
	this.description = description;
}
/**
 * Getter for id
 * @return id
 */
public Long getId() {
	return id;
}
/**
 * Setter for id
 * @param id
 */
public void setId(Long id) {
	this.id = id;
}
/**
 * 
 * @return date
 */
public String getDate() {
	return date;
}
/**
 * 
 * @param date
 */
public void setDate(String date) {
	this.date = date;
}
/**
 * 
 * @return startTime
 */
public String getStartTime() {
	return startTime;
}
/**
 * 
 * @param startTime
 */
public void setStartTime(String startTime) {
	this.startTime = startTime;
}
/**
 * 
 * @return stopTime
 */
public String getStopTime() {
	return stopTime;
}
/**
 * 
 * @param stopTime
 */
public void setStopTime(String stopTime) {
	this.stopTime = stopTime;
}
/**
 *  This is task description assign to the user
 * @return Description
 */
public String getDescription() {
	return description;
}
/**
 * 
 * @param description
 */
public void setDescription(String description) {
	this.description = description;
}
/**
 * 
 * @return user
 */
public User getUser() {
	return user;
}
/**
 * 
 * @param user
 */
public void setUser(User user) {
	this.user = user;
}
}

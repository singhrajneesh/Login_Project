package com.training.database.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@GeneratedValue
	private Integer id;
	
	@Id
	private String username;
	
	private String password;
	
	public User() {
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	

	
	

}


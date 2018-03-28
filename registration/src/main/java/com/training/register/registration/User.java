package com.training.register.registration;

public class User {
	private Integer id;

	private String username;
	private String password;
	
	public User() {
	
	}
	
	
	public User(String username, String password) {
		super();
		this.id=id;
		this.username = username;
		this.password = password;
	}
	
	public Integer getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
	

}

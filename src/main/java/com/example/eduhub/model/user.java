package com.example.eduhub.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class user {
	
	@Id
	private String userId;
	
	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;
	
	public user() {
	}
	public user(String username, String password, String email) {
		super();
		this.username = username;
		this.password= password;
		this.email= email;
	}
	public String getId() {
		return userId;
	}
	public void setId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

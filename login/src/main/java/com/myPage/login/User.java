package com.myPage.login;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	
	
	@NotNull
	@Size(max=45, min=3,  message = "Your  characters")
    private String username;
	
	@NotNull
	@Size(max=45, min=3,  message = "Your  characters")
	private String password;
	
	private String email;
	private String contact;
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
}

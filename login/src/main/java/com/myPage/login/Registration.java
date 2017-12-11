package com.myPage.login;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Registration {
	
	@NotNull
	@Size(max=45)
	private String first_name;
	
	@NotNull(message = "Please enter your password.")
    @Size(min = 6, max = 15, message = "Your password must between 6 and 15 characters")
	private String password;
	
	@NotNull
	@Size(max=45,  message = "Your  characters")
	private String last_name;
	
	@NotNull
	@Size(max=45,  message = "Your password must between 6 and 15 characters")
	private String email;
	
	@NotNull
	@Size(max=45,  message = "Your password must between 6 and 15 characters")
	private int age;
	
	public Registration() {
		super();
	}
	public Registration(String first_name, String last_name, String email, String password, int age) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.age = age;
		
	}
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}

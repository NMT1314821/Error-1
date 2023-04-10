package com.example.UserSpring.Dto;

import lombok.Data;

@Data
public class UserDto
{
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	public UserDto(long id2, String firstName2, String lastName2, String email2) {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	


	
	
}

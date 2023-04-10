package com.example.UserSpring.Mapper;

import com.example.UserSpring.Dto.UserDto;
import com.example.UserSpring.Model.User;

public class UserMapper 
{
	//Convert user JPA enity to UserDto
	
	public static UserDto mapToUserDto(User user)
	{
		UserDto userDto=new UserDto(
				user.getId(),
				user.getFirstName(),
				user.getLastName(),
				user.getEmail()
				);
				
		return userDto;
		
	}
	//Convert UserDto to User Jpa entity
	
	public static User mapToUser(UserDto userDto)
	{
		User user=new User(
				userDto.getId(),
				userDto.getFirstName(),
				userDto.getLastName(),
				userDto.getEmail()
				);
		return user;
	}

}

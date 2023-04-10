package com.example.UserSpring.Service;



import java.util.List;

import com.example.UserSpring.Dto.UserDto;
import com.example.UserSpring.Model.User;

public interface UserService
{
	UserDto createUser(UserDto user);
	User getUserById(Long userid);
	List<User> getAllUsers();
	User updatUser(User user);
	void DeleteUser(Long userid);

}

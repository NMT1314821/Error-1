package com.example.UserSpring.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserSpring.Dto.UserDto;
import com.example.UserSpring.Model.User;
import com.example.UserSpring.Service.UserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/use")
@AllArgsConstructor
public class UserController
{
	@Autowired
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto user)
	{
		UserDto saveUser=userService.createUser(user);
		return new ResponseEntity<>(saveUser,HttpStatus.CREATED);
	}
	
	//find User By ID
	
	@GetMapping("{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Long userid)
	{
		User gu=userService.getUserById(userid);
		return new ResponseEntity<>(gu,HttpStatus.OK);
	}
	
	
	//get all users at a time
	
	@GetMapping
	public ResponseEntity<List<User>>getAllUsers()
	{
		List<User> users= userService.getAllUsers();
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
	
	//update by id
	
	@PutMapping("{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") Long userid ,@RequestBody User user)
	{
		user.setId(userid);
		User saveuser=userService.updatUser(user);
		return new ResponseEntity<>(saveuser,HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> DeleteUser(@PathVariable("id") Long userid)
	{
		userService.DeleteUser(userid);
		return new ResponseEntity<>("userdeleted successfull",HttpStatus.OK);
	}
	
}

package com.example.UserSpring.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserSpring.Dto.UserDto;
import com.example.UserSpring.Model.User;
import com.example.UserSpring.Repository.UserRepository;
import com.example.UserSpring.Service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto createUser(UserDto userDto) 
	{
		//convert userDto to userJpa
		User userDto1=new User(
				userDto.getId(),
				userDto.getFirstName(),
				userDto.getLastName(),
				userDto.getEmail()
				
				
				);
		
		User savedUser=userRepository.save(userDto1);
		UserDto saveuserDto = new UserDto(
				savedUser.getId(),
				savedUser.getFirstName(),
				savedUser.getLastName(),
				savedUser.getEmail()
				
		);
		return saveuserDto;
	}

	@Override
	public User getUserById(Long userid) 
	{
	    Optional<User> ou =userRepository.findById(userid);	
		return ou.get();
	}

	@Override
	public List<User> getAllUsers()
	{
	
		return userRepository.findAll();
	}

	@Override
	public User updatUser(User user) {
		User exeuser=userRepository.findById(user.getId()).get();
		exeuser.setFirstName(user.getFirstName());
		exeuser.setLastName(user.getLastName());
		exeuser.setEmail(user.getEmail());
		User updateuser=userRepository.save(exeuser);
		return updateuser;
	}

	@Override
	public void DeleteUser(Long userid)
	{
		userRepository.deleteById(userid);
		
	}
	

}

package com.example.UserSpring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UserSpring.Model.User;

public interface UserRepository extends JpaRepository<User, Long>
{
	

}

package com.demo.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.example.entities.Users;
import com.demo.example.repositories.UserRepositories;
@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	UserRepositories repo;
	
	@Override
	public String addUsers(Users user) {
		repo.save(user);
		return "User Added Successfully";
	}

}

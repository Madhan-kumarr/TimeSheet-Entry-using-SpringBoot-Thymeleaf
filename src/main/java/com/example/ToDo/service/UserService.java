package com.example.ToDo.service;

import com.example.ToDo.dto.UsersDto;
import com.example.ToDo.model.Users;

public interface UserService {

	public Users saveUser(Users user);
	
	public Users registerUser(Users user);
	
	public Users loginUser(Users user);

	public Users checkUser(UsersDto user);

	
	
	
}

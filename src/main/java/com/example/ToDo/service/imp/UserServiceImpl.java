package com.example.ToDo.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ToDo.dto.UsersDto;
import com.example.ToDo.model.Users;
import com.example.ToDo.repository.UserRepositoryService;
import com.example.ToDo.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepositoryService userRepositoryService;

	@Override
	public Users saveUser(Users user) {
		// TODO Auto-generated method stub
		return userRepositoryService.save(user);
	}

	@Override
	public Users registerUser(Users user) {
		// TODO Auto-generated method stub
		return userRepositoryService.save(user);
	}

	@Override
	public Users loginUser(Users user) {
		// TODO Auto-generated method stub
		return userRepositoryService.save(user);
	}

	@Override
	public Users checkUser(UsersDto user) {
		// TODO Auto-generated method stub
		return userRepositoryService.findBynameAndPassword(user.getName(),user.getPassword());
	}

	


	

}

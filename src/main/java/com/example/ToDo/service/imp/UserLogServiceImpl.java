package com.example.ToDo.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ToDo.model.UserLog;
import com.example.ToDo.repository.UserLogRepositaryService;
import com.example.ToDo.service.UserLogService;


@Service
public class UserLogServiceImpl implements UserLogService {
	
	@Autowired
	private UserLogRepositaryService userLogRepositaryService ;

	@Override
	public UserLog entryCheck(UserLog userLog) {
		// TODO Auto-generated method stub
		return userLogRepositaryService.save(userLog);
	}

	@Override
	public UserLog saveLog(UserLog userLog) {
		return userLogRepositaryService.save(userLog);
		
	}

	@Override
	public List<UserLog> getAllLog() {
		// TODO Auto-generated method stub
		return userLogRepositaryService.findAll();
	}
	
	
	

}

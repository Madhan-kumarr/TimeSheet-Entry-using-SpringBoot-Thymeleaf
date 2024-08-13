package com.example.ToDo.service;

import java.util.List;

import com.example.ToDo.model.UserLog;

public interface UserLogService {

	public UserLog entryCheck(UserLog userLog);

	public UserLog saveLog(UserLog userLog);

	public List<UserLog> getAllLog();
}

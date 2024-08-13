package com.example.ToDo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ToDo.model.UserLog;

@Repository
public interface UserLogRepositaryService extends JpaRepository<UserLog, Long> {

	
}  

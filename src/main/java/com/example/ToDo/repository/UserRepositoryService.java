package com.example.ToDo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ToDo.model.Users;

@Repository
public interface UserRepositoryService extends JpaRepository<Users, Long> {

	Users findBynameAndPassword(String name, String password);

}

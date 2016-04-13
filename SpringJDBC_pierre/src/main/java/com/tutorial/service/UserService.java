package com.tutorial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tutorial.model.User;

@Service
public interface UserService {

	public List<User> getUsers();

	public User getUserById(int id);

	public List<User> getAllUsers();

	public void update(User user);
	
	public void insertUser(int id, String name, String firstname, String email, int age );
	
	public void deleteUser(User user);
	
}
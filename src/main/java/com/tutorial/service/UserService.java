package com.tutorial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tutorial.model.User;

@Service
public interface UserService {

	public List<User> getUsers();

	public User getUserById(int id);

	public void updateUser(User user);

	public void deleteUser(int id);

	public void insertUser(User user);

	public int countUsers();
}
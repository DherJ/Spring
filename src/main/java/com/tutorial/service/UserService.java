package com.tutorial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tutorial.model.User;

@Service
public interface UserService {

	public List<User> getUsers();

	public User getUserById(int id);

<<<<<<< HEAD
=======
	public List<User> getUsersByName(String name);

>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
	public void updateUser(User user);

	public void deleteUser(int id);

	public void insertUser(User user);

	public int countUsers();
<<<<<<< HEAD
=======

	public int isLoginValid(String identifiant, String pass);
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
}
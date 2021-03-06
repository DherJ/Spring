package com.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.dao.UserDao;
import com.tutorial.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

	public List<User> getUsers() {
		return userDao.listUsers();
	}

	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}

	public void insertUser(User user) {
		userDao.insertUser(user);
	}

	public int countUsers() {
		return userDao.countUsers();
	}
<<<<<<< HEAD
=======

	public List<User> getUsersByName(String name) {
		return userDao.getUsersByName(name);
	}

	public int isLoginValid(String identifiant, String pass) {
		return userDao.isLoginValid(identifiant, pass);
	}
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
}
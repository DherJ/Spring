package com.tutorial.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.dao.UserDao;
import com.tutorial.model.User;

@Service
public class UserServiceImpl implements UserService {

	private List<User> listUsers = new ArrayList<User>();

	@Autowired
	private UserDao userDao;

	public UserServiceImpl() {
		User p1 = new User(1, "aaa", "bbb", "email1", 11);
		User p2 = new User(2, "ccc", "ddd", "email2", 22);
		User p3 = new User(3, "eee", "fff", "email3", 33);
		listUsers.add(p1);
		listUsers.add(p2);
		listUsers.add(p3);
	}

	public List<User> getAllUsers() {
		return listUsers;
	}

	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(User user) {
		// TODO Auto-generated method stub

	}
	
	public void insertUser(int id, String name, String firstname, String email, int age ){
		userDao.insertUser(id,name,firstname,email,age);
	}

	public List<User> getUsers() {
		return userDao.listUsers();
	}
	
	public void deleteUser(String name, String firstName){
		userDao.deleteUser(name,firstName);
	}
	//
	// public User getUserById(int id) {
	// return userMapper.getUser(id);
	// }

	

	// public boolean saveUser(User user) {
	// if (user.getId() == 0) {
	// return userDao.insertUser(user) == 1;
	// } else {
	// return userDao.updateUser(user) == 1;
	// }
	// }

	// public void update(User user) {
	// userDao.updateUser(user);
	// }
}
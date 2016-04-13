package com.tutorial.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.tutorial.model.User;

@Repository
public interface UserDao {

	/**
	 * This is the method to be used to list down a record from the User table
	 * corresponding to a passed user id.
	 */
	public User getUserById(@Param("id") Integer id);

	/**
	 * This is the method to be used to list down all the records from the User
	 * table.
	 */
	public List<User> listUsers();
	
	public void deleteUser(@Param("name")String name, @Param("firstName") String firstName);

	/**
	 * This is the method to be used to delete a record from the User table
	 * corresponding to a passed user id.
	 */
	// public void deleteUser(@Param("id") Integer id);

	/**
	 * This is the method to be used to update a record into the User table.
	 */
	public void updateUser(@Param("id") Integer id, @Param("age") Integer age);

	/**
	 * @param user
	 * @return the number of rows affected
	 */
	public int insertUser(@Param("id") int id, @Param("name") String name,
			@Param("firstName") String firstName, @Param("email") String email,
			@Param("age") int age);

}
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
	 * Give a list of User with the same name
	 * 
	 * @param name
	 * @return
	 */
	public List<User> getUsersByName(@Param("name") String name);

	/**
	 * This is the method to be used to list down all the records from the User
	 * table.
	 */
	public List<User> listUsers();

	/**
	 * This is the method to be used to delete a record from the User table
	 * corresponding to a passed user id.
	 */
	public void deleteUser(@Param("id") Integer id);

	/**
	 * This is the method to be used to update a record into the User table.
	 */
	public void updateUser(@Param("user") User user);

	/**
	 * @param user
	 * @return the number of rows affected
	 */
	public int insertUser(@Param("user") User user);

	/**
	 * Count the number of entries in the table
	 * 
	 * @return
	 */
	public int countUsers();

	/**
	 * check if the login is in the database
	 * 
	 * @param identifiant
	 * @param pass
	 * @return
	 */
	public int isLoginValid(@Param("identifiant") String identifiant,
			@Param("pass") String pass);
}
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
<<<<<<< HEAD
	public User getUserById(@Param("user_id") Integer id);
=======
	public User getUserById(@Param("id") Integer id);
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53

	/**
	 * Give a list of User with the same name
	 * 
	 * @param name
	 * @return
	 */
<<<<<<< HEAD
	public List<User> getUsersByName(@Param("user_name") String name);
=======
	public List<User> getUsersByName(@Param("name") String name);
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53

	/**
	 * This is the method to be used to list down all the records from the User
	 * table.
	 */
	public List<User> listUsers();

	/**
	 * This is the method to be used to delete a record from the User table
	 * corresponding to a passed user id.
	 */
<<<<<<< HEAD
	public void deleteUser(@Param("user_id") Integer id);
=======
	public void deleteUser(@Param("id") Integer id);
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53

	/**
	 * This is the method to be used to update a record into the User table.
	 */
	public void updateUser(@Param("user") User user);

	/**
	 * @param user
	 * @return the number of rows affected
	 */
	public int insertUser(@Param("user") User user);

<<<<<<< HEAD
	public int countUsers();
=======
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
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
}
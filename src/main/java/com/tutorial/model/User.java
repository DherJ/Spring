package com.tutorial.model;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String firstName;
	private String email;
	private int age;
<<<<<<< HEAD
	private String pass;
=======
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53

	public User() {
	}

	public User(int id, String name, String firstName, String email, int age) {
		this.id = id;
		this.name = name;
		this.firstName = firstName;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return " User : id : " + id + " name : " + name + " firstName : "
				+ firstName + " email : " + email + " age : " + age;
	}
<<<<<<< HEAD

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
=======
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
}
package com.tutorial.model;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

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

	public User() {
	}

	public User(int id, String name, String firstName, String email, int age) {
		this.id = id;
		this.name = name;
		this.firstName = firstName;
		this.email = email;
		this.age = age;
	}

	@NotNull
	@Length(max = 20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@NotNull
	@Length(max = 20)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Min(value = 1)
	@Max(value = 100)
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@NotNull
	@Length(max = 20)
	@Pattern(regexp = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@NotNull
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
}
package com.tutorial.model;

public class Vehicule {

	private int id;
	private int id_user;
	private String type;
	private String constructor;
	private String name;
	private boolean isLoue;

	public Vehicule() {
	}

	public Vehicule(String type, String constructor, String name) {
		this.type = type;
		this.constructor = constructor;
		this.name = name;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getConstructor() {
		return constructor;
	}

	public void setConstructor(String constructor) {
		this.constructor = constructor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isLoue() {
		return isLoue;
	}

	public void setLoue(boolean isLoue) {
		this.isLoue = isLoue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
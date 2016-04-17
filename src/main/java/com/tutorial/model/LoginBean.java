package com.tutorial.model;

public class LoginBean {

	private int id;
	private String identifiant;
	private String pass;

	public LoginBean() {
	}

	public LoginBean(int id, String identifiant, String pass) {
		this.id = id;
		this.identifiant = identifiant;
		this.pass = pass;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
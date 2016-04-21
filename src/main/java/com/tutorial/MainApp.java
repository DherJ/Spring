package com.tutorial;

import org.springframework.boot.SpringApplication;
<<<<<<< HEAD
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class);
=======

public class MainApp {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfiguration.class);
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
	}
}
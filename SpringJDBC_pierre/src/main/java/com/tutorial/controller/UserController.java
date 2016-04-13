package com.tutorial.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tutorial.model.User;
import com.tutorial.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "users", method = RequestMethod.GET)
	@Transactional(readOnly = true)
	public ModelAndView getAllUsersView(ModelAndView model) {
		model = new ModelAndView("listUser");
		List<User> list = new ArrayList<User>();
		list = userService.getUsers();
		if (list.size() == 0) {
			model = new ModelAndView("error");
		}
		model.addObject("users", list);
		return model;
	}
	

	@RequestMapping(value = "addUser", method = RequestMethod.GET)
	public ModelAndView user() {
		return new ModelAndView("addUserForm", "User", new User());
	}

	@RequestMapping(value = "resultAdd", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("User") User user, ModelMap model) {
		model.addAttribute("id", user.getId());
		model.addAttribute("name", user.getName());
		model.addAttribute("firstName", user.getFirstName());
		model.addAttribute("email", user.getEmail());
		model.addAttribute("age", user.getAge());
		userService.insertUser(user.getId(),user.getName(),user.getFirstName(),user.getEmail(),user.getAge());
		return "resultAdd";
	}
	
	@RequestMapping(value ="resultDeleteForm", method = RequestMethod.GET)
	public String removeStudent(@ModelAttribute("User") User user){
		userService.deleteUser(user);
		return "listUser";
	}

	@RequestMapping(value = "bdd", method = RequestMethod.GET)
	public ModelAndView listBDD(ModelAndView model) {
		model = new ModelAndView("bdd");
		model.addObject("users", userService.getUsers());
		return model;
	}
	
	@RequestMapping(value = "deleteUserForm", method = RequestMethod.GET)
	public ModelAndView deleteUser(){
		return new ModelAndView("deleteUserForm", "User", new User());
	}
}
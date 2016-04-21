package com.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tutorial.exception.RessourceNotFoundException;
import com.tutorial.model.User;
import com.tutorial.service.UserService;
import com.tutorial.validateur.ValidateurUser;

@Controller
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	ValidateurUser validator;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@Transactional(readOnly = true)
	public ModelAndView getAllUsersView(ModelAndView model) {
		model = new ModelAndView("listUser");
		model.addObject("users", userService.getUsers());
		return model;
	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.GET)
	public ModelAndView afficherFormUpdateUser(ModelAndView model,
			@RequestParam(value = "id", required = false) Integer userId) {
		User user;
		model = new ModelAndView("formUser");
		user = userService.getUserById(userId);
		model.addObject("user", user);
		return model;
	}

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public ModelAndView afficherFormUser(ModelAndView model) {
		User user;
		model = new ModelAndView("formUser");
		user = new User();
		model.addObject("user", user);
		return model;
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public ModelAndView addUser(ModelAndView model,
			@ModelAttribute("user") User user, BindingResult result) {
		validator.validate(user, result);
		userService.insertUser(user);
		System.out.println("add user-------" + user.toString());
		model = new ModelAndView("listUser");
		model.addObject("users", userService.getUsers());
		return model;
	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	public ModelAndView updateUser(@ModelAttribute("user") User user,
			ModelAndView model) {
		userService.updateUser(user);
		model = new ModelAndView("listUser");
		model.addObject("users", userService.getUsers());
		return model;
	}

	@RequestMapping(value = "/deleteUser/{userId}", method = RequestMethod.POST)
	public ModelAndView deleteUser(ModelAndView model,
			@PathVariable("userId") Integer userId) {
		userService.deleteUser(userId);
		model = new ModelAndView("listUser");
		model.addObject("users", userService.getUsers());
		return model;
	}

	@RequestMapping(value = "/searchUser/{id}", method = RequestMethod.GET)
	@Transactional(readOnly = true)
	public ModelAndView searchUser(ModelAndView model,
			@PathVariable("id") Integer userId) {
		model = new ModelAndView("listUser");
		model.addObject("users", userService.getUserById(userId));
		return model;
	}

	@ExceptionHandler(RessourceNotFoundException.class)
	public String handleResourceNotFoundException() {
		return "404";
	}
}
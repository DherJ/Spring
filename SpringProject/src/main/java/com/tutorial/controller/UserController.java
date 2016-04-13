package com.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tutorial.model.User;
import com.tutorial.service.UserService;
import com.tutorial.validator.UserValidator;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	UserValidator validator;

	@RequestMapping(value = "users", method = RequestMethod.GET)
	@Transactional(readOnly = true)
	public ModelAndView getAllUsersView(ModelAndView model) {
		model = new ModelAndView("listUser");
		model.addObject("users", userService.getUsers());
		return model;
	}

	@RequestMapping(value = { "/form", "/updateUser" }, method = RequestMethod.GET)
	public String form(
			@RequestParam(value = "id", required = false) Integer userId,
			Model u_Model) {
		User user;
		if (userId != null) {
			user = userService.getUserById(userId);
			u_Model.addAttribute("linkSubmit", "updateUser");
		} else {
			user = new User();
			u_Model.addAttribute("linkSubmit", "addUser");
		}
		u_Model.addAttribute("User", user);
		return "formUser";
	}

	@RequestMapping(value = "addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("User") User user, ModelMap model, BindingResult result) {
		validator.validate(user, result);
		
		if (result.hasErrors()){
			return "index";

		}
		else {
		int id = userService.countUsers() + 1;
		user.setId(id);
		userService.insertUser(user);
		System.out.println(user.toString());
		return "redirect:/users";
		}
	}

	@RequestMapping(value = "updateUser", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute("SpringWeb") User user,
			ModelMap model) {
		System.out.println(user.toString());
		userService.updateUser(user);
		return "redirect:/users";
	}

	@RequestMapping(value = "deleteUser/{userId}")
	public String deleteUser(@PathVariable("userId") Integer userId) {
		userService.deleteUser(userId);
		return "redirect:/users";
	}

	@RequestMapping(value = "searchUser/{id}", method = RequestMethod.GET)
	@Transactional(readOnly = true)
	public ModelAndView searchUser(ModelAndView model,
			@PathVariable("id") Integer userId) {
		model = new ModelAndView("resultSearchUser");
		model.addObject("user", userService.getUserById(userId));
		return model;
	}
}
package com.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
=======
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
<<<<<<< HEAD
import org.springframework.web.servlet.ModelAndView;
=======
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53

import com.tutorial.exception.RessourceNotFoundException;
import com.tutorial.model.User;
import com.tutorial.service.UserService;
import com.tutorial.validateur.ValidateurUser;

@Controller
<<<<<<< HEAD
@RequestMapping(value = "/users")
=======
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	ValidateurUser validator;

<<<<<<< HEAD
	@RequestMapping(value = "/list", method = RequestMethod.GET)
=======
	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handle(NoHandlerFoundException ex) {

		return "notfound";
	}

	@RequestMapping(value = "users", method = RequestMethod.GET)
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
	@Transactional(readOnly = true)
	public ModelAndView getAllUsersView(ModelAndView model) {
		model = new ModelAndView("listUser");
		model.addObject("users", userService.getUsers());
		return model;
	}

<<<<<<< HEAD
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

=======
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
		u_Model.addAttribute("user", user);
		return "formUser";
	}

	@RequestMapping(value = "addUser", method = RequestMethod.POST)
	public String addUser(ModelMap model, @ModelAttribute("user") User user,
			BindingResult result) {

		validator.validate(user, result);

		if (result.hasErrors()) {
			return "formUser";
		} else {
			int id = userService.countUsers() + 1;
			user.setId(id);
			userService.insertUser(user);
			System.out.println(user.toString());
			return "redirect:/users";
		}
	}

	@RequestMapping(value = "updateUser", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute("user") User user, ModelMap model) {
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

	@RequestMapping(value = { "searchUsers" }, method = RequestMethod.GET)
	public String form(Model u_Model) {
		User user = new User();
		u_Model.addAttribute("user", user);
		u_Model.addAttribute("title", "Search User");
		return "formSearchUsers";
	}

	@RequestMapping(value = "resultSearchUsers", method = RequestMethod.POST)
	public ModelAndView searchUsers(ModelAndView model,
			@ModelAttribute("user") User user) {
		model = new ModelAndView("formSearchUsers");
		model.addObject("users", userService.getUsersByName(user.getName()));
		model.addObject("title", "ResultSearch");
		return model;
	}

	@RequestMapping("/location/{id}")
	public String info(Model model, @PathVariable("id") Integer userId)
			throws RessourceNotFoundException {
		if (userId == 100) {
			model.addAttribute("msg", "Hello Key World!");
		} else {
			throw new RessourceNotFoundException();
		}
		return "index";
	}

>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
	@ExceptionHandler(RessourceNotFoundException.class)
	public String handleResourceNotFoundException() {
		return "404";
	}
}
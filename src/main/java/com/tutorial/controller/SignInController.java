package com.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tutorial.model.LoginBean;
import com.tutorial.service.UserService;

@Controller
public class SignInController {

	private final String IDENTIFIANT = "user";
	private final String PASS = "user";

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/signIn", method = RequestMethod.GET)
	public ModelAndView signIn(LoginBean loginBean) {

		ModelAndView model = new ModelAndView("login");
		model.addObject("loginBean", loginBean);
		return model;
	}

	@RequestMapping(value = "/chekSignIn", method = RequestMethod.POST)
	public String checkSignIn(Model u_Model,
			@ModelAttribute("loginBean") LoginBean loginBean) {

		try {
			int isValidUser = userService.isLoginValid(
					loginBean.getIdentifiant(), loginBean.getPass());
			System.out.println("isValidUser = " + isValidUser);
			if (isValidUser > 0) {
				System.out.println("User Login Successful");
				return "users";
			} else {
				u_Model.addAttribute("message", "Invalid credentials!!");
				return "login";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "login";
	}
}
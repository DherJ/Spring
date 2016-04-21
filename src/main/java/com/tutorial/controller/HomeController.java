package com.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
=======
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53

@Controller
public class HomeController {

<<<<<<< HEAD
	@RequestMapping(value = { "/index**", "/" }, method = RequestMethod.GET)
	public ModelAndView getIndexView() {
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		return model;
	}

	// @RequestMapping(value = "/admin**", method = RequestMethod.GET)
	// public ModelAndView adminPage() {
	// ModelAndView model = new ModelAndView();
	// model.setViewName("index");
	// return model;
	// }

	// @RequestMapping(value = "/login", method = RequestMethod.GET)
	// public ModelAndView loginPage() {
	// ModelAndView model = new ModelAndView();
	// model.setViewName("login");
	// return model;
	// }
=======
	@RequestMapping("/")
	public String getHomePage() {
		return "index";
	}
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
}
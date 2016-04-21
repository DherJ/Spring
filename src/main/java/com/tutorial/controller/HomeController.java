package com.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

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
}
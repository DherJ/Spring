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
import com.tutorial.model.Vehicule;
import com.tutorial.service.VehiculeService;

@Controller
@RequestMapping(value = "/vehicules")
public class VehiculeController {

	@Autowired
	private VehiculeService vehiculeService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@Transactional(readOnly = true)
	public ModelAndView getAllUsersView(ModelAndView model) {
		model = new ModelAndView("listVehicules");
		model.addObject("vehicules", vehiculeService.listVehicules());
		return model;
	}

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public ModelAndView afficherFormVehicule(ModelAndView model) {
		Vehicule vehicule;
		model = new ModelAndView("formVehicule");
		vehicule = new Vehicule();
		model.addObject("vehicule", vehicule);
		return model;
	}

	@RequestMapping(value = "/updateFormVehicule", method = RequestMethod.GET)
	public ModelAndView afficherFormUpdateVehicule(ModelAndView model,
			@RequestParam(value = "id", required = false) Integer vehiculeId) {
		Vehicule vehicule;
		model = new ModelAndView("formVehicule");
		if (vehiculeId != null) {
			vehicule = vehiculeService.getVehiculeById(vehiculeId);
			model.addObject("vehicule", vehicule);
		}
		return model;
	}

	@RequestMapping(value = "/addVehicule", method = RequestMethod.POST)
	public ModelAndView addUser(ModelAndView model,
			@ModelAttribute("vehicule") Vehicule vehicule, BindingResult result) {
		vehiculeService.insertVehicule(vehicule);
		System.out.println(vehicule.toString());
		model = new ModelAndView("listVehicules");
		model.addObject("users", vehiculeService.listVehicules());
		return model;
	}

	@RequestMapping(value = "/updateVehicule", method = RequestMethod.POST)
	public ModelAndView updateVehicule(
			@ModelAttribute("vehicule") Vehicule vehicule, ModelAndView model) {
		vehiculeService.updateVehicule(vehicule);
		model = new ModelAndView("listVehicules");
		model.addObject("vehicules", vehiculeService.listVehicules());
		return model;
	}

	@RequestMapping(value = "/deleteVehicule/{vehiculeId}", method = RequestMethod.POST)
	public ModelAndView deleteUser(ModelAndView model,
			@PathVariable("vehiculeId") Integer vehiculeId) {
		vehiculeService.deleteVehicule(vehiculeId);
		model = new ModelAndView("listVehicules");
		model.addObject("vehicules", vehiculeService.listVehicules());
		return model;
	}

	@RequestMapping(value = "/searchVehicule/{id}", method = RequestMethod.GET)
	@Transactional(readOnly = true)
	public ModelAndView searchUser(ModelAndView model,
			@PathVariable("id") Integer userId) {
		model = new ModelAndView("listVehicules");
		model.addObject("vehicules", vehiculeService.getVehiculeById(userId));
		return model;
	}

	@ExceptionHandler(RessourceNotFoundException.class)
	public String handleResourceNotFoundException() {
		return "404";
	}
}
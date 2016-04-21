package com.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
<<<<<<< HEAD
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
=======
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

<<<<<<< HEAD
import com.tutorial.exception.RessourceNotFoundException;
=======
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
import com.tutorial.model.Vehicule;
import com.tutorial.service.VehiculeService;

@Controller
<<<<<<< HEAD
@RequestMapping(value = "/vehicules")
=======
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
public class VehiculeController {

	@Autowired
	private VehiculeService vehiculeService;

<<<<<<< HEAD
	@RequestMapping(value = "/list", method = RequestMethod.GET)
=======
	@RequestMapping(value = "vehicules", method = RequestMethod.GET)
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
	@Transactional(readOnly = true)
	public ModelAndView getAllUsersView(ModelAndView model) {
		model = new ModelAndView("listVehicules");
		model.addObject("vehicules", vehiculeService.listVehicules());
		return model;
	}

<<<<<<< HEAD
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
=======
	@RequestMapping(value = { "/formVehicule", "/updateVehicule" }, method = RequestMethod.GET)
	public String form(
			@RequestParam(value = "id", required = false) Integer vehiculeId,
			Model u_Model) {
		Vehicule vehicule;
		if (vehiculeId != null) {
			vehicule = vehiculeService.getVehiculeById(vehiculeId);
			u_Model.addAttribute("linkSubmit", "updateVehicule");
		} else {
			vehicule = new Vehicule();
			u_Model.addAttribute("linkSubmit", "addVehicule");
		}
		u_Model.addAttribute("vehicule", vehicule);
		return "formVehicule";
	}

	@RequestMapping(value = "addVehicule", method = RequestMethod.POST)
	public String addUser(ModelMap model,
			@ModelAttribute("vehicule") Vehicule vehicule, BindingResult result) {

		if (result.hasErrors()) {
			return "formVehicule";
		} else {
			int id = vehiculeService.countVehicules() + 1;
			vehicule.setId(id);
			vehiculeService.insertVehicule(vehicule);
			System.out.println(vehicule.toString());
			return "redirect:/vehicules";
		}
	}

	@RequestMapping(value = "updateVehicule", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute("vehicule") Vehicule vehicule,
			ModelMap model) {
		System.out.println(vehicule.toString());
		vehiculeService.updateVehicule(vehicule);
		return "redirect:/vehicules";
	}

	@RequestMapping(value = "deleteVehicule/{vehiculeId}")
	public String deleteUser(@PathVariable("vehiculeId") Integer vehiculeId) {
		vehiculeService.deleteVehicule(vehiculeId);
		return "redirect:/vehicules";
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
	}
}
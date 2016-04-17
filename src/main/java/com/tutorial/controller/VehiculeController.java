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

import com.tutorial.model.Vehicule;
import com.tutorial.service.VehiculeService;

@Controller
public class VehiculeController {

	@Autowired
	private VehiculeService vehiculeService;

	@RequestMapping(value = "vehicules", method = RequestMethod.GET)
	@Transactional(readOnly = true)
	public ModelAndView getAllUsersView(ModelAndView model) {
		model = new ModelAndView("listVehicules");
		model.addObject("vehicules", vehiculeService.listVehicules());
		return model;
	}

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
	}
}
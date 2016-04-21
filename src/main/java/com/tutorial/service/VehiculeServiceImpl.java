package com.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.dao.VehiculeDao;
import com.tutorial.model.Vehicule;

@Service
public class VehiculeServiceImpl implements VehiculeService {

	@Autowired
	private VehiculeDao vehiculeDao;

	public Vehicule getVehiculeById(int id) {
		return vehiculeDao.getVehiculeById(id);
	}

	public List<Vehicule> getVehiculesByContructor(String constructor) {
		return vehiculeDao.getVehiculesByContructor(constructor);
	}

	public List<Vehicule> listVehicules() {
		return vehiculeDao.listVehicules();
	}

	public int countVehicules() {
		return vehiculeDao.countVehicules();
	}

	public int countVehiculesLoue(boolean isLoue) {
		return vehiculeDao.countVehiculesLoue(isLoue);
	}

	public void insertVehicule(Vehicule vehicule) {
		vehiculeDao.insertVehicule(vehicule);
	}

	public void updateVehicule(Vehicule vehicule) {
		vehiculeDao.updateVehicule(vehicule);
	}

	public void deleteVehicule(int id) {
		vehiculeDao.deleteVehicule(id);
	}
}
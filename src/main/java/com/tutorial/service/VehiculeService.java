package com.tutorial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tutorial.model.Vehicule;

@Service
public interface VehiculeService {

	public Vehicule getVehiculeById(int id);

	public List<Vehicule> getVehiculesByContructor(String constructor);

	public List<Vehicule> listVehicules();

	public int countVehicules();

	public int countVehiculesLoue(boolean isLoue);

	public void insertVehicule(Vehicule vehicule);

	public void updateVehicule(Vehicule vehicule);

	public void deleteVehicule(int id);
}
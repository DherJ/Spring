package com.tutorial.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tutorial.model.Vehicule;

public interface VehiculeDao {

	public Vehicule getVehiculeById(@Param("v_id") int id);

	public List<Vehicule> getVehiculesByContructor(
			@Param("v_constructor") String constructor);

	public List<Vehicule> listVehicules();

	public int countVehicules();

	public int countVehiculesLoue(@Param("v_isLoue") boolean isLoue);

	public void insertVehicule(@Param("vehicule") Vehicule vehicule);

	public void updateVehicule(@Param("vehicule") Vehicule vehicule);

	public void deleteVehicule(@Param("v_id") int id);
}
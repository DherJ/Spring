package com.tutorial.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tutorial.model.Vehicule;

public interface VehiculeDao {

<<<<<<< HEAD
	public Vehicule getVehiculeById(@Param("v_id") int id);

	public List<Vehicule> getVehiculesByContructor(
			@Param("v_constructor") String constructor);
=======
	public Vehicule getVehiculeById(@Param("id") int id);

	public List<Vehicule> getVehiculesByContructor(
			@Param("constructor") String constructor);
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53

	public List<Vehicule> listVehicules();

	public int countVehicules();

<<<<<<< HEAD
	public int countVehiculesLoue(@Param("v_isLoue") boolean isLoue);
=======
	public int countVehiculesLoue(@Param("isLoue") boolean isLoue);
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53

	public void insertVehicule(@Param("vehicule") Vehicule vehicule);

	public void updateVehicule(@Param("vehicule") Vehicule vehicule);

<<<<<<< HEAD
	public void deleteVehicule(@Param("v_id") int id);
=======
	public void deleteVehicule(@Param("id") int id);
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
}
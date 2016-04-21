package com.tutorial.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.tutorial.model.Adresse;

@Repository
public interface AdresseDao {

	/**
	 * This is the method to be used to list down a record from the Adresse
	 * table corresponding to a passed user id.
	 */
	public Adresse getAdresseByUserId(@Param("user_id_adr") Integer id);

	/**
	 * This is the method to be used to delete a record from the Adresse table
	 * corresponding to a passed user id.
	 */
	public void deleteAdresse(@Param("adr_id") Integer id);

	/**
	 * This is the method to be used to update a record into the Adresse table.
	 */
	public void updateAdresse(@Param("adresse") Adresse adresse);

	/**
	 * @param adresse
	 * @return the number of rows affected
	 */
	public int insertAdresse(@Param("adresse") Adresse adresse);

	public int countAdresses();
}
/*Copyright (c) 2015-2016 wavemaker-com All Rights Reserved.This software is the confidential and proprietary information of wavemaker-com You shall not disclose such Confidential Information and shall use it only in accordance with the terms of the source code license agreement you entered into with wavemaker-com*/

package com.salesdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.salesdb.*;

/**
 * Service object for domain model class Reps.
 * @see com.salesdb.Reps
 */

public interface RepsService {
   /**
	 * Creates a new reps.
	 * 
	 * @param created
	 *            The information of the created reps.
	 * @return The created reps.
	 */
	public Reps create(Reps created);

	/**
	 * Deletes a reps.
	 * 
	 * @param repsId
	 *            The id of the deleted reps.
	 * @return The deleted reps.
	 * @throws EntityNotFoundException
	 *             if no reps is found with the given id.
	 */
	public Reps delete(Integer repsId) throws EntityNotFoundException;

	/**
	 * Finds all repss.
	 * 
	 * @return A list of repss.
	 */
	public Page<Reps> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Reps> findAll(Pageable pageable);
	
	/**
	 * Finds reps by id.
	 * 
	 * @param id
	 *            The id of the wanted reps.
	 * @return The found reps. If no reps is found, this method returns
	 *         null.
	 */
	public Reps findById(Integer id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a reps.
	 * 
	 * @param updated
	 *            The information of the updated reps.
	 * @return The updated reps.
	 * @throws EntityNotFoundException
	 *             if no reps is found with given id.
	 */
	public Reps update(Reps updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the repss in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the reps.
	 */

	public long countAll();


    public Page<Reps> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

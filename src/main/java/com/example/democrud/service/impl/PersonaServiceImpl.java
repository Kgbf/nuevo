package com.example.democrud.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.example.democrud.commons.*;
import com.example.democrud.model.*;
import com.example.democrud.service.api.*;
import com.example.democrud.dao.api.*;
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long>implements PersonaServiceAPI {

	@Autowired
	private PersonaDaoApi personaDaoAPI;
	@Override
	public CrudRepository<Persona, Long> getDao() {
		
		return personaDaoAPI;
	}

}

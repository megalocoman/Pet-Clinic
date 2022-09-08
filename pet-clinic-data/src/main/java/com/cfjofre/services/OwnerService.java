package com.cfjofre.services;

import java.util.Set;

import com.cfjofre.model.Owner;

public interface OwnerService {

	Owner findByLastName(String lastName);
	Owner findById(Long id);
	Owner Save(Owner owner);
	Set<Owner> findAll();
}

package com.cfjofre.services;

import java.util.Set;

import com.cfjofre.model.Pet;

public interface PetService {

	Pet findById(Long id);
	Pet Save(Pet pet);
	Set<Pet> findAll();
}

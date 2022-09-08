package com.cfjofre.services;

import java.util.Set;

import com.cfjofre.model.Vet;

public interface VetService {

	Vet findById(Long id);
	Vet Save(Vet vet);
	Set<Vet> findAll();
}

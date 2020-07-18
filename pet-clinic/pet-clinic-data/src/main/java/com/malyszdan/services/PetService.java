package com.malyszdan.services;

import com.malyszdan.model.Pet;
import java.util.Set;

public interface PetService {

  Pet findById(Long id);

  Pet save(Pet pet);

  Set<Pet> findAll();
}

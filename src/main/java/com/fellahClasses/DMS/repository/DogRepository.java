package com.fellahClasses.DMS.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.fellahClasses.DMS.Models.Dog;
import com.fellahClasses.DMS.Models.Trainer;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
}

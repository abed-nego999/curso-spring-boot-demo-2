package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Coche;
import com.example.demo.entities.Persona;

@Repository
public interface CocheRepositorio extends CrudRepository<Coche, Integer> {
	public Iterable<Persona> findByCasa_Persona_Id(int id);
}

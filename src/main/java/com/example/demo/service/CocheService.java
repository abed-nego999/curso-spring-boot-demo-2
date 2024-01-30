package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Coche;
import com.example.demo.repositories.CocheRepositorio;

@Service
public class CocheService {

	@Autowired
	CocheRepositorio repositorio;

	public Iterable<Coche> list() {
		return repositorio.findAll();
	}

	public Coche addCoche(Coche coche) {
		return repositorio.save(coche);
	}

	public Coche addCoche(String nombreCoche) {
		Coche newCoche = new Coche();
		newCoche.setNombre(nombreCoche);
		return repositorio.save(newCoche);
	}
}

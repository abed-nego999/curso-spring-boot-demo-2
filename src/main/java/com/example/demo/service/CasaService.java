package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Casa;
import com.example.demo.repositories.CasaRepositorio;

@Service
public class CasaService {

	@Autowired
	CasaRepositorio repositorio;

	public Iterable<Casa> list() {
		return repositorio.findAll();
	}

	public Casa getCasa(int id) {
		return repositorio.findCasaById(id).iterator().next();
	}

	public Casa addCasa(Casa casa) {
		return repositorio.save(casa);
	}

	public Casa addCasa(String nombreCasa) {
		Casa newCasa = new Casa();
		newCasa.setNombre(nombreCasa);
		return repositorio.save(newCasa);
	}

	public Casa updateCasa(int id, Casa casa) {
		casa.setId(id);
		return repositorio.save(casa);
	}
}

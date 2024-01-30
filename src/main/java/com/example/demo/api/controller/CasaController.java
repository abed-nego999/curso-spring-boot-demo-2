package com.example.demo.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Casa;
import com.example.demo.service.CasaService;

@RestController
@RequestMapping("/api/casas")
public class CasaController {

	Logger log = LoggerFactory.getLogger(CasaController.class);

	@Autowired
	CasaService servicio;

	@GetMapping
	public Iterable<Casa> actionGet() {
		return servicio.list();
	}

	@GetMapping(path = "/{id}")
	public Casa getCasa(@PathVariable int id) {
		return servicio.getCasa(id);
	}

	@PostMapping
	public Casa addCasa(@RequestParam(defaultValue = "una casa defacta", required = false) String nombreCasa) {
		return servicio.addCasa(nombreCasa);
	}

	@PutMapping(path = "/{id}")
	public Casa putCasa(@PathVariable int id, @RequestBody Casa casa) {
		return servicio.updateCasa(id, casa);
	}
}

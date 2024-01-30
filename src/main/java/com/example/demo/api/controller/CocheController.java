package com.example.demo.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Coche;
import com.example.demo.service.CocheService;

@RestController
@RequestMapping("coches")
public class CocheController {

	Logger log = LoggerFactory.getLogger(CocheController.class);

	@Autowired
	CocheService servicio;

	@GetMapping
	public Iterable<Coche> list() {
		return servicio.list();
	}

	@PostMapping
	public Coche crearCoche(@RequestParam(defaultValue = "un coche defacto", required = false) String nombreCoche) {
		return servicio.addCoche(nombreCoche);
	}
}

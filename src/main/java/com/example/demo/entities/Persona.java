package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Persona {
	@Id
	@SequenceGenerator(sequenceName = "SEC_ORACLE", allocationSize = 1, name = "secuencia")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secuencia")
	private int id;
	private String nombre;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

package com.example.demo.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Casa;

@Repository
public interface CasaRepositorio extends CrudRepository<Casa, Integer> {

	public Iterable<Casa> buscarCasaPorNombre(String nombre);

	@Query(value = "SELECT c FROM Casa c WHERE c.nombre = :nombre")
	public Iterable<Casa> buscarCasaPorNombre2(String nombre);

	public Iterable<Casa> findCasaByNombre(String nombre);

	@Query(value = "SELECT * FROM CASA C WHERE C.NOMBRE = ?", nativeQuery = true)
	public Iterable<Casa> buscarCasaPorNombre3(String nombre);

	@Query(value = "SELECT c FROM Casa c WHERE c.id = :id")
	public Iterable<Casa> findCasaById(Integer id);

	public boolean existsByNombre(@Param("nombre") String nombreCasa);
}

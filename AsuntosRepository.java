package com.msasuntos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.msasuntos.entity.Asuntos;


@Repository
public interface AsuntosRepository extends JpaRepository<Asuntos,Integer>{
	
	//Se maneja con base en objetos de java NO USA LENGUAJE SQL!!!!!!!!!!!!!!! AGTRIBUTOS, ENTIDADES, ETC
	@Query("SELECT c from Asuntos c WHERE c.numExpediente=:numExpediente")//permite darle implementacion a un metodo. la anotacion @Query utiliza el pseudolenguaje jpql: Java Persistence Query Lenguaje
	Asuntos findByName(@Param("numExpediente")int numExpediente);

}

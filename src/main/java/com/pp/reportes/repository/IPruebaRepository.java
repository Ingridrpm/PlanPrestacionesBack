package com.pp.reportes.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pp.reportes.dto.info.InfoPrueba;
import com.pp.reportes.dto.info.InfoPruebaDTO;
import com.pp.reportes.model.Prueba;

public interface IPruebaRepository extends JpaRepository<Prueba, Long>{

	
	//Info de interfaz
	@Query(value = "select p.nombre 'nombre',\r\n" + 
			"	   p.apellido 'apellido'\r\n" + 
			"from PRUEBA p\r\n" + 
			"where p.apellido = :nom", nativeQuery = true)
	List<InfoPrueba> InfoPrueba(
			@Param("nom") String nom
			);
	
	
	//Info para DTO
	@Query(value = "select p.nombre 'nombre',\r\n" + 
			"	   p.apellido 'apellido',\r\n" + 
			"	   p.fecha_nacimiento 'fecha'\r\n" + 
			"from PRUEBA p\r\n" + 
			"where p.fecha_nacimiento = :pfecha", nativeQuery = true)
	List<InfoPruebaDTO> InfoDTO(
			@Param("pfecha") LocalDate pfecha
			);
	
	
}

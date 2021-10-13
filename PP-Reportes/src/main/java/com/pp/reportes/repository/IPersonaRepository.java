package com.pp.reportes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pp.reportes.dto.info.InfoPersona;
import com.pp.reportes.dto.info.InfoPersonaDTO;
import com.pp.reportes.model.Persona;

public interface IPersonaRepository extends JpaRepository<Persona, Long>{

	
	//Info de interfaz
	@Query(value = "select p.* from PERSONA p\r\n" + 
			"where p.registro = :registro", nativeQuery = true)
	List<InfoPersona> InfoPersona(
			@Param("registro") String registro
			);
	
	
	
	
	//Info para DTO
	@Query(value = "select p.nombre 'nombre',\r\n" + 
			"	   p.cuenta 'cuenta',\r\n" + 
			"	   p.dpi 'dpi'\r\n" + 
			"from PERSONA p\r\n" + 
			"where p.dpi = :pfecha", nativeQuery = true)
	List<InfoPersonaDTO> InfoDTO(
			@Param("pfecha") String pfecha
			);
	
	
}

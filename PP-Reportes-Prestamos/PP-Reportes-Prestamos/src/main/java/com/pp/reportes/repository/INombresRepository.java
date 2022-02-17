package com.pp.reportes.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pp.reportes.dto.info.InfoNombres;
import com.pp.reportes.model.Nombres;


public interface INombresRepository extends JpaRepository<Nombres, Long>{

	
	//Nombres
	@Query(value = "select * from nombres\r\n" + 
			"where registro = :registro", nativeQuery = true)
	List<InfoNombres> InfoNombre(
			@Param("registro") String registro
			);
	
	
}

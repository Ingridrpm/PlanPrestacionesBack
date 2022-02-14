package com.pp.reportes.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pp.reportes.dto.info.InfoDatagen;
import com.pp.reportes.model.Datagen;


public interface IDatagenRepository extends JpaRepository<Datagen, Long>{

	
	//Información de persona
	@Query(value = "select * from datagen\r\n" + 
			"where registro = :registro", nativeQuery = true)
	List<InfoDatagen> getDatagenPorRegistro(
			@Param("registro") String registro
			);
	
	
}

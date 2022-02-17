package com.pp.reportes.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pp.reportes.model.Lsusac;
import com.pp.reportes.dto.info.*;



public interface ILsusacRepository extends JpaRepository<Lsusac, Long>{

	
	//Nombres
	@Query(value = "select * from lsusac\r\n" + 
			"where registro = :registro", nativeQuery = true)
	List<InfoLsusac> lsusacPorRegistro(
			@Param("registro") String registro
			);
	
	
}

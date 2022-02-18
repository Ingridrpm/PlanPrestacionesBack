package com.pp.reportes.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pp.reportes.model.*;
import com.pp.reportes.dto.info.*;



public interface IContratRepository extends JpaRepository<Contrat, Long>{

	
	//Registro
	@Query(value = "select * from contrat\r\n" + 
			"where deudor = :registro", nativeQuery = true)
	List<InfoContrat> contratPorRegistro(
			@Param("registro") String registro
			);
	
	//Mes
	//select * from contrat where year(fecha) = 1998 and month(fecha) = 1 
	@Query(value = "select * from contrat\r\n" + 
			"where year(fecha) = :ano and month(fecha) = :mes", nativeQuery = true)
	List<InfoContrat> contratPorMes(
			@Param("ano") String ano, @Param("mes") String mes
			);
}

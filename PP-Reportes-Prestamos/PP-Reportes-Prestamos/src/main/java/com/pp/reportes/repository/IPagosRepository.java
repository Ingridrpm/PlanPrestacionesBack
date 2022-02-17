package com.pp.reportes.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pp.reportes.dto.info.InfoPagos;
import com.pp.reportes.model.Pagos;



public interface IPagosRepository extends JpaRepository<Pagos, Long>{

	
	//Pagos por registro
	@Query(value = "select * from pagos\r\n" + 
			"where registro = :registro", nativeQuery = true)
	List<InfoPagos> pagosPorRegistro(
			@Param("registro") String registro
			);
	
	//Pagos
	@Query(value = "select * from pagos where mes = :mes", nativeQuery = true)
	List<InfoPagos> pagosPorMes(
			@Param("mes") String mes
			);
	
	
}

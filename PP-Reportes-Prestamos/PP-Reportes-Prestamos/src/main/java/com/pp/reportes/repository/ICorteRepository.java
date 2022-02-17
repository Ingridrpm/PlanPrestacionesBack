package com.pp.reportes.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pp.reportes.model.*;
import com.pp.reportes.dto.info.*;
import com.pp.reportes.dto.*;



public interface ICorteRepository extends JpaRepository<Corte, Long>{

	
	//Registro
	@Query(value = "select p.fecha as fecha_asignacion, p.cheque, p.plazo, p.fiador, p.actual as contrato, \r\n" + 
			"p.inicio, p.monto, i.cuota, p.registro as registro_contrat, i.registro, i.tasai as porcent, p.final1, p.anter as contrato_anterior, p.seguro\r\n" + 
			"from contrat p, corte i\r\n" + 
			"where p.actual = i.actual \r\n" + 
			"and p.actual = :contrato", nativeQuery = true)
	List<InfoCorteDTO> cortePorRegistro(
			@Param("contrato") String registro
			);
	
	@Query(value = "select * from corte\r\n" + 
			"where actual = :actual", nativeQuery = true)
	List<InfoCorte> cortePorContrato(
			@Param("actual") String actual
			);
}

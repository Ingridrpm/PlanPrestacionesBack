package com.pp.reportes.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pp.reportes.dto.info.InfoCuenta;
import com.pp.reportes.dto.info.InfoCuentaDTO;
import com.pp.reportes.model.Cuenta;

public interface ICuentaRepository extends JpaRepository<Cuenta, Long>{

	
	//Info de interfaz
	@Query(value = "select c.*\r\n" + 
			"from Cuenta c\r\n" + 
			"where p.apellido = :nom", nativeQuery = true)
	List<InfoCuenta> InfoCuenta(
			@Param("nom") String nom
			);
	
	
	//Info para DTO
	@Query(value = "select p.*, c.cuenta\r\n" + 
			"from persona p, cuenta c \r\n" + 
			"where p.registro = :registro\r\n" + 
			"and p.plaza = :plaza\r\n" + 
			"and p.partida = :partida\r\n" + 
			"and c.registro = p.registro \r\n" + 
			"and c.plaza = p.plaza \r\n" + 
			"and c.partida = p.partida", nativeQuery = true)
	List<InfoCuentaDTO> InfoDTO(
			@Param("registro") Long registro, @Param("partida") Long partida, @Param("plaza") Long plaza
			);
	
	
}

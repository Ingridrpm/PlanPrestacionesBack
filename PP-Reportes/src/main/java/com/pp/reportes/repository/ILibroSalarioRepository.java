package com.pp.reportes.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pp.reportes.dto.info.InfoLibroSalarioDTO;
import com.pp.reportes.dto.info.InfoPersona;
import com.pp.reportes.dto.DatosLibroSalarioDTO;
import com.pp.reportes.dto.info.InfoDatosLibroSalarioDTO;
import com.pp.reportes.dto.info.InfoDescuentoLibroSalarioDTO;
import com.pp.reportes.dto.info.InfoLibroSalario;
import com.pp.reportes.model.LibroSalario;
import com.pp.reportes.model.Prueba;

public interface ILibroSalarioRepository extends JpaRepository<LibroSalario, Long>{

	
	//Info de interfaz
	@Query(value = "select p.*\r\n" + 
			"from LIBRO_SALARIO p\r\n" + 
			"where p.id_libsal = :id", nativeQuery = true)
	List<InfoLibroSalario> InfoLibroSalario(
			@Param("id") Long id
			);
	
	@Query(value = "select id_libsal as id, nomina, partida,plaza, sueldo as salario, (IGSS+TBR+ISR+CPP+PPP+ABT+PBT+DJD+CSN+TCP+FBP+IAP+CCV+PCV+CCC+PCC+PBA+CV+BON+DEU+FID+FT+DT+VAR) as descuentos, liquido, fechadoc as fecha, cheque\r\n" + 
			"from libro_salario \r\n" + 
			"where registro = :registro\r\n" + 
			"and plaza = :plaza", nativeQuery = true)
	List<InfoDatosLibroSalarioDTO> DatosLibro(
			@Param("registro") Long registro,@Param("plaza") Long plaza
			);
	
	//Info para DTO
	@Query(value = "Select p.*\r\n" + 
			"from libro_salario p\r\n" + 
			"where p.registro = :registro and p.plaza = :plaza", nativeQuery = true)
	List<InfoLibroSalarioDTO> InfoDTO(
			@Param("registro") Long registro, @Param("plaza") Long plaza
			);
	
	//Info para Descuento
		@Query(value = "select all nomina, partida, plaza, registro, sueldo, liquido, :descuento as descuento from libro_salario where registro = :registro and plaza = :plaza and :descuento>0 ", nativeQuery = true)
		List<InfoDescuentoLibroSalarioDTO> DescuentosLibro(
				@Param("registro") Long registro, @Param("plaza") Long plaza, @Param("descuento") String descuento
				);
	
		//
		@Query(value = "select * from libro_salario where nomina = :nomina ", nativeQuery = true)
		List<InfoLibroSalarioDTO> InfoNomina(
				@Param("nomina") Long nomina
				);
	
		//Info para DTO
		@Query(value = "select REGISTRO,PLAZA,PARTIDA,SUM(SUELDO),SUM(IGSS),SUM(TBR),SUM(ISR),SUM(CPP),SUM(PPP),SUM(ABT),SUM(PBT),\r\n" + 
				"SUM(DJD),SUM(CSN),SUM(TCP),SUM(FBP),SUM(IAP),SUM(CCV),SUM(PCV),SUM(CCC),SUM(PCC),SUM(PBA),SUM(CV),SUM(BON),\r\n" + 
				"SUM(DEU),SUM(FID),SUM(FT),SUM(DT),SUM(VAR),SUM(LIQUIDO),PLAZA_DESCRIPCION,CHEQUE,DELCHEQUE,NULO,REPXCHEQUE,\r\n" + 
				"NOMBRE,BONICV,BONSAL,NOMINA,NOM,BANCO,OBSERV,FECHADOC,NRECIBO,PTD_BON14 \r\n" + 
				"from libro_salario \r\n" + 
				"where registro = :registro and plaza = :plaza", nativeQuery = true)
		List<InfoLibroSalarioDTO> SumaDescuentos(
				@Param("registro") Long registro, @Param("plaza") Long plaza
				);
		
		//select distinct nomina from libro_salario where MONTH(fechadoc) = 11 and YEAR(fechadoc) = 2016
		//nomina por mes y año
		@Query(value = "select distinct nomina from libro_salario where MONTH(fechadoc) = :mes and YEAR(fechadoc) = :ano", nativeQuery = true)
		List<Long> NominaMesAno(
				@Param("mes") Long mes, @Param("ano") Long ano
				);
}

package com.pp.reportes.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.pp.reportes.dto.DatosLibroSalarioDTO;
import com.pp.reportes.dto.DescuentoLibroSalarioDTO;
import com.pp.reportes.dto.LibroSalarioDTO;
import com.pp.reportes.dto.info.InfoLibroSalario;
import com.pp.reportes.model.LibroSalario;


public interface ILibroSalarioService extends ICRUD<LibroSalario>{


	// ************************************************************************************* PARA OBTENER DATOS DE LA BASE **************************************************************************

	
	//metodo para obtener nominas del mes
	public List<InfoLibroSalario> LibroSalarioinfo(String pnom);
	
	public List<DatosLibroSalarioDTO> DatosLibro(String registro,String partida,String plaza);
	
	
	//metodo para obtener nominas del mes
	public List<LibroSalarioDTO> LibroSalariodto(String registro, String plaza);

	public List<LibroSalarioDTO> SumaDescuentos(String registro, String plaza);

	public List<DescuentoLibroSalarioDTO> DescuentosLibro(String registro,String plaza,String descuento);
	
	public List<Long> NominaMesAno(String mes, String ano);
	
	public List<LibroSalarioDTO> InfoNomina(String nomina);
	
	
	
	
}

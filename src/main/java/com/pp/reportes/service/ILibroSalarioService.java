package com.pp.reportes.service;

import java.util.List;

import com.pp.reportes.dto.LibroSalarioDTO;
import com.pp.reportes.dto.info.InfoLibroSalario;
import com.pp.reportes.model.LibroSalario;


public interface ILibroSalarioService extends ICRUD<LibroSalario>{


	// ************************************************************************************* PARA OBTENER DATOS DE LA BASE **************************************************************************

	
	//metodo para obtener nominas del mes
	public List<InfoLibroSalario> LibroSalarioinfo(String pnom);
	
	
	
	//metodo para obtener nominas del mes
	public List<LibroSalarioDTO> LibroSalariodto(String pfecha);
	
	
	
	
}

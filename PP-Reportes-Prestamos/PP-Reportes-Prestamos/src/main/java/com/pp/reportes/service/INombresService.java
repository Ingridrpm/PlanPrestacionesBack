package com.pp.reportes.service;

import java.util.List;

import com.pp.reportes.dto.info.InfoNombres;
import com.pp.reportes.model.Nombres;

public interface INombresService extends ICRUD<Nombres>{


	// ************************************************************************************* PARA OBTENER DATOS DE LA BASE **************************************************************************

	
	//metodo para obtener el nombre con el registro
	public List<InfoNombres> InfoNombre(String registro);
	

	
	
	
}
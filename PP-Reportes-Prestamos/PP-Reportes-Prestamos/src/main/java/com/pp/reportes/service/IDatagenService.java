package com.pp.reportes.service;

import java.util.List;

import com.pp.reportes.dto.info.InfoDatagen;
import com.pp.reportes.model.Datagen;

public interface IDatagenService extends ICRUD<Datagen>{


	// ************************************************************************************* PARA OBTENER DATOS DE LA BASE **************************************************************************

	
	//metodo para obtener la información con el registro
	public List<InfoDatagen> getDatagenPorRegistro(String registro);
	

	
	
	
}
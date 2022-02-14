package com.pp.reportes.service;

import java.util.List;

import com.pp.reportes.dto.info.*;
import com.pp.reportes.model.*;

public interface ILsusacService extends ICRUD<Lsusac>{


	// ************************************************************************************* PARA OBTENER DATOS DE LA BASE **************************************************************************

	
	//metodo para obtener el nombre con el registro
	public List<InfoLsusac> lsusacPorRegistro(String registro);
	

	
	
	
}
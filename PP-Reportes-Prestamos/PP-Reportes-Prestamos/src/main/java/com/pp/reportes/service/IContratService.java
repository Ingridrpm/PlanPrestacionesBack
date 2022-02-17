package com.pp.reportes.service;

import java.util.List;

import com.pp.reportes.dto.info.*;
import com.pp.reportes.model.*;

public interface IContratService extends ICRUD<Contrat>{


	// ************************************************************************************* PARA OBTENER DATOS DE LA BASE **************************************************************************

	
	//metodo para obtener el nombre con el registro
	public List<InfoContrat> contratPorRegistro(String registro);
	
	public List<InfoContrat> contratPorMes(String ano, String mes);
	
	
	
	
}
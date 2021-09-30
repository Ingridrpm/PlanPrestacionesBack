package com.pp.reportes.service;

import java.util.List;

import com.pp.reportes.dto.PruebaDTO;
import com.pp.reportes.dto.info.InfoPrueba;
import com.pp.reportes.model.Prueba;

public interface IPruebaService extends ICRUD<Prueba>{


	// ************************************************************************************* PARA OBTENER DATOS DE LA BASE **************************************************************************

	
	//metodo para obtener nominas del mes
	public List<InfoPrueba> Pruebainfo(String pnom);
	
	
	
	//metodo para obtener nominas del mes
	public List<PruebaDTO> Pruebadto(String pfecha);
	
	
	
	
}

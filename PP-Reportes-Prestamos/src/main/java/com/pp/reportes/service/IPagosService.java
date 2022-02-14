package com.pp.reportes.service;

import java.util.List;

import com.pp.reportes.dto.info.InfoPagos;
import com.pp.reportes.model.Pagos;

public interface IPagosService extends ICRUD<Pagos>{


	// ************************************************************************************* PARA OBTENER DATOS DE LA BASE **************************************************************************

	
	//metodo para obtener los pagos con el registro
	public List<InfoPagos> pagosPorRegistro(String registro);
	
	//metodo para obtener los pagos con el mes y año
	public List<InfoPagos> pagosPorMes(String mes);
	
}
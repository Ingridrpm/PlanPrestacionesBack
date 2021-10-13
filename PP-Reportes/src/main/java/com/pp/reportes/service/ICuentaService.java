package com.pp.reportes.service;

import java.util.List;

import com.pp.reportes.dto.CuentaDTO;
import com.pp.reportes.dto.info.InfoCuenta;
import com.pp.reportes.model.Cuenta;

public interface ICuentaService extends ICRUD<Cuenta>{


	// ************************************************************************************* PARA OBTENER DATOS DE LA BASE **************************************************************************

	
	//metodo para obtener nominas del mes
	public List<InfoCuenta> Cuentainfo(String pnom);
	
	
	
	//metodo para obtener nominas del mes
	public List<CuentaDTO> Cuentadto(Long registro,Long partida,Long plaza);
	
	
	
	
}

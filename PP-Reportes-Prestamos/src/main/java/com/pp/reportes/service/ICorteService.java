package com.pp.reportes.service;

import java.util.List;

import com.pp.reportes.dto.info.*;
import com.pp.reportes.model.*;
import com.pp.reportes.dto.*;

public interface ICorteService extends ICRUD<Corte>{


	// ************************************************************************************* PARA OBTENER DATOS DE LA BASE **************************************************************************

	
	//metodo para obtener el nombre con el registro
	public List<CorteDTO> cortePorRegistro(String contrato);
	
	
	public List<InfoCorte> cortePorContrato(String actual);
	
	
}
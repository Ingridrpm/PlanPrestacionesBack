package com.pp.reportes.service;

import java.util.List;

import com.pp.reportes.dto.PersonaDTO;
import com.pp.reportes.dto.info.InfoPersona;
import com.pp.reportes.model.Persona;

public interface IPersonaService extends ICRUD<Persona>{


	// ************************************************************************************* PARA OBTENER DATOS DE LA BASE **************************************************************************

	
	//metodo para obtener nominas del mes
	public List<InfoPersona> Personainfo(String registro);
	
	
	
	//metodo para obtener nominas del mes
	public List<PersonaDTO> Personadto(String pfecha);
	
	
	
	
}

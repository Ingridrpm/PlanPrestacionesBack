package com.pp.reportes.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.reportes.dto.PersonaDTO;
import com.pp.reportes.dto.info.InfoPersona;
import com.pp.reportes.dto.info.InfoPersonaDTO;
import com.pp.reportes.model.Persona;
import com.pp.reportes.repository.IPersonaRepository;
import com.pp.reportes.service.IPersonaService;

@Service
public class PersonaService implements IPersonaService{

	@Autowired
	private IPersonaRepository personarepository;
	
	// METODOS DE ICRUD
	
	@Override
	public Persona registrar(Persona t) {
		return this.personarepository.save(t);
	}

	@Override
	public Persona modificar(Persona t) {
		return this.personarepository.save(t);
	}

	@Override
	public void eliminar(Long id) {
		//this.personarepository.deleteById(id);		
	}

	@Override
	public List<Persona> listar() {
		return this.personarepository.findAll();
	}

	@Override
	public Persona listarId(Long id) {
		return this.personarepository.findById(id).orElse(null);
	}
	
	//METODOS DE IPRUEBASERVICE
	
	@Override
	public List<InfoPersona> Personainfo(String registro) {
		return personarepository.InfoPersona(registro);
	}
 
	@Override
	public List<PersonaDTO> Personadto(String dpi) {
		
				
		List<PersonaDTO> lis = new ArrayList<PersonaDTO>();
		
		List<InfoPersonaDTO> info = personarepository.InfoDTO(dpi);
		/*
		for (InfoPersonaDTO ia : info) {
			
			PersonaDTO nu = new PersonaDTO();
			
			nu.setNombre(ia.getNombre());
			nu.setApellido(ia.getApellido());
			nu.setCuenta(fecha);
			
			lis.add(nu);
		}
		*/
				
		return lis;
	}
	
}

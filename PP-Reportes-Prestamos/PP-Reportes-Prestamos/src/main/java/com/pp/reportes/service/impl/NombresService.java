package com.pp.reportes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.reportes.dto.info.InfoNombres;
import com.pp.reportes.model.Nombres;
import com.pp.reportes.repository.INombresRepository;
import com.pp.reportes.service.INombresService;


@Service
public class NombresService implements INombresService{

	@Autowired
	private INombresRepository nombresrepository;
	
	// METODOS DE ICRUD
	
	@Override
	public Nombres registrar(Nombres t) {
		return this.nombresrepository.save(t);
	}

	@Override
	public Nombres modificar(Nombres t) {
		return this.nombresrepository.save(t);
	}

	@Override
	public void eliminar(Long id) {
		this.nombresrepository.deleteById(id);		
	}

	@Override
	public List<Nombres> listar() {
		return this.nombresrepository.findAll();
	}

	@Override
	public Nombres listarId(Long id) {
		return this.nombresrepository.findById(id).orElse(null);
	}
	
	//METODOS DE NOMBRE
	
	@Override
	public List<InfoNombres> InfoNombre(String registro) {
		return nombresrepository.InfoNombre(registro);
	}
 
	
}

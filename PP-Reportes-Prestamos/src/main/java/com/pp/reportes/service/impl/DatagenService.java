package com.pp.reportes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.reportes.dto.info.InfoDatagen;
import com.pp.reportes.model.Datagen;
import com.pp.reportes.repository.IDatagenRepository;
import com.pp.reportes.service.IDatagenService;


@Service
public class DatagenService implements IDatagenService{

	@Autowired
	private IDatagenRepository datagenrepository;
	
	// METODOS DE ICRUD
	
	@Override
	public Datagen registrar(Datagen t) {
		return this.datagenrepository.save(t);
	}

	@Override
	public Datagen modificar(Datagen t) {
		return this.datagenrepository.save(t);
	}

	@Override
	public void eliminar(Long id) {
		this.datagenrepository.deleteById(id);		
	}

	@Override
	public List<Datagen> listar() {
		return this.datagenrepository.findAll();
	}

	@Override
	public Datagen listarId(Long id) {
		return this.datagenrepository.findById(id).orElse(null);
	}
	
	//METODOS DE NOMBRE
	
	@Override
	public List<InfoDatagen> getDatagenPorRegistro(String registro) {
		return datagenrepository.getDatagenPorRegistro(registro);
	}
 
	
}
package com.pp.reportes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.reportes.dto.info.*;
import com.pp.reportes.model.*;
import com.pp.reportes.repository.*;
import com.pp.reportes.service.*;


@Service
public class LsusacService implements ILsusacService{

	@Autowired
	private ILsusacRepository lsusacrepository;
	
	// METODOS DE ICRUD
	
	@Override
	public Lsusac registrar(Lsusac t) {
		return this.lsusacrepository.save(t);
	}

	@Override
	public Lsusac modificar(Lsusac t) {
		return this.lsusacrepository.save(t);
	}

	@Override
	public void eliminar(Long id) {
		this.lsusacrepository.deleteById(id);		
	}

	@Override
	public List<Lsusac> listar() {
		return this.lsusacrepository.findAll();
	}

	@Override
	public Lsusac listarId(Long id) {
		return this.lsusacrepository.findById(id).orElse(null);
	}
	
	//METODOS DE NOMBRE
	
	@Override
	public List<InfoLsusac> lsusacPorRegistro(String registro) {
		return lsusacrepository.lsusacPorRegistro(registro);
	}
 
	
}

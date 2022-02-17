package com.pp.reportes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.reportes.dto.info.*;
import com.pp.reportes.model.*;
import com.pp.reportes.repository.*;
import com.pp.reportes.service.*;


@Service
public class ContratService implements IContratService{

	@Autowired
	private IContratRepository contratrepository;
	
	// METODOS DE ICRUD
	
	@Override
	public Contrat registrar(Contrat t) {
		return this.contratrepository.save(t);
	}

	@Override
	public Contrat modificar(Contrat t) {
		return this.contratrepository.save(t);
	}

	@Override
	public void eliminar(Long id) {
		this.contratrepository.deleteById(id);		
	}

	@Override
	public List<Contrat> listar() {
		return this.contratrepository.findAll();
	}

	@Override
	public Contrat listarId(Long id) {
		return this.contratrepository.findById(id).orElse(null);
	}
	
	//METODOS DE NOMBRE
	
	@Override
	public List<InfoContrat> contratPorRegistro(String registro) {
		return contratrepository.contratPorRegistro(registro);
	}
 
	@Override
	public List<InfoContrat> contratPorMes(String ano, String mes) {
		return contratrepository.contratPorMes(ano,mes);
	}
 
	
}

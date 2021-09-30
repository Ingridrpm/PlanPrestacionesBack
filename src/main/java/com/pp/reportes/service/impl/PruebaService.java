package com.pp.reportes.service.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.reportes.dto.PruebaDTO;
import com.pp.reportes.dto.info.InfoPrueba;
import com.pp.reportes.dto.info.InfoPruebaDTO;
import com.pp.reportes.model.Prueba;
import com.pp.reportes.repository.IPruebaRepository;
import com.pp.reportes.service.IPruebaService;

@Service
public class PruebaService implements IPruebaService{

	@Autowired
	private IPruebaRepository pruebarepository;
	
	// METODOS DE ICRUD
	
	@Override
	public Prueba registrar(Prueba t) {
		return this.pruebarepository.save(t);
	}

	@Override
	public Prueba modificar(Prueba t) {
		return this.pruebarepository.save(t);
	}

	@Override
	public void eliminar(Long id) {
		this.pruebarepository.deleteById(id);		
	}

	@Override
	public List<Prueba> listar() {
		return this.pruebarepository.findAll();
	}

	@Override
	public Prueba listarId(Long id) {
		return this.pruebarepository.findById(id).orElse(null);
	}
	
	//METODOS DE IPRUEBASERVICE
	
	@Override
	public List<InfoPrueba> Pruebainfo(String pnom) {
		return pruebarepository.InfoPrueba(pnom);
	}
 
	@Override
	public List<PruebaDTO> Pruebadto(String pfecha) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
		LocalDate fecha = LocalDate.parse(pfecha, formatter);
				
		List<PruebaDTO> lis = new ArrayList<PruebaDTO>();
		
		List<InfoPruebaDTO> info = pruebarepository.InfoDTO(fecha);
		
		for (InfoPruebaDTO ia : info) {
			
			PruebaDTO nu = new PruebaDTO();
			
			nu.setNombre(ia.getNombre());
			nu.setApellido(ia.getApellido());
			nu.setFecha_nacimiento(fecha);
			
			lis.add(nu);
		}
		
				
		return lis;
	}
	
}

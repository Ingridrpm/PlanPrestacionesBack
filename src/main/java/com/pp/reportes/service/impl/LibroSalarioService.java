package com.pp.reportes.service.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.reportes.dto.LibroSalarioDTO;
import com.pp.reportes.dto.info.InfoLibroSalario;
import com.pp.reportes.dto.info.InfoLibroSalarioDTO;
import com.pp.reportes.model.LibroSalario;
import com.pp.reportes.repository.ILibroSalarioRepository;
import com.pp.reportes.service.ILibroSalarioService;

@Service
public class LibroSalarioService implements ILibroSalarioService{

	@Autowired
	private ILibroSalarioRepository pruebarepository;
	
	// METODOS DE ICRUD
	
	@Override
	public LibroSalario registrar(LibroSalario t) {
		return this.pruebarepository.save(t);
	}

	@Override
	public LibroSalario modificar(LibroSalario t) {
		return this.pruebarepository.save(t);
	}

	@Override
	public void eliminar(Long id) {
		this.pruebarepository.deleteById(id);		
	}

	@Override
	public List<LibroSalario> listar() {
		return this.pruebarepository.findAll();
	}

	@Override
	public LibroSalario listarId(Long id) {
		return this.pruebarepository.findById(id).orElse(null);
	}
	
	//METODOS DE IPRUEBASERVICE
	
	@Override
	public List<InfoLibroSalario> LibroSalarioinfo(String pnom) {
		return pruebarepository.InfoLibroSalario(pnom);
	}
 
	@Override
	public List<LibroSalarioDTO> LibroSalariodto(String pfecha) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
		LocalDate fecha = LocalDate.parse(pfecha, formatter);
				
		List<LibroSalarioDTO> lis = new ArrayList<LibroSalarioDTO>();
		
		List<InfoLibroSalarioDTO> info = pruebarepository.InfoDTO(fecha);
		
		for (InfoLibroSalarioDTO ia : info) {
			
			LibroSalarioDTO nu = new LibroSalarioDTO();
			
			nu.setNombre(ia.getNombre());
			
			lis.add(nu);
		}
		
				
		return lis;
	}
	
}

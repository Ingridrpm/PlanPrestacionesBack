package com.pp.reportes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pp.reportes.dto.info.*;
import com.pp.reportes.exception.ModeloNotFoundException;
import com.pp.reportes.model.*;
import com.pp.reportes.service.*;

@RestController
@RequestMapping("/lsusac")
public class LsusacController {

	@Autowired
	private ILsusacService service;
		
	// METODOS DE ICRUD
	
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Lsusac>> listar(){
		
		return new ResponseEntity<List<Lsusac>>(service.listar(), HttpStatus.OK);	
		
	}	
	
	
	@PostMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Lsusac> registrar(@Validated @RequestBody Lsusac parametro) {
		
		Lsusac no = service.registrar(parametro);
		
		if (no == null)
			throw new ModeloNotFoundException("NOMBRES NO REGISTRADO!");
	
		return new ResponseEntity<Lsusac>(no, HttpStatus.OK);
		
	}
	
	@PutMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Lsusac> modificar(@Validated @RequestBody Lsusac parametro) {
				
		return new ResponseEntity<Lsusac>(service.modificar(parametro), HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Lsusac> elminar(@PathVariable("id") Long id) {
		
		Lsusac nom = service.listarId(id);
		
		if (nom == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		} else {
			this.service.eliminar(id);
		}
		
		return new ResponseEntity<Lsusac>(nom, HttpStatus.OK);
		
	}
	
	
	//METODOS DE IPRUEBASERVICE
	
	
	// Devuelve info de consulta 
	@PostMapping(value = "/info", produces = "application/json")
	public ResponseEntity<List<InfoLsusac>> lsusacPorRegistro( @RequestParam(value = "pidu") String pidu, 
														   @RequestParam(value = "registro") String registro
													     ) {
		
		return new ResponseEntity<List<InfoLsusac>>(this.service.lsusacPorRegistro(registro),HttpStatus.OK);
		
	}
	
	
	
}

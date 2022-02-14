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

import com.pp.reportes.dto.*;
import com.pp.reportes.dto.info.*;
import com.pp.reportes.exception.ModeloNotFoundException;
import com.pp.reportes.model.*;
import com.pp.reportes.service.*;

@RestController
@RequestMapping("/corte")
public class CorteController {

	@Autowired
	private ICorteService service;
		
	// METODOS DE ICRUD
	
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Corte>> listar(){
		
		return new ResponseEntity<List<Corte>>(service.listar(), HttpStatus.OK);	
		
	}	
	
	
	@PostMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Corte> registrar(@Validated @RequestBody Corte parametro) {
		
		Corte no = service.registrar(parametro);
		
		if (no == null)
			throw new ModeloNotFoundException("NOMBRES NO REGISTRADO!");
	
		return new ResponseEntity<Corte>(no, HttpStatus.OK);
		
	}
	
	@PutMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Corte> modificar(@Validated @RequestBody Corte parametro) {
				
		return new ResponseEntity<Corte>(service.modificar(parametro), HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Corte> elminar(@PathVariable("id") Long id) {
		
		Corte nom = service.listarId(id);
		
		if (nom == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		} else {
			this.service.eliminar(id);
		}
		
		return new ResponseEntity<Corte>(nom, HttpStatus.OK);
		
	}
	
	
	//METODOS DE IPRUEBASERVICE
	
	
	// Devuelve info de consulta 
	@PostMapping(value = "/estado", produces = "application/json")
	public ResponseEntity<List<CorteDTO>> cortetPorRegistro( @RequestParam(value = "pidu") String pidu, 
														   @RequestParam(value = "contrato") String contrato
													     ) {
		
		return new ResponseEntity<List<CorteDTO>>(this.service.cortePorRegistro(contrato),HttpStatus.OK);
		
	}
	
	// Devuelve info de consulta 
		@PostMapping(value = "/info", produces = "application/json")
		public ResponseEntity<List<InfoCorte>> cortePorContrato( @RequestParam(value = "pidu") String pidu, 
															   @RequestParam(value = "actual") String actual
														     ) {
			
			return new ResponseEntity<List<InfoCorte>>(this.service.cortePorContrato(actual),HttpStatus.OK);
			
		}
	
	
}

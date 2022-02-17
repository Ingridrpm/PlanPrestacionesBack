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
@RequestMapping("/contrat")
public class ContratController {

	@Autowired
	private IContratService service;
		
	// METODOS DE ICRUD
	
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Contrat>> listar(){
		
		return new ResponseEntity<List<Contrat>>(service.listar(), HttpStatus.OK);	
		
	}	
	
	
	@PostMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Contrat> registrar(@Validated @RequestBody Contrat parametro) {
		
		Contrat no = service.registrar(parametro);
		
		if (no == null)
			throw new ModeloNotFoundException("NOMBRES NO REGISTRADO!");
	
		return new ResponseEntity<Contrat>(no, HttpStatus.OK);
		
	}
	
	@PutMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Contrat> modificar(@Validated @RequestBody Contrat parametro) {
				
		return new ResponseEntity<Contrat>(service.modificar(parametro), HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Contrat> elminar(@PathVariable("id") Long id) {
		
		Contrat nom = service.listarId(id);
		
		if (nom == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		} else {
			this.service.eliminar(id);
		}
		
		return new ResponseEntity<Contrat>(nom, HttpStatus.OK);
		
	}
	
	
	//METODOS DE IPRUEBASERVICE
	
	
	// Devuelve info de consulta 
	@PostMapping(value = "/info", produces = "application/json")
	public ResponseEntity<List<InfoContrat>> contratPorRegistro( @RequestParam(value = "pidu") String pidu, 
														   @RequestParam(value = "registro") String registro
													     ) {
		
		return new ResponseEntity<List<InfoContrat>>(this.service.contratPorRegistro(registro),HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/mes", produces = "application/json")
	public ResponseEntity<List<InfoContrat>> contratPorMes( @RequestParam(value = "pidu") String pidu, 
															@RequestParam(value = "ano") String ano,
														   @RequestParam(value = "mes") String mes
													     ) {
		
		return new ResponseEntity<List<InfoContrat>>(this.service.contratPorMes(ano,mes),HttpStatus.OK);
		
	}
	
}

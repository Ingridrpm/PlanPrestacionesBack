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

import com.pp.reportes.dto.PersonaDTO;
import com.pp.reportes.dto.info.InfoPersona;
import com.pp.reportes.exception.ModeloNotFoundException;
import com.pp.reportes.model.Persona;
import com.pp.reportes.service.IPersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {

	@Autowired
	private IPersonaService service;
		
	// METODOS DE ICRUD
	
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Persona>> listar(){
		
		return new ResponseEntity<List<Persona>>(service.listar(), HttpStatus.OK);	
		
	}	
	
	
	@PostMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Persona> registrar(@Validated @RequestBody Persona parametro) {
		
		Persona no = service.registrar(parametro);
		
		if (no == null)
			throw new ModeloNotFoundException("PERSONA NO REGISTRADA!");
	
		return new ResponseEntity<Persona>(no, HttpStatus.OK);
		
	}
	
	@PutMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Persona> modificar(@Validated @RequestBody Persona parametro) {
				
		return new ResponseEntity<Persona>(service.modificar(parametro), HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Persona> elminar(@PathVariable("id") Long id) {
		
		Persona nom = service.listarId(id);
		
		if (nom == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		} else {
			this.service.eliminar(id);
		}
		
		return new ResponseEntity<Persona>(nom, HttpStatus.OK);
		
	}
	
	
	//METODOS DE IPRUEBASERVICE
	
	
	// Devuelve info de consulta en interfaz
	@PostMapping(value = "/info", produces = "application/json")
	public ResponseEntity<List<InfoPersona>> InfoPersona( @RequestParam(value = "pidu") String pidu, 
														   @RequestParam(value = "registro") String registro
													     ) {
		
		return new ResponseEntity<List<InfoPersona>>(this.service.Personainfo(registro),HttpStatus.OK);
		
	}
	
	
	// Devuelve consulta en dto
	@PostMapping(value = "/dto", produces = "application/json")
	public ResponseEntity<List<PersonaDTO>> DtoArticuloss(@RequestParam(value = "pidu") String pidu, 
																@RequestParam(value = "pfecha") String pfecha
																) {
					
		return new ResponseEntity<List<PersonaDTO>>(this.service.Personadto(pfecha),HttpStatus.OK);
		
	}
	
	
}

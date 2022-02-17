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

import com.pp.reportes.dto.info.InfoDatagen;
import com.pp.reportes.exception.ModeloNotFoundException;
import com.pp.reportes.model.Datagen;
import com.pp.reportes.service.IDatagenService;

@RestController
@RequestMapping("/datagen")
public class DatagenController {

	@Autowired
	private IDatagenService service;
		
	// METODOS DE ICRUD
	
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Datagen>> listar(){
		
		return new ResponseEntity<List<Datagen>>(service.listar(), HttpStatus.OK);	
		
	}	
	
	
	@PostMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Datagen> registrar(@Validated @RequestBody Datagen parametro) {
		
		Datagen no = service.registrar(parametro);
		
		if (no == null)
			throw new ModeloNotFoundException("Datagen NO REGISTRADO!");
	
		return new ResponseEntity<Datagen>(no, HttpStatus.OK);
		
	}
	
	@PutMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Datagen> modificar(@Validated @RequestBody Datagen parametro) {
				
		return new ResponseEntity<Datagen>(service.modificar(parametro), HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Datagen> elminar(@PathVariable("id") Long id) {
		
		Datagen nom = service.listarId(id);
		
		if (nom == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		} else {
			this.service.eliminar(id);
		}
		
		return new ResponseEntity<Datagen>(nom, HttpStatus.OK);
		
	}
	
	
	//METODOS DE IDATAGENSERVICE
	
	
	// Devuelve info de consulta 
	@PostMapping(value = "/info", produces = "application/json")
	public ResponseEntity<List<InfoDatagen>> getDatagenPorRegistro( @RequestParam(value = "pidu") String pidu, 
														   @RequestParam(value = "registro") String registro
													     ) {
		
		return new ResponseEntity<List<InfoDatagen>>(this.service.getDatagenPorRegistro(registro),HttpStatus.OK);
		
	}
	
	
	
}

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

import com.pp.reportes.dto.PruebaDTO;
import com.pp.reportes.dto.info.InfoPrueba;
import com.pp.reportes.exception.ModeloNotFoundException;
import com.pp.reportes.model.Prueba;
import com.pp.reportes.service.IPruebaService;

@RestController
@RequestMapping("/prueba")
public class PruebaController {

	@Autowired
	private IPruebaService service;
		
	// METODOS DE ICRUD
	
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Prueba>> listar(){
		
		return new ResponseEntity<List<Prueba>>(service.listar(), HttpStatus.OK);	
		
	}	
	
	
	@PostMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Prueba> registrar(@Validated @RequestBody Prueba parametro) {
		
		Prueba no = service.registrar(parametro);
		
		if (no == null)
			throw new ModeloNotFoundException("PRUEBA NO REGISTRADA!");
	
		return new ResponseEntity<Prueba>(no, HttpStatus.OK);
		
	}
	
	@PutMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Prueba> modificar(@Validated @RequestBody Prueba parametro) {
				
		return new ResponseEntity<Prueba>(service.modificar(parametro), HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Prueba> elminar(@PathVariable("id") Long id) {
		
		Prueba nom = service.listarId(id);
		
		if (nom == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		} else {
			this.service.eliminar(id);
		}
		
		return new ResponseEntity<Prueba>(nom, HttpStatus.OK);
		
	}
	
	
	//METODOS DE IPRUEBASERVICE
	
	
	// Devuelve info de consulta en interfaz
	@PostMapping(value = "/info", produces = "application/json")
	public ResponseEntity<List<InfoPrueba>> InfoPrueba( @RequestParam(value = "pidu") String pidu, 
														   @RequestParam(value = "pnom") String pnom
													     ) {
		
		return new ResponseEntity<List<InfoPrueba>>(this.service.Pruebainfo(pnom),HttpStatus.OK);
		
	}
	
	
	// Devuelve consulta en dto
	@PostMapping(value = "/dto", produces = "application/json")
	public ResponseEntity<List<PruebaDTO>> DtoArticuloss(@RequestParam(value = "pidu") String pidu, 
																@RequestParam(value = "pfecha") String pfecha
																) {
					
		return new ResponseEntity<List<PruebaDTO>>(this.service.Pruebadto(pfecha),HttpStatus.OK);
		
	}
	
	
}

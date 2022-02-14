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

import com.pp.reportes.dto.info.InfoNombres;
import com.pp.reportes.exception.ModeloNotFoundException;
import com.pp.reportes.model.Nombres;
import com.pp.reportes.service.INombresService;

@RestController
@RequestMapping("/nombres")
public class NombresController {

	@Autowired
	private INombresService service;
		
	// METODOS DE ICRUD
	
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Nombres>> listar(){
		
		return new ResponseEntity<List<Nombres>>(service.listar(), HttpStatus.OK);	
		
	}	
	
	
	@PostMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Nombres> registrar(@Validated @RequestBody Nombres parametro) {
		
		Nombres no = service.registrar(parametro);
		
		if (no == null)
			throw new ModeloNotFoundException("NOMBRES NO REGISTRADO!");
	
		return new ResponseEntity<Nombres>(no, HttpStatus.OK);
		
	}
	
	@PutMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Nombres> modificar(@Validated @RequestBody Nombres parametro) {
				
		return new ResponseEntity<Nombres>(service.modificar(parametro), HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Nombres> elminar(@PathVariable("id") Long id) {
		
		Nombres nom = service.listarId(id);
		
		if (nom == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		} else {
			this.service.eliminar(id);
		}
		
		return new ResponseEntity<Nombres>(nom, HttpStatus.OK);
		
	}
	
	
	//METODOS DE IPRUEBASERVICE
	
	
	// Devuelve info de consulta 
	@PostMapping(value = "/info", produces = "application/json")
	public ResponseEntity<List<InfoNombres>> InfoPrueba( @RequestParam(value = "pidu") String pidu, 
														   @RequestParam(value = "registro") String registro
													     ) {
		
		return new ResponseEntity<List<InfoNombres>>(this.service.InfoNombre(registro),HttpStatus.OK);
		
	}
	
	
	
}

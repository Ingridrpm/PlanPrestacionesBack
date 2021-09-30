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

import com.pp.reportes.exception.ModeloNotFoundException;
import com.pp.reportes.dto.LibroSalarioDTO;
import com.pp.reportes.dto.info.InfoLibroSalario;
import com.pp.reportes.model.LibroSalario;
import com.pp.reportes.service.ILibroSalarioService;


@RestController
@RequestMapping("/libsal")
public class LibroSalarioController {

	@Autowired
	private ILibroSalarioService service;
		
	// METODOS DE ICRUD
	
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<LibroSalario>> listar(){
		
		return new ResponseEntity<List<LibroSalario>>(service.listar(), HttpStatus.OK);	
		
	}	
	
	
	@PostMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<LibroSalario> registrar(@Validated @RequestBody LibroSalario parametro) {
		
		LibroSalario no = service.registrar(parametro);
		
		if (no == null)
			throw new ModeloNotFoundException("LIBRO SALARIO NO REGISTRADO!");
	
		return new ResponseEntity<LibroSalario>(no, HttpStatus.OK);
		
	}
	
	@PutMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<LibroSalario> modificar(@Validated @RequestBody LibroSalario parametro) {
				
		return new ResponseEntity<LibroSalario>(service.modificar(parametro), HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<LibroSalario> elminar(@PathVariable("id") Long id) {
		
		LibroSalario nom = service.listarId(id);
		
		if (nom == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		} else {
			this.service.eliminar(id);
		}
		
		return new ResponseEntity<LibroSalario>(nom, HttpStatus.OK);
		
	}
	
	
	//METODOS DE IPRUEBASERVICE
	
	
	// Devuelve info de consulta en interfaz
	@PostMapping(value = "/info", produces = "application/json")
	public ResponseEntity<List<InfoLibroSalario>> InfoLibroSalario( @RequestParam(value = "pidu") String pidu, 
														   @RequestParam(value = "pnom") String pnom
													     ) {
		
		return new ResponseEntity<List<InfoLibroSalario>>(this.service.LibroSalarioinfo(pnom),HttpStatus.OK);
		
	}
	
	
	// Devuelve consulta en dto
	@PostMapping(value = "/dto", produces = "application/json")
	public ResponseEntity<List<LibroSalarioDTO>> DtoArticuloss(@RequestParam(value = "pidu") String pidu, 
																@RequestParam(value = "pfecha") String pfecha
																) {
					
		return new ResponseEntity<List<LibroSalarioDTO>>(this.service.LibroSalariodto(pfecha),HttpStatus.OK);
		
	}
	
	
}

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

import com.pp.reportes.dto.CuentaDTO;
import com.pp.reportes.exception.ModeloNotFoundException;
import com.pp.reportes.model.Cuenta;
import com.pp.reportes.service.ICuentaService;
import com.pp.reportes.dto.info.*;

@RestController
@RequestMapping("/cuenta")
public class CuentaController {

	@Autowired
	private ICuentaService service;
		
	// METODOS DE ICRUD
	
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Cuenta>> listar(){
		
		return new ResponseEntity<List<Cuenta>>(service.listar(), HttpStatus.OK);	
		
	}	
	
	
	@PostMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Cuenta> registrar(@Validated @RequestBody Cuenta parametro) {
		
		Cuenta no = service.registrar(parametro);
		
		if (no == null)
			throw new ModeloNotFoundException("Cuenta NO REGISTRADA!");
	
		return new ResponseEntity<Cuenta>(no, HttpStatus.OK);
		
	}
	
	@PutMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Cuenta> modificar(@Validated @RequestBody Cuenta parametro) {
				
		return new ResponseEntity<Cuenta>(service.modificar(parametro), HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Cuenta> elminar(@PathVariable("id") Long id) {
		
		Cuenta nom = service.listarId(id);
		
		if (nom == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		} else {
			this.service.eliminar(id);
		}
		
		return new ResponseEntity<Cuenta>(nom, HttpStatus.OK);
		
	}
	
	
	//METODOS DE IPRUEBASERVICE
	
	
	// Devuelve info de consulta en interfaz
	@PostMapping(value = "/info", produces = "application/json")
	public ResponseEntity<List<InfoCuenta>> InfoCuenta( @RequestParam(value = "pidu") String pidu, 
														   @RequestParam(value = "pnom") String pnom
													     ) {
		
		return new ResponseEntity<List<InfoCuenta>>(this.service.Cuentainfo(pnom),HttpStatus.OK);
		
	}
	
	
	// Devuelve consulta en dto
	@PostMapping(value = "/dto", produces = "application/json")
	public ResponseEntity<List<CuentaDTO>> DtoArticuloss(@RequestParam(value = "pidu") String pidu, 
																@RequestParam(value = "registro") Long registro,
																@RequestParam(value = "partida") Long partida,
																@RequestParam(value = "plaza") Long plaza
																) {
		return new ResponseEntity<List<CuentaDTO>>(this.service.Cuentadto(registro,partida,plaza),HttpStatus.OK);
		
	}
	
	
}

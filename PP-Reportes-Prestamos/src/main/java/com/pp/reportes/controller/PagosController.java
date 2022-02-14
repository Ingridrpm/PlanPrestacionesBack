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

import com.pp.reportes.dto.info.InfoPagos;
import com.pp.reportes.exception.ModeloNotFoundException;
import com.pp.reportes.model.Pagos;
import com.pp.reportes.service.IPagosService;


@RestController
@RequestMapping("/pagos")
public class PagosController {

	@Autowired
	private IPagosService service;
		
	// METODOS DE ICRUD
	
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Pagos>> listar(){
		
		return new ResponseEntity<List<Pagos>>(service.listar(), HttpStatus.OK);	
		
	}	
	
	
	@PostMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Pagos> registrar(@Validated @RequestBody Pagos parametro) {
		
		Pagos no = service.registrar(parametro);
		
		if (no == null)
			throw new ModeloNotFoundException("Pagos NO REGISTRADO!");
	
		return new ResponseEntity<Pagos>(no, HttpStatus.OK);
		
	}
	
	@PutMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Pagos> modificar(@Validated @RequestBody Pagos parametro) {
				
		return new ResponseEntity<Pagos>(service.modificar(parametro), HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Pagos> elminar(@PathVariable("id") Long id) {
		
		Pagos nom = service.listarId(id);
		
		if (nom == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		} else {
			this.service.eliminar(id);
		}
		
		return new ResponseEntity<Pagos>(nom, HttpStatus.OK);
		
	}
	
	
	//METODOS DE IPagosERVICE
	
	
	// Devuelve info de consulta 
	@PostMapping(value = "/info", produces = "application/json")
	public ResponseEntity<List<InfoPagos>> InfoPrueba( @RequestParam(value = "pidu") String pidu, 
														   @RequestParam(value = "registro") String registro
													     ) {
		
		return new ResponseEntity<List<InfoPagos>>(this.service.pagosPorRegistro(registro),HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/mes", produces = "application/json")
	public ResponseEntity<List<InfoPagos>> PagosMes( @RequestParam(value = "pidu") String pidu, 
														   @RequestParam(value = "mes") String mes
													     ) {
		
		return new ResponseEntity<List<InfoPagos>>(this.service.pagosPorMes(mes),HttpStatus.OK);
		
	}
	
	
}

package com.pp.reportes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.reportes.dto.info.InfoPagos;
import com.pp.reportes.model.Pagos;
import com.pp.reportes.repository.IPagosRepository;
import com.pp.reportes.service.IPagosService;


@Service
public class PagosService implements IPagosService{

	@Autowired
	private IPagosRepository pagosrepository;
	
	// METODOS DE ICRUD
	
	@Override
	public Pagos registrar(Pagos t) {
		return this.pagosrepository.save(t);
	}

	@Override
	public Pagos modificar(Pagos t) {
		return this.pagosrepository.save(t);
	}

	@Override
	public void eliminar(Long id) {
		this.pagosrepository.deleteById(id);		
	}

	@Override
	public List<Pagos> listar() {
		return this.pagosrepository.findAll();
	}

	@Override
	public Pagos listarId(Long id) {
		return this.pagosrepository.findById(id).orElse(null);
	}
	
	//METODOS DE Pagos
	
	@Override
	public List<InfoPagos> pagosPorRegistro(String registro) {
		return pagosrepository.pagosPorRegistro(registro);
	}
	
	@Override
	public List<InfoPagos> pagosPorMes(String mes) {
		return pagosrepository.pagosPorMes(mes);
	}
 
	
}
package com.pp.reportes.service.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.reportes.dto.info.*;
import com.pp.reportes.dto.*;
import com.pp.reportes.model.*;
import com.pp.reportes.repository.*;
import com.pp.reportes.service.*;

@Service
public class CorteService implements ICorteService {

	@Autowired
	private ICorteRepository contratrepository;

	// METODOS DE ICRUD

	@Override
	public Corte registrar(Corte t) {
		return this.contratrepository.save(t);
	}

	@Override
	public Corte modificar(Corte t) {
		return this.contratrepository.save(t);
	}

	@Override
	public void eliminar(Long id) {
		this.contratrepository.deleteById(id);
	}

	@Override
	public List<Corte> listar() {
		return this.contratrepository.findAll();
	}

	@Override
	public Corte listarId(Long id) {
		return this.contratrepository.findById(id).orElse(null);
	}

	// METODOS DE NOMBRE

	@Override
	public List<CorteDTO> cortePorRegistro(String contrato) {

		List<CorteDTO> lis = new ArrayList<CorteDTO>();

		List<InfoCorteDTO> info = contratrepository.cortePorRegistro(contrato);

		for (InfoCorteDTO ia : info) {

			CorteDTO nu = new CorteDTO();

			nu.setFecha_asignacion(ia.getFecha_asignacion());
			nu.setCheque(ia.getCheque());
			nu.setPlazo(ia.getPlazo());
			nu.setFiador(ia.getFiador());
			nu.setContrato(ia.getContrato());
			nu.setInicio(ia.getInicio());
			nu.setMonto(ia.getMonto());
			nu.setCuota(ia.getCuota());
			nu.setRegistro_contrat(ia.getRegistro_contrat());
			nu.setRegistro(ia.getRegistro());
			nu.setPorcent(ia.getPorcent());
			nu.setFinal1(ia.getFinal1());
			nu.setContrato_anterior(ia.getContrato_anterior());
			nu.setSeguro(ia.getSeguro());

			lis.add(nu);
		}

		return lis;
	}
	
	@Override
	public List<InfoCorte> cortePorContrato(String actual) {
		return contratrepository.cortePorContrato(actual);
	}
	

}

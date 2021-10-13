package com.pp.reportes.service.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.reportes.dto.CuentaDTO;
import com.pp.reportes.dto.PruebaDTO;
import com.pp.reportes.dto.info.InfoCuenta;
import com.pp.reportes.dto.info.InfoCuentaDTO;
import com.pp.reportes.dto.info.InfoPrueba;
import com.pp.reportes.dto.info.InfoPruebaDTO;
import com.pp.reportes.model.Cuenta;
import com.pp.reportes.model.Prueba;
import com.pp.reportes.repository.ICuentaRepository;
import com.pp.reportes.repository.IPruebaRepository;
import com.pp.reportes.service.ICuentaService;
import com.pp.reportes.service.IPruebaService;

@Service
public class CuentaService implements ICuentaService{

	@Autowired
	private ICuentaRepository pruebarepository;
	
	// METODOS DE ICRUD
	
	@Override
	public Cuenta registrar(Cuenta t) {
		return this.pruebarepository.save(t);
	}

	@Override
	public Cuenta modificar(Cuenta t) {
		return this.pruebarepository.save(t);
	}

	@Override
	public void eliminar(Long id) {
		this.pruebarepository.deleteById(id);		
	}

	@Override
	public List<Cuenta> listar() {
		return this.pruebarepository.findAll();
	}

	@Override
	public Cuenta listarId(Long id) {
		return this.pruebarepository.findById(id).orElse(null);
	}
	
	//METODOS DE IPRUEBASERVICE
	
	@Override
	public List<InfoCuenta> Cuentainfo(String pnom) {
		return pruebarepository.InfoCuenta(pnom);
	}
 
	@Override
	public List<CuentaDTO> Cuentadto(Long registro, Long partida, Long plaza) {
		
		List<CuentaDTO> lis = new ArrayList<CuentaDTO>();
		
		List<InfoCuentaDTO> info = pruebarepository.InfoDTO(registro,partida,plaza);
		for (InfoCuentaDTO ia : info) {
			
			CuentaDTO nu = new CuentaDTO();
			
			nu.setCuenta(ia.getCuenta());
			nu.setRegistro(ia.getRegistro());
			nu.setPartida(ia.getPartida());
			nu.setPlaza(ia.getPlaza());
			nu.setNombre(ia.getNombre());
			nu.setBaja(ia.getBaja());
			nu.setDpi(ia.getDpi());
			nu.setPasaporte(ia.getPasaporte());
			
			lis.add(nu);
		}
		
				
		return lis;
	}
	
}

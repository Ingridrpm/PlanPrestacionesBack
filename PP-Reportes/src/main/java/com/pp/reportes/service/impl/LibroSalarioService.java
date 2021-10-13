package com.pp.reportes.service.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.reportes.dto.DatosLibroSalarioDTO;
import com.pp.reportes.dto.DescuentoLibroSalarioDTO;
import com.pp.reportes.dto.LibroSalarioDTO;
import com.pp.reportes.dto.info.InfoDatosLibroSalarioDTO;
import com.pp.reportes.dto.info.InfoDescuentoLibroSalarioDTO;
import com.pp.reportes.dto.info.InfoLibroSalario;
import com.pp.reportes.dto.info.InfoLibroSalarioDTO;
import com.pp.reportes.model.LibroSalario;
import com.pp.reportes.repository.ILibroSalarioRepository;
import com.pp.reportes.service.ILibroSalarioService;

@Service
public class LibroSalarioService implements ILibroSalarioService {

	@Autowired
	private ILibroSalarioRepository pruebarepository;

	// METODOS DE ICRUD

	@Override
	public LibroSalario registrar(LibroSalario t) {
		return this.pruebarepository.save(t);
	}

	@Override
	public LibroSalario modificar(LibroSalario t) {
		return this.pruebarepository.save(t);
	}

	@Override
	public void eliminar(Long id) {
		this.pruebarepository.deleteById(id);
	}

	@Override
	public List<LibroSalario> listar() {
		return this.pruebarepository.findAll();
	}

	@Override
	public LibroSalario listarId(Long id) {
		return this.pruebarepository.findById(id).orElse(null);
	}

	// METODOS DE IPRUEBASERVICE

	@Override
	public List<InfoLibroSalario> LibroSalarioinfo(String id) {
		return pruebarepository.InfoLibroSalario(Long.parseLong(id));
	}

	@Override
	public List<LibroSalarioDTO> LibroSalariodto(String registro, String plaza) {

		List<LibroSalarioDTO> lis = new ArrayList<LibroSalarioDTO>();

		List<InfoLibroSalarioDTO> info = pruebarepository.InfoDTO(Long.parseLong(registro), Long.parseLong(plaza));

		for (InfoLibroSalarioDTO ia : info) {

			LibroSalarioDTO nu = new LibroSalarioDTO();

			nu.setId_libsal(ia.getId_libsal());
			nu.setRegistro(ia.getRegistro());
			nu.setPlaza(ia.getPlaza());
			nu.setPartida(ia.getPartida());
			nu.setSueldo(ia.getSueldo());
			nu.setIgss(ia.getIgss());
			nu.setTbr(ia.getTbr());
			nu.setIsr(ia.getIsr());
			nu.setCpp(ia.getCpp());
			nu.setPpp(ia.getPpp());
			nu.setAbt(ia.getAbt());
			nu.setPbt(ia.getPbt());
			nu.setDjd(ia.getDjd());
			nu.setCsn(ia.getCsn());
			nu.setTcp(ia.getTcp());
			nu.setFbp(ia.getFbp());
			nu.setIap(ia.getIap());
			nu.setCcv(ia.getCcv());
			nu.setPcv(ia.getPcv());
			nu.setCcc(ia.getCcc());
			nu.setPcc(ia.getPcc());
			nu.setPba(ia.getPba());
			nu.setCv(ia.getCv());
			nu.setBon(ia.getBon());
			nu.setDeu(ia.getDeu());
			nu.setFid(ia.getFid());
			nu.setFt(ia.getFt());
			nu.setDt(ia.getDt());
			nu.setVar(ia.getVar());
			nu.setLiquido(ia.getLiquido());
			nu.setPlaza_descripcion(ia.getPlaza_descripcion());
			nu.setCheque(ia.getCheque());
			nu.setDelcheque(ia.getDelcheque());
			nu.setNulo(ia.getNulo());
			nu.setRepxcheque(ia.getRepxcheque());
			nu.setNombre(ia.getNombre());
			nu.setBonicv(ia.getBonicv());
			nu.setBonsal(ia.getBonsal());
			nu.setNomina(ia.getNomina());
			nu.setNom(ia.getNom());
			nu.setBanco(ia.getBanco());
			nu.setObserv(ia.getObserv());
			nu.setFechadoc(ia.getFechadoc());
			nu.setNrecibo(ia.getNrecibo());
			nu.setPtd_bon14(ia.getPtd_bon14());

			lis.add(nu);
		}

		return lis;
	}

	@Override
	public List<DatosLibroSalarioDTO> DatosLibro(String registro, String partida, String plaza) {
		List<DatosLibroSalarioDTO> lis = new ArrayList<DatosLibroSalarioDTO>();

		List<InfoDatosLibroSalarioDTO> info = pruebarepository.DatosLibro(Long.parseLong(registro),
				Long.parseLong(plaza));

		for (InfoDatosLibroSalarioDTO ia : info) {

			DatosLibroSalarioDTO nu = new DatosLibroSalarioDTO();
			nu.setId(ia.getId());
			nu.setNomina(ia.getNomina());
			nu.setPartida(ia.getPartida());
			nu.setPlaza(ia.getPlaza());
			nu.setFecha(ia.getFecha());
			nu.setDescuentos(ia.getDescuentos());
			nu.setSalario(ia.getSalario());
			nu.setLiquido(ia.getLiquido());
			nu.setCheque(ia.getCheque());

			lis.add(nu);
		}

		return lis;
	}

	@Override
	public List<DescuentoLibroSalarioDTO> DescuentosLibro(String registro, String plaza, String descuento) {
		List<DescuentoLibroSalarioDTO> lis = new ArrayList<DescuentoLibroSalarioDTO>();
		List<InfoDescuentoLibroSalarioDTO> info = pruebarepository.DescuentosLibro(Long.parseLong(registro),
				Long.parseLong(plaza), descuento);

		for (InfoDescuentoLibroSalarioDTO ia : info) {

			DescuentoLibroSalarioDTO nu = new DescuentoLibroSalarioDTO();

			nu.setNomina(ia.getNomina());
			nu.setPartida(ia.getPartida());
			nu.setPlaza(ia.getPlaza());
			nu.setRegistro(ia.getRegistro());
			nu.setSueldo(ia.getSueldo());
			nu.setLiquido(ia.getLiquido());
			nu.setDescuento(ia.getDescuento());

			lis.add(nu);
		}

		return lis;
	}

	@Override
	public List<LibroSalarioDTO> SumaDescuentos(String registro, String plaza) {
		List<LibroSalarioDTO> lis = new ArrayList<LibroSalarioDTO>();

		List<InfoLibroSalarioDTO> info = pruebarepository.SumaDescuentos(Long.parseLong(registro),
				Long.parseLong(plaza));

		for (InfoLibroSalarioDTO ia : info) {

			LibroSalarioDTO nu = new LibroSalarioDTO();

			nu.setId_libsal(ia.getId_libsal());
			nu.setRegistro(ia.getRegistro());
			nu.setPlaza(ia.getPlaza());
			nu.setPartida(ia.getPartida());
			nu.setSueldo(ia.getSueldo());
			nu.setIgss(ia.getIgss());
			nu.setTbr(ia.getTbr());
			nu.setIsr(ia.getIsr());
			nu.setCpp(ia.getCpp());
			nu.setPpp(ia.getPpp());
			nu.setAbt(ia.getAbt());
			nu.setPbt(ia.getPbt());
			nu.setDjd(ia.getDjd());
			nu.setCsn(ia.getCsn());
			nu.setTcp(ia.getTcp());
			nu.setFbp(ia.getFbp());
			nu.setIap(ia.getIap());
			nu.setCcv(ia.getCcv());
			nu.setPcv(ia.getPcv());
			nu.setCcc(ia.getCcc());
			nu.setPcc(ia.getPcc());
			nu.setPba(ia.getPba());
			nu.setCv(ia.getCv());
			nu.setBon(ia.getBon());
			nu.setDeu(ia.getDeu());
			nu.setFid(ia.getFid());
			nu.setFt(ia.getFt());
			nu.setDt(ia.getDt());
			nu.setVar(ia.getVar());
			nu.setLiquido(ia.getLiquido());
			nu.setPlaza_descripcion(ia.getPlaza_descripcion());
			nu.setCheque(ia.getCheque());
			nu.setDelcheque(ia.getDelcheque());
			nu.setNulo(ia.getNulo());
			nu.setRepxcheque(ia.getRepxcheque());
			nu.setNombre(ia.getNombre());
			nu.setBonicv(ia.getBonicv());
			nu.setBonsal(ia.getBonsal());
			nu.setNomina(ia.getNomina());
			nu.setNom(ia.getNom());
			nu.setBanco(ia.getBanco());
			nu.setObserv(ia.getObserv());
			nu.setFechadoc(ia.getFechadoc());
			nu.setNrecibo(ia.getNrecibo());
			nu.setPtd_bon14(ia.getPtd_bon14());

			lis.add(nu);
		}

		return lis;
	}

	@Override
	public List<Long> NominaMesAno(String mes, String ano) {
		List<Long> info = pruebarepository.NominaMesAno(Long.parseLong(mes), Long.parseLong(ano));
		return info;

	}

	@Override
	public List<LibroSalarioDTO> InfoNomina(String nomina) {

		List<LibroSalarioDTO> lis = new ArrayList<LibroSalarioDTO>();

		List<InfoLibroSalarioDTO> info = pruebarepository.InfoNomina(Long.parseLong(nomina));

		for (InfoLibroSalarioDTO ia : info) {

			LibroSalarioDTO nu = new LibroSalarioDTO();

			nu.setId_libsal(ia.getId_libsal());
			nu.setRegistro(ia.getRegistro());
			nu.setPlaza(ia.getPlaza());
			nu.setPartida(ia.getPartida());
			nu.setSueldo(ia.getSueldo());
			nu.setIgss(ia.getIgss());
			nu.setTbr(ia.getTbr());
			nu.setIsr(ia.getIsr());
			nu.setCpp(ia.getCpp());
			nu.setPpp(ia.getPpp());
			nu.setAbt(ia.getAbt());
			nu.setPbt(ia.getPbt());
			nu.setDjd(ia.getDjd());
			nu.setCsn(ia.getCsn());
			nu.setTcp(ia.getTcp());
			nu.setFbp(ia.getFbp());
			nu.setIap(ia.getIap());
			nu.setCcv(ia.getCcv());
			nu.setPcv(ia.getPcv());
			nu.setCcc(ia.getCcc());
			nu.setPcc(ia.getPcc());
			nu.setPba(ia.getPba());
			nu.setCv(ia.getCv());
			nu.setBon(ia.getBon());
			nu.setDeu(ia.getDeu());
			nu.setFid(ia.getFid());
			nu.setFt(ia.getFt());
			nu.setDt(ia.getDt());
			nu.setVar(ia.getVar());
			nu.setLiquido(ia.getLiquido());
			nu.setPlaza_descripcion(ia.getPlaza_descripcion());
			nu.setCheque(ia.getCheque());
			nu.setDelcheque(ia.getDelcheque());
			nu.setNulo(ia.getNulo());
			nu.setRepxcheque(ia.getRepxcheque());
			nu.setNombre(ia.getNombre());
			nu.setBonicv(ia.getBonicv());
			nu.setBonsal(ia.getBonsal());
			nu.setNomina(ia.getNomina());
			nu.setNom(ia.getNom());
			nu.setBanco(ia.getBanco());
			nu.setObserv(ia.getObserv());
			nu.setFechadoc(ia.getFechadoc());
			nu.setNrecibo(ia.getNrecibo());
			nu.setPtd_bon14(ia.getPtd_bon14());

			lis.add(nu);
		}

		return lis;

	}

}

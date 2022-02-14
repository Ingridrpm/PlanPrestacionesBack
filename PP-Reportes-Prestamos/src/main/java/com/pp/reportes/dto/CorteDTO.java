package com.pp.reportes.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class CorteDTO {

	/*p.fecha as fecha_asignacion, p.cheque, p.plazo, p.fiador, p.actual as contrato, \r\n" + 
			"p.inicio, p.monto, i.cuota, p.registro as registro_contrat, i.registro, i.tasai as porcent, p.`final`, p.anter as contrato_anterior*/
	
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate fecha_asignacion;
	
	private Long cheque;
	private Long plazo;
	private Long fiador;
	private Long contrato;
	private Long inicio;
	private Double monto;
	private Double cuota;
	private Long registro_contrat;
	private Long registro;
	private Double tasai;
	private Long final1;
	private Long contrato_anterior;
	
	public LocalDate getFecha_asignacion() {
		return fecha_asignacion;
	}
	public void setFecha_asignacion(LocalDate fecha_asignacion) {
		this.fecha_asignacion = fecha_asignacion;
	}
	public Long getCheque() {
		return cheque;
	}
	public void setCheque(Long cheque) {
		this.cheque = cheque;
	}
	public Long getPlazo() {
		return plazo;
	}
	public void setPlazo(Long plazo) {
		this.plazo = plazo;
	}
	public Long getFiador() {
		return fiador;
	}
	public void setFiador(Long fiador) {
		this.fiador = fiador;
	}
	public Long getContrato() {
		return contrato;
	}
	public void setContrato(Long contrato) {
		this.contrato = contrato;
	}
	public Long getInicio() {
		return inicio;
	}
	public void setInicio(Long inicio) {
		this.inicio = inicio;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public Double getCuota() {
		return cuota;
	}
	public void setCuota(Double cuota) {
		this.cuota = cuota;
	}
	public Long getRegistro_contrat() {
		return registro_contrat;
	}
	public void setRegistro_contrat(Long registro_contrat) {
		this.registro_contrat = registro_contrat;
	}
	public Long getRegistro() {
		return registro;
	}
	public void setRegistro(Long registro) {
		this.registro = registro;
	}
	public Double getTasai() {
		return tasai;
	}
	public void setTasai(Double tasai) {
		this.tasai = tasai;
	}
	public Long getFinal1() {
		return final1;
	}
	public void setFinal1(Long final1) {
		this.final1 = final1;
	}
	public Long getContrato_anterior() {
		return contrato_anterior;
	}
	public void setContrato_anterior(Long contrato_anterior) {
		this.contrato_anterior = contrato_anterior;
	}
	
	
	
	
}

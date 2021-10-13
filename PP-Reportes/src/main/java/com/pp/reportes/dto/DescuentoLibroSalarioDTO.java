package com.pp.reportes.dto;

public class DescuentoLibroSalarioDTO {
	//nomina, partida, plaza, registro, sueldo, liquido, ppp
	private Long nomina;
	private Long partida; 
	private Long plaza;
	private Long registro;
	private Double sueldo;
	private Double liquido;
	private Double descuento;
	public Long getNomina() {
		return nomina;
	}
	public void setNomina(Long nomina) {
		this.nomina = nomina;
	}
	public Long getPartida() {
		return partida;
	}
	public void setPartida(Long partida) {
		this.partida = partida;
	}
	public Long getPlaza() {
		return plaza;
	}
	public void setPlaza(Long plaza) {
		this.plaza = plaza;
	}
	public Long getRegistro() {
		return registro;
	}
	public void setRegistro(Long registro) {
		this.registro = registro;
	}
	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	public Double getLiquido() {
		return liquido;
	}
	public void setLiquido(Double liquido) {
		this.liquido = liquido;
	}
	public Double getDescuento() {
		return descuento;
	}
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	
	
}

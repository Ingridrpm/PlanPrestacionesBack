package com.pp.reportes.dto;

public class CuentaDTO {
	private String cuenta;
	private Long registro;
	private Long plaza;
	
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public Long getRegistro() {
		return registro;
	}
	public void setRegistro(Long registro) {
		this.registro = registro;
	}
	public Long getPlaza() {
		return plaza;
	}
	public void setPlaza(Long plaza) {
		this.plaza = plaza;
	}
	public Long getPartida() {
		return partida;
	}
	public void setPartida(Long partida) {
		this.partida = partida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getBaja() {
		return baja;
	}
	public void setBaja(String baja) {
		this.baja = baja;
	}
	public String getDpi() {
		return dpi;
	}
	public void setDpi(String dpi) {
		this.dpi = dpi;
	}
	public Boolean getPasaporte() {
		return pasaporte;
	}
	public void setPasaporte(Boolean pasaporte) {
		this.pasaporte = pasaporte;
	}
	private Long partida;
	private String nombre;
	private String baja;
	private String dpi;
	private Boolean pasaporte;
}

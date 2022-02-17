package com.pp.reportes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Tabla nombrada CONTRAT1 en la base de datos original")
@Entity
@Table(name = "CORTE")
public class Corte {
//REGISTRO	ACTUAL	CUOTA	INTERES	SALDO	TASAI

	@ApiModelProperty(notes = "OBLIGATORIO, LO GENERA EL SISTEMA")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_corte;

	@ApiModelProperty(notes = "REGISTRO")
	@Column(name = "registro", nullable = true)
	private Long registro;
	
	@ApiModelProperty(notes = "ACTUAL")
	@Column(name = "actual", nullable = true)
	private Long actual;
	
	@ApiModelProperty(notes = "CUOTA")
	@Column(name = "cuota", nullable = true)
	private Double cuota;
	
	@ApiModelProperty(notes = "INTERES")
	@Column(name = "interes", nullable = true)
	private Double interes;
	
	@ApiModelProperty(notes = "SALDO")
	@Column(name = "saldo", nullable = true)
	private Double saldo;
	
	@ApiModelProperty(notes = "TASAI")
	@Column(name = "tasai", nullable = true)
	private Double tasai;

	public Long getId_corte() {
		return id_corte;
	}

	public void setId_corte(Long id_corte) {
		this.id_corte = id_corte;
	}

	public Long getRegistro() {
		return registro;
	}

	public void setRegistro(Long registro) {
		this.registro = registro;
	}

	public Long getActual() {
		return actual;
	}

	public void setActual(Long actual) {
		this.actual = actual;
	}

	public Double getCuota() {
		return cuota;
	}

	public void setCuota(Double cuota) {
		this.cuota = cuota;
	}

	public Double getInteres() {
		return interes;
	}

	public void setInteres(Double interes) {
		this.interes = interes;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getTasai() {
		return tasai;
	}

	public void setTasai(Double tasai) {
		this.tasai = tasai;
	}
	
	
}

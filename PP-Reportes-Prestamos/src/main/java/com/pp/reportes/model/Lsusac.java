package com.pp.reportes.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Tabla nombrada LSUSAC1 en la base de datos original")
@Entity
@Table(name = "LSUSAC")
public class Lsusac {
	
	@ApiModelProperty(notes = "OBLIGATORIO, LO GENERA EL SISTEMA")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_lsusac;

	@ApiModelProperty(notes = "REGISTRO")
	@Column(name = "registro", nullable = true)
	private Long registro;
	
	@ApiModelProperty(notes = "NOMINA")
	@Column(name = "nomina", nullable = true)
	private Long nomina;
	
	@ApiModelProperty(notes = "PARTIDA")
	@Column(name = "partida", nullable = true)
	private Long partida;
	
	@ApiModelProperty(notes = "PLAZA")
	@Column(name = "plaza", nullable = true)
	private Long plaza;
	
	@ApiModelProperty(notes = "SUELDO")
	@Column(name = "sueldo", nullable = true)
	private Double sueldo;
	
	@ApiModelProperty(notes = "CUOTAPLAN")
	@Column(name = "cuotaplan", nullable = true)
	private Double cuotaplan;
	
	@ApiModelProperty(notes = "CUOTASEG")
	@Column(name = "cuotaseg", nullable = true)
	private Double cuotaseg;
	
	@ApiModelProperty(notes = "NUMCHEQUE")
	@Column(name = "numcheque", nullable = true)
	private Long numcheque;
	
	@ApiModelProperty(notes = "FECHACHEQ")
	@Column(name = "fechacheq", nullable = true)
	private Long fechacheq;
	
	@ApiModelProperty(notes = "NULO")
	@Column(name = "nulo", nullable = true)
	private Long nulo;
	
	@ApiModelProperty(notes = "OPERADO")
	@Column(name = "operado", nullable = true)
	private String operado;
	
	@ApiModelProperty(notes = "FIDEICOM")
	@Column(name = "fideicom", nullable = true)
	private Long fideicom;
	
	@ApiModelProperty(notes = "AFILIAPLAN")
	@Column(name = "afiliaplan", nullable = true)
	private Long afiliaplan;

	public Long getId_lsusac() {
		return id_lsusac;
	}

	public void setId_lsusac(Long id_lsusac) {
		this.id_lsusac = id_lsusac;
	}

	public Long getRegistro() {
		return registro;
	}

	public void setRegistro(Long registro) {
		this.registro = registro;
	}

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

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public Double getCuotaplan() {
		return cuotaplan;
	}

	public void setCuotaplan(Double cuotaplan) {
		this.cuotaplan = cuotaplan;
	}

	public Double getCuotaseg() {
		return cuotaseg;
	}

	public void setCuotaseg(Double cuotaseg) {
		this.cuotaseg = cuotaseg;
	}

	public Long getNumcheque() {
		return numcheque;
	}

	public void setNumcheque(Long numcheque) {
		this.numcheque = numcheque;
	}

	public Long getFechacheq() {
		return fechacheq;
	}

	public void setFechacheq(Long fechacheq) {
		this.fechacheq = fechacheq;
	}

	public Long getNulo() {
		return nulo;
	}

	public void setNulo(Long nulo) {
		this.nulo = nulo;
	}

	public String getOperado() {
		return operado;
	}

	public void setOperado(String operado) {
		this.operado = operado;
	}

	public Long getFideicom() {
		return fideicom;
	}

	public void setFideicom(Long fideicom) {
		this.fideicom = fideicom;
	}

	public Long getAfiliaplan() {
		return afiliaplan;
	}

	public void setAfiliaplan(Long afiliaplan) {
		this.afiliaplan = afiliaplan;
	}
	
}

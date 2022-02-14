package com.pp.reportes.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Tabla nombrada PAGOS1 en la base de datos original")
@Entity
@Table(name = "PAGOS")
public class Pagos {

	@ApiModelProperty(notes = "OBLIGATORIO, LO GENERA EL SISTEMA")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_pago;

	@ApiModelProperty(notes = "REGISTRO")
	@Column(name = "registro", nullable = true)
	private Long registro;
	
	@ApiModelProperty(notes = "MES")
	@Column(name = "mes", nullable = true)
	private Long mes;
	
	@ApiModelProperty(notes = "TIPO")
	@Column(name = "tipo", nullable = true)
	private Long tipo;
	
	@ApiModelProperty(notes = "VALOR")
	@Column(name = "valor", nullable = true)
	private Double valor;
	
	@ApiModelProperty(notes = "PARTIDA")
	@Column(name = "partida", nullable = true)
	private String partida;
	
	@ApiModelProperty(notes = "PLAZA")
	@Column(name = "plaza", nullable = true)
	private Long plaza;
	
	@ApiModelProperty(notes = "DOCUMENTO")
	@Column(name = "documento", nullable = true)
	private Long documento;
	
	@ApiModelProperty(notes = "FECHADOC")
	@Column(name = "fechadoc", nullable = true)
	private String fechadoc;
	
	@ApiModelProperty(notes = "OBSERV")
	@Column(name = "observ", nullable = true)
	private String observ;

	public Long getId_pago() {
		return id_pago;
	}

	public void setId_pago(Long id_pago) {
		this.id_pago = id_pago;
	}

	public Long getRegistro() {
		return registro;
	}

	public void setRegistro(Long registro) {
		this.registro = registro;
	}

	public Long getMes() {
		return mes;
	}

	public void setMes(Long mes) {
		this.mes = mes;
	}

	public Long getTipo() {
		return tipo;
	}

	public void setTipo(Long tipo) {
		this.tipo = tipo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getPartida() {
		return partida;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}

	public Long getPlaza() {
		return plaza;
	}

	public void setPlaza(Long plaza) {
		this.plaza = plaza;
	}

	public Long getDocumento() {
		return documento;
	}

	public void setDocumento(Long documento) {
		this.documento = documento;
	}

	public String getFechadoc() {
		return fechadoc;
	}

	public void setFechadoc(String fechadoc) {
		this.fechadoc = fechadoc;
	}

	public String getObserv() {
		return observ;
	}

	public void setObserv(String observ) {
		this.observ = observ;
	}
	
	
}

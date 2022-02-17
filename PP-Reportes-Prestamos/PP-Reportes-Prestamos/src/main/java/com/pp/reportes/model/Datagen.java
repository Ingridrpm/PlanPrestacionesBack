package com.pp.reportes.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Tabla nombrada DATAGEN1 en la base de datos original")
@Entity
@Table(name = "DATAGEN")
public class Datagen {

	@ApiModelProperty(notes = "OBLIGATORIO, LO GENERA EL SISTEMA")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_datagen;

	@ApiModelProperty(notes = "REGISTRO")
	@Column(name = "registro", nullable = true)
	private Long registro;
	
	@ApiModelProperty(notes = "DIRECL1")
	@Column(name = "direcl1", nullable = true)
	private String direcl1;
	
	@ApiModelProperty(notes = "DIRECL2")
	@Column(name = "direcl2", nullable = true)
	private String direcl2;
	
	@ApiModelProperty(notes = "CIUDAD")
	@Column(name = "ciudad", nullable = true)
	private String ciudad;
	
	@ApiModelProperty(notes = "DEPTO")
	@Column(name = "depto", nullable = true)
	private Long depto;
	
	@ApiModelProperty(notes = "FECHANAC")
	@Column(name = "fechanac", nullable = true)
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate fechanac;
	
	@ApiModelProperty(notes = "EDOCIV")
	@Column(name = "edociv", nullable = true)
	private Long edociv;
	
	@ApiModelProperty(notes = "CEDULAO")
	@Column(name = "cedulao", nullable = true)
	private String cedulao;
	
	@ApiModelProperty(notes = "CEDULAR")
	@Column(name = "cedular", nullable = true)
	private Long cedular;
	
	@ApiModelProperty(notes = "NACIONALID")
	@Column(name = "nacionalid", nullable = true)
	private String nacionalid;
	
	@ApiModelProperty(notes = "PROFESION")
	@Column(name = "profesion", nullable = true)
	private String profesion;
	
	@ApiModelProperty(notes = "DEPEND")
	@Column(name = "depend", nullable = true)
	private String depend;
	
	@ApiModelProperty(notes = "OBSERV")
	@Column(name = "observ", nullable = true)
	private String observ;
	
	@ApiModelProperty(notes = "LASTUP")
	@Column(name = "lastup", nullable = true)
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate lastup;
	
	@ApiModelProperty(notes = "MUNICIPIO")
	@Column(name = "municipio", nullable = true)
	private String municipio;
	
	@ApiModelProperty(notes = "DPI")
	@Column(name = "dpi", nullable = true)
	private String dpi;
	
	@ApiModelProperty(notes = "ESPASAPORT")
	@Column(name = "espasaport", nullable = true)
	private String espasaport;

	public Long getId_datagen() {
		return id_datagen;
	}

	public void setId_datagen(Long id_datagen) {
		this.id_datagen = id_datagen;
	}

	public Long getRegistro() {
		return registro;
	}

	public void setRegistro(Long registro) {
		this.registro = registro;
	}

	public String getDirecl1() {
		return direcl1;
	}

	public void setDirecl1(String direcl1) {
		this.direcl1 = direcl1;
	}

	public String getDirecl2() {
		return direcl2;
	}

	public void setDirecl2(String direcl2) {
		this.direcl2 = direcl2;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Long getDepto() {
		return depto;
	}

	public void setDepto(Long depto) {
		this.depto = depto;
	}

	public LocalDate getFechanac() {
		return fechanac;
	}

	public void setFechanac(LocalDate fechanac) {
		this.fechanac = fechanac;
	}

	public Long getEdociv() {
		return edociv;
	}

	public void setEdociv(Long edociv) {
		this.edociv = edociv;
	}

	public String getCedulao() {
		return cedulao;
	}

	public void setCedulao(String cedulao) {
		this.cedulao = cedulao;
	}

	public Long getCedular() {
		return cedular;
	}

	public void setCedular(Long cedular) {
		this.cedular = cedular;
	}

	public String getNacionalid() {
		return nacionalid;
	}

	public void setNacionalid(String nacionalid) {
		this.nacionalid = nacionalid;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getDepend() {
		return depend;
	}

	public void setDepend(String depend) {
		this.depend = depend;
	}

	public String getObserv() {
		return observ;
	}

	public void setObserv(String observ) {
		this.observ = observ;
	}

	public LocalDate getLastup() {
		return lastup;
	}

	public void setLastup(LocalDate lastup) {
		this.lastup = lastup;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getDpi() {
		return dpi;
	}

	public void setDpi(String dpi) {
		this.dpi = dpi;
	}

	public String getEspasaport() {
		return espasaport;
	}

	public void setEspasaport(String espasaport) {
		this.espasaport = espasaport;
	}

	
}

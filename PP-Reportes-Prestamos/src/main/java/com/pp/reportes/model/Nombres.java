package com.pp.reportes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Tabla nombrada NOMBRES1 en la base de datos original")
@Entity
@Table(name = "NOMBRES")
public class Nombres {
	@ApiModelProperty(notes = "OBLIGATORIO, LO GENERA EL SISTEMA")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_nombres;
	
	@ApiModelProperty(notes = "REGISTRO")
	@Column(name = "registro", nullable = true)
	private Long registro;

	public Long getRegistro() {
		return registro;
	}

	public void setRegistro(Long registro) {
		this.registro = registro;
	}

	@ApiModelProperty(notes = "NOMBRE")
	@Column(name = "nombre", nullable = true)
	private String nombre;
	
	@ApiModelProperty(notes = "DESCRIP")
	@Column(name = "descrip", nullable = true)
	private String descrip;

	public Long getId_nombres() {
		return id_nombres;
	}

	public void setId_nombres(Long id_nombres) {
		this.id_nombres = id_nombres;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	
}

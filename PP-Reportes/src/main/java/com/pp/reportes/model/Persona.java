package com.pp.reportes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "INFORMACION DE TABLA PERSONA")
@Entity
@Table(name = "PERSONA")
@IdClass(PersonaPK.class)
public class Persona {
	@ApiModelProperty(notes = "OBLIGATORIO REGISTRO")
	@Id
	@Column(name = "registro", nullable = false)
	private Long registro;
	
	@ApiModelProperty(notes = "OBLIGATORIO PLAZA")
	@Id
	@Column(name = "plaza", nullable = false)
	private Long plaza;
	
	@ApiModelProperty(notes = "OBLIGATORIO PARTIDA")
	@Id
	@Column(name = "partida", nullable = false)
	private Long partida;

	@ApiModelProperty(notes = "OBLIGATORIO NOMBRE")
	@Column(name = "nombre", nullable = false, length = 255)
	private String nombre;
	
	@ApiModelProperty(notes = "BAJA")
	@Column(name = "baja", nullable = true, length = 255)
	private String baja;
	
	@ApiModelProperty(notes = "DPI")
	@Column(name = "dpi", nullable = true)
	private String dpi;
	
	@ApiModelProperty(notes = "PASAPORTE")
	@Column(name = "pasaporte", nullable = true)
	private Boolean pasaporte;

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

	
	

/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((edad == null) ? 0 : edad.hashCode());
		result = prime * result + ((fecha_nacimiento == null) ? 0 : fecha_nacimiento.hashCode());
		result = prime * result + ((id_prueba == null) ? 0 : id_prueba.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prueba other = (Prueba) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (edad == null) {
			if (other.edad != null)
				return false;
		} else if (!edad.equals(other.edad))
			return false;
		if (fecha_nacimiento == null) {
			if (other.fecha_nacimiento != null)
				return false;
		} else if (!fecha_nacimiento.equals(other.fecha_nacimiento))
			return false;
		if (id_prueba == null) {
			if (other.id_prueba != null)
				return false;
		} else if (!id_prueba.equals(other.id_prueba))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	*/
	
}

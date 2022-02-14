package com.pp.reportes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Tabla nombrada DEPEND-U en la base de datos original")
@Entity
@Table(name = "DEPEND_U")
public class Depend_u {

	public Long getId_depend() {
		return id_depend;
	}

	public void setId_depend(Long id_depend) {
		this.id_depend = id_depend;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDependencia() {
		return dependencia;
	}

	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}

	@ApiModelProperty(notes = "OBLIGATORIO, LO GENERA EL SISTEMA")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_depend;

	@ApiModelProperty(notes = "CODIGO")
	@Column(name = "codigo", nullable = true)
	private Long codigo;
	
	@ApiModelProperty(notes = "DEPENDENCI")
	@Column(name = "dependencia", nullable = true)
	private String dependencia;
	
}

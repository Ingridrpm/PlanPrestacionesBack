package com.pp.reportes.dto.info;

import java.time.LocalDate;

public interface InfoCorteDTO {

	public LocalDate getFecha_asignacion();
	public Long getCheque();
	public Long getPlazo();
	public Long getFiador();
	public Long getContrato();
	public Long getInicio();
	public Double getMonto();
	public Double getCuota();
	public Long getRegistro_contrat();
	public Long getRegistro();
	public Double getPorcent();
	public Long getFinal1();
	public Long getContrato_anterior();
	public Double getSeguro();
}

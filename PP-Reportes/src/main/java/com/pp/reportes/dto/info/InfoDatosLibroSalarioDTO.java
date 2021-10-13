package com.pp.reportes.dto.info;

import java.time.LocalDate;

public interface InfoDatosLibroSalarioDTO {
	public Long getId();
	
	public String getNomina();

	public Long getPartida();

	public Long getPlaza();

	public Double getSalario();

	public Double getDescuentos();

	public Double getLiquido();

	public LocalDate getFecha();

	public Long getCheque();
}

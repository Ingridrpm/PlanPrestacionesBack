package com.pp.reportes.dto.info;

import java.time.LocalDate;

public interface InfoLibroSalarioDTO {
	public Long getId_libsal();
	public Long getRegistro();
	public Long getPlaza();
	public Long getPartida();
	public Double getSueldo();
	public Double getIgss();
	public Double getTbr();
	public Double getIsr();
	public Double getCpp();
	public Double getPpp();
	public Double getAbt();
	public Double getPbt();
	public Double getDjd();
	public Double getCsn();
	public Double getTcp();
	public Double getFbp();
	public Double getIap();
	public Double getCcv();
	public Double getPcv();
	public Double getCcc();
	public Double getPcc();
	public Double getPba();
	public Double getCv();
	public Double getBon();
	public Double getDeu();
	public Double getFid();
	public Double getFt();
	public Double getDt();
	public Double getVar();
	public Double getLiquido();
	public String getPlaza_descripcion();
	public Long getCheque();
	public String getDelcheque();
	public String getNulo();
	public String getRepxcheque();
	public String getNombre();
	public Double getBonicv();
	public Double getBonsal();
	public Long getNomina();
	public String getNom();
	public String getBanco();
	public String getObserv();
	public LocalDate getFechadoc();
	public Long getNrecibo();
	public Long getPtd_bon14();
}

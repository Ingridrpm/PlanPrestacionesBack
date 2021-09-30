package com.pp.reportes.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class LibroSalarioDTO {

	//0
	private Long registro;

	//1
	private Long plaza;
	
	//2
	private Long partida;
	
	//3
	private Double sueldo;
	
	//4
	private Double igss;
	
	//5
	private Double tbr;
	
	//6
	private Double isr;
	
	//7
	private Double cpp;
	
	//8
	private Double ppp;
	
	//9
	private Double abt;
	
	//10
	private Double pbt;
	
	//11
	private Double djd;
	
	//12
	private Double csn;
	
	//13
	private Double tcp;
	
	//14
	private Double fbp;
	
	//15
	private Double iap;
	
	//16
	private Double ccv;
	
	//17
	private Double pcv;
	
	//18
	private Double ccc;
	
	//19
	private Double pcc;
	
	//20
	private Double pba;
	
	//21
	private Double cv;
	
	//22
	private Double bon;
	
	//23
	private Double deu;
	
	//24
	private Double fid;
	
	//25
	private Double ft;
	
	//26
	private Double dt;
	
	//27
	private Double var;

	//28
	private Double liquido;
	
	//29
	private String plaza_descripcion;
	
	//30
	private Long cheque;
	
	//31
	private String delcheque;
	
	//32
	private String nulo;
	
	//33
	private String repxcheque;
	
	//34
	private String nombre;
	
	//35
	private Double bonicv;
	
	//36
	private Double bonsal;
	
	//37
	private Long nomina;
	
	//38
	private String nom;
	
	//39
	private String banco;
	
	//40
	private String observ;
	
	//41
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate fechadoc;
	
	//42
	private Long nrecibo;

	//43
	private Long ptd_bon14;

	public Long getRegistro() {
		return registro;
	}

	public void setRegistro(Long registro) {
		this.registro = registro;
	}

	public Long getPlaza() {
		return plaza;
	}

	public void setPlaza(Long plaza) {
		this.plaza = plaza;
	}

	public Long getPartida() {
		return partida;
	}

	public void setPartida(Long partida) {
		this.partida = partida;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public Double getIgss() {
		return igss;
	}

	public void setIgss(Double igss) {
		this.igss = igss;
	}

	public Double getTbr() {
		return tbr;
	}

	public void setTbr(Double tbr) {
		this.tbr = tbr;
	}

	public Double getIsr() {
		return isr;
	}

	public void setIsr(Double isr) {
		this.isr = isr;
	}

	public Double getCpp() {
		return cpp;
	}

	public void setCpp(Double cpp) {
		this.cpp = cpp;
	}

	public Double getPpp() {
		return ppp;
	}

	public void setPpp(Double ppp) {
		this.ppp = ppp;
	}

	public Double getAbt() {
		return abt;
	}

	public void setAbt(Double abt) {
		this.abt = abt;
	}

	public Double getPbt() {
		return pbt;
	}

	public void setPbt(Double pbt) {
		this.pbt = pbt;
	}

	public Double getDjd() {
		return djd;
	}

	public void setDjd(Double djd) {
		this.djd = djd;
	}

	public Double getCsn() {
		return csn;
	}

	public void setCsn(Double csn) {
		this.csn = csn;
	}

	public Double getTcp() {
		return tcp;
	}

	public void setTcp(Double tcp) {
		this.tcp = tcp;
	}

	public Double getFbp() {
		return fbp;
	}

	public void setFbp(Double fbp) {
		this.fbp = fbp;
	}

	public Double getIap() {
		return iap;
	}

	public void setIap(Double iap) {
		this.iap = iap;
	}

	public Double getCcv() {
		return ccv;
	}

	public void setCcv(Double ccv) {
		this.ccv = ccv;
	}

	public Double getPcv() {
		return pcv;
	}

	public void setPcv(Double pcv) {
		this.pcv = pcv;
	}

	public Double getCcc() {
		return ccc;
	}

	public void setCcc(Double ccc) {
		this.ccc = ccc;
	}

	public Double getPcc() {
		return pcc;
	}

	public void setPcc(Double pcc) {
		this.pcc = pcc;
	}

	public Double getPba() {
		return pba;
	}

	public void setPba(Double pba) {
		this.pba = pba;
	}

	public Double getCv() {
		return cv;
	}

	public void setCv(Double cv) {
		this.cv = cv;
	}

	public Double getBon() {
		return bon;
	}

	public void setBon(Double bon) {
		this.bon = bon;
	}

	public Double getDeu() {
		return deu;
	}

	public void setDeu(Double deu) {
		this.deu = deu;
	}

	public Double getFid() {
		return fid;
	}

	public void setFid(Double fid) {
		this.fid = fid;
	}

	public Double getFt() {
		return ft;
	}

	public void setFt(Double ft) {
		this.ft = ft;
	}

	public Double getDt() {
		return dt;
	}

	public void setDt(Double dt) {
		this.dt = dt;
	}

	public Double getVar() {
		return var;
	}

	public void setVar(Double var) {
		this.var = var;
	}

	public Double getLiquido() {
		return liquido;
	}

	public void setLiquido(Double liquido) {
		this.liquido = liquido;
	}

	public String getPlaza_descripcion() {
		return plaza_descripcion;
	}

	public void setPlaza_descripcion(String plaza_descripcion) {
		this.plaza_descripcion = plaza_descripcion;
	}

	public Long getCheque() {
		return cheque;
	}

	public void setCheque(Long cheque) {
		this.cheque = cheque;
	}

	public String getDelcheque() {
		return delcheque;
	}

	public void setDelcheque(String delcheque) {
		this.delcheque = delcheque;
	}

	public String getNulo() {
		return nulo;
	}

	public void setNulo(String nulo) {
		this.nulo = nulo;
	}

	public String getRepxcheque() {
		return repxcheque;
	}

	public void setRepxcheque(String repxcheque) {
		this.repxcheque = repxcheque;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getBonicv() {
		return bonicv;
	}

	public void setBonicv(Double bonicv) {
		this.bonicv = bonicv;
	}

	public Double getBonsal() {
		return bonsal;
	}

	public void setBonsal(Double bonsal) {
		this.bonsal = bonsal;
	}

	public Long getNomina() {
		return nomina;
	}

	public void setNomina(Long nomina) {
		this.nomina = nomina;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getObserv() {
		return observ;
	}

	public void setObserv(String observ) {
		this.observ = observ;
	}

	public LocalDate getFechadoc() {
		return fechadoc;
	}

	public void setFechadoc(LocalDate fechadoc) {
		this.fechadoc = fechadoc;
	}

	public Long getNrecibo() {
		return nrecibo;
	}

	public void setNrecibo(Long nrecibo) {
		this.nrecibo = nrecibo;
	}

	public Long getPtd_bon14() {
		return ptd_bon14;
	}

	public void setPtd_bon14(Long ptd_bon14) {
		this.ptd_bon14 = ptd_bon14;
	}
	
	
}

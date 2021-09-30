package com.pp.reportes.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "INFORMACION DE TABLA LIBRO SALARIO")
@Entity
@Table(name = "LIBRO_SALARIO")
public class LibroSalario {
/*
	//0
	@ApiModelProperty(notes = "OBLIGATORIO REGISTRO")
	@Id
	@JoinColumn(name = "registro", nullable = false, foreignKey = @ForeignKey(name = "libsal_registro"))
	private Long registro;

	//1
	@ApiModelProperty(notes = "OBLIGATORIO PLAZA")
	@Id
	@JoinColumn(name = "plaza", nullable = false, foreignKey = @ForeignKey(name = "libsal_plaza"))
	private Long plaza;
	
	//2
	@ApiModelProperty(notes = "OBLIGATORIO PARTIDA")
	@Id
	@JoinColumn(name = "partida", nullable = false, foreignKey = @ForeignKey(name = "libsal_partida"))
	private Long partida;
*/
	@ApiModelProperty(notes = "OBLIGATORIO, LO GENERA EL SISTEMA")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_libsal;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumns({
	  @JoinColumn(name = "partida", insertable = true, updatable = true),
	  @JoinColumn(name = "plaza", insertable = true, updatable = true),
	  @JoinColumn(name = "registro", insertable = true, updatable = true)
	})
	private Persona persona;
	
	//3
	@ApiModelProperty(notes = "SUELDO")
	@Column(name = "sueldo", nullable = false)
	private Double sueldo;
	
	//4
	@ApiModelProperty(notes = "IGSS")
	@Column(name = "igss", nullable = false)
	private Double igss;
	
	//5
	@ApiModelProperty(notes = "TBR")
	@Column(name = "tbr", nullable = false)
	private Double tbr;
	
	//6
	@ApiModelProperty(notes = "ISR")
	@Column(name = "isr", nullable = false)
	private Double isr;
	
	//7
	@ApiModelProperty(notes = "CPP")
	@Column(name = "cpp", nullable = false)
	private Double cpp;
	
	//8
	@ApiModelProperty(notes = "PPP")
	@Column(name = "ppp", nullable = false)
	private Double ppp;
	
	//9
	@ApiModelProperty(notes = "ABT")
	@Column(name = "abt", nullable = false)
	private Double abt;
	
	//10
	@ApiModelProperty(notes = "PBT")
	@Column(name = "pbt", nullable = false)
	private Double pbt;
	
	//11
	@ApiModelProperty(notes = "DJD")
	@Column(name = "djd", nullable = false)
	private Double djd;
	
	//12
	@ApiModelProperty(notes = "CSN")
	@Column(name = "csn", nullable = false)
	private Double csn;
	
	//13
	@ApiModelProperty(notes = "TCP")
	@Column(name = "tcp", nullable = false)
	private Double tcp;
	
	//14
	@ApiModelProperty(notes = "FBP")
	@Column(name = "fbp", nullable = false)
	private Double fbp;
	
	//15
	@ApiModelProperty(notes = "IAP")
	@Column(name = "iap", nullable = false)
	private Double iap;
	
	//16
	@ApiModelProperty(notes = "CCV")
	@Column(name = "ccv", nullable = false)
	private Double ccv;
	
	//17
	@ApiModelProperty(notes = "PCV")
	@Column(name = "pcv", nullable = false)
	private Double pcv;
	
	//18
	@ApiModelProperty(notes = "CCC")
	@Column(name = "ccc", nullable = false)
	private Double ccc;
	
	//19
	@ApiModelProperty(notes = "PCC")
	@Column(name = "pcc", nullable = false)
	private Double pcc;
	
	//20
	@ApiModelProperty(notes = "PBA")
	@Column(name = "pba", nullable = false)
	private Double pba;
	
	//21
	@ApiModelProperty(notes = "CV")
	@Column(name = "cv", nullable = false)
	private Double cv;
	
	//22
	@ApiModelProperty(notes = "BON")
	@Column(name = "bon", nullable = false)
	private Double bon;
	
	//23
	@ApiModelProperty(notes = "DEU")
	@Column(name = "deu", nullable = false)
	private Double deu;
	
	//24
	@ApiModelProperty(notes = "FID")
	@Column(name = "fid", nullable = false)
	private Double fid;
	
	//25
	@ApiModelProperty(notes = "FT")
	@Column(name = "ft", nullable = false)
	private Double ft;
	
	//26
	@ApiModelProperty(notes = "DT")
	@Column(name = "dt", nullable = false)
	private Double dt;
	
	//27
	@ApiModelProperty(notes = "VAR")
	@Column(name = "var", nullable = false)
	private Double var;

	//28
	@ApiModelProperty(notes = "LIQUIDO")
	@Column(name = "liquido", nullable = false)
	private Double liquido;
	
	//29
	@ApiModelProperty(notes = "PLAZA_DESCRIPCION")
	@Column(name = "plaza_descripcion", nullable = false,length=255)
	private String plaza_descripcion;
	
	//30
	@ApiModelProperty(notes = "CHEQUE")
	@Column(name = "cheque", nullable = false)
	private Long cheque;
	
	//31
	@ApiModelProperty(notes = "DELCHEQUE")
	@Column(name = "delcheque",length=255, nullable = true)
	private String delcheque;
	
	//32
	@ApiModelProperty(notes = "NULO")
	@Column(name = "nulo",length=255, nullable = true)
	private String nulo;
	
	//33
	@ApiModelProperty(notes = "REPXCHEQUE")
	@Column(name = "repxcheque",length=255, nullable = true)
	private String repxcheque;
	
	//34
	@ApiModelProperty(notes = "NOMBRE")
	@Column(name = "nombre",length=255, nullable = true)
	private String nombre;
	
	//35
	@ApiModelProperty(notes = "BONICV")
	@Column(name = "bonicv", nullable = true)
	private Double bonicv;
	
	//36
	@ApiModelProperty(notes = "BONSAL")
	@Column(name = "bonsal", nullable = true)
	private Double bonsal;
	
	//37
	@ApiModelProperty(notes = "NOMINA")
	@Column(name = "nomina", nullable = true)
	private Long nomina;
	
	//38
	@ApiModelProperty(notes = "NOM")
	@Column(name = "nom", nullable = true, length=255)
	private String nom;
	
	//39
	@ApiModelProperty(notes = "BANCO")
	@Column(name = "banco", nullable = true, length=255)
	private String banco;
	
	//40
	@ApiModelProperty(notes = "OBSERV")
	@Column(name = "observ", nullable = true, length=255)
	private String observ;
	
	//41
	@ApiModelProperty(notes = "FECHADOC")
	@Column(name = "fechadoc", nullable = true)
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate fechadoc;
	
	//42
	@ApiModelProperty(notes = "NRECIBO")
	@Column(name = "nrecibo", nullable = true)
	private Long nrecibo;

	//43
	@ApiModelProperty(notes = "PTD_BON14")
	@Column(name = "ptd_bon14", nullable = true)
	private Long ptd_bon14;


	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
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

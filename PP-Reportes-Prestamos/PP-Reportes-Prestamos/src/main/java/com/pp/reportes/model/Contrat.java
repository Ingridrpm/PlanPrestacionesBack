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

@ApiModel(description = "Tabla nombrada CONTRAT1 en la base de datos original")
@Entity
@Table(name = "CONTRAT")
public class Contrat {
	
	@ApiModelProperty(notes = "OBLIGATORIO, LO GENERA EL SISTEMA")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_contrat;

	@ApiModelProperty(notes = "SUSTITUIDO")
	@Column(name = "sustituido", nullable = true)
	private String sustituido;
	
	@ApiModelProperty(notes = "CODIGO")
	@Column(name = "codigo", nullable = true)
	private String codigo;
	
	@ApiModelProperty(notes = "DEUDOR")
	@Column(name = "deudor", nullable = true)
	private Long deudor;
	
	@ApiModelProperty(notes = "ANTER")
	@Column(name = "anter", nullable = true)
	private Long anter;
	
	@ApiModelProperty(notes = "INICIO")
	@Column(name = "inicio", nullable = true)
	private Long inicio;
	
	@ApiModelProperty(notes = "MONTO")
	@Column(name = "monto", nullable = true)
	private Double monto;
	
	@ApiModelProperty(notes = "PLAZO")
	@Column(name = "plazo", nullable = true)
	private Long plazo;
	
	@ApiModelProperty(notes = "CUOTA")
	@Column(name = "cuota", nullable = true)
	private Long cuota;
	
	@ApiModelProperty(notes = "SEGURO")
	@Column(name = "seguro", nullable = true)
	private Double seguro;
	
	@ApiModelProperty(notes = "CHEQUE")
	@Column(name = "cheque", nullable = true)
	private Long cheque;
	
	@ApiModelProperty(notes = "FECHA")
	@Column(name = "fecha", nullable = true)
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate fecha;
	
	@ApiModelProperty(notes = "ACTUAL")
	@Column(name = "actual", nullable = true)
	private Long actual;
	
	@ApiModelProperty(notes = "FIADOR")
	@Column(name = "fiador", nullable = true)
	private Long fiador;
	
	@ApiModelProperty(notes = "FINAL1")
	@Column(name = "final1", nullable = true)
	private Long final1;
	
	@ApiModelProperty(notes = "SALDO")
	@Column(name = "saldo", nullable = true)
	private Double saldo;
	
	@ApiModelProperty(notes = "CANCELADO")
	@Column(name = "cancelado", nullable = true)
	private String cancelado;
	
	@ApiModelProperty(notes = "FECHAALTA")
	@Column(name = "fechaalta", nullable = true)
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate fechaalta;
	
	@ApiModelProperty(notes = "HORAALTA")
	@Column(name = "horaalta", nullable = true)
	private String horaalta;
	
	@ApiModelProperty(notes = "FECHABAJA")
	@Column(name = "fechabaja", nullable = true)
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate fechabaja;
	
	@ApiModelProperty(notes = "DEL_PLAN")
	@Column(name = "del_plan", nullable = true)
	private String del_plan;
	
	@ApiModelProperty(notes = "RECINDEM")
	@Column(name = "recindem", nullable = true)
	private Long recindem;
	
	@ApiModelProperty(notes = "ULTMESPAG")
	@Column(name = "ultmespag", nullable = true)
	private Long ultmespag;
	
	@ApiModelProperty(notes = "ULTIMOPAG")
	@Column(name = "ultimopag", nullable = true)
	private Long ultimopag;
	
	@ApiModelProperty(notes = "OBSERV")
	@Column(name = "observ", nullable = true)
	private String observ;
	
	@ApiModelProperty(notes = "CODRETEN")
	@Column(name = "codreten", nullable = true)
	private String codreten;
	
	@ApiModelProperty(notes = "SALDOANT")
	@Column(name = "saldoant", nullable = true)
	private Double saldoant;
	
	@ApiModelProperty(notes = "REGISTRO")
	@Column(name = "registro", nullable = true)
	private Long registro;
	
	@ApiModelProperty(notes = "CONTRASENA")
	@Column(name = "contrasena", nullable = true)
	private String contrasena;
	
	@ApiModelProperty(notes = "MAIL")
	@Column(name = "mail", nullable = true)
	private String mail;
	
	@ApiModelProperty(notes = "PANT")
	@Column(name = "pant", nullable = true)
	private String pant;
	
	@ApiModelProperty(notes = "BANDERAJUB")
	@Column(name = "banderajub", nullable = true)
	private Long banderajub;

	public Long getId_contrat() {
		return id_contrat;
	}

	public void setId_contrat(Long id_contrat) {
		this.id_contrat = id_contrat;
	}

	public String getSustituido() {
		return sustituido;
	}

	public void setSustituido(String sustituido) {
		this.sustituido = sustituido;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Long getDeudor() {
		return deudor;
	}

	public void setDeudor(Long deudor) {
		this.deudor = deudor;
	}

	public Long getAnter() {
		return anter;
	}

	public void setAnter(Long anter) {
		this.anter = anter;
	}

	public Long getInicio() {
		return inicio;
	}

	public void setInicio(Long inicio) {
		this.inicio = inicio;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Long getPlazo() {
		return plazo;
	}

	public void setPlazo(Long plazo) {
		this.plazo = plazo;
	}

	public Long getCuota() {
		return cuota;
	}

	public void setCuota(Long cuota) {
		this.cuota = cuota;
	}

	public Double getSeguro() {
		return seguro;
	}

	public void setSeguro(Double seguro) {
		this.seguro = seguro;
	}

	public Long getCheque() {
		return cheque;
	}

	public void setCheque(Long cheque) {
		this.cheque = cheque;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Long getActual() {
		return actual;
	}

	public void setActual(Long actual) {
		this.actual = actual;
	}

	public Long getFiador() {
		return fiador;
	}

	public void setFiador(Long fiador) {
		this.fiador = fiador;
	}

	public Long getFinal1() {
		return final1;
	}

	public void setFinal1(Long final1) {
		this.final1 = final1;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getCancelado() {
		return cancelado;
	}

	public void setCancelado(String cancelado) {
		this.cancelado = cancelado;
	}

	public LocalDate getFechaalta() {
		return fechaalta;
	}

	public void setFechaalta(LocalDate fechaalta) {
		this.fechaalta = fechaalta;
	}

	public String getHoraalta() {
		return horaalta;
	}

	public void setHoraalta(String horaalta) {
		this.horaalta = horaalta;
	}

	public LocalDate getFechabaja() {
		return fechabaja;
	}

	public void setFechabaja(LocalDate fechabaja) {
		this.fechabaja = fechabaja;
	}

	public String getDel_plan() {
		return del_plan;
	}

	public void setDel_plan(String del_plan) {
		this.del_plan = del_plan;
	}

	public Long getRecindem() {
		return recindem;
	}

	public void setRecindem(Long recindem) {
		this.recindem = recindem;
	}

	public Long getUltmespag() {
		return ultmespag;
	}

	public void setUltmespag(Long ultmespag) {
		this.ultmespag = ultmespag;
	}

	public Long getUltimopag() {
		return ultimopag;
	}

	public void setUltimopag(Long ultimopag) {
		this.ultimopag = ultimopag;
	}

	public String getObserv() {
		return observ;
	}

	public void setObserv(String observ) {
		this.observ = observ;
	}

	public String getCodreten() {
		return codreten;
	}

	public void setCodreten(String codreten) {
		this.codreten = codreten;
	}

	public Double getSaldoant() {
		return saldoant;
	}

	public void setSaldoant(Double saldoant) {
		this.saldoant = saldoant;
	}

	public Long getRegistro() {
		return registro;
	}

	public void setRegistro(Long registro) {
		this.registro = registro;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPant() {
		return pant;
	}

	public void setPant(String pant) {
		this.pant = pant;
	}

	public Long getBanderajub() {
		return banderajub;
	}

	public void setBanderajub(Long banderajub) {
		this.banderajub = banderajub;
	}
	
	

}

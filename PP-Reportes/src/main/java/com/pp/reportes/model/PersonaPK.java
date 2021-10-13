package com.pp.reportes.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PersonaPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long plaza;
	private Long partida;
	private Long registro;

}

package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tema implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7362742483051874787L;
	
	@Id
	@Column
	private int idTema;
	
	@Column 
	private String tema;

	public int getIdTema() {
		return idTema;
	}

	public void setIdTema(int idTema) {
		this.idTema = idTema;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public Tema(int idTema, String tema) {
		super();
		this.idTema = idTema;
		this.tema = tema;
	}

	public Tema() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}

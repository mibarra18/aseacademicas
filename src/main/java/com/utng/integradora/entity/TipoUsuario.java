package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoUsuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7072016992233327473L;
	
	@Id
	@Column
	private int idTipoUsuario;
	
	@Column
	private String tipo;

	public int getIdTipoUsuario() {
		return idTipoUsuario;
	}

	public void setIdTipoUsuario(int idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public TipoUsuario(int idTipoUsuario, String tipo) {
		this.idTipoUsuario = idTipoUsuario;
		this.tipo = tipo;
	}

	public TipoUsuario() {
		super();
	}
	
	

}

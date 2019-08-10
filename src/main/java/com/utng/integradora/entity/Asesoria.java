package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Asesoria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5144471690480651974L;
	
	@Id
	@Column
	private int idAsesoria;
	
	@Column
	private String fecha;
	
	@Column
	private double hora;
		
	@Column
	private String estatus;
	
	@ManyToOne
	@JoinColumn(name="idTema")
	private Grupo idTema;
	
	public int getIdAsesoria() {
		return idAsesoria;
	}


	public void setIdAsesoria(int idAsesoria) {
		this.idAsesoria = idAsesoria;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public double getHora() {
		return hora;
	}


	public void setHora(double hora) {
		this.hora = hora;
	}


	public String getEstatus() {
		return estatus;
	}


	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}


	public Grupo getIdTema() {
		return idTema;
	}


	public void setIdTema(Grupo idTema) {
		this.idTema = idTema;
	}


	public Asesoria(int idAsesoria, String fecha, double hora, String estatus, Grupo idTema) {
		super();
		this.idAsesoria = idAsesoria;
		this.fecha = fecha;
		this.hora = hora;
		this.estatus = estatus;
		this.idTema = idTema;
	}


	public Asesoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}

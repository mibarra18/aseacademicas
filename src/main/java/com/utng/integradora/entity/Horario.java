package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Horario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3592458573668242275L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int idHorario;
	
	@Column
	private String fecha;
	
	@Column
	private String hora;
	
	@Column
	private String periodo;

	public int getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(int idHorario) {
		this.idHorario = idHorario;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Horario(int idHorario, String fecha, String hora, String periodo) {
		super();
		this.idHorario = idHorario;
		this.fecha = fecha;
		this.hora = hora;
		this.periodo = periodo;
	}

	public Horario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}

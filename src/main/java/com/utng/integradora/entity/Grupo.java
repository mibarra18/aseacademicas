package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name="grupo")
public class Grupo implements Serializable{

	private static final long serialVersionUID = 4377648509352540715L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int idGrupo;
	
	@Column
	private String nombre;

	
	@Column
	private String cuatrimestre;
	
	@ManyToOne
	@JoinColumn(name="idProEducativo")
	private ProEducativo idProEducativo;

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuatrimestre() {
		return cuatrimestre;
	}

	public void setCuatrimestre(String cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}

	public ProEducativo getIdProEducativo() {
		return idProEducativo;
	}

	public void setIdProEducativo(ProEducativo idProEducativo) {
		this.idProEducativo = idProEducativo;
	}

	public Grupo(int idGrupo, String nombre, String cuatrimestre, ProEducativo idProEducativo) {
		super();
		this.idGrupo = idGrupo;
		this.nombre = nombre;
		this.cuatrimestre = cuatrimestre;
		this.idProEducativo = idProEducativo;
	}

	public Grupo() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	
	
	
}

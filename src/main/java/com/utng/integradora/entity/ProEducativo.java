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
@Table(name="proeducativo")
public class ProEducativo implements Serializable{

	private static final long serialVersionUID = 4377648509352540715L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int idProEducativo;
	
	@Column
	private String nombre;

	public int getIdProEducativo() {
		return idProEducativo;
	}

	public void setIdProEducativo(int idProEducativo) {
		this.idProEducativo = idProEducativo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ProEducativo(int idProEducativo, String nombre) {
		super();
		this.idProEducativo = idProEducativo;
		this.nombre = nombre;
	}

	public ProEducativo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	


	
	
}

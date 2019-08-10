package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Notificacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8611748813470173109L;
	
	@Id
	@Column
	private int notificacion;
	
	@Column
	private String mensaje;
	
	@Column
	private String estatus;
	
	@Column 
	private String fecha;

	public int getNotificacion() {
		return notificacion;
	}

	public void setNotificacion(int notificacion) {
		this.notificacion = notificacion;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Notificacion(int notificacion, String mensaje, String estatus, String fecha) {
		super();
		this.notificacion = notificacion;
		this.mensaje = mensaje;
		this.estatus = estatus;
		this.fecha = fecha;
	}

	public Notificacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}

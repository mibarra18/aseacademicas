package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
public class Usuario implements Serializable{

	private static final long serialVersionUID = 4377648509352540715L;

	@Id
	@Column
	private int idUsuario;
	
	@Email(message="Formato de correo no valido")
	@Size(min = 1, max = 254, message="Rango permitido de 1 a 254 caracteres")
	@Column
	private String correo;
	@Column
	private String username;
	@Column
	private String nombre;
	@Column
	private String apellidoP;
	@Column
	private String apellidoM;
	@Column
	@Size(min = 4, max = 15, message="Rango permitido de 4 a 15 caracteres")
	private String contrasena; 
		
	@ManyToOne
	@JoinColumn(name="idTipoUsuario")
	private TipoUsuario idTipoUsuario;
	
	@ManyToOne
	@JoinColumn(name="idHorario")
	private Horario idHorario;


	@ManyToOne
	@JoinColumn(name="idGrupo")
	private Grupo idGrupo;


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}




	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidoP() {
		return apellidoP;
	}


	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}


	public String getApellidoM() {
		return apellidoM;
	}


	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	public TipoUsuario getIdTipoUsuario() {
		return idTipoUsuario;
	}


	public void setIdTipoUsuario(TipoUsuario idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}


	public Horario getIdHorario() {
		return idHorario;
	}


	public void setIdHorario(Horario idHorario) {
		this.idHorario = idHorario;
	}


	public Grupo getIdGrupo() {
		return idGrupo;
	}


	public void setIdGrupo(Grupo idGrupo) {
		this.idGrupo = idGrupo;
	}


	public Usuario(int idUsuario,
			@Size(min = 1, max = 254, message = "Rango permitido de 1 a 254 caracteres") String correo, String username, String nombre,
			String apellidoP, String apellidoM, String contrasena, TipoUsuario idTipoUsuario, Horario idHorario,
			Grupo idGrupo) {
		super();
		this.idUsuario = idUsuario;
		this.correo = correo;
		this.username = username;
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.contrasena = contrasena;
		this.idTipoUsuario = idTipoUsuario;
		this.idHorario = idHorario;
		this.idGrupo = idGrupo;
	}


	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}

package com.utng.integradora.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/profesor")
public class ProfesorController {
	
	List<String> mensajes = new ArrayList<>();
	
	


	@RequestMapping(value = { "/perfilp" }, method = RequestMethod.GET)
	public String listEstudiantes(Model model) {

		return "perfilp"; 
	}
	
	@RequestMapping(value="/perfilp")
	public String perfilp() {
		
		return "perfilp";
	}
	
	@RequestMapping(value="/solicitar")
	public String solicitar() {
		
		return "solicitar";
	}
	
	@RequestMapping(value="/cancelarp")
	public String cancelarp() {
		
		return "cancelarp";
	}
	
	@RequestMapping(value="/asistencia")
	public String asistencia() {
		
		return "asistencia";
	}
	
}
package com.utng.integradora.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.utng.integradora.entity.Usuario;
import com.utng.integradora.service.ILoginService;

/**
 * Descripcion: Maneja peticiones de pantalla de Login. Autor: Equipo Asesorias
 * Academicas. Fecha: 01 de Agosto del 2019
 */
@Controller
public class HomeController {

	@Autowired
	ILoginService loginService;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simplemente selecciona la pantalla de home
	 */

	@RequestMapping(value = { "/", "/inicio" }, method = RequestMethod.GET)
	public String showHome(Model model, Usuario usuario) {

		logger.info("Ingresando al método showHome");
		model.addAttribute("error", 1); // Todo es correcto
		model.addAttribute("usuario", new Usuario());
		model.addAttribute("title", "Ingreso al sistema");
		return "inicio";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String saveUsuario(@Valid Usuario usuario, BindingResult result, Model model) {
		List<Usuario> usuarios = loginService.isLogin(usuario.getUsername(), usuario.getContrasena());
		
		if (result.hasErrors()) {
			return "/inicio";

		}
	
		
		
		if (usuarios.size() == 0) {//No existe usuario
			model.addAttribute("error", 1); // Todo es correcto
			model.addAttribute("usuario", new Usuario());
			model.addAttribute("msg", "El usuario o contraseña no correctos");
			return "/inicio";
		} else { //Existe el usuario
			
			return "perfil";
		}

	}

}

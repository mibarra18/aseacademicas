package com.utng.integradora.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.utng.integradora.dao.IGrupoDao;
import com.utng.integradora.entity.Grupo;
import com.utng.integradora.entity.ProEducativo;
import com.utng.integradora.entity.TipoUsuario;
import com.utng.integradora.entity.Usuario;
import com.utng.integradora.service.IGrupoService;
import com.utng.integradora.service.IProEducativoService;
import com.utng.integradora.service.ITipoUsuarioService;
import com.utng.integradora.service.IUsuarioService;



@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	List<String> mensajes = new ArrayList<>();
	
	@RequestMapping(value="/inicio")
	public String inicio() {
		
		return "inicio";
	}
	
	
	@Autowired
	private IUsuarioService usuarioService;
	@Autowired
	private IGrupoService grupoService;
	@Autowired
	private IProEducativoService proEducativoService;
	@Autowired
	private ITipoUsuarioService tipoUsuarioService;

	
	@RequestMapping(value = "/registro" , method = RequestMethod.GET)
	public String registroUsuario(Model model) {
		Usuario usuario = new Usuario();
		List<Grupo> grupos = grupoService.getAll();
		List<ProEducativo> proEducativos = proEducativoService.getAll();
		List<TipoUsuario> tipoUsuarios = tipoUsuarioService.getAll();
		
		
		model.addAttribute("grupos", grupos);
		model.addAttribute("proEducativos", proEducativos);
		model.addAttribute("tipoUsuarios", tipoUsuarios);
		model.addAttribute("usuario", usuario);
		model.addAttribute("edit", false);
		return "registro"; 
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String saveUsuario(@Valid Usuario usuario, BindingResult result, Model model) {
		
		 if (result.hasErrors()) {
			 return "registro";
		 
}
		usuarioService.saveOrUpdate(usuario);
		model.addAttribute("error", 1);
		return "inicio"; 	
	}
	
	
	//VISTAS PARA LOS USUARIOS
	//ALUMNO
}
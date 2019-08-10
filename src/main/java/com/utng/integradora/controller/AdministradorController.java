package com.utng.integradora.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/administrador")
public class AdministradorController {


	List<String> mensajes = new ArrayList<>();
	

	
	@RequestMapping(value = { "/perfila" }, method = RequestMethod.GET)
	public String listEstudiantes(Model model) {

		return "perfila"; 
	}
	
	@RequestMapping(value="/perfila")
	public String perfilp() {
		
		return "perfila";
	}
	
	@RequestMapping(value="/reporteA")
	public String reporteA() {
		
		return "reporteA";
	}
	
	@RequestMapping(value="/reporteH")
	public String reporteH() {
		
		return "reporteH";
	}
	
	@RequestMapping(value="/actualizarP")
	public String actulizarP() {
		
		return "actualizarP";
	}
	
	@RequestMapping(value="/actualizarm")
	public String actulizarm() {
		
		return "actualizarm";
	}
	
	@RequestMapping(value="/actualizarmp")
	public String actulizarmp() {
		
		return "actualizarmp";
	}

	

	
	
	
	
	
	
//	@RequestMapping(value = { "/estudiante", "/registro" }, method = RequestMethod.GET)
//	public String newEstudiante(Model model) {
//		
//		Estudiante estudiante = new Estudiante();
//		model.addAttribute("estudiante", estudiante);
//		model.addAttribute("error", 0); //No hay nada que mostrar
//		mensajes.clear();
//		model.addAttribute("mensajes", mensajes);		
//		model.addAttribute("registro", false);
//		return "registroEstudiante";
//	}
//	
//	@RequestMapping(value = { "/estudiante" }, method = RequestMethod.POST)
//	public String saveEstudiante(@Valid Estudiante estudiante, BindingResult result, Model model) {
//
//		if (result.hasErrors()) {
//			return "Estudiante";
//		}
//
//		/*
//		if (!estudianteService.isEmployeeSsnUnique(employee.getId(), employee.getSsn())) {
//			FieldError ssnError = new FieldError("employee", "ssn", messageSource.getMessage("non.unique.ssn",
//					new String[] { estudiante.getSsn() }, Locale.getDefault()));
//			result.addError(ssnError);
//			return "registration";
//		}*/
//
//		estudianteService.saveOrUpdate(estudiante);
//
//		model.addAttribute("error", 1);
//		mensajes.clear();
//		mensajes.add("Estudiante con Número de control" + estudiante.getNumeroControl() + " se ha registrado exitosamente");
//		model.addAttribute("mensajes", mensajes);
//		return "redirect:/estudiante/list";
//	}
//	
//	/*
//     * 
//     */
//	@RequestMapping(value = { "/estudiante", "/delete/{id}" }, method = RequestMethod.GET)
//    public String deleteEstudiante(@PathVariable String id, Model model) {
//		
//		Estudiante student = new Estudiante();
//		student.setNumeroControl(id);
//        estudianteService.remove(student);
//		model.addAttribute("error", 1);
//		mensajes.clear();
//		mensajes.add("El Estudiante con número de control " + id + " se ha eliminado exitosamente");
//		model.addAttribute("mensajes", mensajes);
//        return "redirect:/estudiante/list";
//    }
//	
//	@RequestMapping(value = { "/estudiante", "/edit/{id}" }, method = RequestMethod.GET)
//	public String editEstudiante(@PathVariable String id, Model model) {
//        Estudiante student = estudianteService.get(id);
//        model.addAttribute("estudiante", student);
//        model.addAttribute("error", 0);
//        model.addAttribute("edit", true);
//        model.addAttribute("error", 0);
//        return "addEstudiante";
//    }
//
//	@RequestMapping(value = { "/estudiante", "/edit/{id}" }, method = RequestMethod.POST)
//	public String updateEstudiante(@Valid Estudiante student, BindingResult result,
//            Model model, @PathVariable String id) {
// 
//        if (result.hasErrors()) {
//            return "addEstudiante";
//        }
// 
//        estudianteService.saveOrUpdate(student);
// 
//		model.addAttribute("error", 1);
//		mensajes.clear();
//		mensajes.add("El Estudiante con número de control " + id + " se ha modificado exitosamente");
//        model.addAttribute("mensajes", mensajes);
//        return "redirect:/estudiante/list";
//    }
	
}

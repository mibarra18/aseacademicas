package com.utng.integradora.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.utng.integradora.dao.IGenericDao;
import com.utng.integradora.dao.IUsuarioDao;
import com.utng.integradora.entity.Usuario;
import com.utng.integradora.service.GenericService;
import com.utng.integradora.service.IUsuarioService;

@Service
public class UsuarioServiceImpl extends GenericService<Usuario, String> implements IUsuarioService{

	IUsuarioDao usuarioDao;
	
	@Autowired
	public UsuarioServiceImpl(
			@Qualifier("usuarioDaoImpl") IGenericDao<Usuario, String> genericDao) {
		super(genericDao);
		this.usuarioDao = (IUsuarioDao) genericDao;
	}

	public UsuarioServiceImpl() {
	}
	
	
}

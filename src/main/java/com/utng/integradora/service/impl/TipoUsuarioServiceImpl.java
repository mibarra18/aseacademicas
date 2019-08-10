package com.utng.integradora.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.utng.integradora.dao.IGenericDao;
import com.utng.integradora.dao.ITipoUsuarioDao;
import com.utng.integradora.entity.TipoUsuario;
import com.utng.integradora.service.GenericService;
import com.utng.integradora.service.IGenericService;
import com.utng.integradora.service.ITipoUsuarioService;

@Service
public class TipoUsuarioServiceImpl  extends GenericService<TipoUsuario, Integer> implements ITipoUsuarioService{

	private ITipoUsuarioDao tipoUsuarioDao;

	@Autowired
	public TipoUsuarioServiceImpl(@Qualifier("tipoUsuarioDaoImpl")IGenericDao<TipoUsuario, Integer> genericDao) {
		super(genericDao);
		this.tipoUsuarioDao = (ITipoUsuarioDao) genericDao;
	}

	public TipoUsuarioServiceImpl() {
		super();
}

}

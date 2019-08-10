package com.utng.integradora.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.utng.integradora.service.IGenericService;
import com.utng.integradora.service.IGrupoService;
import com.utng.integradora.service.GenericService;
import com.utng.integradora.dao.IGenericDao;
import com.utng.integradora.dao.IGrupoDao;
import com.utng.integradora.entity.Grupo;

@Service
public class GrupoServiceImpl extends GenericService<Grupo, Integer> implements IGrupoService{

	private IGrupoDao grupoDao;

	@Autowired
	public GrupoServiceImpl(@Qualifier("grupoDaoImpl")IGenericDao<Grupo, Integer> genericDao) {
		super(genericDao);
		this.grupoDao = (IGrupoDao) genericDao;
	}

	public GrupoServiceImpl() {
		super();
	}
	

}

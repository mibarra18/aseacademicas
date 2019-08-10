package com.utng.integradora.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.utng.integradora.dao.IGenericDao;
import com.utng.integradora.dao.IProEducativoDao;
import com.utng.integradora.entity.ProEducativo;
import com.utng.integradora.service.GenericService;
import com.utng.integradora.service.IGenericService;
import com.utng.integradora.service.IProEducativoService;

@Service
public class ProEducativoServiceImpl extends GenericService<ProEducativo, Integer> implements IProEducativoService{

	private IProEducativoDao proEducativoDao;

	@Autowired
	public ProEducativoServiceImpl(@Qualifier("proEducativoDaoImpl")IGenericDao<ProEducativo, Integer> genericDao) {
		super(genericDao);
		this.proEducativoDao = (IProEducativoDao) genericDao;
	}

	public ProEducativoServiceImpl() {
		super();
}
}

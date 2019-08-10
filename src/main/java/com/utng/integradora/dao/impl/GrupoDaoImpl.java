package com.utng.integradora.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.utng.integradora.dao.GenericDao;
import com.utng.integradora.dao.IGrupoDao;
import com.utng.integradora.entity.Grupo;

@Repository
@Transactional
public class GrupoDaoImpl extends GenericDao<Grupo, Integer> implements IGrupoDao{

}

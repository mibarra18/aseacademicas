package com.utng.integradora.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.utng.integradora.dao.GenericDao;
import com.utng.integradora.dao.ITipoUsuarioDao;
import com.utng.integradora.entity.TipoUsuario;

@Repository
@Transactional
public class TipoUsuarioDaoImpl extends GenericDao<TipoUsuario, Integer> implements ITipoUsuarioDao{

}

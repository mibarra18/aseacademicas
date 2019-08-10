package com.utng.integradora.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.utng.integradora.dao.GenericDao;
import com.utng.integradora.dao.IProEducativoDao;
import com.utng.integradora.entity.ProEducativo;

@Repository
@Transactional
public class ProEducativoDaoImpl extends GenericDao<ProEducativo, Integer> implements IProEducativoDao {

}

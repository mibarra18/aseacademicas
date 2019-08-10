package com.utng.integradora.dao.impl;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.utng.integradora.dao.GenericDao;
import com.utng.integradora.dao.IUsuarioDao;
import com.utng.integradora.entity.Usuario;

/**
 * Clase que permite acceder a la base de datos.
 * 
 * @author Gabriel Barrón Rodríguez
 * @author 19 de Junio 2019
 *
 */
@Repository
@Transactional
public class UsuarioDaoImpl extends GenericDao<Usuario, String> implements IUsuarioDao{

	

}

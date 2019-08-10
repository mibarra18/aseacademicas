package com.utng.integradora.dao.impl;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.utng.integradora.dao.GenericDao;
import com.utng.integradora.dao.ILoginDao;
import com.utng.integradora.entity.Usuario;

@Repository
@Transactional
public class LoginDaoImpl extends GenericDao<Usuario, String> implements ILoginDao {

	@Override
	public List<Usuario> isLogin(String username, String contrasena){
		String sql ="from Usuario u where u.username= '" +username + "'and u.contrasena='"+contrasena +"'";
		
		Query<Usuario> query= currentSession().createQuery(sql);
		
		
		return query.getResultList();
		
	}

	

}

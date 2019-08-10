
package com.utng.integradora.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.utng.integradora.dao.IGenericDao;
import com.utng.integradora.dao.ILoginDao;
import com.utng.integradora.entity.Usuario;
import com.utng.integradora.service.GenericService;
import com.utng.integradora.service.ILoginService;

@Service
public class LoginServiceImpl extends GenericService<Usuario, String> implements ILoginService {

	private ILoginDao loginDao;
	
	
	
	
	public LoginServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Autowired
	public LoginServiceImpl(@Qualifier("loginDaoImpl")IGenericDao<Usuario, String> genericDao) {
		super(genericDao);
		this.loginDao = (ILoginDao) genericDao;
		// TODO Auto-generated constructor stub
	}




	@Override
	public List<Usuario> isLogin(String username, String contrasena) {
		
		return loginDao.isLogin(username, contrasena);
	}


}

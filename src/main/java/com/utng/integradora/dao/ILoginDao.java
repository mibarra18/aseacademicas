package com.utng.integradora.dao;

import java.util.List;

import com.utng.integradora.entity.Usuario;

public interface ILoginDao extends IGenericDao<Usuario, String>{
	
	List<Usuario> isLogin(String username, String contrasena);

}

package com.utng.integradora.service;

import java.util.List;

import com.utng.integradora.entity.Usuario;

public interface ILoginService extends IGenericService<Usuario, String> {
	
	List<Usuario> isLogin(String username, String contrasena);

}

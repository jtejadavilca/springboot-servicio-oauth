package com.formacionbdi.springboot.app.oauth.services;

import com.formacionbdi.springboot.app.oauth.models.entity.Usuario;

public interface IUsuarioService {

	
	Usuario findByUsername(String username);
	
}

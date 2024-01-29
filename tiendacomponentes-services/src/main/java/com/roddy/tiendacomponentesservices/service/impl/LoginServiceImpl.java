/**
 * 
 */
package com.roddy.tiendacomponentesservices.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roddy.tiendacomponentesdata.dao.ClienteDAO;
import com.roddy.tiendacomponentesentities.entities.Cliente;
import com.roddy.tiendacomponentesservices.service.LoginService;

/**
 * clase que implementa las finciones para la logica de negocio para la pantalla de login
 */

@Service

public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private ClienteDAO clienteDAOImpl;

	@Override
	public Cliente consultarUsuarioLogin(String usuario, String password) {
		return this.clienteDAOImpl.findByUsuarioAndPassword(usuario, password);
	}

}

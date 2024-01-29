/**
 * 
 */
package com.roddy.tiendacomponentesservices.service;

import com.roddy.tiendacomponentesentities.entities.Cliente;

/**
 * Interfaz que realiza la logica de negocio para el inicio de sesion de la persona
 */
public interface LoginService {

	/**Metodo que permite consultar un usuario que trata de ingresar a sesion en la tienda
	 * @param usuario {@link} usuario capturado por el cliente
	 * @param paasword {@link} contraseña capturado por el cliente
	 * @preturn {@link Cliente} usuario encontrado en la base de datos
	 * 
	 * 
	 * */
	Cliente consultarUsuarioLogin(String usuario, String password);
}

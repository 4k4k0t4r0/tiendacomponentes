/**
 * 
 */
package com.roddy.tiendacomponentesdata.impl;

import com.roddy.tiendacomponentesdata.common.CommonDAO;
import com.roddy.tiendacomponentesdata.dao.ClienteDAO;
import com.roddy.tiendacomponentesentities.entities.Cliente;

/**
 * Clase que implementa el CRUD Generico y las funciones de la iterface de PeronaDAO
 */
public class ClienteDAOImpl extends CommonDAO<Cliente, ClienteDAO> {
	
	/**Metodo que permite consultar una persona por su usuario
	 * @param usuario {@link String} usuario capturado por la persona
	 * @param password {@link String} contraseña capturada por la persona
	 * @return {@link Cliente} Cliente encontrado.
	 * */
    public Cliente findUsuarioAndPassword(String usuario,String password) {
    	return this.repository.findByUsuarioAndPassword(usuario, password);
    }
    
}

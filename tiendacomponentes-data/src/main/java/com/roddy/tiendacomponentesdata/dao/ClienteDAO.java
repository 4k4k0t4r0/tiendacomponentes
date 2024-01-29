/**
 * 
 */
package com.roddy.tiendacomponentesdata.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.roddy.tiendacomponentesentities.entities.Cliente;

/**
 * clase DAO que realiza el CRUD con SpringJPA para la tabla de persona
 */


public interface ClienteDAO extends PagingAndSortingRepository<Cliente, Long> {
	/**
	 * Merodo que permite consutar el usuario que trata de ingresar a sesion
	 * @param usuario{@link String} USUARIO CAPTURADO POR EL CLIENTE
	 * @param password{@link String} CONTRASEÑA CAPTURADO POR EL CLIENTE
	 * @return {@link String} OBJETO CON LA PERSONA ENCONTRADA
	 * */

	@Query("SELECT p FROM Cliente p WHERE p.usuario= ?1 AND p.password= ?2")
	Cliente findByUsuarioAndPassword(String usuario,String password);
	
	
}

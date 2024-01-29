/**
 * 
 */
package com.roddy.tiendacomponentesdata.common;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;



/**
 * 	Clase generica que representa los metodos del CRUD que se reutilizan en todas las entidades
 * del proyecto
 * E=Significa la entidad a utilizar en el CRUD
 * R=Repositorio a utlizar de JPA para ejecutar el CRUD
 */
public class CommonDAO <E,R extends PagingAndSortingRepository<E, Long>> {
    
	
	
	@Autowired
	protected R repository;
	
	/** Metodo que permite consultar una lista de adtos paginable de una entidad
	 * 
	 * @param desde {@link String} indica a partir de que valor se obtendran los resultados
	 * @param hasta {@link String} indica el limire de resultados paginados a obtener
	 * @param order by {@link String} indica a partir de que campo se ordenaran los registros.
	 * @return {@link String} lista con los datos consultados pagonados.
	 * 
	 * */
	
	
	public List<E> consultarListaPaginable(int desde,int hasta,String orderBy) {
		Pageable pageable= PageRequest.of(desde, hasta, Sort.by(orderBy));
		Page<E> page=this.repository.findAll(pageable);
		return page.getContent();
		
	}
	  /**metodo que permite persistir la informacion de cualquier entidad
	   * @param e {@link Onject} objeto o entidad a persistir
	   * @return {@link Onject} ibjeto recuperado despues de persistir el registro.
	   * */
	public E guardar(E e) {
		return this.repository.save(e);
		
		
	}
	
	  /**metodo que permite actualizar la informacion de cualquier entidad
	   * @param e {@link Onject} objeto o entidad a actualizar
	   * @return {@link Onject} ibjeto recuperado despues de persistir el registro.
	   * */
	public E actualizar(E e) {
		return this.repository.save(e);
		
		
	}
	
	  /**metodo que permite eliminar la informacion de cualquier entidad
	   * @param e {@link Onject} objeto o entidad a eliminar
	   * @return {@link Onject} ibjeto recuperado despues de persistir el registro.
	   * */
	public void eliminar(E e) {
		this.repository.delete(e);
		
		
	}
	
}

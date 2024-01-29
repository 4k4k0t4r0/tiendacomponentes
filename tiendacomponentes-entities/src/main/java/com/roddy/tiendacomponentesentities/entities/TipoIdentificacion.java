/**
 * 
 */
package com.roddy.tiendacomponentesentities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que contiene entidades de tipos de identificacion de tipos de usuario
 */

@Entity
@Table(name="tipoidentificacion")

public class TipoIdentificacion extends Common {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idTipoidentificacion")
	private Long idTipoidentificacion;
	
	@Column(name="nombre",length=45,nullable=false)
    private String nombre;

	/**
	 * @return the idTipoidentificacion
	 */
	public Long getIdTipoidentificacion() {
		return idTipoidentificacion;
	}

	/**
	 * @param idTipoidentificacion the idTipoidentificacion to set
	 */
	public void setIdTipoidentificacion(Long idTipoidentificacion) {
		this.idTipoidentificacion = idTipoidentificacion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

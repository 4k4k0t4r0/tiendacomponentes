package com.roddy.tiendacomponentesentities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**Clase de los clientes que interactuan en la tienda musical*/

@Entity
@Table(name="cliente")
public class Cliente extends Common {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCliente")
    private long IdCliente;
    
    @Column(name="numeroIdentificacion",length=12,nullable=false)
    private String numeroIdentificacion;
    
    @Column(name="nombre",length=100,nullable=false)
    private String nombre;
    
    @Column(name="primerApellido",length=100,nullable=false)
    private String primerApellido;
    
    @Column(name="segundoApellido",length=45,nullable=false)
    private String segundoApellido;
    
    @Column(name="imagen",length=100)
    private String imagen;
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="idtipoIdentificacion")
    private TipoIdentificacion tipoIdentificacion;
    
    @Column(name="usuario",length=45,nullable=false)
    private String usuario;
    
    @Column(name="password",length=45,nullable=false)
    private String password;
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="idRol")
    private Rol rol;

	/**
	 * @return the idCliente
	 */
	public long getIdCliente() {
		return IdCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(long idCliente) {
		IdCliente = idCliente;
	}

	/**
	 * @return the numeroIdentificacion
	 */
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	/**
	 * @param numeroIdentificacion the numeroIdentificacion to set
	 */
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
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

	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	/**
	 * @return the tipoIdentificacion
	 */
	public TipoIdentificacion getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	/**
	 * @param tipoIdentificacion the tipoIdentificacion to set
	 */
	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	/**
	 * @return the ususario
	 */
	public String getUsusario() {
		return usuario;
	}

	/**
	 * @param ususario the ususario to set
	 */
	public void setUsusario(String ususario) {
		this.usuario = ususario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the rol
	 */
	public Rol getRol() {
		return rol;
	}

	/**
	 * @param rol the rol to set
	 */
	public void setRol(Rol rol) {
		this.rol = rol;
	}

	
}

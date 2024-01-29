package com.roddy.tiendacomponentesweb.controller;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import com.roddy.tiendacomponentesentities.entities.Cliente;
import com.roddy.tiendacomponentesservices.service.LoginService;
import com.roddy.tiendacomponentesweb.webutils.CommonUtils;

/**Controlador que se encarga del flujo del login.xhtml*/

@ManagedBean
@ViewScoped
public class LoginController {
  /**Usiario Capturado por la persona*/
	
	private String usuario;
	  /**Usiario Capturado por la persona*/
	
		private String password;
		
		
		/**Logica de negocio inyectada con JSF y Spring*/
		@ManagedProperty("#{loginServiceImpl}")
		private LoginService loginServiceImpl;
		
		
		@PostConstruct
		public void init() {
			System.out.println("Incializando Login...");
		}
	/** Metodo que permiate a la persona ingresar a su pantalla de home*/
		public void entrar() {
			
			Cliente clienteConsultada= this.loginServiceImpl.consultarUsuarioLogin(this.usuario, this.password);
			 
	        if (clienteConsultada != null) {
				CommonUtils.mostarMensaje(FacesMessage.SEVERITY_INFO, "¡EXITOSO!", "¡BIENVENIDO AL HOME!");
			} else {
				CommonUtils.mostarMensaje(FacesMessage.SEVERITY_ERROR, "¡UPS!", "¡El usuario y/o contraseña son incorrectos!");
			}
		}
		
		
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
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
	 * @return the loginServiceImpl
	 */
	public LoginService getLoginServiceImpl() {
		return loginServiceImpl;
	}
	/**
	 * @param loginServiceImpl the loginServiceImpl to set
	 */
	public void setLoginServiceImpl(LoginService loginServiceImpl) {
		this.loginServiceImpl = loginServiceImpl;
	}
	
}

/**
 * 
 */
package com.roddy.tiendacomponentesweb.webutils;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

/**
 * clase generada para crear dfunciones globales o 
 * comunes entre clases del proyecto
 */
public class CommonUtils {
	/** metodo que permite mostyrar un mensaje al usuario
	 * 
	 * @param severity{@link Severity}
	 * @param summary{@link String}
	 * @param detail{@link String}
	 * */
	
	
   public static void mostarMensaje(Severity severity,String summary,String detail){
	   
	   FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, summary, detail));
   }
}

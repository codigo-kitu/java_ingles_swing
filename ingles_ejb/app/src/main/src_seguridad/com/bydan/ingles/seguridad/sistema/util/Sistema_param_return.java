/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.ingles.seguridad.sistema.util;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.util.Date;
import java.sql.Timestamp;

//import org.hibernate.validator.*;

import com.bydan.framework.ingles.business.entity.GeneralEntity;
import com.bydan.framework.ingles.business.entity.GeneralEntityParameterReturnGeneral;
import com.bydan.framework.ingles.business.entity.GeneralEntityReturnGeneral;
import com.bydan.framework.ingles.business.entity.Classe;
import com.bydan.framework.ingles.business.data.ConstantesSql;
//import com.bydan.framework.ingles.business.entity.Mensajes;
import com.bydan.framework.ingles.util.Constantes;
import com.bydan.framework.ingles.util.DeepLoadType;
import com.bydan.ingles.seguridad.sistema.util.Sistema_util;

import com.bydan.ingles.seguridad.sistema.business.entity.*;//Sistema

//FK


//REL

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.paquete.business.entity.Paquete;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;



@SuppressWarnings("unused")
public class Sistema_param_return extends Sistema_param_return_add implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected Sistema sistema;	
	protected List<Sistema> sistemas;
	
	
	
	public Sistema_param_return () throws Exception {						
		super();
		this.sistemas= new ArrayList<Sistema>();
		this.sistema= new Sistema();
		
		
	} 
	
	public Sistema getSistema() throws Exception {	
		return sistema;
	}
		
	public void setSistema(Sistema newSistema) {
		this.sistema = newSistema;
	}
	
	public List<Sistema> getSistemas() throws Exception {		
		return sistemas;
	}
	
	public void setSistemas(List<Sistema> newSistemas) {
		this.sistemas = newSistemas;
	}
	
	
	
	
}


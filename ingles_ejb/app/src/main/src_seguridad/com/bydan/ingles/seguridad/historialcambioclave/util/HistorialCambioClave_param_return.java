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
package com.bydan.ingles.seguridad.historialcambioclave.util;

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
import com.bydan.ingles.seguridad.historialcambioclave.util.HistorialCambioClave_util;

import com.bydan.ingles.seguridad.historialcambioclave.business.entity.*;//HistorialCambioClave

//FK

import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;

//REL




@SuppressWarnings("unused")
public class HistorialCambioClave_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected HistorialCambioClave historialcambioclave;	
	protected List<HistorialCambioClave> historialcambioclaves;
	
	
	public List<Usuario> usuariosFK;
	
	public HistorialCambioClave_param_return () throws Exception {						
		super();
		this.historialcambioclaves= new ArrayList<HistorialCambioClave>();
		this.historialcambioclave= new HistorialCambioClave();
		
		
		this.usuariosFK=new ArrayList<Usuario>();
	} 
	
	public HistorialCambioClave getHistorialCambioClave() throws Exception {	
		return historialcambioclave;
	}
		
	public void setHistorialCambioClave(HistorialCambioClave newHistorialCambioClave) {
		this.historialcambioclave = newHistorialCambioClave;
	}
	
	public List<HistorialCambioClave> getHistorialCambioClaves() throws Exception {		
		return historialcambioclaves;
	}
	
	public void setHistorialCambioClaves(List<HistorialCambioClave> newHistorialCambioClaves) {
		this.historialcambioclaves = newHistorialCambioClaves;
	}
	
	

	public List<Usuario> getusuariosFK() {
		return this.usuariosFK;
	}
	
	

	public void setusuariosFK(List<Usuario> usuariosFK) {
		this.usuariosFK=usuariosFK;
	}
}


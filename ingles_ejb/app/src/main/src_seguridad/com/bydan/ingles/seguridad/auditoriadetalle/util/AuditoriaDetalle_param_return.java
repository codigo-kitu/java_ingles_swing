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
package com.bydan.ingles.seguridad.auditoriadetalle.util;

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
import com.bydan.ingles.seguridad.auditoriadetalle.util.AuditoriaDetalle_util;

import com.bydan.ingles.seguridad.auditoriadetalle.business.entity.*;//AuditoriaDetalle

//FK

import com.bydan.ingles.seguridad.auditoria.business.entity.Auditoria;

//REL




@SuppressWarnings("unused")
public class AuditoriaDetalle_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected AuditoriaDetalle auditoriadetalle;	
	protected List<AuditoriaDetalle> auditoriadetalles;
	
	
	public List<Auditoria> auditoriasFK;
	
	public AuditoriaDetalle_param_return () throws Exception {						
		super();
		this.auditoriadetalles= new ArrayList<AuditoriaDetalle>();
		this.auditoriadetalle= new AuditoriaDetalle();
		
		
		this.auditoriasFK=new ArrayList<Auditoria>();
	} 
	
	public AuditoriaDetalle getAuditoriaDetalle() throws Exception {	
		return auditoriadetalle;
	}
		
	public void setAuditoriaDetalle(AuditoriaDetalle newAuditoriaDetalle) {
		this.auditoriadetalle = newAuditoriaDetalle;
	}
	
	public List<AuditoriaDetalle> getAuditoriaDetalles() throws Exception {		
		return auditoriadetalles;
	}
	
	public void setAuditoriaDetalles(List<AuditoriaDetalle> newAuditoriaDetalles) {
		this.auditoriadetalles = newAuditoriaDetalles;
	}
	
	

	public List<Auditoria> getauditoriasFK() {
		return this.auditoriasFK;
	}
	
	

	public void setauditoriasFK(List<Auditoria> auditoriasFK) {
		this.auditoriasFK=auditoriasFK;
	}
}


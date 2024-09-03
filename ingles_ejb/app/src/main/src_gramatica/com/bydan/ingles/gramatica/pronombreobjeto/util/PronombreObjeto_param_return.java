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
package com.bydan.ingles.gramatica.pronombreobjeto.util;

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
import com.bydan.ingles.gramatica.pronombreobjeto.util.PronombreObjeto_util;

import com.bydan.ingles.gramatica.pronombreobjeto.business.entity.*;//PronombreObjeto

//FK


//REL




@SuppressWarnings("unused")
public class PronombreObjeto_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected PronombreObjeto pronombreobjeto;	
	protected List<PronombreObjeto> pronombreobjetos;
	
	
	
	public PronombreObjeto_param_return () throws Exception {						
		super();
		this.pronombreobjetos= new ArrayList<PronombreObjeto>();
		this.pronombreobjeto= new PronombreObjeto();
		
		
	} 
	
	public PronombreObjeto getPronombreObjeto() throws Exception {	
		return pronombreobjeto;
	}
		
	public void setPronombreObjeto(PronombreObjeto newPronombreObjeto) {
		this.pronombreobjeto = newPronombreObjeto;
	}
	
	public List<PronombreObjeto> getPronombreObjetos() throws Exception {		
		return pronombreobjetos;
	}
	
	public void setPronombreObjetos(List<PronombreObjeto> newPronombreObjetos) {
		this.pronombreobjetos = newPronombreObjetos;
	}
	
	
	
	
}


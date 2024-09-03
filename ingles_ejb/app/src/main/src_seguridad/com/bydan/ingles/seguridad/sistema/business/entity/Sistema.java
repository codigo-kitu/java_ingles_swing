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
package com.bydan.ingles.seguridad.sistema.business.entity;

import java.io.Serializable;
import java.io.File;

import java.sql.Timestamp;
import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Date;





import com.bydan.framework.ingles.business.entity.*;
import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.framework.ingles.business.data.ConstantesSql;
//import com.bydan.framework.ingles.business.entity.Mensajes;
import com.bydan.framework.ingles.util.Constantes;
import com.bydan.framework.ingles.util.ConstantesValidacion;
//import com.bydan.ingles.seguridad.util.SistemaConstantesFunciones;
import com.bydan.ingles.seguridad.sistema.util.*;

//FK


//REL

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.paquete.business.entity.Paquete;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;







@SuppressWarnings("unused")
public class Sistema extends Sistema_add implements Serializable ,Cloneable {//SistemaAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient Sistema sistemaOriginal;
	
	private Map<String, Object> map_Sistema;
	
	public void inicializarMap_Sistema() {
		this.map_Sistema = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Sistema_util.S_REGEX_CODIGO,message=Sistema_util.S_MENSAJE_REGEX_CODIGO)
	private String codigo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=100,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Sistema_util.S_REGEX_NOMBRE_PRINCIPAL,message=Sistema_util.S_MENSAJE_REGEX_NOMBRE_PRINCIPAL)
	private String nombre_principal;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=100,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Sistema_util.S_REGEX_NOMBRE_SECUNDARIO,message=Sistema_util.S_MENSAJE_REGEX_NOMBRE_SECUNDARIO)
	private String nombre_secundario;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean estado;
			
	
	
	
	
	
	public List<Perfil> perfils;
	public List<Opcion> opcions;
	public List<Paquete> paquetes;
	public List<Modulo> modulos;
		
	public Sistema () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.sistemaOriginal=this;
		
 		this.codigo="";
 		this.nombre_principal="";
 		this.nombre_secundario="";
 		this.estado=false;
		
		
		
		
		
		
		this.perfils=null;
		this.opcions=null;
		this.paquetes=null;
		this.modulos=null;
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public Sistema (Long id,Date versionRow,String codigo,String nombre_principal,String nombre_secundario,Boolean estado) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.sistemaOriginal=this;
		
 		this.codigo=codigo;
 		this.nombre_principal=nombre_principal;
 		this.nombre_secundario=nombre_secundario;
 		this.estado=estado;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public Sistema (String codigo,String nombre_principal,String nombre_secundario,Boolean estado) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.sistemaOriginal=this;
		
 		this.codigo=codigo;
 		this.nombre_principal=nombre_principal;
 		this.nombre_secundario=nombre_secundario;
 		this.estado=estado;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		Sistema sistemaLocal=null;
		
		if(object!=null) {
			sistemaLocal=(Sistema)object;
			
			if(sistemaLocal!=null) {
				if(this.getId()!=null && sistemaLocal.getId()!=null) {
					if(this.getId().equals(sistemaLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!Sistema_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=Sistema_util.getSistemaDescripcion(this);
		} else {
			sDetalle=Sistema_util.getSistemaDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public Sistema getSistemaOriginal() {
		return this.sistemaOriginal;
	}
	
	public void setSistemaOriginal(Sistema sistema) {
		try {
			this.sistemaOriginal=sistema;
		} catch(Exception e) {
			;
		}
	}
	
	
	protected Sistema_add sistemaAdditional=null;
	
	public Sistema_add getSistemaAdditional() {
		return this.sistemaAdditional;
	}
	
	public void setSistemaAdditional(Sistema_add sistemaAdditional) {
		try {
			this.sistemaAdditional=sistemaAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public String getcodigo() {
		return this.codigo;
	}
    
	
	public String getnombre_principal() {
		return this.nombre_principal;
	}
    
	
	public String getnombre_secundario() {
		return this.nombre_secundario;
	}
    
	
	public Boolean getestado() {
		return this.estado;
	}
	
    
	public void setcodigo(String newcodigo)throws Exception
	{
		try {
			if(this.codigo!=newcodigo) {
				if(newcodigo==null) {
					//newcodigo="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Sistema:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("Sistema:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
				}

				this.codigo=newcodigo;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre_principal(String newnombre_principal)throws Exception
	{
		try {
			if(this.nombre_principal!=newnombre_principal) {
				if(newnombre_principal==null) {
					//newnombre_principal="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Sistema:Valor nulo no permitido en columna nombre_principal");
					}
				}

				if(newnombre_principal!=null&&newnombre_principal.length()>100) {
					newnombre_principal=newnombre_principal.substring(0,98);
					System.out.println("Sistema:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna nombre_principal");
				}

				this.nombre_principal=newnombre_principal;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre_secundario(String newnombre_secundario)throws Exception
	{
		try {
			if(this.nombre_secundario!=newnombre_secundario) {
				if(newnombre_secundario==null) {
					//newnombre_secundario="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Sistema:Valor nulo no permitido en columna nombre_secundario");
					}
				}

				if(newnombre_secundario!=null&&newnombre_secundario.length()>100) {
					newnombre_secundario=newnombre_secundario.substring(0,98);
					System.out.println("Sistema:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna nombre_secundario");
				}

				this.nombre_secundario=newnombre_secundario;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setestado(Boolean newestado)throws Exception
	{
		try {
			if(this.estado!=newestado) {
				if(newestado==null) {
					//newestado=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Sistema:Valor nulo no permitido en columna estado");
					}
				}

				this.estado=newestado;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	
	public List<Perfil> getPerfils() {
		return this.perfils;
	}

	public List<Opcion> getOpcions() {
		return this.opcions;
	}

	public List<Paquete> getPaquetes() {
		return this.paquetes;
	}

	public List<Modulo> getModulos() {
		return this.modulos;
	}

	
	
	public  void  setPerfils(List<Perfil> perfils) {
		try {
			this.perfils=perfils;
		} catch(Exception e) {
			;
		}
	}

	public  void  setOpcions(List<Opcion> opcions) {
		try {
			this.opcions=opcions;
		} catch(Exception e) {
			;
		}
	}

	public  void  setPaquetes(List<Paquete> paquetes) {
		try {
			this.paquetes=paquetes;
		} catch(Exception e) {
			;
		}
	}

	public  void  setModulos(List<Modulo> modulos) {
		try {
			this.modulos=modulos;
		} catch(Exception e) {
			;
		}
	}

	
	/*PARA REPORTES*/
	String estado_descripcion="";
	
	
	
	public String getestado_descripcion() {
		return estado_descripcion;
	}
	
	
	public void setestado_descripcion(String newestado_descripcion)throws Exception {
		try {
			this.estado_descripcion=newestado_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	
	public void inicializarVariablesParaReporte() {
		
		this.estado_descripcion="";
	}
	
	
	Object perfilsDescripcionReporte;
	Object opcionsDescripcionReporte;
	Object paquetesDescripcionReporte;
	Object modulosDescripcionReporte;
	
	
	public Object getperfilsDescripcionReporte() {
		return perfilsDescripcionReporte;
	}

	public Object getopcionsDescripcionReporte() {
		return opcionsDescripcionReporte;
	}

	public Object getpaquetesDescripcionReporte() {
		return paquetesDescripcionReporte;
	}

	public Object getmodulosDescripcionReporte() {
		return modulosDescripcionReporte;
	}

	
	
	public  void  setperfilsDescripcionReporte(Object perfils) {
		try {
			this.perfilsDescripcionReporte=perfils;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setopcionsDescripcionReporte(Object opcions) {
		try {
			this.opcionsDescripcionReporte=opcions;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setpaquetesDescripcionReporte(Object paquetes) {
		try {
			this.paquetesDescripcionReporte=paquetes;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setmodulosDescripcionReporte(Object modulos) {
		try {
			this.modulosDescripcionReporte=modulos;
		} catch(Exception ex) {
			;
		}
	}

	/*PARA REPORTES FIN*/
	
	public Object clone() {
        return super.clone();
    }

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long newId) {
		if(this.id!=newId) {
			this.isChanged=true;
		}
		
		this.id=newId;
		super.setId(newId);
	}
	

	public Date getVersionRow(){
		//ESTO SIEMPRE SE EJECUTA CUANDO SE CONSUME EJB
		return this.versionRow;
	}
	
	public void setVersionRow(Date newVersionRow){
		if(this.versionRow!=newVersionRow){
			//LE COMENTO PORQUE CUANDO HAGO GET SIEMPRE POR ESTO LE PONE isChanged=true
			//this.isChanged=true;
		}
		
		this.versionRow=newVersionRow;
		super.setVersionRow(newVersionRow);
	}
	
	public String getsVersionRow() {
		return sVersionRow;
	}

	public void setsVersionRow(String sVersionRow) {
		this.sVersionRow = sVersionRow;
		
		super.setsVersionRow(sVersionRow);
	}
	
	public boolean getIsNew() {
		return this.isNew;
	}
	
	public void setIsNew(boolean newIsNew) {
		this.isNew=newIsNew;
		super.setIsNew(newIsNew);
	}
	
	public boolean getIsChanged() {
		return this.isChanged;
	}
	
	public void setIsChanged(boolean newIsChanged) {
		this.isChanged=newIsChanged;
		super.setIsChanged(newIsChanged);
	}
	
	public boolean getIsDeleted() {
		return this.isDeleted;
	}
	
	public void setIsDeleted(boolean newIsDeleted) {
		this.isDeleted=newIsDeleted;
		super.setIsDeleted(newIsDeleted);
	}
	
	public boolean getIsSelected() {
		return this.isSelected;
	}
	
	public void setIsSelected(boolean newIsSelected) {
		this.isSelected=newIsSelected;
		super.setIsSelected(newIsSelected);
	}
	
	public String getsType() {
		return this.sType;
	}
	
	public void setsType(String sType) {
		this.sType=sType;
		super.setsType(sType);
	}

	public Map<String, Object> getMap_Sistema() {
		return map_Sistema;
	}

	public void setMap_Sistema(Map<String, Object> map_Sistema) {
		this.map_Sistema = map_Sistema;
	}

	public void setMapValue_Sistema(String sKey,Object oValue) {
		this.map_Sistema.put(sKey, oValue);
	}
	
	public Object getMapValue_Sistema(String sKey) {
		return this.map_Sistema.get(sKey);
	}
}


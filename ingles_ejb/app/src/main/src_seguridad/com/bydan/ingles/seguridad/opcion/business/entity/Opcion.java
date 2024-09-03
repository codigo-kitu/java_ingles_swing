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
package com.bydan.ingles.seguridad.opcion.business.entity;

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
//import com.bydan.ingles.seguridad.util.OpcionConstantesFunciones;
import com.bydan.ingles.seguridad.opcion.util.*;

//FK

import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;

//REL

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.campo.business.entity.Campo;







@SuppressWarnings("unused")
public class Opcion extends GeneralEntity implements Serializable ,Cloneable {//OpcionAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient Opcion opcionOriginal;
	
	private Map<String, Object> map_Opcion;
	
	public void inicializarMap_Opcion() {
		this.map_Opcion = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_sistema;
	
	//@Expose
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	private Long id_opcion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Opcion_util.S_REGEX_CODIGO,message=Opcion_util.S_MENSAJE_REGEX_CODIGO)
	private String codigo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Opcion_util.S_REGEX_NOMBRE,message=Opcion_util.S_MENSAJE_REGEX_NOMBRE)
	private String nombre;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=5,fraction=0,message=ConstantesValidacion.S_VALIDACION_SMALLINT)
	private Short posicion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=150,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Opcion_util.S_REGEX_ICON_NAME,message=Opcion_util.S_MENSAJE_REGEX_ICON_NAME)
	private String icon_name;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=100,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=Opcion_util.S_REGEX_NOMBRE_CLASE,message=Opcion_util.S_MENSAJE_REGEX_NOMBRE_CLASE)
	private String nombre_clase;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Opcion_util.S_REGEX_MODULO,message=Opcion_util.S_MENSAJE_REGEX_MODULO)
	private String modulo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=Opcion_util.S_REGEX_SUB_MODULO,message=Opcion_util.S_MENSAJE_REGEX_SUB_MODULO)
	private String sub_modulo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=200,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=Opcion_util.S_REGEX_PAQUETE,message=Opcion_util.S_MENSAJE_REGEX_PAQUETE)
	private String paquete;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean es_para_menu;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean es_guardar_relaciones;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean con_mostrar_acciones_campo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean estado;
			
	
	public Sistema sistema;
	public Opcion opcion;
	
	
	private String sistema_descripcion;
	private String opcion_descripcion;
	
	
	public List<Perfil> perfils;
	public List<Opcion> opcions;
	public List<Accion> accions;
	public List<PerfilOpcion> perfilopcions;
	public List<Campo> campos;
		
	public Opcion () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.opcionOriginal=this;
		
 		this.id_sistema=-1L;
 		this.id_opcion=null;
 		this.codigo="";
 		this.nombre="";
 		this.posicion=Short.parseShort("0");
 		this.icon_name="";
 		this.nombre_clase="";
 		this.modulo="";
 		this.sub_modulo="";
 		this.paquete="";
 		this.es_para_menu=false;
 		this.es_guardar_relaciones=false;
 		this.con_mostrar_acciones_campo=false;
 		this.estado=false;
		
		
		this.sistema=null;
		
		
		this.sistema_descripcion="";
		
		
		this.perfils=null;
		this.opcions=null;
		this.accions=null;
		this.perfilopcions=null;
		this.campos=null;
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public Opcion (Long id,Date versionRow,Long id_sistema,Long id_opcion,String codigo,String nombre,Short posicion,String icon_name,String nombre_clase,String modulo,String sub_modulo,String paquete,Boolean es_para_menu,Boolean es_guardar_relaciones,Boolean con_mostrar_acciones_campo,Boolean estado) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.opcionOriginal=this;
		
 		this.id_sistema=id_sistema;
 		this.id_opcion=id_opcion;
 		this.codigo=codigo;
 		this.nombre=nombre;
 		this.posicion=posicion;
 		this.icon_name=icon_name;
 		this.nombre_clase=nombre_clase;
 		this.modulo=modulo;
 		this.sub_modulo=sub_modulo;
 		this.paquete=paquete;
 		this.es_para_menu=es_para_menu;
 		this.es_guardar_relaciones=es_guardar_relaciones;
 		this.con_mostrar_acciones_campo=con_mostrar_acciones_campo;
 		this.estado=estado;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public Opcion (Long id_sistema,Long id_opcion,String codigo,String nombre,Short posicion,String icon_name,String nombre_clase,String modulo,String sub_modulo,String paquete,Boolean es_para_menu,Boolean es_guardar_relaciones,Boolean con_mostrar_acciones_campo,Boolean estado) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.opcionOriginal=this;
		
 		this.id_sistema=id_sistema;
 		this.id_opcion=id_opcion;
 		this.codigo=codigo;
 		this.nombre=nombre;
 		this.posicion=posicion;
 		this.icon_name=icon_name;
 		this.nombre_clase=nombre_clase;
 		this.modulo=modulo;
 		this.sub_modulo=sub_modulo;
 		this.paquete=paquete;
 		this.es_para_menu=es_para_menu;
 		this.es_guardar_relaciones=es_guardar_relaciones;
 		this.con_mostrar_acciones_campo=con_mostrar_acciones_campo;
 		this.estado=estado;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		Opcion opcionLocal=null;
		
		if(object!=null) {
			opcionLocal=(Opcion)object;
			
			if(opcionLocal!=null) {
				if(this.getId()!=null && opcionLocal.getId()!=null) {
					if(this.getId().equals(opcionLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!Opcion_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=Opcion_util.getOpcionDescripcion(this);
		} else {
			sDetalle=Opcion_util.getOpcionDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public Opcion getOpcionOriginal() {
		return this.opcionOriginal;
	}
	
	public void setOpcionOriginal(Opcion opcion) {
		try {
			this.opcionOriginal=opcion;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_sistema() {
		return this.id_sistema;
	}
    
	
	public Long getid_opcion() {
		return this.id_opcion;
	}
    
	
	public String getcodigo() {
		return this.codigo;
	}
    
	
	public String getnombre() {
		return this.nombre;
	}
    
	
	public Short getposicion() {
		return this.posicion;
	}
    
	
	public String geticon_name() {
		return this.icon_name;
	}
    
	
	public String getnombre_clase() {
		return this.nombre_clase;
	}
    
	
	public String getmodulo() {
		return this.modulo;
	}
    
	
	public String getsub_modulo() {
		return this.sub_modulo;
	}
    
	
	public String getpaquete() {
		return this.paquete;
	}
    
	
	public Boolean getes_para_menu() {
		return this.es_para_menu;
	}
    
	
	public Boolean getes_guardar_relaciones() {
		return this.es_guardar_relaciones;
	}
    
	
	public Boolean getcon_mostrar_acciones_campo() {
		return this.con_mostrar_acciones_campo;
	}
    
	
	public Boolean getestado() {
		return this.estado;
	}
	
    
	public void setid_sistema(Long newid_sistema)throws Exception
	{
		try {
			if(this.id_sistema!=newid_sistema) {
				if(newid_sistema==null) {
					//newid_sistema=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Opcion:Valor nulo no permitido en columna id_sistema");
					}
				}

				this.id_sistema=newid_sistema;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_opcion(Long newid_opcion) {
		if(this.id_opcion==null&&newid_opcion!=null) {
			this.id_opcion=newid_opcion;
				this.setIsChanged(true);
		}

		if(this.id_opcion!=null&&!this.id_opcion.equals(newid_opcion)) {

			this.id_opcion=newid_opcion;
				this.setIsChanged(true);
		}
	}
    
	public void setcodigo(String newcodigo)throws Exception
	{
		try {
			if(this.codigo!=newcodigo) {
				if(newcodigo==null) {
					//newcodigo="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Opcion:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("Opcion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
				}

				this.codigo=newcodigo;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre(String newnombre)throws Exception
	{
		try {
			if(this.nombre!=newnombre) {
				if(newnombre==null) {
					//newnombre="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Opcion:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>50) {
					newnombre=newnombre.substring(0,48);
					System.out.println("Opcion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna nombre");
				}

				this.nombre=newnombre;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setposicion(Short newposicion)throws Exception
	{
		try {
			if(this.posicion!=newposicion) {
				if(newposicion==null) {
					//newposicion=Short.parseShort("0");
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Opcion:Valor nulo no permitido en columna posicion");
					}
				}

				this.posicion=newposicion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void seticon_name(String newicon_name)throws Exception
	{
		try {
			if(this.icon_name!=newicon_name) {
				if(newicon_name==null) {
					//newicon_name="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Opcion:Valor nulo no permitido en columna icon_name");
					}
				}

				if(newicon_name!=null&&newicon_name.length()>150) {
					newicon_name=newicon_name.substring(0,148);
					System.out.println("Opcion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna icon_name");
				}

				this.icon_name=newicon_name;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre_clase(String newnombre_clase)throws Exception
	{
		try {
			if(this.nombre_clase!=newnombre_clase) {
				if(newnombre_clase==null) {
					//newnombre_clase="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Opcion:Valor nulo no permitido en columna nombre_clase");
					}
				}

				if(newnombre_clase!=null&&newnombre_clase.length()>100) {
					newnombre_clase=newnombre_clase.substring(0,98);
					System.out.println("Opcion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna nombre_clase");
				}

				this.nombre_clase=newnombre_clase;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setmodulo(String newmodulo)throws Exception
	{
		try {
			if(this.modulo!=newmodulo) {
				if(newmodulo==null) {
					//newmodulo="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Opcion:Valor nulo no permitido en columna modulo");
					}
				}

				if(newmodulo!=null&&newmodulo.length()>50) {
					newmodulo=newmodulo.substring(0,48);
					System.out.println("Opcion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna modulo");
				}

				this.modulo=newmodulo;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setsub_modulo(String newsub_modulo)throws Exception
	{
		try {
			if(this.sub_modulo!=newsub_modulo) {
				if(newsub_modulo==null) {
					//newsub_modulo="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Opcion:Valor nulo no permitido en columna sub_modulo");
					}
				}

				if(newsub_modulo!=null&&newsub_modulo.length()>50) {
					newsub_modulo=newsub_modulo.substring(0,48);
					System.out.println("Opcion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna sub_modulo");
				}

				this.sub_modulo=newsub_modulo;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setpaquete(String newpaquete)throws Exception
	{
		try {
			if(this.paquete!=newpaquete) {
				if(newpaquete==null) {
					//newpaquete="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Opcion:Valor nulo no permitido en columna paquete");
					}
				}

				if(newpaquete!=null&&newpaquete.length()>200) {
					newpaquete=newpaquete.substring(0,198);
					System.out.println("Opcion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=200 en columna paquete");
				}

				this.paquete=newpaquete;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setes_para_menu(Boolean newes_para_menu)throws Exception
	{
		try {
			if(this.es_para_menu!=newes_para_menu) {
				if(newes_para_menu==null) {
					//newes_para_menu=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Opcion:Valor nulo no permitido en columna es_para_menu");
					}
				}

				this.es_para_menu=newes_para_menu;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setes_guardar_relaciones(Boolean newes_guardar_relaciones)throws Exception
	{
		try {
			if(this.es_guardar_relaciones!=newes_guardar_relaciones) {
				if(newes_guardar_relaciones==null) {
					//newes_guardar_relaciones=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Opcion:Valor nulo no permitido en columna es_guardar_relaciones");
					}
				}

				this.es_guardar_relaciones=newes_guardar_relaciones;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcon_mostrar_acciones_campo(Boolean newcon_mostrar_acciones_campo)throws Exception
	{
		try {
			if(this.con_mostrar_acciones_campo!=newcon_mostrar_acciones_campo) {
				if(newcon_mostrar_acciones_campo==null) {
					//newcon_mostrar_acciones_campo=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Opcion:Valor nulo no permitido en columna con_mostrar_acciones_campo");
					}
				}

				this.con_mostrar_acciones_campo=newcon_mostrar_acciones_campo;
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
						System.out.println("Opcion:Valor nulo no permitido en columna estado");
					}
				}

				this.estado=newestado;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public Sistema getSistema() {
		return this.sistema;
	}

	public Opcion getOpcion() {
		return this.opcion;
	}

	
	
	public String getsistema_descripcion() {
		return this.sistema_descripcion;
	}

	public String getopcion_descripcion() {
		return this.opcion_descripcion;
	}

	
	
	public  void  setSistema(Sistema sistema) {
		try {
			this.sistema=sistema;
		} catch(Exception e) {
			;
		}
	}


	public  void  setOpcion(Opcion opcion) {
		try {
			this.opcion=opcion;
		} catch(Exception e) {
			;
		}
	}


	
	
	public  void  setsistema_descripcion(String sistema_descripcion) {
		try {
			this.sistema_descripcion=sistema_descripcion;
		} catch(Exception e) {
			;
		}
	}


	public  void  setopcion_descripcion(String opcion_descripcion) {
		try {
			this.opcion_descripcion=opcion_descripcion;
		} catch(Exception e) {
			;
		}
	}


	
	
	public List<Perfil> getPerfils() {
		return this.perfils;
	}

	public List<Opcion> getOpcions() {
		return this.opcions;
	}

	public List<Accion> getAccions() {
		return this.accions;
	}

	public List<PerfilOpcion> getPerfilOpcions() {
		return this.perfilopcions;
	}

	public List<Campo> getCampos() {
		return this.campos;
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

	public  void  setAccions(List<Accion> accions) {
		try {
			this.accions=accions;
		} catch(Exception e) {
			;
		}
	}

	public  void  setPerfilOpcions(List<PerfilOpcion> perfilopcions) {
		try {
			this.perfilopcions=perfilopcions;
		} catch(Exception e) {
			;
		}
	}

	public  void  setCampos(List<Campo> campos) {
		try {
			this.campos=campos;
		} catch(Exception e) {
			;
		}
	}

	
	/*PARA REPORTES*/
	String id_sistema_descripcion="";
	String id_opcion_descripcion="";
	String es_para_menu_descripcion="";
	String es_guardar_relaciones_descripcion="";
	String con_mostrar_acciones_campo_descripcion="";
	String estado_descripcion="";
	
	
	
	public String getid_sistema_descripcion() {
		return id_sistema_descripcion;
	}
	public String getid_opcion_descripcion() {
		return id_opcion_descripcion;
	}
	public String getes_para_menu_descripcion() {
		return es_para_menu_descripcion;
	}
	public String getes_guardar_relaciones_descripcion() {
		return es_guardar_relaciones_descripcion;
	}
	public String getcon_mostrar_acciones_campo_descripcion() {
		return con_mostrar_acciones_campo_descripcion;
	}
	public String getestado_descripcion() {
		return estado_descripcion;
	}
	
	
	public void setid_sistema_descripcion(String newid_sistema_descripcion)throws Exception {
		try {
			this.id_sistema_descripcion=newid_sistema_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setid_opcion_descripcion(String newid_opcion_descripcion) {
		this.id_opcion_descripcion=newid_opcion_descripcion;
	}
	public void setes_para_menu_descripcion(String newes_para_menu_descripcion)throws Exception {
		try {
			this.es_para_menu_descripcion=newes_para_menu_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setes_guardar_relaciones_descripcion(String newes_guardar_relaciones_descripcion)throws Exception {
		try {
			this.es_guardar_relaciones_descripcion=newes_guardar_relaciones_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setcon_mostrar_acciones_campo_descripcion(String newcon_mostrar_acciones_campo_descripcion)throws Exception {
		try {
			this.con_mostrar_acciones_campo_descripcion=newcon_mostrar_acciones_campo_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setestado_descripcion(String newestado_descripcion)throws Exception {
		try {
			this.estado_descripcion=newestado_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	
	public void inicializarVariablesParaReporte() {
		
		this.id_sistema_descripcion="";
		this.id_opcion_descripcion="";
		this.es_para_menu_descripcion="";
		this.es_guardar_relaciones_descripcion="";
		this.con_mostrar_acciones_campo_descripcion="";
		this.estado_descripcion="";
	}
	
	
	Object perfilsDescripcionReporte;
	Object opcionsDescripcionReporte;
	Object accionsDescripcionReporte;
	Object perfilopcionsDescripcionReporte;
	Object camposDescripcionReporte;
	
	
	public Object getperfilsDescripcionReporte() {
		return perfilsDescripcionReporte;
	}

	public Object getopcionsDescripcionReporte() {
		return opcionsDescripcionReporte;
	}

	public Object getaccionsDescripcionReporte() {
		return accionsDescripcionReporte;
	}

	public Object getperfilopcionsDescripcionReporte() {
		return perfilopcionsDescripcionReporte;
	}

	public Object getcamposDescripcionReporte() {
		return camposDescripcionReporte;
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

	public  void  setaccionsDescripcionReporte(Object accions) {
		try {
			this.accionsDescripcionReporte=accions;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setperfilopcionsDescripcionReporte(Object perfilopcions) {
		try {
			this.perfilopcionsDescripcionReporte=perfilopcions;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setcamposDescripcionReporte(Object campos) {
		try {
			this.camposDescripcionReporte=campos;
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

	public Map<String, Object> getMap_Opcion() {
		return map_Opcion;
	}

	public void setMap_Opcion(Map<String, Object> map_Opcion) {
		this.map_Opcion = map_Opcion;
	}

	public void setMapValue_Opcion(String sKey,Object oValue) {
		this.map_Opcion.put(sKey, oValue);
	}
	
	public Object getMapValue_Opcion(String sKey) {
		return this.map_Opcion.get(sKey);
	}
}


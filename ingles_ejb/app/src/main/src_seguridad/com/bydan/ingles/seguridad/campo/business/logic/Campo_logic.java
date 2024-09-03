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
package com.bydan.ingles.seguridad.campo.business.logic;


import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.sql.SQLException;
import java.util.Date;
import java.util.Calendar;



import java.util.logging.Logger;


//VALIDACION

import com.bydan.framework.ConstantesCommon;
import com.bydan.framework.ingles.business.entity.GeneralEntityLogic;
import com.bydan.framework.ingles.business.entity.Classe;
import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.framework.ingles.business.entity.DatoGeneralMinimo;
import com.bydan.framework.ingles.business.entity.DatoGeneralMaximo;
import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;
import com.bydan.ingles.seguridad.campo.util.*;
import com.bydan.ingles.seguridad.campo.util.Campo_util;
import com.bydan.ingles.seguridad.campo.util.Campo_param_return;
//import com.bydan.ingles.seguridad.campo.util.CampoParameterGeneral;
import com.bydan.ingles.seguridad.campo.business.entity.Campo;
//import com.bydan.ingles.seguridad.campo.business.logic.Campo_logic_add;
import com.bydan.ingles.seguridad.campo.business.data.*;
import com.bydan.ingles.seguridad.campo.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.business.data.Opcion_data;
import com.bydan.ingles.seguridad.opcion.business.logic.Opcion_logic;

//REL


import com.bydan.ingles.seguridad.perfilcampo.business.entity.PerfilCampo;
import com.bydan.ingles.seguridad.perfilcampo.business.data.PerfilCampo_data;
import com.bydan.ingles.seguridad.perfilcampo.business.logic.PerfilCampo_logic;
import com.bydan.ingles.seguridad.perfilcampo.util.PerfilCampo_util;

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.data.Perfil_data;
import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;

//REL DETALLES











@SuppressWarnings({"unused"})
public class Campo_logic  extends GeneralEntityLogic implements Campo_logicI {
	static Logger logger = Logger.getLogger("Campo_logic.class");	

	protected Campo_data campoDataAccess; 	
	protected Campo campo;
	protected List<Campo> campos;
	protected Object campoObject;	
	protected List<Object> camposObject;
	
	public ArrayList<Object> invalidValues=new ArrayList<Object>();
	
	public StringBuilder stringBuilder=new StringBuilder();
	public Boolean conMostrarMensajesStringBuilder=true;
		
	/*
	protected ArrayList<DatoGeneral> arrDatoGeneral;
	protected Connexion connexion;
	protected DatosCliente datosCliente;
	protected ConnexionType connexionType;
	protected ParameterDbType parameterDbType;
	protected EntityManagerFactory entityManagerFactory;
	
	protected DatosDeep datosDeep;
	protected Boolean isConDeep=false;
	*/
	
	
	
	
	
	
	public Campo_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.campoDataAccess = new Campo_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			Campo_data.ActualizarQueries();
			
			//this.campoDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.campos= new ArrayList<Campo>();
			this.campo= new Campo();
			
			this.campoObject=new Object();
			this.camposObject=new ArrayList<Object>();
				
			/*
			this.connexion=new Connexion();
			this.datosCliente=new DatosCliente();
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			
			//INICIALIZA PARAMETROS CONEXION
			this.connexionType=Constantes.CONNEXIONTYPE;
			this.parameterDbType=Constantes.PARAMETERDBTYPE;
			
			if(Constantes.CONNEXIONTYPE.equals(ConnexionType.HIBERNATE)) {
				this.entityManagerFactory=ConstantesCommon.JPAENTITYMANAGERFACTORY;
			}
			
			this.datosDeep=new DatosDeep();
			this.isConDeep=false;
			*/
			
			this.campoDataAccess.setConnexionType(this.connexionType);
			this.campoDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public Campo_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.campoDataAccess = new Campo_data();
			this.campos= new ArrayList<Campo>();
			this.campo= new Campo();
			this.campoObject=new Object();
			this.camposObject=new ArrayList<Object>();
			
			/*
			this.datosCliente=new DatosCliente();
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			
			//INICIALIZA PARAMETROS CONEXION
			this.connexionType=Constantes.CONNEXIONTYPE;
			this.parameterDbType=Constantes.PARAMETERDBTYPE;
			
			if(Constantes.CONNEXIONTYPE.equals(ConnexionType.HIBERNATE)) {
				this.entityManagerFactory=ConstantesCommon.JPAENTITYMANAGERFACTORY;
			}
			
			this.datosDeep=new DatosDeep();
			this.isConDeep=false;
			*/
			
			this.campoDataAccess.setConnexionType(this.connexionType);
			this.campoDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public Campo getCampo() throws Exception {	
		//Campo_logic_add.checkCampoToGet(campo,this.datosCliente,this.arrDatoGeneral);
		//Campo_logic_add.updateCampoToGet(campo,this.arrDatoGeneral);
		
		return campo;
	}
	
	public List<Campo> getCampos() throws Exception {		
		if(this.campos==null) {
			this.campos= new ArrayList<Campo>();
		}
		
		this.quitarsNulos();
		
		//Campo_logic_add.checkCampoToGets(campos,this.datosCliente,this.arrDatoGeneral);
		
		for (Campo campoLocal: campos ) {
			//Campo_logic_add.updateCampoToGet(campoLocal,this.arrDatoGeneral);
		}
		
		return campos;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.campoDataAccess!=null) {
			this.campoDataAccess.setDatosCliente(datosCliente);
		}
	}
			
	public void setDatosDeepParametros(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String strTituloMensaje) {
		this.datosDeep.setIsDeep(isDeep);
		this.datosDeep.setDeepLoadType(deepLoadType);
		this.datosDeep.setClases(clases);
		this.datosDeep.setSTituloMensaje(strTituloMensaje);
	}
	
			
	
	public void getNewConnexionToDeep()throws Exception {
		//this.getNewConnexionToDeep();
		try	{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,"");
			
			this.connexion.begin();
			
		} catch(SQLException e) {
			Funciones.manageException(logger,e);
			throw e;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public void getNewConnexionToDeep(String sDetalle)throws Exception {
		try	{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,sDetalle);
			
			this.connexion.begin();
			
		} catch(SQLException e) {
			Funciones.manageException(logger,e);
			throw e;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public void commitNewConnexionToDeep()throws Exception {
		try	{
			if(this.connexion!=null) {
				this.connexion.commit();
			}
			
		} catch(SQLException e) {
			Funciones.manageException(logger,e);
			throw e;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public void rollbackNewConnexionToDeep()throws Exception {
		try	{
			if(this.connexion!=null) {
				this.connexion.rollback();
			}
			
		} catch(SQLException e) {
			Funciones.manageException(logger,e);
			throw e;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public void closeNewConnexionToDeep()throws Exception {
		try	{
			if(this.connexion!=null) {
				this.connexion.close();
			}
			
		} 
		catch(SQLException e) {
			Funciones.manageException(logger,e);
			throw e;
			
		} 
		catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public void executeQueryWithConnection(String sQueryExecute) throws Exception {
		try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			campoDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
			this.connexion.commit();
						
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
	}
	
	public void executeQuery(String sQueryExecute) throws Exception {
		try {			
			campoDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		campo = new  Campo();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			campo=campoDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.campo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Campo_util.refrescarFKsDescripciones(this.campo);
			}
			
			this.connexion.commit();
						
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
	}
	
	public void getEntity(Long id) throws Exception {
		campo = new  Campo();
		  		  
        try {
			
			campo=campoDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.campo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Campo_util.refrescarFKsDescripciones(this.campo);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		campo = new  Campo();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			campo=campoDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.campo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Campo_util.refrescarFKsDescripciones(this.campo);
			}
			
			this.connexion.commit();
						
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
	}
	
	public void getEntityWithConnection(String sFinalQuery) throws Exception {
		campo = new  Campo();
		  		  
        try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			this.getEntityWithConnection(queryWhereSelectParameters);
			
		} catch(Exception e) {
			throw e;
			
      	} finally {
					
		}
	}
	
	public void getEntity(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		campo = new  Campo();
		  		  
        try {
			
			campo=campoDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.campo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Campo_util.refrescarFKsDescripciones(this.campo);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		campo = new  Campo();
		  		  
        try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			this.getEntity(queryWhereSelectParameters);
			
		} catch(Exception e) {
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		campo = new  Campo();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =campoDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
		
		return datoGeneralMinimo;
	}
	
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		campo = new  Campo();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=campoDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		campo = new  Campo();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =campoDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		campo = new  Campo();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=campoDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		campo = new  Campo();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =campoDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
		
		return datoGeneralMaximos;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		campo = new  Campo();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=campoDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		campos = new  ArrayList<Campo>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			Campo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			campos=campoDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(campos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Campo_util.refrescarFKsDescripciones(this.campos);
			}
			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
	}
	
	public void getEntitiesWithConnection(String sFinalQuery)throws Exception {	
		campos = new  ArrayList<Campo>();
		  		  
        try {
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			this.getEntitiesWithConnection(queryWhereSelectParameters);    	       	 
			
		} catch(Exception e) {
			throw e;
			
      	} finally {
		}
	}
	
	public void getEntities(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		campos = new  ArrayList<Campo>();
		  		  
        try {			
			Campo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			campos=campoDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(campos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Campo_util.refrescarFKsDescripciones(this.campos);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		campos = new  ArrayList<Campo>();
		  		  
        try {			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			this.getEntities(queryWhereSelectParameters);    	       	 			
		
		} catch(Exception e) {	
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntitiesWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		campos = new  ArrayList<Campo>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			Campo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			campos=campoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(campos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Campo_util.refrescarFKsDescripciones(this.campos);
			}
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();				
		}
	}
	
	public void getEntities(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		campos = new  ArrayList<Campo>();
		  		  
        try {
			Campo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			campos=campoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(campos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Campo_util.refrescarFKsDescripciones(this.campos);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	/**
	* Trae cualquier tipo de query select
	* @conMapGenerico  Si es true, trae todo como objeto generico, Si es false trae query en campos de la clase, usando unicamente los determinados en listColumns y deepLoadType
	* @deepLoadType  Si conMapGenerico es false trae query select con las columnas de listColumns, incluyento o excludendo deacuerdo a deepLoadType
	*/
	public void getEntitiesWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		campos = new  ArrayList<Campo>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Campo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			campos=campoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(campos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Campo_util.refrescarFKsDescripciones(this.campos);
			}
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();				
		}
	}
	
	public void getEntities(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		campos = new  ArrayList<Campo>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Campo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			campos=campoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(campos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Campo_util.refrescarFKsDescripciones(this.campos);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		campo = new  Campo();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Campo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			campo=campoDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(campo);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Campo_util.refrescarFKsDescripciones(this.campo);
			}
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();				
		}
	}
	
	public void getEntity(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		campo = new  Campo();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Campo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			campo=campoDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(campo);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Campo_util.refrescarFKsDescripciones(this.campo);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		campos = new  ArrayList<Campo>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			Campo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			campos=campoDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(campos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Campo_util.refrescarFKsDescripciones(this.campos);
			}
			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();				
		}
	}
	
	public void getEntitiesSimpleQueryBuild(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		campos = new  ArrayList<Campo>();
		  		  
        try {
			Campo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			campos=campoDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(campos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Campo_util.refrescarFKsDescripciones(this.campos);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		campos = new  ArrayList<Campo>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Campo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			campos=campoDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(campos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Campo_util.refrescarFKsDescripciones(this.campos);
			}
			
			this.connexion.commit();			
			
		} catch(Exception e) {	
			this.connexion.rollback();			
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();				
		}		
	}
	
	public void  getTodos(String sFinalQuery,Pagination pagination)throws Exception {
		campos = new  ArrayList<Campo>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Campo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			campos=campoDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(campos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Campo_util.refrescarFKsDescripciones(this.campos);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(Campo campo) throws Exception {
		Boolean estaValidado=false;
		
		if(campo.getIsNew() || campo.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<Campo> Campos) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(Campo campoLocal:campos) {				
			estaValidadoObjeto=this.validarGuardar(campoLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<Campo> Campos) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(campos)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(Campo Campo) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(campo)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(Campo campo) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+campo.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"campo","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(Campo_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(Campo_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//Campo_logic_add.checkCampoToSave(this.campo,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Campo_logic_add.updateCampoToSave(this.campo,this.arrDatoGeneral);
			
			Campo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.campo,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Campo_util.permiteMantenimiento(this.campo) && this.validarGuardar(this.campo)) {
				Campo_data.save(this.campo, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.campo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.campo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Campo_util.refrescarFKsDescripciones(this.campo);				
			}

			//Campo_logic_add.checkCampoToSaveAfter(this.campo,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.campo.getIsDeleted()) {
				this.campo=null;
			}
			
		} catch(Exception e) {
			this.connexion.rollback();			
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
	}
	
	public void save()throws Exception {	
		try {	
			
			//Campo_logic_add.checkCampoToSave(this.campo,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Campo_logic_add.updateCampoToSave(this.campo,this.arrDatoGeneral);
			
			Campo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.campo,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Campo_util.permiteMantenimiento(this.campo) && this.validarGuardar(this.campo)) {			
				Campo_data.save(this.campo, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.campo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.campo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Campo_util.refrescarFKsDescripciones(this.campo);				
			}
			
			//Campo_logic_add.checkCampoToSaveAfter(this.campo,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.campo.getIsDeleted()) {
				this.campo=null;
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void savesWithConnection()throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//Campo_logic_add.checkCampoToSaves(campos,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosCampo=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Campo campoLocal:campos) {		
				
				if(!Campo_util.permiteMantenimiento(campoLocal)) {
					continue;
				}
				
				//Campo_logic_add.updateCampoToSave(campoLocal,this.arrDatoGeneral);
	        	
				Campo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),campoLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(campoLocal)) {
					Campo_data.save(campoLocal, connexion);				
				} else {
					validadoTodosCampo=false;
				}
			}
			
			if(!validadoTodosCampo) {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSaves(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(), this.datosDeep.getSTituloMensaje());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Campo_util.refrescarFKsDescripciones(this.campos);
			}
			
			//Campo_logic_add.checkCampoToSavesAfter(campos,this.datosCliente,connexion,this.arrDatoGeneral);
					
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRows();
			
			this.connexion.commit();		
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			this.connexion.rollback();			
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();				
		}
	}
	
	public void saves()throws Exception {				
		 try {	
			//Campo_logic_add.checkCampoToSaves(campos,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosCampo=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Campo campoLocal:campos) {				
				if(!Campo_util.permiteMantenimiento(campoLocal)) {
					continue;
				}
				
				//Campo_logic_add.updateCampoToSave(campoLocal,this.arrDatoGeneral);
	        	
				Campo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),campoLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(campoLocal)) {				
					Campo_data.save(campoLocal, connexion);				
				} else {
					validadoTodosCampo=false;
				}
			}
			
			if(!validadoTodosCampo) {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSaves(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(), this.datosDeep.getSTituloMensaje());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Campo_util.refrescarFKsDescripciones(this.campos);
			}

			//Campo_logic_add.checkCampoToSavesAfter(campos,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Campo_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Campo> campos,Campo_param_return campoParameterGeneral)throws Exception {
		 try {	
			Campo_param_return campoReturnGeneral=new Campo_param_return();
	
			
			return campoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Campo_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Campo> campos,Campo_param_return campoParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			Campo_param_return campoReturnGeneral=new Campo_param_return();
	
			
			this.connexion.commit();
			
			return campoReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Campo_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Campo> campos,Campo campo,Campo_param_return campoParameterGeneral,Boolean isEsNuevoCampo,ArrayList<Classe> clases)throws Exception {
		 try {	
			Campo_param_return campoReturnGeneral=new Campo_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				campoReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return campoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public Campo_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Campo> campos,Campo campo,Campo_param_return campoParameterGeneral,Boolean isEsNuevoCampo,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			Campo_param_return campoReturnGeneral=new Campo_param_return();
	
			campoReturnGeneral.setCampo(campo);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				campoReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return campoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Campo_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,Campo_param_return campoParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			Campo_param_return campoReturnGeneral=new Campo_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.campos=new ArrayList<Campo>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.campo=new Campo();
				
				
				if(conColumnasBase) {this.campo.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.campo.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.campo.setcodigo(arrColumnas[iColumn++]);
				this.campo.setnombre(arrColumnas[iColumn++]);
			this.campo.setdescripcion(arrColumnas[iColumn++]);
				this.campo.setestado(Boolean.parseBoolean(arrColumnas[iColumn++]));
				
				this.campos.add(this.campo);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			campoReturnGeneral.setConRetornoEstaProcesado(true);
			campoReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return campoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<Campo> camposAux= new ArrayList<Campo>();
		
		for(Campo campo:campos) {
			if(!campo.getIsDeleted()) {
				camposAux.add(campo);
			}
		}
		
		campos=camposAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<Campo> camposAux= new ArrayList<Campo>();
		
		for(Campo campo : this.campos) {
			if(campo==null) {
				camposAux.add(campo);
			}
		}
		
		//this.campos=camposAux;
		
		this.campos.removeAll(camposAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(campo.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((campo.getIsDeleted() || (campo.getIsChanged()&&!campo.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=campoDataAccess.getSetVersionRow(connexion,campo.getId());
				
				if(!campo.getVersionRow().equals(timestamp)) {	
					campo.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				campo.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(campo.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((campo.getIsDeleted() || (campo.getIsChanged()&&!campo.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=campoDataAccess.getSetVersionRow(connexion,campo.getId());
			
			try {							
				if(!campo.getVersionRow().equals(timestamp)) {	
					campo.setVersionRow(timestamp);
				}
				
				campo.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(campos!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(Campo campoAux:campos) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(campoAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(campoAux.getIsDeleted() || (campoAux.getIsChanged()&&!campoAux.getIsNew())) {
						
						timestamp=campoDataAccess.getSetVersionRow(connexion,campoAux.getId());
						
						if(!campo.getVersionRow().equals(timestamp)) {	
							campoAux.setVersionRow(timestamp);
						}
								
						campoAux.setIsChangedAuxiliar(false);														
					//}
				}
				
				this.connexion.commit();									
				
			} catch(Exception e) {
				this.connexion.rollback();							
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRows()throws Exception {	
		if(campos!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(Campo campoAux:campos) {
					if(campoAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(campoAux.getIsDeleted() || (campoAux.getIsChanged()&&!campoAux.getIsNew())) {
						
						timestamp=campoDataAccess.getSetVersionRow(connexion,campoAux.getId());
						
						if(!campoAux.getVersionRow().equals(timestamp)) {	
							campoAux.setVersionRow(timestamp);
						}
						
													
						campoAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public Campo_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalOpcion) throws Exception {
		Campo_param_return  campo_return =new Campo_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-cargarCombosLoteForeignKeyCampoWithConnection");
			
			this.connexion.begin();
			
			campo_return =new Campo_param_return();
			
			

			List<Opcion> opcionsForeignKey=new ArrayList<Opcion>();
			Opcion_logic opcionLogic=new Opcion_logic();
			opcionLogic.setConnexion(this.connexion);
			opcionLogic.getOpcionDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalOpcion.equals("NONE")) {
				opcionLogic.getTodos(finalQueryGlobalOpcion,new Pagination());
				opcionsForeignKey=opcionLogic.getOpcions();
			}

			campo_return.setopcionsFK(opcionsForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return campo_return;
	}
	
	public Campo_param_return cargarCombosLoteFK(String finalQueryGlobalOpcion) throws Exception {
		Campo_param_return  campo_return =new Campo_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			campo_return =new Campo_param_return();
			
			

			List<Opcion> opcionsForeignKey=new ArrayList<Opcion>();
			Opcion_logic opcionLogic=new Opcion_logic();
			opcionLogic.setConnexion(this.connexion);
			opcionLogic.getOpcionDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalOpcion.equals("NONE")) {
				opcionLogic.getTodos(finalQueryGlobalOpcion,new Pagination());
				opcionsForeignKey=opcionLogic.getOpcions();
			}

			campo_return.setopcionsFK(opcionsForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return campo_return;
	}
	
	public void cargarRelacionesLoteFKWithConnection() throws Exception {
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		
			PerfilCampo_logic perfilcampoLogic=new PerfilCampo_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-cargarRelacionesLoteForeignKeyCampoWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(PerfilCampo.class));
											
			

			perfilcampoLogic.setConnexion(this.getConnexion());
			perfilcampoLogic.setDatosCliente(this.datosCliente);
			perfilcampoLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(Campo campo:this.campos) {
				

				classes=new ArrayList<Classe>();
				classes=PerfilCampo_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				perfilcampoLogic.setPerfilCampos(campo.perfilcampos);
				perfilcampoLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			}
			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
	}
	
	public void deepLoad(Campo campo,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//Campo_logic_add.updateCampoToGet(campo,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		campo.setOpcion(campoDataAccess.getOpcion(connexion,campo));
		campo.setPerfilCampos(campoDataAccess.getPerfilCampos(connexion,campo));
		campo.setPerfils(campoDataAccess.getPerfils(connexion,campo));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Opcion.class)) {
				campo.setOpcion(campoDataAccess.getOpcion(connexion,campo));
				continue;
			}

			if(clas.clas.equals(PerfilCampo.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				campo.setPerfilCampos(campoDataAccess.getPerfilCampos(connexion,campo));

				if(this.isConDeep) {
					PerfilCampo_logic perfilcampoLogic= new PerfilCampo_logic(this.connexion);
					perfilcampoLogic.setPerfilCampos(campo.getPerfilCampos());
					ArrayList<Classe> classesLocal=PerfilCampo_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					perfilcampoLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					PerfilCampo_util.refrescarFKsDescripciones(perfilcampoLogic.getPerfilCampos());
					campo.setPerfilCampos(perfilcampoLogic.getPerfilCampos());
				}

				continue;
			}

			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				campo.setPerfils(campoDataAccess.getPerfils(connexion,campo));

				if(this.isConDeep) {
					Perfil_logic perfilLogic= new Perfil_logic(this.connexion);
					perfilLogic.setPerfils(campo.getPerfils());
					ArrayList<Classe> classesLocal=Perfil_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					perfilLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Perfil_util.refrescarFKsDescripciones(perfilLogic.getPerfils());
					campo.setPerfils(perfilLogic.getPerfils());
				}

				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Opcion.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			campo.setOpcion(campoDataAccess.getOpcion(connexion,campo));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(PerfilCampo.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(PerfilCampo.class));
			campo.setPerfilCampos(campoDataAccess.getPerfilCampos(connexion,campo));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Perfil.class));
			campo.setPerfils(campoDataAccess.getPerfils(connexion,campo));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		campo.setOpcion(campoDataAccess.getOpcion(connexion,campo));
		Opcion_logic opcionLogic= new Opcion_logic(connexion);
		opcionLogic.deepLoad(campo.getOpcion(),isDeep,deepLoadType,clases);
				

		campo.setPerfilCampos(campoDataAccess.getPerfilCampos(connexion,campo));

		for(PerfilCampo perfilcampo:campo.getPerfilCampos()) {
			PerfilCampo_logic perfilcampoLogic= new PerfilCampo_logic(connexion);
			perfilcampoLogic.deepLoad(perfilcampo,isDeep,deepLoadType,clases);
		}

		campo.setPerfils(campoDataAccess.getPerfils(connexion,campo));

		for(Perfil perfil:campo.getPerfils()) {
			Perfil_logic perfilLogic= new Perfil_logic(connexion);
			perfilLogic.deepLoad(perfil,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Opcion.class)) {
				campo.setOpcion(campoDataAccess.getOpcion(connexion,campo));
				Opcion_logic opcionLogic= new Opcion_logic(connexion);
				opcionLogic.deepLoad(campo.getOpcion(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(PerfilCampo.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				campo.setPerfilCampos(campoDataAccess.getPerfilCampos(connexion,campo));

				for(PerfilCampo perfilcampo:campo.getPerfilCampos()) {
					PerfilCampo_logic perfilcampoLogic= new PerfilCampo_logic(connexion);
					perfilcampoLogic.deepLoad(perfilcampo,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				campo.setPerfils(campoDataAccess.getPerfils(connexion,campo));

				for(Perfil perfil:campo.getPerfils()) {
					Perfil_logic perfilLogic= new Perfil_logic(connexion);
					perfilLogic.deepLoad(perfil,isDeep,deepLoadType,clases);
				}
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Opcion.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			campo.setOpcion(campoDataAccess.getOpcion(connexion,campo));
			Opcion_logic opcionLogic= new Opcion_logic(connexion);
			opcionLogic.deepLoad(campo.getOpcion(),isDeep,deepLoadType,clases);
				
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(PerfilCampo.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(PerfilCampo.class));
			campo.setPerfilCampos(campoDataAccess.getPerfilCampos(connexion,campo));

			for(PerfilCampo perfilcampo:campo.getPerfilCampos()) {
				PerfilCampo_logic perfilcampoLogic= new PerfilCampo_logic(connexion);
				perfilcampoLogic.deepLoad(perfilcampo,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Perfil.class));
			campo.setPerfils(campoDataAccess.getPerfils(connexion,campo));

			for(Perfil perfil:campo.getPerfils()) {
				Perfil_logic perfilLogic= new Perfil_logic(connexion);
				perfilLogic.deepLoad(perfil,isDeep,deepLoadType,clases);
			}
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(Campo campo,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//Campo_logic_add.updateCampoToSave(campo,this.arrDatoGeneral);
			
Campo_data.save(campo, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Opcion_data.save(campo.getOpcion(),connexion);

		for(PerfilCampo perfilcampo:campo.getPerfilCampos()) {
			perfilcampo.setid_campo(campo.getId());
			PerfilCampo_data.save(perfilcampo,connexion);
		}

		for(Perfil perfil:campo.getPerfils()) {
			Perfil_data.save(perfil,connexion);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Opcion.class)) {
				Opcion_data.save(campo.getOpcion(),connexion);
				continue;
			}


			if(clas.clas.equals(PerfilCampo.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(PerfilCampo perfilcampo:campo.getPerfilCampos()) {
					perfilcampo.setid_campo(campo.getId());
					PerfilCampo_data.save(perfilcampo,connexion);
				}
				continue;
			}

			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Perfil perfil:campo.getPerfils()) {
					Perfil_data.save(perfil,connexion);
				}
				continue;
			}
		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Opcion_data.save(campo.getOpcion(),connexion);
		Opcion_logic opcionLogic= new Opcion_logic(connexion);
		opcionLogic.deepLoad(campo.getOpcion(),isDeep,deepLoadType,clases);
				

		for(PerfilCampo perfilcampo:campo.getPerfilCampos()) {
			PerfilCampo_logic perfilcampoLogic= new PerfilCampo_logic(connexion);
			perfilcampo.setid_campo(campo.getId());
			PerfilCampo_data.save(perfilcampo,connexion);
			perfilcampoLogic.deepSave(perfilcampo,isDeep,deepLoadType,clases);
		}

		for(Perfil perfil:campo.getPerfils()) {
			Perfil_logic perfilLogic= new Perfil_logic(connexion);
			Perfil_data.save(perfil,connexion);
			perfilLogic.deepSave(perfil,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Opcion.class)) {
				Opcion_data.save(campo.getOpcion(),connexion);
				Opcion_logic opcionLogic= new Opcion_logic(connexion);
				opcionLogic.deepSave(campo.getOpcion(),isDeep,deepLoadType,clases);				
				continue;
			}


			if(clas.clas.equals(PerfilCampo.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(PerfilCampo perfilcampo:campo.getPerfilCampos()) {
					PerfilCampo_logic perfilcampoLogic= new PerfilCampo_logic(connexion);
					perfilcampo.setid_campo(campo.getId());
					PerfilCampo_data.save(perfilcampo,connexion);
					perfilcampoLogic.deepSave(perfilcampo,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Perfil perfil:campo.getPerfils()) {
					Perfil_logic perfilLogic= new Perfil_logic(connexion);
					Perfil_data.save(perfil,connexion);
					perfilLogic.deepSave(perfil,isDeep,deepLoadType,clases);
				}
				continue;
			}
		}
	}

	}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}	
	}
	
	public void deepLoadWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Campo.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(campo,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Campo_util.refrescarFKsDescripciones(campo);
			}
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			this.closeNewConnexionToDeep();
  		}
	}
	
	public void deepLoad(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.deepLoad(this.campo,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Campo_util.refrescarFKsDescripciones(this.campo);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Campo.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(campos!=null) {
				for(Campo campo:campos) {
					this.deepLoad(campo,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					Campo_util.refrescarFKsDescripciones(campos);
				}
			}
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			this.closeNewConnexionToDeep();
  		}
	}
	
	public void deepLoads(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {			
			if(campos!=null) {
				for(Campo campo:campos) {
					this.deepLoad(campo,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					Campo_util.refrescarFKsDescripciones(campos);
				}	
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
		
	public void deepSaveWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {	
			this.getNewConnexionToDeep(Campo.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(campo,isDeep,deepLoadType,clases);	
			
			this.connexion.commit();
		} catch(Exception e) {			
			this.connexion.rollback();
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			this.closeNewConnexionToDeep();
  		}
	}
	
	public void deepSavesWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {			
			this.getNewConnexionToDeep(Campo.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(campos!=null) {
				for(Campo campo:campos) {
					this.deepSave(campo,isDeep,deepLoadType,clases);
				}
			}
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			Funciones.manageException(logger,e);
			throw e;
			
  		}finally {
			this.closeNewConnexionToDeep();
  		}
	}
	
	public void deepSaves(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {	
			if(campos!=null) {
				for(Campo campo:campos) {
					this.deepSave(campo,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsFK_IdOpcionWithConnection(String sFinalQuery,Pagination pagination,Long id_opcion)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Campo.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidOpcion= new ParameterSelectionGeneral();
			parameterSelectionGeneralidOpcion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_opcion,Campo_util.IDOPCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidOpcion);

			Campo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdOpcion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			campos=campoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Campo_util.refrescarFKsDescripciones(this.campos);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdOpcion(String sFinalQuery,Pagination pagination,Long id_opcion)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidOpcion= new ParameterSelectionGeneral();
			parameterSelectionGeneralidOpcion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_opcion,Campo_util.IDOPCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidOpcion);

			Campo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdOpcion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			campos=campoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Campo_util.refrescarFKsDescripciones(this.campos);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,String sProcesoBusqueda,String sDetalleProcesoBusqueda,QueryWhereSelectParameters queryWhereSelectParameters,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		//Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		//auditoriaLogicAdditional.setConnexion(connexion);
		//AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Campo_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				//auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,CampoDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,Campo campo,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		//Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		//auditoriaLogicAdditional.setConnexion(connexion);
		//AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Campo_util.IS_CON_AUDITORIA) {
				if(campo.getIsNew()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,CampoDataAccess.TABLENAME, campo.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Campo_util.IS_CON_AUDITORIA_DETALLE) {
						//Campo_logic.registrarAuditoriaDetalles(connexion,campo,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(campo.getIsDeleted()) {
					/*if(!campo.getIsExpired()) {
						//auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,CampoDataAccess.TABLENAME, campo.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						//Campo_logic.registrarAuditoriaDetalles(connexion,campo,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,CampoDataAccess.TABLENAME, campo.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(campo.getIsChanged()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,CampoDataAccess.TABLENAME, campo.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Campo_util.IS_CON_AUDITORIA_DETALLE) {
						//Campo_logic.registrarAuditoriaDetalles(connexion,campo,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,Campo campo)throws Exception {		
		//AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		//auditoriaDetalleLogicAdditional.setConnexion(connexion);
		//AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(campo.getIsNew()||!campo.getid_opcion().equals(campo.getCampoOriginal().getid_opcion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(campo.getCampoOriginal().getid_opcion()!=null)
				{
					strValorActual=campo.getCampoOriginal().getid_opcion().toString();
				}
				if(campo.getid_opcion()!=null)
				{
					strValorNuevo=campo.getid_opcion().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),CampoConstantesFunciones.IDOPCION,strValorActual,strValorNuevo);
			}	
			
			if(campo.getIsNew()||!campo.getcodigo().equals(campo.getCampoOriginal().getcodigo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(campo.getCampoOriginal().getcodigo()!=null)
				{
					strValorActual=campo.getCampoOriginal().getcodigo();
				}
				if(campo.getcodigo()!=null)
				{
					strValorNuevo=campo.getcodigo() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),CampoConstantesFunciones.CODIGO,strValorActual,strValorNuevo);
			}	
			
			if(campo.getIsNew()||!campo.getnombre().equals(campo.getCampoOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(campo.getCampoOriginal().getnombre()!=null)
				{
					strValorActual=campo.getCampoOriginal().getnombre();
				}
				if(campo.getnombre()!=null)
				{
					strValorNuevo=campo.getnombre() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),CampoConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
			
			if(campo.getIsNew()||!campo.getdescripcion().equals(campo.getCampoOriginal().getdescripcion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(campo.getCampoOriginal().getdescripcion()!=null)
				{
					strValorActual=campo.getCampoOriginal().getdescripcion();
				}
				if(campo.getdescripcion()!=null)
				{
					strValorNuevo=campo.getdescripcion() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),CampoConstantesFunciones.DESCRIPCION,strValorActual,strValorNuevo);
			}	
			
			if(campo.getIsNew()||!campo.getestado().equals(campo.getCampoOriginal().getestado()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(campo.getCampoOriginal().getestado()!=null)
				{
					strValorActual=campo.getCampoOriginal().getestado().toString();
				}
				if(campo.getestado()!=null)
				{
					strValorNuevo=campo.getestado().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),CampoConstantesFunciones.ESTADO,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(Campo campo,List<PerfilCampo> perfilcampos) throws Exception {

		if(!campo.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(campo,perfilcampos,true);
		}
	}

	public void saveRelaciones(Campo campo,List<PerfilCampo> perfilcampos)throws Exception {

		if(!campo.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(campo,perfilcampos,false);
		}
	}

	public void saveRelacionesBase(Campo campo,List<PerfilCampo> perfilcampos,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("Campo-saveRelacionesWithConnection");}
	
			campo.setPerfilCampos(perfilcampos);

			this.setCampo(campo);

			if(true) {

				//Campo_logic_add.updateRelacionesToSave(campo,this);

				if((campo.getIsNew()||campo.getIsChanged())&&!campo.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles(perfilcampos);

				} else if(campo.getIsDeleted()) {
					this.saveRelacionesDetalles(perfilcampos);
					this.save();
				}

				//Campo_logic_add.updateRelacionesToSaveAfter(campo,this);

			} else {
				throw new Exception("LOS DATOS SON INVALIDOS");
			}

			if(conConexion) {this.connexion.commit();}

		} catch(Exception e) {
			
			PerfilCampo_util.InicializarGeneralEntityAuxiliares(perfilcampos,true,true);

			if(conConexion){this.connexion.rollback();}
			Funciones.manageException(logger,e);
			throw e;

		} finally {
			if(conConexion){this.closeNewConnexionToDeep();}
		}
	}
	
	
	private void saveRelacionesDetalles(List<PerfilCampo> perfilcampos)throws Exception {
		try {
	

			Long idCampoActual=this.getCampo().getId();

			PerfilCampo_logic perfilcampoLogic_Desde_Campo=new PerfilCampo_logic();
			perfilcampoLogic_Desde_Campo.setPerfilCampos(perfilcampos);

			perfilcampoLogic_Desde_Campo.setConnexion(this.getConnexion());
			perfilcampoLogic_Desde_Campo.setDatosCliente(this.datosCliente);

			for(PerfilCampo perfilcampo_Desde_Campo:perfilcampoLogic_Desde_Campo.getPerfilCampos()) {
				perfilcampo_Desde_Campo.setid_campo(idCampoActual);
			}

			perfilcampoLogic_Desde_Campo.saves();

		} catch(Exception e) {


			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Campo_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Campo_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setCampo(Campo newCampo) {
		this.campo = newCampo;
	}
	
	public Campo_data getCampoDataAccess() {
		return campoDataAccess;
	}
	
	public void setCampoDataAccess(Campo_data newcampoDataAccess) {
		this.campoDataAccess = newcampoDataAccess;
	}

	public void setCampos(List<Campo> newCampos) {
		this.campos = newCampos;
	}
	
	public Object getCampoObject() {	
		this.campoObject=this.campoDataAccess.getEntityObject();
		return this.campoObject;
	}
		
	public void setCampoObject(Object newCampoObject) {
		this.campoObject = newCampoObject;
	}
	
	public List<Object> getCamposObject() {		
		this.camposObject=this.campoDataAccess.getEntitiesObject();
		return this.camposObject;
	}
		
	public void setCamposObject(List<Object> newCamposObject) {
		this.camposObject = newCamposObject;
	}
	
	/*
	public Connexion getConnexion() {
		return this.connexion;		
	}
	
	public void setConnexion(Connexion newConnexion) {
		this.connexion=newConnexion;		
	}
	
	public DatosCliente getDatosCliente() {
		return datosCliente;
	}
	*/

	/*
	public DatosDeep getDatosDeep() {
		return this.datosDeep;
	}

	public void setDatosDeep(DatosDeep datosDeep) {
		this.datosDeep = datosDeep;
	}
	
	public void setDatosDeepFromDatosCliente() {
		this.datosDeep = this.datosCliente.getDatosDeep();
		this.isConDeep=this.datosCliente.getIsConDeep();
	}
	
	public Boolean getIsConDeep() {
		return this.isConDeep;
	}

	public void setIsConDeep(Boolean isConDeep) {
		this.isConDeep = isConDeep;
	}
	
	public ArrayList<DatoGeneral> getArrDatoGeneral() {
		return arrDatoGeneral;
	}

	public void setArrDatoGeneral(ArrayList<DatoGeneral> arrDatoGeneral) {
		this.arrDatoGeneral = arrDatoGeneral;
	}
	
	public ConnexionType getConnexionType() {
		return connexionType;
	}

	public void setConnexionType(ConnexionType connexionType) {
		this.connexionType = connexionType;
	}


	public ParameterDbType getParameterDbType() {
		return parameterDbType;
	}

	public void setParameterDbType(ParameterDbType parameterDbType) {
		this.parameterDbType = parameterDbType;
	}

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}
	*/
	

	public StringBuilder getStringBuilder() {
		return this.stringBuilder;
	}

	public void setStringBuilder(StringBuilder stringBuilder) {
		this.stringBuilder = stringBuilder;
	}
	
	public Boolean getConMostrarMensajesStringBuilder() {
		return this.conMostrarMensajesStringBuilder;
	}

	public void setConMostrarMensajesStringBuilder(Boolean conMostrarMensajesStringBuilder) {
		this.conMostrarMensajesStringBuilder = conMostrarMensajesStringBuilder;
	}	

}

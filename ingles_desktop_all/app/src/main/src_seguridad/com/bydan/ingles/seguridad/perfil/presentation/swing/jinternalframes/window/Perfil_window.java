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
package com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.window;

import com.bydan.ingles.seguridad.perfil.presentation.web.jsf.sessionbean.*;//;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.auxiliar.*;

//FK


import com.bydan.ingles.seguridad.sistema.presentation.web.jsf.sessionbean.*;
import com.bydan.ingles.seguridad.sistema.presentation.swing.jinternalframes.control.*;

//REL


import com.bydan.ingles.seguridad.perfilaccion.business.entity.PerfilAccion;
import com.bydan.ingles.seguridad.perfilaccion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilaccion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilaccion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfilcampo.business.entity.PerfilCampo;
import com.bydan.ingles.seguridad.perfilcampo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilcampo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilcampo.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.accion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.accion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.accion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.campo.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.usuario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.opcion.presentation.web.jsf.sessionbean.*;


//import com.bydan.ingles.seguridad.presentation.report.source.*;


import com.bydan.framework.ingles.business.entity.Reporte;

import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.ParametroGeneralSg;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

import com.bydan.ingles.seguridad.sistema.util.Sistema_param_return;



import com.bydan.ingles.seguridad.perfil.business.entity.*;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;

import com.bydan.ingles.seguridad.perfil.business.logic.*;
import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.framework.ingles.business.entity.OrderBy;
import com.bydan.framework.ingles.business.entity.Mensajes;
import com.bydan.framework.ingles.business.entity.Classe;
import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.presentation.desktop.swing.DateConverter;
import com.bydan.framework.ingles.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.ingles.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.ingles.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.ingles.presentation.desktop.swing.*;
import com.bydan.framework.ingles.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings({ "unused", "deprecation" }) //, "deprecation"
public class Perfil_window extends JInternalFrameBase {	
	private static final long serialVersionUID = 1L;
	//public Usuario usuarioActual=null;	
	
		
	
		
	
	
	public JPanel jContentPane = null;
	
	public JPanel jPanelBusquedasParametros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	public GridBagLayout gridaBagLayout;//;	
	public GridBagConstraints gridBagConstraints;//;	
	
	//public JInternalFrameBase jFrameParent;
	
	public Perfil_form_window jFrameDetalleForm;//_form;		
	
	
	public ReporteDinamicoJInternalFrame jFrameReporteDinamico;	
	public ImportacionJInternalFrame jFrameImportacion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	public Sistema_control_window sistemaBeanSwingJFrame;
	public String sFinalQueryGeneral_sistema="";
	
	public Perfil_session perfil_session;
		
	
	
	public Sistema_session sistema_session;
	
	//public JDesktopPane jDesktopPane;
	public List<Perfil> perfils;		
	public List<Perfil> perfilsEliminados;	
	public List<Perfil> perfilsAux;
	
	
		
	public OrderByJInternalFrame jFrameOrderBy;		
	//public JButton jButtonAbrirOrderBy;
	
	
	//public JPanel jPanelOrderBy;
	//public JScrollPane jScrollPanelOrderBy;	
	//public JButton jButtonCerrarOrderBy;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public Perfil_logic perfilLogic;
	
	
	
	public JScrollPane jScrollPanelDatos;
	public JScrollPane jScrollPanelDatosEdicion;
	public JScrollPane jScrollPanelDatosGeneral;
    
	
	
	//public JScrollPane jScrollPanelDatosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamico;
	//public JScrollPane jScrollPanelImportacion;
	
	
	
	
    //public JPanel jPanelPaginacion;
    //public JPanel jPanelParametrosReportes;
	//public JPanel jPanelParametrosReportesAcciones;
	
	
	
	
	
	;
	
	
		
	//protected JPanel jPanelParametrosAuxiliar1;
	//protected JPanel jPanelParametrosAuxiliar2;
	//protected JPanel jPanelParametrosAuxiliar3;
	//protected JPanel jPanelParametrosAuxiliar4;	
	//protected JPanel jPanelParametrosAuxiliar5;
	
	
	
	//protected JPanel jPanelReporteDinamico;
	//protected JPanel jPanelImportacion;
	
	
	public JTable tableDatos;
	
	
	
	//public JTable jTableDatosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
   
	
	//protected JButton jButtonGenerarReporteDinamico;
	//protected JButton jButtonCerrarReporteDinamico;
	//protected JButton jButtonGenerarExcelReporteDinamico;	
			
	//protected JButton jButtonAbrirImportacion;
	//protected JButton jButtonGenerarImportacion;
	//protected JButton jButtonCerrarImportacion;
	//protected JFileChooser jFileChooserImportacion;
	//protected File fileImportacion;
	
	
	
	//TOOLBAR
	
	
		
		
	
	//TOOLBAR
	
	
	//MENU
	
	
	
	
	//MENU
	
	
	
	//protected JLabel jLabelAcciones;	
	
	   
	//protected JCheckBox jCheckBoxSeleccionarTodos;
	//protected JCheckBox jCheckBoxSeleccionados;
	
	
	//protected JCheckBox jCheckBoxConAltoMaximoTabla;
	//protected JCheckBox jCheckBoxConGraficoReporte;
	//@SuppressWarnings("rawtypes")
    //protected JComboBoxMe jComboBoxTiposArchivosReportes;
	//@SuppressWarnings("rawtypes")
    //protected JComboBoxMe jComboBoxTiposReportes;
			//@SuppressWarnings("rawtypes")
			//protected JComboBox jComboBoxTiposArchivosReportesDinamico;
			//@SuppressWarnings("rawtypes")
			//protected JComboBox jComboBoxTiposReportesDinamico;
	//@SuppressWarnings("rawtypes")
    //protected JComboBoxMe jComboBoxTiposGraficosReportes;
	//@SuppressWarnings("rawtypes")
	//protected JComboBoxMe jComboBoxTiposPaginacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBoxMe jComboBoxTiposRelaciones;
	//@SuppressWarnings("rawtypes")
	//protected JComboBoxMe jComboBoxTiposAcciones;
	//@SuppressWarnings("rawtypes")
	//protected JComboBoxMe jComboBoxTiposSeleccionar;
	//protected JTextField jTextFieldValorCampoGeneral;s	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedas;
	public JPanel pnl_BusquedaPorNombre;
	public JButton btn_BusquedaPorNombre;
	public JPanel pnl_BusquedaPorNombre2;
	public JButton btn_BusquedaPorNombre2;
	public JPanel pnl_FK_IdSistema;
	public JButton btn_FK_IdSistema;
	
	public JPanel pnlnombreBusquedaPorNombre;
	public JLabel lbl_nombreBusquedaPorNombre;
	public JTextField txf_nombreBusquedaPorNombre;
	public JButton btn_nombreBusquedaPorNombre_Busqueda= new JButton();

	
	public JPanel pnlnombre2BusquedaPorNombre2;
	public JLabel lbl_nombre2BusquedaPorNombre2;
	public JTextArea txa_nombre2BusquedaPorNombre2;
	public JButton btn_nombre2BusquedaPorNombre2_Busqueda= new JButton();

	
	public JPanel pnlid_sistemaFK_IdSistema;
	public JLabel lbl_id_sistemaFK_IdSistema;
	public JComboBoxMe cmb_id_sistemaFK_IdSistema;
	public JButton btn_id_sistemaFK_IdSistema= new JButton();
	public JButton btn_id_sistemaFK_IdSistema_Update= new JButton();
	public JButton btn_id_sistemaFK_IdSistema_Busqueda= new JButton();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String S_TIPO_TAMANIO_GENERAL="NORMAL";
	public static String S_TIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
	
	//Esto va en DetalleForm
	//public int iHeightFormularioMaximo=0;
	//public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
	
	/*
	double start=(double)System.currentTimeMillis();	
	double end=0;
	double dif=0;
	
	end=(double)System.currentTimeMillis();			
	dif=end - start;			
	start=(double)System.currentTimeMillis();	
	System.out.println("Tiempo(ms) Carga TEST 1_2 DetalleMovimientoInventario: " + dif);		
	*/
	
	public Sistema_param_return sistemaReturn;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public Perfil_window() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Perfil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Perfil_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Perfil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.IS_DEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.IS_DEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		
	
	public Perfil_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Perfil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Perfil_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Perfil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public JInternalFrameBase getJFrameParent() {
		return jFrameParent;
	}

	public void setJFrameParent(JInternalFrameBase internalFrameParent)	{
		jFrameParent = internalFrameParent;
	}
	
	
	
	
	
	
	
	
	public List<Perfil> getperfils() {
		return this.perfils;
	}

	public void setperfils(List<Perfil> perfils) {
		this.perfils = perfils;
	}
	
	public List<Perfil> getperfilsAux() {
		return this.perfilsAux;
	}

	public void setperfilsAux(List<Perfil> perfilsAux) {
		this.perfilsAux = perfilsAux;
	}
	
	public List<Perfil> getperfilsEliminados() {
		return this.perfilsEliminados;
	}

	public void setPerfilsEliminados(List<Perfil> perfilsEliminados) {
		this.perfilsEliminados = perfilsEliminados;
	}
	
	
			
	public void setBorderResaltarTiposSeleccionar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.cmb_TiposSeleccionar.setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarValorCampoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.txf_ValorCampoGeneral.setBorder(borderResaltar);		
	}		
	
	
	
	public void setBorderResaltarSeleccionarTodos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.chb_SeleccionarTodos.setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarSeleccionados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.chb_Seleccionados.setBorder(borderResaltar);		
	}
	
	
	public void setBorderResaltarTiposArchivosReportes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.cmb_TiposArchivosReportes.setBorder(borderResaltar);		
	}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamico() {
	//	return jComboBoxTiposReportesDinamico;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamico(
	//		JComboBox jComboBoxTiposReportesDinamico) {
	//	this.jComboBoxTiposReportesDinamico = jComboBoxTiposReportesDinamico;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamico() {
	//	return jComboBoxTiposArchivosReportesDinamico;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamico(
	//		JComboBox jComboBoxTiposArchivosReportesDinamico) {
	//	this.jComboBoxTiposArchivosReportesDinamico = jComboBoxTiposArchivosReportesDinamico;
	//}
	
	public void setBorderResaltarTiposReportes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.cmb_TiposReportes.setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposGraficosReportes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.cmb_TiposGraficosReportes.setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposPaginacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.cmb_TiposPaginacion.setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposRelaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.cmb_TiposRelaciones.setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAcciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.cmb_TiposAcciones.setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamico {
	//	return jCheckBoxConGraficoDinamico;
	//}

	//public void setjCheckBoxConGraficoDinamico(
	//		JCheckBox jCheckBoxConGraficoDinamicoPerfil) {
	//	this.jCheckBoxConGraficoDinamicoPerfil = jCheckBoxConGraficoDinamico;
	//}	
	
	//public void setBorderResaltarConGraficoDinamico() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jPanelToolBar.toolBar.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPerfil.setBorder(borderResaltar);		
	//}
	
	
	
			
	
	
	
	
	/*
	public JDesktopPane getJDesktopPane() {
		return jDesktopPane;
	}

	public void setJDesktopPane(JDesktopPane desktopPane) {
		jDesktopPane = desktopPane;
	}
	*/
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.perfil_session=new Perfil_session();
		
		this.perfil_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.perfil_session.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.perfil_session.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=Perfil_window.S_TIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=Perfil_window.S_TIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		Perfil_window.S_TIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		Perfil_window.S_TIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		Perfil_window.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Perfil MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.perfil_session.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.I_NUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}
		
		Perfil_window.ESTA_CARGADO_PORPARTE=true;
		
		//super("Perfil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }		
		
	
	public void cargarMenus() {		
		
		//PRINCIPAL
		//this.cargarMenusGenerico();
		//PRINCIPAL_FIN
		
		this.jmenuBarPrincipal=new JMenuBarPrincipal(this,S_TIPO_TAMANIO_GENERAL,this.conCargarMinimo);
		

		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPrincipal);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
		
	@SuppressWarnings("rawtypes")	
	public void inicializarElementosBusquedas() {
		JComboBox jComboBoxAux=null;
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.pnl_BusquedaPorNombre=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.pnl_BusquedaPorNombre.setToolTipText("Buscar Por Nombre ");
		this.btn_BusquedaPorNombre= new JButton();

		FuncionesSwing.addImagenButtonGeneral(this.btn_BusquedaPorNombre,"buscar_button","Buscar","Buscar Por Nombre ");
		FuncionesSwing.setBoldButton(this.btn_BusquedaPorNombre, S_TIPO_TAMANIO_GENERAL,false,true,this);;
		FuncionesSwing.setBoldComponent(this.btn_BusquedaPorNombre, S_TIPO_TAMANIO_GENERAL,false,true,this);;
	
		lbl_nombreBusquedaPorNombre = new JLabel();
		FuncionesSwing.setLabelProp(lbl_nombreBusquedaPorNombre,"Nombre :","Nombre");
		FuncionesSwing.setLabelSize(lbl_nombreBusquedaPorNombre,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-30),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_nombreBusquedaPorNombre,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_nombreBusquedaPorNombre,this.sTipoTamanioGeneral,false,true,this);

		txf_nombreBusquedaPorNombre= new JTextField();
		FuncionesSwing.setTextFieldSize(txf_nombreBusquedaPorNombre,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_nombreBusquedaPorNombre,this.sTipoTamanioGeneral,false,true,this);



		this.pnl_BusquedaPorNombre2=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.pnl_BusquedaPorNombre2.setToolTipText("Buscar Por Nombre Alterno ");
		this.btn_BusquedaPorNombre2= new JButton();

		FuncionesSwing.addImagenButtonGeneral(this.btn_BusquedaPorNombre2,"buscar_button","Buscar","Buscar Por Nombre Alterno ");
		FuncionesSwing.setBoldButton(this.btn_BusquedaPorNombre2, S_TIPO_TAMANIO_GENERAL,false,true,this);;
		FuncionesSwing.setBoldComponent(this.btn_BusquedaPorNombre2, S_TIPO_TAMANIO_GENERAL,false,true,this);;
	
		lbl_nombre2BusquedaPorNombre2 = new JLabel();
		FuncionesSwing.setLabelProp(lbl_nombre2BusquedaPorNombre2,"Nombre Alterno :","Nombre Alterno");
		FuncionesSwing.setLabelSize(lbl_nombre2BusquedaPorNombre2,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-30),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_nombre2BusquedaPorNombre2,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_nombre2BusquedaPorNombre2,this.sTipoTamanioGeneral,false,true,this);

		txa_nombre2BusquedaPorNombre2= new JTextArea();
		FuncionesSwing.setTextAreaSize(txa_nombre2BusquedaPorNombre2,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextArea(txa_nombre2BusquedaPorNombre2,this.sTipoTamanioGeneral,false,true,this);



		this.pnl_FK_IdSistema=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.pnl_FK_IdSistema.setToolTipText("Buscar Por Sistema ");
		this.btn_FK_IdSistema= new JButton();

		FuncionesSwing.addImagenButtonGeneral(this.btn_FK_IdSistema,"buscar_button","Buscar","Buscar Por Sistema ");
		FuncionesSwing.setBoldButton(this.btn_FK_IdSistema, S_TIPO_TAMANIO_GENERAL,false,true,this);;
		FuncionesSwing.setBoldComponent(this.btn_FK_IdSistema, S_TIPO_TAMANIO_GENERAL,false,true,this);;
	
		lbl_id_sistemaFK_IdSistema = new JLabel();
		FuncionesSwing.setLabelProp(lbl_id_sistemaFK_IdSistema,"Sistema :","Sistema");
		FuncionesSwing.setLabelSize(lbl_id_sistemaFK_IdSistema,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-30),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_id_sistemaFK_IdSistema,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_id_sistemaFK_IdSistema,this.sTipoTamanioGeneral,false,true,this);

		cmb_id_sistemaFK_IdSistema= new JComboBoxMe();
		FuncionesSwing.setComboBoxSize(cmb_id_sistemaFK_IdSistema,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));
		FuncionesSwing.setBoldComboBox(cmb_id_sistemaFK_IdSistema,this.sTipoTamanioGeneral,false,true,this);




		this.jTabbedPaneBusquedas=new JTabbedPane();

		FuncionesSwing.setTabbedPaneSize(this.jTabbedPaneBusquedas,this.getWidth(),Constantes.I_SWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_TABPANE_BUSQUEDA,25));

		//this.jTabbedPaneBusquedas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedas,S_TIPO_TAMANIO_GENERAL,false,true,this);

		//INDICES BUSQUEDA_FIN		
	}
	
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	@SuppressWarnings("rawtypes")
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		JComboBox jComboBoxAux=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
		
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		//int gxy.iGridyPrincipal=0;
		
		
		//this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jFrameDetalle = new PerfilDetalle_window(paginaTipo);//JInternalFrameBase("Perfil DATOS");
			//_form
			this.jFrameDetalleForm = new Perfil_form_window(jDesktopPane,this.perfil_session.getConGuardarRelaciones(),this.perfil_session.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			//_form
			this.jFrameDetalleForm = null;//new Perfil_form_window("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayout= new GridBagLayout();//Perfil
		
		
		this.tableDatos = new JTable();      
		
		String sToolTipPerfil="";
		sToolTipPerfil=Perfil_util.S_CLASS_WEB_TITULO;
		
		if(Constantes.IS_DEVELOPING) {
			sToolTipPerfil+="(Seguridad.Perfil)";
		}
		
		if(!this.perfil_session.getEsGuardarRelacionado()) {
			sToolTipPerfil+="_"+this.opcionActual.getId();
		}
		
		this.tableDatos.setToolTipText(sToolTipPerfil);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.tableDatos);
		FuncionesSwing.setTableProp(this.tableDatos,true,Constantes.I_SWING_ALTO_FILA_TABLA + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA,true,ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(tableDatos,S_TIPO_TAMANIO_GENERAL,false,true,this);
		
		
			
		
		
		this.jScrollPanelDatos = new JScrollPane();   
        this.jScrollPanelDatosGeneral = new JScrollPane();
		
				
		
		
		this.jPanelAcciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Perfil";
		
		if(!this.perfil_session.getEsGuardarRelacionado()) {
			this.jScrollPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfiles" + this.sPath));
		} else {
			this.jScrollPanelDatos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		      
		FuncionesSwing.setPanelProp(this.jPanelAcciones,"Acciones","Acciones","Acciones");		
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneral, S_TIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatos, S_TIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			
					
		}
		
				
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jFrameOrderBy=new OrderByJInternalFrame(S_TIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfil,false,this);
			
			//this.cargarOrderBy(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jFrameOrderBy=new OrderByJInternalFrame(S_TIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfil,true,this);
			
			//this.cargarOrderBy(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.tableDatos.setMinimumSize(new Dimension(400,50));//730
		this.tableDatos.setMaximumSize(new Dimension(400,50));//730
		this.tableDatos.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatos.setPreferredSize(new Dimension(400,50));
		*/
		
		
		
		
			
		
			
		
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		//String sMapKey = "";
		//InputMap inputMap =null;
		
		
				//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        //this.jPanelParametrosReportes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelPaginacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		this.jPanelParametrosReportes = new JPanelParametrosReportes(this,"Perfil",this.parametroGeneralUsuario.getid_tipo_fondo(),S_TIPO_TAMANIO_GENERAL,this.conCargarMinimo,false,false,true);//new JPanel();
		this.jPanelParametrosReportesAcciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		this.jPanelPaginacion = new JPanelPaginacion(this,this.parametroGeneralUsuario.getid_tipo_fondo(),true,this.conCargarMinimo,this.perfil_session.getEsGuardarRelacionado(),S_TIPO_TAMANIO_GENERAL,"Perfil",PaginaTipo.PRINCIPAL,false,this.conFuncionalidadRelaciones,false);
		this.jPanelToolBar = new JPanelToolBar(this.parametroGeneralUsuario.getid_tipo_fondo(),"Perfil",PaginaTipo.PRINCIPAL,this);
		
		
		this.jPanelParametrosReportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportes.setName("jPanelParametrosReportes"); 
		
		this.jPanelParametrosReportesAcciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		this.jPanelParametrosReportesAcciones.setName("jPanelParametrosReportesAcciones"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportes, S_TIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAcciones, S_TIPO_TAMANIO_GENERAL,false,false,this);
	
		
		//this.jButtonRecargarInformacion = new JButton();		
		//FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacion,"recargar_button","Recargar","Recargar"+" "+Perfil_util.S_CLASS_WEB_TITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));		
		
		
		
		
		this.btn_ProcesarInformacion = new JButton();
		FuncionesSwing.setButtonProp(this.btn_ProcesarInformacion,"Procesar","Procesar"+" "+Perfil_util.S_CLASS_WEB_TITULO,false);
		FuncionesSwing.setButtonSize(this.btn_ProcesarInformacion,185,25);		
		
		
		
		
		
				
	
		
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		
		//RECARGAR		
		
		//HOT KEYS2
				
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelaciones.setMinimumSize(new Dimension(this.getWidth(),PerfilBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PerfilBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelaciones.setMaximumSize(new Dimension(this.getWidth(),PerfilBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PerfilBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelaciones.setPreferredSize(new Dimension(this.getWidth(),PerfilBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PerfilBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		//int iPosXAccionPaginacion=0;
		GridXy gxy=new GridXy();
		
												
																
		
		
		
		
				
				
					
		
		
		
			GridBagLayout gridaBagParametrosReportesAcciones = new GridBagLayout();
			
			this.jPanelParametrosReportesAcciones.setLayout(gridaBagParametrosReportesAcciones);
			
			//BYDAN_FALTA_1
			
			
						
			
			
						
			
			
			
										
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPerfil = new GridBagLayout();

			this.jScrollPanelDatos.setLayout(gridaBagLayoutDatosPerfil);
			
			this.gridBagConstraints = new GridBagConstraints();
			this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraints.gridy = 0;
			this.gridBagConstraints.gridx = 0;
			
			this.jScrollPanelDatos.add(this.tableDatos, this.gridBagConstraints);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatos.setViewportView(this.tableDatos);
		this.tableDatos.setFillsViewportHeight(true);
		this.tableDatos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAcciones= new GridBagLayout();
		this.jPanelAcciones.setLayout(gridaBagLayoutAcciones);
		
		
		/*	
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = 0;
		this.gridBagConstraints.gridx = 0;
			
		this.jPanelAcciones.add(this.jButtonNuevoPerfil, this.gridBagConstraints);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombrePerfil= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombrePerfil.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePerfil.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePerfil.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombrePerfil.columnWeights = new double[]{0.0, 1.0};
		pnl_BusquedaPorNombre.setLayout(gridaBagLayoutBusquedaPorNombrePerfil);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,0);
		pnl_BusquedaPorNombre.add(lbl_nombreBusquedaPorNombre, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,0);
		pnl_BusquedaPorNombre.add(txf_nombreBusquedaPorNombre, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,1);
		pnl_BusquedaPorNombre.add(btn_BusquedaPorNombre, gridBagConstraints);

		jTabbedPaneBusquedas.addTab("1.-Por Nombre ", pnl_BusquedaPorNombre);
		jTabbedPaneBusquedas.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombre2Perfil= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombre2Perfil.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombre2Perfil.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombre2Perfil.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombre2Perfil.columnWeights = new double[]{0.0, 1.0};
		pnl_BusquedaPorNombre2.setLayout(gridaBagLayoutBusquedaPorNombre2Perfil);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,0);
		pnl_BusquedaPorNombre2.add(lbl_nombre2BusquedaPorNombre2, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,0);
		pnl_BusquedaPorNombre2.add(txa_nombre2BusquedaPorNombre2, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,1);
		pnl_BusquedaPorNombre2.add(btn_BusquedaPorNombre2, gridBagConstraints);

		jTabbedPaneBusquedas.addTab("2.-Por Nombre Alterno ", pnl_BusquedaPorNombre2);
		jTabbedPaneBusquedas.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdSistemaPerfil= new GridBagLayout();
		gridaBagLayoutFK_IdSistemaPerfil.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSistemaPerfil.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSistemaPerfil.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSistemaPerfil.columnWeights = new double[]{0.0, 1.0};
		pnl_FK_IdSistema.setLayout(gridaBagLayoutFK_IdSistemaPerfil);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,0);
		pnl_FK_IdSistema.add(lbl_id_sistemaFK_IdSistema, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,0);
		pnl_FK_IdSistema.add(cmb_id_sistemaFK_IdSistema, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,1);
		pnl_FK_IdSistema.add(btn_FK_IdSistema, gridBagConstraints);

		jTabbedPaneBusquedas.addTab("3.-Por Sistema ", pnl_FK_IdSistema);
		jTabbedPaneBusquedas.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayout = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayout);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.perfil_session.getEsGuardarRelacionado()) {			
					
			this.gridBagConstraints = new GridBagConstraints();						
			//this.gridBagConstraints.fill =GridBagConstraints.VERTICAL;
			GridXy.SetGridBagPropAnchor(this.gridBagConstraints,GridBagConstraints.CENTER,0,gxy.iGridyPrincipal++);
			this.gridBagConstraints.ipadx = 100;
			
			this.jContentPane.add(this.jPanelToolBar, this.gridBagConstraints);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.gridy = gxy.iGridyPrincipal++;
		this.gridBagConstraints.gridx = 0;		
		//this.gridBagConstraints.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraints.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraints.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgress, this.gridBagConstraints);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraints = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraints.gridy = gxy.iGridyPrincipal++;
			this.gridBagConstraints.gridx = 0;		
			this.gridBagConstraints.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraints.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedas, this.gridBagConstraints);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyPrincipal++);
		
		
		this.jContentPane.add(this.jPanelParametrosReportes, this.gridBagConstraints);								
		
		
		/*
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.gridy = gxy.iGridyPrincipal++;		
		this.gridBagConstraints.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAcciones, this.gridBagConstraints);
		*/		
		
		this.gridBagConstraints = new GridBagConstraints();
		//this.gridBagConstraints.ipady =150;
		GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.BOTH,0,gxy.iGridyPrincipal++);
		this.jContentPane.add(this.jScrollPanelDatos, this.gridBagConstraints);
				
		
		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyPrincipal++);
		this.jContentPane.add(this.jPanelPaginacion, this.gridBagConstraints);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ANCHO_REL_SCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO_REL_SCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(Perfil_window.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametros = new GridBagLayout();
			this.jPanelBusquedasParametros.setLayout(gridaBagLayoutBusquedasParametros);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);						
			FuncionesSwing.setScrollPaneSize(this.jScrollPanelDatosGeneral,iWidthScroll,iHeightScroll);	
			
			this.gridBagConstraints = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
			if(!Constantes.IS_DEVELOPING) {
			} else {
				if(tieneColumnasOcultas) {
				}
			}					
			
		} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
		}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.gridy = gxy.iGridyPrincipal++;		
		this.gridBagConstraints.gridx = 0;
							
		this.jContentPane.add(this.jPanelCampos, this.gridBagConstraints);
			
			
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.gridy = gxy.iGridyPrincipal++;		
		this.gridBagConstraints.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultos, this.gridBagConstraints);
		
			
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.gridy =gxy.iGridyPrincipal++;		
		this.gridBagConstraints.gridx =0;
			
		this.jContentPane.add(this.jPanelAcciones, this.gridBagConstraints);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneral;//jContentPane;
    } 
	
	
	
	
	
	
	
	public void redimensionarTablaDatos(int iNumFilas) {
		this.redimensionarTablaDatos(iNumFilas,0);
	}
	
	public void redimensionarTablaDatos(int iNumFilas,int iTamanioFilaTabla) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    
		int iWidthTable=screenSize.width*2;//screenSize.width - (screenSize.width/8);
		int iWidthTableScroll=screenSize.width - (screenSize.width/8);
		int iWidthTableCalculado=0;//1530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.IS_DEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.perfil_session.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.I_SWING_ANCHO_COLUMNA;
		}
		}
		
		//SI CALCULADO ES MENOR QUE MAXIMO
		/*
		if(iWidthTableCalculado<=iWidthTable) {
			iWidthTable=iWidthTableCalculado;
		}
		*/
		
		//SI TABLA ES MENOR QUE SCROLL
		if(iWidthTableCalculado<=iWidthTableScroll) {
			iWidthTableScroll=iWidthTableCalculado;
		}
		
		//NO VALE SIEMPRE PONE TAMANIO COLUMNA 200
		/*
		int iTotalWidth=0;
		int iWidthColumn=0;
		int iCountColumns=this.tableDatos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.tableDatos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.tableDatos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.tableDatos.getRowHeight();//Perfil_util.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.perfil_session.getEsGuardarRelacionado()) {			
			if(iHeightTable > Perfil_util.TAMANIO_ALTO_MAXIMO_TABLA_DATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jPanelParametrosReportes.chb_ConAltoMaximoTabla.isSelected()) {
					iHeightTable=Perfil_util.TAMANIO_ALTO_MAXIMO_TABLA_DATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < Perfil_util.TAMANIO_ALTO_MINIMO_TABLA_DATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=Perfil_util.TAMANIO_ALTO_MINIMO_TABLA_DATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > Perfil_util.TAMANIO_ALTO_MAXIMO_TABLA_DATOS_REL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jPanelParametrosReportes.chb_ConAltoMaximoTabla.isSelected()) {
					iHeightTable=Perfil_util.TAMANIO_ALTO_MAXIMO_TABLA_DATOS_REL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < Perfil_util.TAMANIO_ALTO_MINIMO_TABLA_DATOS_REL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=Perfil_util.TAMANIO_ALTO_MINIMO_TABLA_DATOS_REL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		FuncionesSwing.setTableSize(this.tableDatos,iWidthTableCalculado,iHeightTableTotal);
		
		FuncionesSwing.setScrollPaneSize(this.jScrollPanelDatos,iWidthTableScroll,iHeightTable);
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jFrameOrderBy!=null && this.jFrameOrderBy.gettable_DatosOrderBy()!=null) {
			//if(!this.perfil_session.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jFrameOrderBy.gettable_DatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			FuncionesSwing.setTableSize(this.jFrameOrderBy.gettable_DatosOrderBy(),Constantes2.I_SWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy);
			
			FuncionesSwing.setScrollPaneSize(this.jFrameOrderBy.getjScrollPanelDatosOrderBy(),Constantes2.I_SWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.I_SWING_TAMANIO_ALTO_TABLADATOS_ORDERBY);
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
		//VERSION 0
		/*
		//SI CALCULADO ES MENOR QUE MAXIMO
		if(iWidthTableCalculado<=iWidthTable) {
			iWidthTable=iWidthTableCalculado;
		}
		
		//SI TABLA ES MENOR QUE SCROLL
		if(iWidthTable<=iWidthTableScroll) {
			iWidthTableScroll=iWidthTable;
		}
		*/
	}
	
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
			iSizeTabla=perfilLogic.getPerfils().size();
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			iSizeTabla=perfils.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Perfil> TraerBeans(List<Perfil> perfils,ArrayList<Classe> classes)throws Exception {
		try {
			for(Perfil perfil:perfils) {
					
				if(!(Perfil_util.S_TIPO_REPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || Perfil_util.S_TIPO_REPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					perfil.setsDetalleGeneralEntityReporte(Perfil_util.getPerfilDescripcion(perfil));
										
					perfil.setestado_descripcion(Perfil_util.getestadoDescripcion(perfil));	
					
					
				} else  {
							
					//perfil.setsDetalleGeneralEntityReporte(perfil.getsDetalleGeneralEntityReporte());
										
				}
				
				//perfilbeans.add(perfilbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return perfils;
    }
	//PARA REPORTES FIN
	
	/*
		public interface Perfil_windowI {	
				
		public void setBorderResaltarTiposSeleccionar();	
		public void setBorderResaltarValorCampoGeneral();	
		public void setBorderResaltarExportar();				
		public void setBorderResaltarGenerarReporte();		
		public void setBorderResaltarGenerarReporteRelaciones();			
		public void setBorderResaltarTiposReportes();
				
		private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception;				
		public void cargarMenus();
			
		
		
		public void inicializarElementosBusquedas();	
		//FUNCION GRANDE
		public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception; 
			
		public void redimensionarTablaDatos(int iNumFilas);	
		public void redimensionarTablaDatos(int iNumFilas,int iTamanioFilaTabla);
		
		
		public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception;
				
		public static List<Perfil> TraerBeans(List<Perfil> perfils,ArrayList<Classe> classes)throws Exception;
	}
	*/
}

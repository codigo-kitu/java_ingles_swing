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
package com.bydan.ingles.gramatica.tipogrammardetalle.presentation.swing.jinternalframes.window;

import com.bydan.ingles.gramatica.tipogrammardetalle.presentation.web.jsf.sessionbean.*;//;
import com.bydan.ingles.gramatica.tipogrammardetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.tipogrammardetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.tipogrammardetalle.presentation.swing.jinternalframes.auxiliar.*;

//FK


//REL


import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;
import com.bydan.ingles.gramatica.verboirregulardetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.verboirregulardetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.verboirregulardetalle.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.pronundetalle.business.entity.PronunDetalle;
import com.bydan.ingles.gramatica.pronundetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.pronundetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.pronundetalle.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.VocabularioDetalle;
import com.bydan.ingles.gramatica.vocabulariodetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.vocabulariodetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.vocabulariodetalle.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
import com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.expresiondetalle.business.entity.ExpresionDetalle;
import com.bydan.ingles.gramatica.expresiondetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.expresiondetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.expresiondetalle.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.grammardetalle.business.entity.GrammarDetalle;
import com.bydan.ingles.gramatica.grammardetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.grammardetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.grammardetalle.presentation.web.jsf.sessionbean.*;


//import com.bydan.ingles.gramatica.presentation.report.source.*;


import com.bydan.framework.ingles.business.entity.Reporte;

import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.ParametroGeneralSg;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

import com.bydan.ingles.seguridad.sistema.util.Sistema_param_return;



import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.*;
import com.bydan.ingles.gramatica.tipogrammardetalle.util.TipoGrammarDetalle_util;

import com.bydan.ingles.gramatica.tipogrammardetalle.business.logic.*;
import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.framework.ingles.business.entity.OrderBy;
import com.bydan.framework.ingles.business.entity.Mensajes;
import com.bydan.framework.ingles.business.entity.GeneralEntityParameterGeneral;
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
public class TipoGrammarDetalle_form_window extends JInternalFrameBase {	
	private static final long serialVersionUID = 1L;
	
	
				
	
	
	public JPanel jContentPane = null;
	public JPanel jContentPaneDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	public GridBagLayout gridaBagLayout;	
	public GridBagConstraints gridBagConstraints;	
		
	//public JInternalFrameBase jFrameParent; //ESTA EN BASE
	//public TipoGrammarDetalle_controlJInternalFrameAdditional jFrameDetalle;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoGrammarDetalle_session tipogrammardetalle_session;
	
	

	public VerboIrregularDetalle_control_window verboirregulardetalleBeanSwingJFrame=null;
	public VerboIrregularDetalle_control_window verboirregulardetalleBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteVerboIrregularDetalle=false;
	public VerboIrregularDetalle_session verboirregulardetalle_session;

	public PronunDetalle_control_window pronundetalleBeanSwingJFrame=null;
	public PronunDetalle_control_window pronundetalleBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorPartePronunDetalle=false;
	public PronunDetalle_session pronundetalle_session;

	public VocabularioDetalle_control_window vocabulariodetalleBeanSwingJFrame=null;
	public VocabularioDetalle_control_window vocabulariodetalleBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteVocabularioDetalle=false;
	public VocabularioDetalle_session vocabulariodetalle_session;

	public VerboCompuestoDetalle_control_window verbocompuestodetalleBeanSwingJFrame=null;
	public VerboCompuestoDetalle_control_window verbocompuestodetalleBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteVerboCompuestoDetalle=false;
	public VerboCompuestoDetalle_session verbocompuestodetalle_session;

	public ExpresionDetalle_control_window expresiondetalleBeanSwingJFrame=null;
	public ExpresionDetalle_control_window expresiondetalleBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteExpresionDetalle=false;
	public ExpresionDetalle_session expresiondetalle_session;

	public GrammarDetalle_control_window grammardetalleBeanSwingJFrame=null;
	public GrammarDetalle_control_window grammardetalleBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteGrammarDetalle=false;
	public GrammarDetalle_session grammardetalle_session;
	
		
	
	public TipoGrammarDetalle_logic tipogrammardetalleLogic;
	
	public JScrollPane jScrollPanelDatos;
	public JScrollPane jScrollPanelDatosEdicion;
	public JScrollPane jScrollPanelDatosGeneral;
	
	public JPanel jPanelCampos;    
	public JPanel jPanelCamposOcultos;    	
	//public JPanel jPanelAcciones;//BotonesFormulario
	//public JPanel jPanelAccionesFormulario;
    
	
	
	
	//Usa los de GridXy
	//protected Integer iXPanelCamposTipoGrammarDetalle=0;
	//protected Integer iYPanelCamposTipoGrammarDetalle=0;
	
	//protected Integer iXPanelCamposOcultosTipoGrammarDetalle=0;
	//protected Integer iYPanelCamposOcultosTipoGrammarDetalle=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN		
	
	//TOOLBAR
	
	
	
	
	//TOOLBAR
	
	
	//MENU
	
	
		
	
	//MENU
	
	
		
	
	//@SuppressWarnings("rawtypes")
	//public JComboBoxMe jComboBoxTiposAcciones;
	
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel pnl_id;
	public JLabel lbl_Id;
	public JTextFieldMe txf_id;
	public JButton btn_id_Busqueda= new JButton();

	public JPanel pnl_nombre;
	public JLabel lbl_nombre;
	public JTextField txf_nombre;
	public JButton btn_nombre_Busqueda= new JButton();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JTabbedPane jTabbedPaneRelaciones;
	
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
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public Sistema_param_return sistemaReturn;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoGrammarDetalle_form_window(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCampos=new JPanel();
				this.jPanelAccionesFormulario=new JPanel();
				this.jmenuBarDetalleTipoGrammarDetalle=new JMenuBar();
				this.jTtoolBarDetalleTipoGrammarDetalle=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrammarDetalle_form_window(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoGrammarDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoGrammarDetalle_form_window() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoGrammarDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrammarDetalle_form_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGrammarDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrammarDetalle_form_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGrammarDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrammarDetalle_form_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGrammarDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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

	public JInternalFrameBase getJFrameParent() {
		return jFrameParent;
	}

	public void setJFrameParent(JInternalFrameBase internalFrameParent)	{
		jFrameParent = internalFrameParent;
	}
	
		
	
	
	
	

	
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBoxMe getjComboBoxTiposAcciones() {
		//return this.jComboBoxTiposAcciones;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposAcciones(
			//JComboBoxMe jComboBoxTiposAccionesTipoGrammarDetalle) {
		//this.jComboBoxTiposAccionesTipoGrammarDetalle = jComboBoxTiposAcciones;
	//}		
	
			
		
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipogrammardetalle_session=new TipoGrammarDetalle_session();
		
		this.tipogrammardetalle_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogrammardetalle_session.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogrammardetalle_session.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.verboirregulardetalle_session=new VerboIrregularDetalle_session();
		//this.pronundetalle_session=new PronunDetalle_session();
		//this.vocabulariodetalle_session=new VocabularioDetalle_session();
		//this.verbocompuestodetalle_session=new VerboCompuestoDetalle_session();
		//this.expresiondetalle_session=new ExpresionDetalle_session();
		//this.grammardetalle_session=new GrammarDetalle_session();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGrammarDetalle_window.S_TIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGrammarDetalle_window.S_TIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGrammarDetalle_window.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Grammar Detalle MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipogrammardetalle_session.getEsGuardarRelacionado()) {
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
	
		TipoGrammarDetalle_window.ESTA_CARGADO_PORPARTE=true;
		
    }		
		
	
	public void cargarMenus() {		
		
		//this.cargarMenusDetalleGenerico();				
		
		this.jmenuBarDetalle=new JMenuBarDetalle(this,S_TIPO_TAMANIO_GENERAL,this.conCargarMinimo);
		
			
		
		//MENU RELACIONES
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalle);				
	}
	
	
	public void inicializarElementosCampos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		lbl_Id = new JLabel();
		lbl_Id.setText(""+Constantes2.S_CODIGO_UNICO+"");
		FuncionesSwing.setLabelSize(lbl_Id,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-60),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_Id,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_Id,this.sTipoTamanioGeneral,false,false,this);

		this.pnl_id = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id.setToolTipText(TipoGrammarDetalle_util.LABEL_ID);
		this.gridaBagLayout= new GridBagLayout();

		this.pnl_id.setLayout(this.gridaBagLayout);

		txf_id = new JTextFieldMe();
		txf_id.setText("Id");

		FuncionesSwing.setComponentSize(txf_id,Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL);

		FuncionesSwing.setBoldTextField(txf_id,this.sTipoTamanioGeneral,false,false,this);




					
		this.lbl_nombre = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_nombre,""+TipoGrammarDetalle_util.LABEL_NOMBRE+" : *","Nombre");
		FuncionesSwing.setLabelSize(this.lbl_nombre,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-60),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_nombre,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_nombre,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_nombre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_nombre.setToolTipText(TipoGrammarDetalle_util.LABEL_NOMBRE);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_nombre.setLayout(this.gridaBagLayout);


		txf_nombre= new JTextField();

		txf_nombre.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_nombre,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_nombre,this.sTipoTamanioGeneral,false,false,this);

		this.btn_nombre_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_nombre_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_nombre_Busqueda.setText("U");
		this.btn_nombre_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_nombre_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_nombre_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_nombre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_nombre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_Busqueda"));

		if(this.tipogrammardetalle_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_nombre_Busqueda.setVisible(false);		}


	}
	
	@SuppressWarnings("rawtypes")
	public void inicializarElementosCamposFKs() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		JComboBox jComboBoxAux=null;
		
		
	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt,Boolean esControlTabla) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt,esControlTabla);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	@SuppressWarnings("rawtypes")
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		GridXy gxy=new GridXy();
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		JComboBox jComboBox=null;
		
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
		//this.jFrameDetalle = new TipoGrammarDetalle_controlJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Grammar Detalle DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayout= new GridBagLayout();
		

		
		String sToolTipTipoGrammarDetalle="";
		sToolTipTipoGrammarDetalle=TipoGrammarDetalle_util.S_CLASS_WEB_TITULO;
		
		if(Constantes.IS_DEVELOPING) {
			sToolTipTipoGrammarDetalle+="(Gramatica.TipoGrammarDetalle)";
		}
		
		if(!this.tipogrammardetalle_session.getEsGuardarRelacionado()) {
			sToolTipTipoGrammarDetalle+="_"+this.opcionActual.getId();
		}
								
		
		
		this.jScrollPanelDatos = new JScrollPane();   
        this.jScrollPanelDatosEdicion = new JScrollPane();
		this.jScrollPanelDatosGeneral = new JScrollPane();
				
		
		
		this.jPanelCampos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        //this.jPanelAccionesBotonesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesBotonesFormulario = new JPanelAccionesBotonesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this.tipogrammardetalle_session.getEsGuardarRelacionado());               
		//this.jPanelAccionesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormulario = new JPanelAccionesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),S_TIPO_TAMANIO_GENERAL,this.sTipoTamanioGeneral,this.tipogrammardetalle_session.getEsGuardarRelacionado(),false,false,false);
		this.jPanelToolBarDetalle = new JPanelToolBarDetalle(parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this);               
		
		
		this.jPanelAccionesBotonesFormulario.sNombreClase=TipoGrammarDetalle_util.S_CLASS_WEB_TITULO;
		this.jPanelAccionesFormulario.sNombreClase=TipoGrammarDetalle_util.S_CLASS_WEB_TITULO;
		this.jPanelToolBarDetalle.sNombreClase=TipoGrammarDetalle_util.S_CLASS_WEB_TITULO;
		
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Grammar Detalle";
		
		if(!this.tipogrammardetalle_session.getEsGuardarRelacionado()) {
			this.jScrollPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grammar Detalles" + this.sPath));
		} else {
			this.jScrollPanelDatos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCampos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCampos.setName("jPanelCampos"); 
		FuncionesSwing.setBoldPanel(this.jPanelCampos, this.sTipoTamanioGeneral,false,true,this);
       
		this.jPanelCamposOcultos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultos.setName("jPanelCamposOcultos"); 
		FuncionesSwing.setBoldPanel(this.jPanelCamposOcultos, this.sTipoTamanioGeneral,false,true,this);
        
        //this.jPanelAccionesBotonesFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        //this.jPanelAccionesBotonesFormulario.setToolTipText("Acciones");
        //this.jPanelAccionesBotonesFormulario.setName("Acciones"); 

		//this.jPanelAccionesFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        //this.jPanelAccionesFormulario.setToolTipText("Acciones");
        //this.jPanelAccionesFormulario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicion, this.sTipoTamanioGeneral,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneral, this.sTipoTamanioGeneral,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatos, this.sTipoTamanioGeneral,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCampos, this.sTipoTamanioGeneral,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultos, this.sTipoTamanioGeneral,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormulario, this.sTipoTamanioGeneral,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
	
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
		String sMapKey = "";
		InputMap inputMap =null;
		
			
		//HOT KEYS
		
				
		
			
			
		//this.jComboBoxTiposAccionesTipoGrammarDetalle = new JComboBoxMe();
				//this.jComboBoxTiposAccionesTipoGrammarDetalle.setText("Accion");
		//this.jComboBoxTiposAccionesTipoGrammarDetalle.setToolTipText("Tipos de Acciones");
							
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCampos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposFKs();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelaciones=new JTabbedPane();
		this.jTabbedPaneRelaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelaciones,S_TIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		//FuncionesSwing.setComboBoxSize(this.jComboBoxTiposAccionesTipoGrammarDetalle,145,20);
		//FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGrammarDetalle, S_TIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		GridBagLayout gridaBagLayoutCampos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultos = new GridBagLayout();
		
		this.jPanelCampos.setLayout(gridaBagLayoutCampos);
		this.jPanelCamposOcultos.setLayout(gridaBagLayoutCamposOcultos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_id.add(lbl_Id, this.gridBagConstraints);



	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_id.add(txf_id, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_nombre.add(lbl_nombre, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_nombre.add(btn_nombre_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_nombre.add(txf_nombre, this.gridBagConstraints);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_id, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_nombre, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		//Integer iGridXParametrosAccionesFormulario=0;
		//Integer iGridYParametrosAccionesFormulario=0;
		//GridXy gxy=new GridXy();
		
		GridBagLayout gridaBagLayoutAcciones= new GridBagLayout();
		this.jPanelAccionesBotonesFormulario.setLayout(gridaBagLayoutAcciones);						
		
		//int gxy.iPosXAccion=0;
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayout = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayout);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogrammardetalle_session.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraints = new GridBagConstraints();						
			GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.CENTER,-1,0,gxy.iGridyPrincipal++,100);			
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.BOTH,0,gxy.iGridyPrincipal++);
		this.jContentPane.add(this.jScrollPanelDatos, this.gridBagConstraints);
						
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ANCHO_REL_SCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO_REL_SCROLL);

		
			
		//if(TipoGrammarDetalleJInternalFrame.CON_DATOS_FRAME) {				
			//this.jFrameDetalle = new TipoGrammarDetalle_controlJInternalFrameAdditional();//JInternalFrameBase("Tipo Grammar Detalle DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Tipo Grammar Detalle DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Grammar Detalle Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoGrammarDetalle_model tipogrammardetalleModel=new TipoGrammarDetalle_model(this);
			
			//SI USARA CLASE INTERNA
			//TipoGrammarDetalleModel.TipoGrammarDetalleFocusTraversalPolicy tipogrammardetalleFocusTraversalPolicy = tipogrammardetalleModel.new TipoGrammarDetalleFocusTraversalPolicy(this);
			
			//tipogrammardetalleFocusTraversalPolicy.settipogrammardetalleJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipogrammardetalleModel);
			
			
			this.jContentPaneDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			//int gxy.iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalle = new GridBagLayout();	
			this.jContentPaneDetalle.setLayout(gridaBagLayoutDetalle);
			
			GridBagLayout gridaBagLayoutBusquedasParametros = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraints = new GridBagConstraints();				
				GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyRelaciones++);	
				
				this.jContentPaneDetalle.add(this.jPanelToolBarDetalle, gridBagConstraints);								
				
}
			
			this.jScrollPanelDatosEdicion=   new JScrollPane(jContentPaneDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			FuncionesSwing.setScrollPaneSize(this.jScrollPanelDatosEdicion,iWidthScroll,iHeightScroll);
			
			this.jScrollPanelDatosGeneral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			FuncionesSwing.setScrollPaneSize(this.jScrollPanelDatosGeneral,iWidthScroll,iHeightScroll);	
			
			this.gridBagConstraints = new GridBagConstraints();
			
	        GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyRelaciones++);
			this.jContentPaneDetalle.add(jPanelCampos, gridBagConstraints);			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& tipogrammardetalle_session.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJFrameExpresionDetalle(this.puedeCargarPorParteExpresionDetalle,false,-1);
					this.cargarSessionConBeanSwingJFrameGrammarDetalle(this.puedeCargarPorParteGrammarDetalle,false,-1);
					this.cargarSessionConBeanSwingJFramePronunDetalle(this.puedeCargarPorPartePronunDetalle,false,-1);
					this.cargarSessionConBeanSwingJFrameVerboCompuestoDetalle(this.puedeCargarPorParteVerboCompuestoDetalle,false,-1);
					this.cargarSessionConBeanSwingJFrameVerboIrregularDetalle(this.puedeCargarPorParteVerboIrregularDetalle,false,-1);
					this.cargarSessionConBeanSwingJFrameVocabularioDetalle(this.puedeCargarPorParteVocabularioDetalle,false,-1);
					
					if(this.tipogrammardetalle_session.getConGuardarRelaciones()) {
						this.gridBagConstraints= new GridBagConstraints();
						GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyRelaciones++);
						this.jContentPaneDetalle.add(this.jTabbedPaneRelaciones, this.gridBagConstraints);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoGrammarDetalle.setVisible(false);
						
					this.cargarSessionConBeanSwingJFrameExpresionDetalle(true,false,-1);
					this.cargarSessionConBeanSwingJFrameGrammarDetalle(true,false,-1);
					this.cargarSessionConBeanSwingJFramePronunDetalle(true,false,-1);
					this.cargarSessionConBeanSwingJFrameVerboCompuestoDetalle(true,false,-1);
					this.cargarSessionConBeanSwingJFrameVerboIrregularDetalle(true,false,-1);
					this.cargarSessionConBeanSwingJFrameVocabularioDetalle(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.IS_DEVELOPING) {
	       		this.jPanelCamposOcultos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
				}
			}					
			
			
			
			
			this.gridBagConstraints = new GridBagConstraints();
			GridXy.SetGridBagPropAnchor(this.gridBagConstraints,GridBagConstraints.CENTER,0,gxy.iGridyRelaciones++);
			
			
			
			this.jContentPaneDetalle.add(this.jPanelAccionesFormulario, this.gridBagConstraints);							
			
			
			
			this.gridBagConstraints = new GridBagConstraints();
	        GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyRelaciones);
			
			
			this.jContentPaneDetalle.add(this.jPanelAccionesBotonesFormulario, this.gridBagConstraints);							
			
	        //this.setContentPane(jScrollPanelDatosEdicion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicion=   new JScrollPane(this.jPanelCampos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);						
			FuncionesSwing.setScrollPaneSize(this.jScrollPanelDatosEdicion,iWidthScroll,iHeightScroll);
			
			this.gridBagConstraints = new GridBagConstraints();
			GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.BOTH,0,gxy.iGridyPrincipal++);
			this.gridBagConstraints.ipady = this.getSize().height-yOffset*3;			
			this.jContentPane.add(this.jScrollPanelDatosEdicion, this.gridBagConstraints);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraints = new GridBagConstraints();
			GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyPrincipal++);
			this.jContentPane.add(this.jPanelAccionesFormulario, this.gridBagConstraints);			
			
			this.gridBagConstraints = new GridBagConstraints();			
			GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyPrincipal++);
			this.jContentPane.add(this.jPanelAcciones, this.gridBagConstraints);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraints = new GridBagConstraints();		
		GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyPrincipal++);					
		this.jContentPane.add(this.jPanelCampos, this.gridBagConstraints);
						
		this.gridBagConstraints = new GridBagConstraints();		
		GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyPrincipal++);					
		this.jContentPane.add(this.jPanelCamposOcultos, this.gridBagConstraints);
					
		this.gridBagConstraints = new GridBagConstraints();		
		GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyPrincipal++);	
		this.jContentPane.add(this.jPanelAcciones, this.gridBagConstraints);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneral;//jContentPane;
		
		return jScrollPanelDatosEdicion;
    } 
	
		

	public void cargarSessionConBeanSwingJFrameExpresionDetalle(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.expresiondetalle_session=new ExpresionDetalle_session();
		this.expresiondetalle_session.setConGuardarRelaciones(false);
		this.expresiondetalle_session.setEsGuardarRelacionado(true);

		this.expresiondetalleBeanSwingJFrame=null;//new ExpresionDetalleBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.expresiondetalleBeanSwingJFramePopup=new ExpresionDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.expresiondetalleBeanSwingJFramePopup.jFrameParent=this;


			if(this.expresiondetalle_session.getEsGuardarRelacionado()) {

				ExpresionDetalle_window.S_TIPO_TAMANIO_GENERAL=TipoGrammarDetalle_window.S_TIPO_TAMANIO_GENERAL;
				ExpresionDetalle_window.S_TIPO_TAMANIO_GENERAL_TABLA=TipoGrammarDetalle_window.S_TIPO_TAMANIO_GENERAL;

				this.expresiondetalle_session.setEsGuardarRelacionado(true);

				this.expresiondetalleBeanSwingJFrame=new ExpresionDetalle_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.expresiondetalleBeanSwingJFrame.setJFrameParent(this);
				this.expresiondetalleBeanSwingJFrame.setexpresiondetalle_session(this.expresiondetalle_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.expresiondetalleBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Expresion Detalles",this.expresiondetalleBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.expresiondetalleBeanSwingJFrame.getContentPane());
				}

				//ExpresionDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.expresiondetalle_session.setEsGuardarRelacionado(false);
				this.expresiondetalleBeanSwingJFrame=null;//new ExpresionDetalleBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.expresiondetalle_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteExpresionDetalle) {
					this.jTabbedPaneRelaciones.add("Expresion Detalles",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJFrameGrammarDetalle(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.grammardetalle_session=new GrammarDetalle_session();
		this.grammardetalle_session.setConGuardarRelaciones(false);
		this.grammardetalle_session.setEsGuardarRelacionado(true);

		this.grammardetalleBeanSwingJFrame=null;//new GrammarDetalleBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.grammardetalleBeanSwingJFramePopup=new GrammarDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.grammardetalleBeanSwingJFramePopup.jFrameParent=this;


			if(this.grammardetalle_session.getEsGuardarRelacionado()) {

				GrammarDetalle_window.S_TIPO_TAMANIO_GENERAL=TipoGrammarDetalle_window.S_TIPO_TAMANIO_GENERAL;
				GrammarDetalle_window.S_TIPO_TAMANIO_GENERAL_TABLA=TipoGrammarDetalle_window.S_TIPO_TAMANIO_GENERAL;

				this.grammardetalle_session.setEsGuardarRelacionado(true);

				this.grammardetalleBeanSwingJFrame=new GrammarDetalle_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.grammardetalleBeanSwingJFrame.setJFrameParent(this);
				this.grammardetalleBeanSwingJFrame.setgrammardetalle_session(this.grammardetalle_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.grammardetalleBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Grammar Detalles",this.grammardetalleBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.grammardetalleBeanSwingJFrame.getContentPane());
				}

				//GrammarDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.grammardetalle_session.setEsGuardarRelacionado(false);
				this.grammardetalleBeanSwingJFrame=null;//new GrammarDetalleBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.grammardetalle_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteGrammarDetalle) {
					this.jTabbedPaneRelaciones.add("Grammar Detalles",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJFramePronunDetalle(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pronundetalle_session=new PronunDetalle_session();
		this.pronundetalle_session.setConGuardarRelaciones(false);
		this.pronundetalle_session.setEsGuardarRelacionado(true);

		this.pronundetalleBeanSwingJFrame=null;//new PronunDetalleBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pronundetalleBeanSwingJFramePopup=new PronunDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pronundetalleBeanSwingJFramePopup.jFrameParent=this;


			if(this.pronundetalle_session.getEsGuardarRelacionado()) {

				PronunDetalle_window.S_TIPO_TAMANIO_GENERAL=TipoGrammarDetalle_window.S_TIPO_TAMANIO_GENERAL;
				PronunDetalle_window.S_TIPO_TAMANIO_GENERAL_TABLA=TipoGrammarDetalle_window.S_TIPO_TAMANIO_GENERAL;

				this.pronundetalle_session.setEsGuardarRelacionado(true);

				this.pronundetalleBeanSwingJFrame=new PronunDetalle_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.pronundetalleBeanSwingJFrame.setJFrameParent(this);
				this.pronundetalleBeanSwingJFrame.setpronundetalle_session(this.pronundetalle_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.pronundetalleBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Pronun Detalles",this.pronundetalleBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.pronundetalleBeanSwingJFrame.getContentPane());
				}

				//PronunDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pronundetalle_session.setEsGuardarRelacionado(false);
				this.pronundetalleBeanSwingJFrame=null;//new PronunDetalleBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pronundetalle_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePronunDetalle) {
					this.jTabbedPaneRelaciones.add("Pronun Detalles",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJFrameVerboCompuestoDetalle(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.verbocompuestodetalle_session=new VerboCompuestoDetalle_session();
		this.verbocompuestodetalle_session.setConGuardarRelaciones(false);
		this.verbocompuestodetalle_session.setEsGuardarRelacionado(true);

		this.verbocompuestodetalleBeanSwingJFrame=null;//new VerboCompuestoDetalleBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.verbocompuestodetalleBeanSwingJFramePopup=new VerboCompuestoDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.verbocompuestodetalleBeanSwingJFramePopup.jFrameParent=this;


			if(this.verbocompuestodetalle_session.getEsGuardarRelacionado()) {

				VerboCompuestoDetalle_window.S_TIPO_TAMANIO_GENERAL=TipoGrammarDetalle_window.S_TIPO_TAMANIO_GENERAL;
				VerboCompuestoDetalle_window.S_TIPO_TAMANIO_GENERAL_TABLA=TipoGrammarDetalle_window.S_TIPO_TAMANIO_GENERAL;

				this.verbocompuestodetalle_session.setEsGuardarRelacionado(true);

				this.verbocompuestodetalleBeanSwingJFrame=new VerboCompuestoDetalle_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.verbocompuestodetalleBeanSwingJFrame.setJFrameParent(this);
				this.verbocompuestodetalleBeanSwingJFrame.setverbocompuestodetalle_session(this.verbocompuestodetalle_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.verbocompuestodetalleBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Verbo Compuesto Detalles",this.verbocompuestodetalleBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.verbocompuestodetalleBeanSwingJFrame.getContentPane());
				}

				//VerboCompuestoDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.verbocompuestodetalle_session.setEsGuardarRelacionado(false);
				this.verbocompuestodetalleBeanSwingJFrame=null;//new VerboCompuestoDetalleBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.verbocompuestodetalle_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteVerboCompuestoDetalle) {
					this.jTabbedPaneRelaciones.add("Verbo Compuesto Detalles",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJFrameVerboIrregularDetalle(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.verboirregulardetalle_session=new VerboIrregularDetalle_session();
		this.verboirregulardetalle_session.setConGuardarRelaciones(false);
		this.verboirregulardetalle_session.setEsGuardarRelacionado(true);

		this.verboirregulardetalleBeanSwingJFrame=null;//new VerboIrregularDetalleBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.verboirregulardetalleBeanSwingJFramePopup=new VerboIrregularDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.verboirregulardetalleBeanSwingJFramePopup.jFrameParent=this;


			if(this.verboirregulardetalle_session.getEsGuardarRelacionado()) {

				VerboIrregularDetalle_window.S_TIPO_TAMANIO_GENERAL=TipoGrammarDetalle_window.S_TIPO_TAMANIO_GENERAL;
				VerboIrregularDetalle_window.S_TIPO_TAMANIO_GENERAL_TABLA=TipoGrammarDetalle_window.S_TIPO_TAMANIO_GENERAL;

				this.verboirregulardetalle_session.setEsGuardarRelacionado(true);

				this.verboirregulardetalleBeanSwingJFrame=new VerboIrregularDetalle_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.verboirregulardetalleBeanSwingJFrame.setJFrameParent(this);
				this.verboirregulardetalleBeanSwingJFrame.setverboirregulardetalle_session(this.verboirregulardetalle_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.verboirregulardetalleBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Verbo Irregular Detalles",this.verboirregulardetalleBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.verboirregulardetalleBeanSwingJFrame.getContentPane());
				}

				//VerboIrregularDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.verboirregulardetalle_session.setEsGuardarRelacionado(false);
				this.verboirregulardetalleBeanSwingJFrame=null;//new VerboIrregularDetalleBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.verboirregulardetalle_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteVerboIrregularDetalle) {
					this.jTabbedPaneRelaciones.add("Verbo Irregular Detalles",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJFrameVocabularioDetalle(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.vocabulariodetalle_session=new VocabularioDetalle_session();
		this.vocabulariodetalle_session.setConGuardarRelaciones(false);
		this.vocabulariodetalle_session.setEsGuardarRelacionado(true);

		this.vocabulariodetalleBeanSwingJFrame=null;//new VocabularioDetalleBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.vocabulariodetalleBeanSwingJFramePopup=new VocabularioDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.vocabulariodetalleBeanSwingJFramePopup.jFrameParent=this;


			if(this.vocabulariodetalle_session.getEsGuardarRelacionado()) {

				VocabularioDetalle_window.S_TIPO_TAMANIO_GENERAL=TipoGrammarDetalle_window.S_TIPO_TAMANIO_GENERAL;
				VocabularioDetalle_window.S_TIPO_TAMANIO_GENERAL_TABLA=TipoGrammarDetalle_window.S_TIPO_TAMANIO_GENERAL;

				this.vocabulariodetalle_session.setEsGuardarRelacionado(true);

				this.vocabulariodetalleBeanSwingJFrame=new VocabularioDetalle_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.vocabulariodetalleBeanSwingJFrame.setJFrameParent(this);
				this.vocabulariodetalleBeanSwingJFrame.setvocabulariodetalle_session(this.vocabulariodetalle_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.vocabulariodetalleBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Vocabulario Detalles",this.vocabulariodetalleBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.vocabulariodetalleBeanSwingJFrame.getContentPane());
				}

				//VocabularioDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.vocabulariodetalle_session.setEsGuardarRelacionado(false);
				this.vocabulariodetalleBeanSwingJFrame=null;//new VocabularioDetalleBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.vocabulariodetalle_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteVocabularioDetalle) {
					this.jTabbedPaneRelaciones.add("Vocabulario Detalles",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarVerboIrregularDetalleBeanSwingJFrame(List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle tipogrammardetalle,VerboIrregularDetalle_control_window verboirregulardetalleBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//verboirregulardetalleBeanSwingJFrame=new VerboIrregularDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					verboirregulardetalleBeanSwingJFrame.getVerboIrregularDetalleLogic().setConnexion(this.tipogrammardetalleLogic.getConnexion());

					verboirregulardetalleBeanSwingJFrame.settipogrammardetallesFK(tipogrammardetalles);
					verboirregulardetalleBeanSwingJFrame.settipogrammardetalleFK(tipogrammardetalle);
					verboirregulardetalleBeanSwingJFrame.verboirregulardetalle_session.setisBusquedaDesdeFKSesionTipoGrammarDetalle(true);
					verboirregulardetalleBeanSwingJFrame.verboirregulardetalle_session.setlidTipoGrammarDetalleActual(tipogrammardetalle.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					verboirregulardetalleBeanSwingJFrame.cargarCombosFK(verboirregulardetalleBeanSwingJFrame.isCargarCombosDependencia);
					verboirregulardetalleBeanSwingJFrame.setVisibilidadBusquedasParaTipoGrammarDetalle(true);
					verboirregulardetalleBeanSwingJFrame.setid_tipo_grammar_detalleFK_IdTipoGrammarDetalle(tipogrammardetalle.getId());

					if(!this.conCargarFormDetalle) {
						verboirregulardetalleBeanSwingJFrame.inicializarFormDetalle();
					}

					verboirregulardetalleBeanSwingJFrame.setSelectedItemCombosFrameTipoGrammarDetalleFK(tipogrammardetalle,1,false,true,true);
					verboirregulardetalleBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					verboirregulardetalleBeanSwingJFrame.procesarBusqueda("FK_IdTipoGrammarDetalle");
					verboirregulardetalleBeanSwingJFrame.setsAccionBusqueda("FK_IdTipoGrammarDetalle");
					verboirregulardetalleBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					verboirregulardetalleBeanSwingJFrame.actualizarEstadoCeldasBotones("n",verboirregulardetalleBeanSwingJFrame.isGuardarCambiosEnLote, verboirregulardetalleBeanSwingJFrame.isEsMantenimientoRelacionado);
					verboirregulardetalleBeanSwingJFrame.setAutoscrolls(true);
					verboirregulardetalleBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						verboirregulardetalleBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						verboirregulardetalleBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					verboirregulardetalleBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPronunDetalleBeanSwingJFrame(List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle tipogrammardetalle,PronunDetalle_control_window pronundetalleBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pronundetalleBeanSwingJFrame=new PronunDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pronundetalleBeanSwingJFrame.getPronunDetalleLogic().setConnexion(this.tipogrammardetalleLogic.getConnexion());

					pronundetalleBeanSwingJFrame.settipogrammardetallesFK(tipogrammardetalles);
					pronundetalleBeanSwingJFrame.settipogrammardetalleFK(tipogrammardetalle);
					pronundetalleBeanSwingJFrame.pronundetalle_session.setisBusquedaDesdeFKSesionTipoGrammarDetalle(true);
					pronundetalleBeanSwingJFrame.pronundetalle_session.setlidTipoGrammarDetalleActual(tipogrammardetalle.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					pronundetalleBeanSwingJFrame.cargarCombosFK(pronundetalleBeanSwingJFrame.isCargarCombosDependencia);
					pronundetalleBeanSwingJFrame.setVisibilidadBusquedasParaTipoGrammarDetalle(true);
					pronundetalleBeanSwingJFrame.setid_tipo_grammar_detalleFK_IdTipoGrammarDetalle(tipogrammardetalle.getId());

					if(!this.conCargarFormDetalle) {
						pronundetalleBeanSwingJFrame.inicializarFormDetalle();
					}

					pronundetalleBeanSwingJFrame.setSelectedItemCombosFrameTipoGrammarDetalleFK(tipogrammardetalle,1,false,true,true);
					pronundetalleBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pronundetalleBeanSwingJFrame.procesarBusqueda("FK_IdTipoGrammarDetalle");
					pronundetalleBeanSwingJFrame.setsAccionBusqueda("FK_IdTipoGrammarDetalle");
					pronundetalleBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					pronundetalleBeanSwingJFrame.actualizarEstadoCeldasBotones("n",pronundetalleBeanSwingJFrame.isGuardarCambiosEnLote, pronundetalleBeanSwingJFrame.isEsMantenimientoRelacionado);
					pronundetalleBeanSwingJFrame.setAutoscrolls(true);
					pronundetalleBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pronundetalleBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						pronundetalleBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					pronundetalleBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarVocabularioDetalleBeanSwingJFrame(List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle tipogrammardetalle,VocabularioDetalle_control_window vocabulariodetalleBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//vocabulariodetalleBeanSwingJFrame=new VocabularioDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					vocabulariodetalleBeanSwingJFrame.getVocabularioDetalleLogic().setConnexion(this.tipogrammardetalleLogic.getConnexion());

					vocabulariodetalleBeanSwingJFrame.settipogrammardetallesFK(tipogrammardetalles);
					vocabulariodetalleBeanSwingJFrame.settipogrammardetalleFK(tipogrammardetalle);
					vocabulariodetalleBeanSwingJFrame.vocabulariodetalle_session.setisBusquedaDesdeFKSesionTipoGrammarDetalle(true);
					vocabulariodetalleBeanSwingJFrame.vocabulariodetalle_session.setlidTipoGrammarDetalleActual(tipogrammardetalle.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					vocabulariodetalleBeanSwingJFrame.cargarCombosFK(vocabulariodetalleBeanSwingJFrame.isCargarCombosDependencia);
					vocabulariodetalleBeanSwingJFrame.setVisibilidadBusquedasParaTipoGrammarDetalle(true);
					vocabulariodetalleBeanSwingJFrame.setid_tipo_grammar_detalleFK_IdTipoGrammarDetalle(tipogrammardetalle.getId());

					if(!this.conCargarFormDetalle) {
						vocabulariodetalleBeanSwingJFrame.inicializarFormDetalle();
					}

					vocabulariodetalleBeanSwingJFrame.setSelectedItemCombosFrameTipoGrammarDetalleFK(tipogrammardetalle,1,false,true,true);
					vocabulariodetalleBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					vocabulariodetalleBeanSwingJFrame.procesarBusqueda("FK_IdTipoGrammarDetalle");
					vocabulariodetalleBeanSwingJFrame.setsAccionBusqueda("FK_IdTipoGrammarDetalle");
					vocabulariodetalleBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					vocabulariodetalleBeanSwingJFrame.actualizarEstadoCeldasBotones("n",vocabulariodetalleBeanSwingJFrame.isGuardarCambiosEnLote, vocabulariodetalleBeanSwingJFrame.isEsMantenimientoRelacionado);
					vocabulariodetalleBeanSwingJFrame.setAutoscrolls(true);
					vocabulariodetalleBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						vocabulariodetalleBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						vocabulariodetalleBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					vocabulariodetalleBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarVerboCompuestoDetalleBeanSwingJFrame(List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle tipogrammardetalle,VerboCompuestoDetalle_control_window verbocompuestodetalleBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//verbocompuestodetalleBeanSwingJFrame=new VerboCompuestoDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					verbocompuestodetalleBeanSwingJFrame.getVerboCompuestoDetalleLogic().setConnexion(this.tipogrammardetalleLogic.getConnexion());

					verbocompuestodetalleBeanSwingJFrame.settipogrammardetallesFK(tipogrammardetalles);
					verbocompuestodetalleBeanSwingJFrame.settipogrammardetalleFK(tipogrammardetalle);
					verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalle_session.setisBusquedaDesdeFKSesionTipoGrammarDetalle(true);
					verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalle_session.setlidTipoGrammarDetalleActual(tipogrammardetalle.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					verbocompuestodetalleBeanSwingJFrame.cargarCombosFK(verbocompuestodetalleBeanSwingJFrame.isCargarCombosDependencia);
					verbocompuestodetalleBeanSwingJFrame.setVisibilidadBusquedasParaTipoGrammarDetalle(true);
					verbocompuestodetalleBeanSwingJFrame.setid_tipo_grammar_detalleFK_IdTipoGrammarDetalle(tipogrammardetalle.getId());

					if(!this.conCargarFormDetalle) {
						verbocompuestodetalleBeanSwingJFrame.inicializarFormDetalle();
					}

					verbocompuestodetalleBeanSwingJFrame.setSelectedItemCombosFrameTipoGrammarDetalleFK(tipogrammardetalle,1,false,true,true);
					verbocompuestodetalleBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					verbocompuestodetalleBeanSwingJFrame.procesarBusqueda("FK_IdTipoGrammarDetalle");
					verbocompuestodetalleBeanSwingJFrame.setsAccionBusqueda("FK_IdTipoGrammarDetalle");
					verbocompuestodetalleBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					verbocompuestodetalleBeanSwingJFrame.actualizarEstadoCeldasBotones("n",verbocompuestodetalleBeanSwingJFrame.isGuardarCambiosEnLote, verbocompuestodetalleBeanSwingJFrame.isEsMantenimientoRelacionado);
					verbocompuestodetalleBeanSwingJFrame.setAutoscrolls(true);
					verbocompuestodetalleBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						verbocompuestodetalleBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						verbocompuestodetalleBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					verbocompuestodetalleBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarExpresionDetalleBeanSwingJFrame(List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle tipogrammardetalle,ExpresionDetalle_control_window expresiondetalleBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//expresiondetalleBeanSwingJFrame=new ExpresionDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					expresiondetalleBeanSwingJFrame.getExpresionDetalleLogic().setConnexion(this.tipogrammardetalleLogic.getConnexion());

					expresiondetalleBeanSwingJFrame.settipogrammardetallesFK(tipogrammardetalles);
					expresiondetalleBeanSwingJFrame.settipogrammardetalleFK(tipogrammardetalle);
					expresiondetalleBeanSwingJFrame.expresiondetalle_session.setisBusquedaDesdeFKSesionTipoGrammarDetalle(true);
					expresiondetalleBeanSwingJFrame.expresiondetalle_session.setlidTipoGrammarDetalleActual(tipogrammardetalle.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					expresiondetalleBeanSwingJFrame.cargarCombosFK(expresiondetalleBeanSwingJFrame.isCargarCombosDependencia);
					expresiondetalleBeanSwingJFrame.setVisibilidadBusquedasParaTipoGrammarDetalle(true);
					expresiondetalleBeanSwingJFrame.setid_tipo_grammar_detalleFK_IdTipoGrammarDetalle(tipogrammardetalle.getId());

					if(!this.conCargarFormDetalle) {
						expresiondetalleBeanSwingJFrame.inicializarFormDetalle();
					}

					expresiondetalleBeanSwingJFrame.setSelectedItemCombosFrameTipoGrammarDetalleFK(tipogrammardetalle,1,false,true,true);
					expresiondetalleBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					expresiondetalleBeanSwingJFrame.procesarBusqueda("FK_IdTipoGrammarDetalle");
					expresiondetalleBeanSwingJFrame.setsAccionBusqueda("FK_IdTipoGrammarDetalle");
					expresiondetalleBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					expresiondetalleBeanSwingJFrame.actualizarEstadoCeldasBotones("n",expresiondetalleBeanSwingJFrame.isGuardarCambiosEnLote, expresiondetalleBeanSwingJFrame.isEsMantenimientoRelacionado);
					expresiondetalleBeanSwingJFrame.setAutoscrolls(true);
					expresiondetalleBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						expresiondetalleBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						expresiondetalleBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					expresiondetalleBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarGrammarDetalleBeanSwingJFrame(List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle tipogrammardetalle,GrammarDetalle_control_window grammardetalleBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//grammardetalleBeanSwingJFrame=new GrammarDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					grammardetalleBeanSwingJFrame.getGrammarDetalleLogic().setConnexion(this.tipogrammardetalleLogic.getConnexion());

					grammardetalleBeanSwingJFrame.settipogrammardetallesFK(tipogrammardetalles);
					grammardetalleBeanSwingJFrame.settipogrammardetalleFK(tipogrammardetalle);
					grammardetalleBeanSwingJFrame.grammardetalle_session.setisBusquedaDesdeFKSesionTipoGrammarDetalle(true);
					grammardetalleBeanSwingJFrame.grammardetalle_session.setlidTipoGrammarDetalleActual(tipogrammardetalle.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					grammardetalleBeanSwingJFrame.cargarCombosFK(grammardetalleBeanSwingJFrame.isCargarCombosDependencia);
					grammardetalleBeanSwingJFrame.setVisibilidadBusquedasParaTipoGrammarDetalle(true);
					grammardetalleBeanSwingJFrame.setid_tipo_grammar_detalleFK_IdTipoGrammarDetalle(tipogrammardetalle.getId());

					if(!this.conCargarFormDetalle) {
						grammardetalleBeanSwingJFrame.inicializarFormDetalle();
					}

					grammardetalleBeanSwingJFrame.setSelectedItemCombosFrameTipoGrammarDetalleFK(tipogrammardetalle,1,false,true,true);
					grammardetalleBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					grammardetalleBeanSwingJFrame.procesarBusqueda("FK_IdTipoGrammarDetalle");
					grammardetalleBeanSwingJFrame.setsAccionBusqueda("FK_IdTipoGrammarDetalle");
					grammardetalleBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					grammardetalleBeanSwingJFrame.actualizarEstadoCeldasBotones("n",grammardetalleBeanSwingJFrame.isGuardarCambiosEnLote, grammardetalleBeanSwingJFrame.isEsMantenimientoRelacionado);
					grammardetalleBeanSwingJFrame.setAutoscrolls(true);
					grammardetalleBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						grammardetalleBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						grammardetalleBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					grammardetalleBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

	
	
	
		
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
	
	/*
	
	public interface TipoGrammarDetalle_form_windowI {	
		
		private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception;		
		public void cargarMenus();	
		public void inicializarElementosCampos();	
		public void inicializarElementosCamposFKs();	
		public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt,Boolean esControlTabla);
		
		//FUNCION GRANDE
		public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception ;
	}
	*/
}

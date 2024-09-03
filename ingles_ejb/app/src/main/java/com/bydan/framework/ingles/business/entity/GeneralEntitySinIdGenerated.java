package com.bydan.framework.ingles.business.entity;

import java.util.Calendar;
import java.util.Date;

/*
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.GeneratedValue;
import javax.persistence.Transient;
import javax.persistence.Version;

import static javax.persistence.GenerationType.IDENTITY;
*/

import com.bydan.framework.ingles.business.data.ConstantesSql;
import com.bydan.framework.ingles.util.ParameterDbType;
import com.bydan.framework.ingles.util.ParametersMaintenance;
import com.bydan.framework.ingles.util.ParametersType;
/*import com.google.gson.annotations.Expose;*/

@SuppressWarnings("unused")
//HIBERNATE
//@MappedSuperclass 
//@Inheritance
abstract public class GeneralEntitySinIdGenerated implements Cloneable {
	public Object clone() {
		Object object =new Object();
        try {
        	object =super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return object;
    }
	
	protected GeneralEntitySinIdGenerated generalEntityOriginal;
	
	protected transient Long id;
	protected transient Long idOriginal;
	//private Boolean isActive;
	//private Boolean isExpired;
	public transient Date versionRow;
	public transient String sVersionRow;
	protected transient boolean isNew;
	protected boolean isNewAuxiliar;
	protected transient boolean isChanged;
	protected boolean isChangedAuxiliar;
	protected transient boolean isDeleted;
	protected boolean isDeletedAuxiliar;
	private boolean conCambioAuxiliar;
	private transient boolean isSelected;
	
	//COLUMNAS AUXILIARES
	private transient String sType;
	//PARA REPORTES
	private String sDescripcionGeneralEntityReporte1;
	private String sDescripcionGeneralEntityReporte2;
	private String sDescripcionGeneralEntityReporte3;
	private String sDescripcionGeneralEntityReporte4;
	private String sDescripcionGeneralEntityReporte5;
		
	private String sDetalleGeneralEntityReporte;
	
	public GeneralEntitySinIdGenerated() {
		
		this.id=0L;
		this.idOriginal=0L;
		//isActive=true;
		//isExpired=true;	
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.sVersionRow="";
		
		this.isNew=true;
		this.isNewAuxiliar=false;
		
		this.isChanged=false;
		this.isChangedAuxiliar=false;
		
		this.isDeleted=false;	
		this.isDeletedAuxiliar=false;	
		
		this.isSelected=false;
		this.conCambioAuxiliar=false;
		
		//COLUMNAS AUXILIARES
		this.sType="NONE";
		this.sDescripcionGeneralEntityReporte1="";
		this.sDescripcionGeneralEntityReporte2="";
		this.sDescripcionGeneralEntityReporte3="";
		this.sDescripcionGeneralEntityReporte4="";
		this.sDescripcionGeneralEntityReporte5="";		
		this.sDetalleGeneralEntityReporte="";
	}
	
	//HIBERNATE
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = ConstantesSql.ID, nullable = false,unique=false)
	//@Column(name = ConstantesSql.ID, columnDefinition="BIGINT GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1 NO MINVALUE NO MAXVALUE NO CYCLE NO ORDER CACHE 20 )", nullable = true,unique=false)		
	public Long getId() {
		return id;
	}
	
	public void setId(Long newId) {
		if(this.id!=newId) {
			this.isChanged=true;
		}
		
		this.id=newId;
	}
	
/*
	//@Column( name =ConstantesSql.ISACTIVE, nullable=true )
	@Transient
	public Boolean getIsActive(){
		return isActive;
	}
	
	public void setIsActive(Boolean newIsActive) {	
		if(this.isActive!=newIsActive){
			this.isChanged=true;
		}
		
		this.isActive=newIsActive;
	}
	
	//@Column( name =ConstantesSql.ISEXPIRED, nullable=false )
	@Transient
	public Boolean getIsExpired() {
		return isExpired;
	}

	public void setIsExpired(Boolean isExpired) {
		this.isExpired = isExpired;
	}
	*/
	/*
	@Version
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = ConstantesSql.VERSIONROW, nullable = false, length = 19)	
	public Date getVersionRow(){
		return this.versionRow;
	}
	*/
	
	public void setVersionRow(Date newVersionRow){
		if(this.versionRow!=newVersionRow){
			this.isChanged=true;
		}
		
		this.versionRow=newVersionRow;
	}
	
	//HIBERNATE
	//@Transient
	public String getsVersionRow() {
		return sVersionRow;
	}

	public void setsVersionRow(String sVersionRow) {
		this.sVersionRow = sVersionRow;
	}	
	
	//HIBERNATE
	//@Transient//@Column(insertable=false,updatable=false )//name =ConstantesSql.ISACTIVE
	public Long getIdOriginal() {
		return this.idOriginal;
	}
	
	public void setIdOriginal(Long newidOriginal) {
		this.idOriginal=newidOriginal;
	}
	
	//HIBERNATE
	//@Transient//@Column(insertable=false,updatable=false )//name =ConstantesSql.ISACTIVE
	public boolean getIsNew() {
		return isNew;
	}
	
	public void setIsNew(boolean newIsNew) {
		this.isNew=newIsNew;
	}
	
	//HIBERNATE
	//@Transient//@Column(insertable=false,updatable=false )//name =ConstantesSql.ISACTIVE
	public boolean getIsNewAuxiliar() {
		return isNewAuxiliar;
	}
	
	public void setIsNewAuxiliar(boolean newIsNewAuxiliar) {
		this.isNewAuxiliar=newIsNewAuxiliar;
	}
	
	//HIBERNATE
	//@Transient//@Column(insertable=false,updatable=false )//( name =ConstantesSql.ISACTIVE, nullable=true )
	public boolean getIsChanged() {
		return isChanged;
	}
	
	public void setIsChanged(boolean newIsChanged) {
		this.isChanged=newIsChanged;
	}

	//HIBERNATE
	//@Transient//@Column(insertable=false,updatable=false )//( name =ConstantesSql.ISACTIVE, nullable=true )
	public boolean getIsChangedAuxiliar() {
		return isChangedAuxiliar;
	}
	
	public void setIsChangedAuxiliar(boolean newIsChangedAuxiliar) {
		this.isChangedAuxiliar=newIsChangedAuxiliar;
	}
	
	//HIBERNATE
	//@Transient//@Column(insertable=false,updatable=false )//( name =ConstantesSql.ISACTIVE, nullable=true )
	public boolean getIsDeleted() {
		return isDeleted;
	}
	
	public void setIsDeleted(boolean newIsDeleted) {
		this.isDeleted=newIsDeleted;
	}

	//HIBERNATE
	//@Transient//@Column(insertable=false,updatable=false )//( name =ConstantesSql.ISACTIVE, nullable=true )
	public boolean getIsSelected() {
		return isSelected;
	}
	
	public void setIsSelected(boolean newIsSelected) {
		this.isSelected=newIsSelected;
	}
	
	//HIBERNATE
	//@Transient//@Column(insertable=false,updatable=false )//( name =ConstantesSql.ISACTIVE, nullable=true )
	public boolean getConCambioAuxiliar() {
		return this.conCambioAuxiliar;
	}
	
	public void setConCambioAuxiliar(boolean conCambioAuxiliar) {
		this.conCambioAuxiliar=conCambioAuxiliar;
	}
	
	//HIBERNATE
	//@Transient//@Column(insertable=false,updatable=false )//( name =ConstantesSql.ISACTIVE, nullable=true )
	public boolean getIsDeletedAuxiliar() {
		return isDeletedAuxiliar;
	}
	
	public void setIsDeletedAuxiliar(boolean newIsDeletedAuxiliar) {
		this.isDeletedAuxiliar=newIsDeletedAuxiliar;
	}
	
	//HIBERNATE
	//@Transient
	public GeneralEntitySinIdGenerated getGeneralEntityOriginal() {
		return generalEntityOriginal;
	}

	public void setGeneralEntityOriginal(GeneralEntitySinIdGenerated generalEntityOriginal) {
		this.generalEntityOriginal = generalEntityOriginal;
	}	
	
	//COLUMNAS AUXILIARES
	//HIBERNATE
	//@Transient//@Column(insertable=false,updatable=false )//( name =ConstantesSql.ISACTIVE, nullable=true )
	public String getsType() {
		return this.sType;
	}
	
	public void setsType(String sType) {
		this.sType=sType;
	}
	
	//PARA REPORTES
	//HIBERNATE
	//@Transient//@Column(insertable=false,updatable=false )//( name =ConstantesSql.ISACTIVE, nullable=true )
	public String getsDescripcionGeneralEntityReporte1() {
		return this.sDescripcionGeneralEntityReporte1;
	}
		
	public void setsDescripcionGeneralEntityReporte1(String sDescripcionGeneralEntityReporte1) {
		this.sDescripcionGeneralEntityReporte1=sDescripcionGeneralEntityReporte1;
	}
		
	//HIBERNATE
	//@Transient//@Column(insertable=false,updatable=false )//( name =ConstantesSql.ISACTIVE, nullable=true )
	public String getsDescripcionGeneralEntityReporte2() {
		return this.sDescripcionGeneralEntityReporte2;
	}
		
	public void setsDescripcionGeneralEntityReporte2(String sDescripcionGeneralEntityReporte2) {
		this.sDescripcionGeneralEntityReporte2=sDescripcionGeneralEntityReporte2;
	}
		
	//HIBERNATE
	//@Transient//@Column(insertable=false,updatable=false )//( name =ConstantesSql.ISACTIVE, nullable=true )
	public String getsDescripcionGeneralEntityReporte3() {
		return this.sDescripcionGeneralEntityReporte3;
	}
		
	public void setsDescripcionGeneralEntityReporte3(String sDescripcionGeneralEntityReporte3) {
		this.sDescripcionGeneralEntityReporte3=sDescripcionGeneralEntityReporte3;
	}
	
	//HIBERNATE
	//@Transient//@Column(insertable=false,updatable=false )//( name =ConstantesSql.ISACTIVE, nullable=true )
	public String getsDescripcionGeneralEntityReporte4() {
		return this.sDescripcionGeneralEntityReporte4;
	}
		
	public void setsDescripcionGeneralEntityReporte4(String sDescripcionGeneralEntityReporte4) {
		this.sDescripcionGeneralEntityReporte4=sDescripcionGeneralEntityReporte4;
	}
		
	//HIBERNATE
	//@Transient//@Column(insertable=false,updatable=false )//( name =ConstantesSql.ISACTIVE, nullable=true )
	public String getsDescripcionGeneralEntityReporte5() {
		return this.sDescripcionGeneralEntityReporte5;
	}
		
	public void setsDescripcionGeneralEntityReporte5(String sDescripcionGeneralEntityReporte5) {
		this.sDescripcionGeneralEntityReporte5=sDescripcionGeneralEntityReporte5;
	}
	
	//HIBERNATE
	//@Transient//@Column(insertable=false,updatable=false )//( name =ConstantesSql.ISACTIVE, nullable=true )
	public String getsDetalleGeneralEntityReporte() {
		return this.sDetalleGeneralEntityReporte;
	}
	
	public void setsDetalleGeneralEntityReporte(String sDetalleGeneralEntityReporte) {
		this.sDetalleGeneralEntityReporte=sDetalleGeneralEntityReporte;
	}
}

package com.userrolemenu.model;

import java.util.Date;
import java.util.UUID;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "APPL_MENUS")
public class ApplMenus {
	
	@Id
	@Column (name="MENU_ID" ,length=30, nullable = false)
	private String menusId;
	
	@Column (name="MENU_NAME", length=100,  nullable = false)
	private String menusName;
	
	@Column (name="MENU_TYPE",length=1)
	private Character MenusType;
	
	@Column (name="MENU_MODULE_ID" ,length=5, nullable = false)
	private Integer menusModuleId;
	
	@Column (name="MENU_FILE_NAME" ,length=240)
	private String menusFileName;
	
	@Column (name="MENU_WEB_FLAG" ,length=1)
	private Character menusWebFlag;
	
	@Column (name="MENU_DESTYPE" ,length=50)
	private String menusDesType;
	
	@Column (name="MENU_DESFORMAT" ,length=240)
	private String menusDesFormat;

	@Column (name="MENU_IS_PARAM" ,length=1)
	private String menusIsParam;

	@Column (name="MENU_ADD_PARAM" ,length=50)
	private String menusAddParam;

	@Column (name="MENU_WEB_PROC" ,length=240)
	private String menusWebProc;

	@Column (name="MENU_MENU_ID_PARENT" ,length=10)
	private String menusMenuIdParent;

	@Column (name="MENU_CREATED_BY",length=30)
	private String menusCreatedBy;
	
	@Column (name="MENU_UPDATE_BY",length=30)
	private String menusUpdatedBy;
	
	@Column (name="MENU_CREATED_DATE")
	private Date menusCreatedDate;
	
	@Column (name="MENU_UPDATE_DATE")
	private Date MenusUpdatedDate;
	
	@Column (name="MENU_ADD_PARAM_VALUE" ,length=100)
	private String menusAddParamValue;
	
	@Column (name="MENU_ENABLE_STS" ,length=1)
	private String menusEnableSts;
	
	@Column (name="MENU_SEQN" ,length=4)
	private Integer menusSeqn;
	
	

}

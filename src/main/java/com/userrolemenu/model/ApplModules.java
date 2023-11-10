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
@Table(name= "APPL_MODULES")
public class ApplModules {
	
	@Id
	@Column (name="MODULE_ID" ,length=5, nullable = false)
	private Integer modulesId;
	
	@Column (name="MODULE_NAME", length=50,  nullable = false)
	private String modulesName;
	
	@Column (name="MODULE_DESC",length=300)
	private Character modulesDesc;
	
	@Column (name="MODULE_ENV_NAME" ,length=50)
	private Integer modulesEnvName;
	
	@Column (name="MODULE_CREATED_BY",length=30)
	private String modulesCreatedBy;
	
	@Column (name="MODULE_UPDATE_BY",length=30)
	private String modulesUpdatedBy;
	
	@Column (name="MODULE_CREATED_DATE")
	private Date modulesCreatedDate;
	
	@Column (name="MODULE_UPDATE_DATE")
	private Date ModulesUpdatedDate;
	

}

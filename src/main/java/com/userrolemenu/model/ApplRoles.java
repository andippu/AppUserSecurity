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
@Table(name = "APPL_ROLES")
public class ApplRoles {
	  
	@Id
	@Column (name="ROLE_ID" ,nullable = false)
	private int rolesId;
	
	@Column (name="ROLE_NAME", length=100,  nullable = false)
	private String rolesName;
	
	@Column (name="ROLE_DESCRIPTION",length=300)
	private String roleDescription;
	
	@Column (name="ROLE_CREATED_BY",length=30)
	private String roleCreatedBy;
	
	@Column (name="ROLE_UPDATED_BY",length=30)
	private String roleUpdatedBy;
	
	@Column (name="ROLE_CREATED_DATE")
	private Date roleCreatedDate;
	
	@Column (name="ROLE_UPDATED_DATE")
	private Date roleUpdatedDate;

}



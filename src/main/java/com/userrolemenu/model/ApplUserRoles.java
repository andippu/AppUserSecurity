package com.userrolemenu.model;

import java.util.Date;
import java.util.UUID;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "APPL_USERROLES")
@IdClass(ApplUserRolesCompKey.class)
public class ApplUserRoles {
	   
	
	@Id
	@Column (name="USER_ID",length=30,  nullable = false)
	private String userId;
	
	@Id
	@Column (name="ROLE_ID",length=8,  nullable = false)
	private Integer roleId;
	
	@Column (name="CREATED_BY", length=30)
    private String createdBy;
	
	@Column (name="CREATED_DATE")
	
    private Date createDate;
	
	@Column (name="UPDATED_BY", length=30)
    private String updatedBy;
	
	@Column (name="UPDATED_DATE")
    private Date updatedDate;
	
	@Column (name="EFF_FROM_DATE")
    private Date effFromDate;
	
	@Column (name="EFF_TO_DATE")
    private Date effToDate;
	
}

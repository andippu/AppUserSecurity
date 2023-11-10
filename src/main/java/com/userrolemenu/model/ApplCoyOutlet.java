package com.userrolemenu.model;

import java.util.Date;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "APPL_COYOUTLET")

public class ApplCoyOutlet {
	 @Id
	  @Column(name="COYOUTLET_ID",length=5,  nullable = false)
	  private String coyOutletId;
	  
	  @Column(name="COYOUTLET_NAME",length=100)
	  private String coyOutletName;
	  
	  @Column(name="COYOUTLET_STREET ",length=200)
	  private String coyOutletStreet;
	  
	  @Column(name="COYOUTLET_KEL",length=30)
	  private String coyOutletKel;
	  
	  @Column(name="COYOUTLET_KEC",length=30)
	  private String coyOutletKec;
	  
	  @Column(name="COYOUTLET_KABKOTA",length=30)
	  private String coyOutletKabKota;
	  
	  @Column(name="COYOUTLET_KODEPOS",length=5)
	  private String coyOutletKodePos;
	  
	  @Column(name="COYOUTLET_PROV",length=50)
	  private String coyOutletProv;
	  
	  @Column(name="COYOUTLET_CREATED_BY",length=30)
	  private String coyOutletCreateBy;
	  
	  @Column(name="COYOUTLET_CREATED_DATE")
	  private Date coyOutletCreateDate;
	  
	  @Column(name="COYOUTLET_UPDATED_BY",length=30)
	  private String coyOutletUpdateBy;
	  
	  @Column(name="COYOUTLET_UPDATED_DATE")
	  private Date coyOutletUpdateDate;
	  
	  @Column(name="COYOUTLET_BRHEAD_ID",length=10)
	  private String coyOutletBrHeadId;
	  
	  @Column(name="COYOUTLET_CRHEAD_ID",length=10)
	  private String coyOutletCrHeadId;
	  
	  @Column(name="COYOUTLET_COLHEAD_ID",length=10)
	  private String coyOutletCollHeadId;
	  
	  @Column(name="COYOUTLET_TYPE",length=1)
	  private String coyOutletType;
	  
	  @Column(name="COYOUTLET_AREA_ID",length=5)
	  private String coyOutletAreaId;
	  
	  @Column(name="COYOUTLET_BRANCH",length=5)
	  private String coyOutletBranch;
	  
	  @Column(name="COYOUTLET_STATUS",length=1)
	  private String coyOutletStatus;
	  
	  @Column(name="COYOUTLET_BI_CODE",length=10)
	  private String coyOutletBICode;
	  
	  @Column(name="COYOUTLET_COSTCENTER",length=20)
	  private String coyOutletCostCentre;
	  
	  @Column(name="PLATFORM",length=1 )
	  private String coyOutletPlatform;
}
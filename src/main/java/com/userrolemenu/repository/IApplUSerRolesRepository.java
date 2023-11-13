package com.userrolemenu.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.userrolemenu.model.ApplUserRoles;
import com.userrolemenu.model.ApplUserRolesCompKey;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.transaction.Transactional;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IApplUSerRolesRepository  extends JpaRepository<ApplUserRoles, ApplUserRolesCompKey> {
	
	@Query("select s from ApplUserRoles s where userId =?1")
	public List<ApplUserRoles> findByUserId(String UserId);
	
	@Query("select s from ApplUserRoles s where userId =?1 and roleId=?2")
	public Optional<ApplUserRoles> getUserRoles(String UserId, Integer roleId);	
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query ("Update ApplUserRoles s set s.roleId =?1, s.effFromDate=?2, s.effToDate=?3, s.updatedBy=?4, s.updatedDate=?5 where s.userId =?6 and s.roleId=?7")
	public void updateUserRole(Integer roleId, Date effFromDate, Date effToDate, String updatedBy, Date updatedDate, String userIdOld, Integer roleIdOld );

}

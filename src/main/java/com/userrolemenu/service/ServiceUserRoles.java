package com.userrolemenu.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import com.userrolemenu.model.ApplUserRoles;
import com.userrolemenu.model.ApplUsers;
import com.userrolemenu.repository.IApplUSerRolesRepository;

@Service
public class ServiceUserRoles {
	@Autowired
	IApplUSerRolesRepository repoUserRoles;
	
	public List<ApplUserRoles> getUserById(String userId){
		 return repoUserRoles.findByUserId(userId);
	}
	
	public Optional<ApplUserRoles> getUserRoleId(String userId, Integer roleId){
		return repoUserRoles.getUserRoles(userId, roleId);
	}
	
	 public void addUserRoles (ApplUserRoles data) {
		  repoUserRoles.saveAndFlush(data);
	 }
	 
	 public void putUserRole(Integer roleId, Date effFromDate, Date effToDate, String updatedBy, Date updatedDate, String userIdOld, Integer roleIdOld ) {
		 System.out.println("aaaaaa : "+roleId+" - "+effFromDate+" - "+userIdOld+" - "+roleIdOld);
		 repoUserRoles.updateUserRole(roleId, effFromDate, effToDate, updatedBy, updatedDate,userIdOld, roleIdOld);
	 }

}

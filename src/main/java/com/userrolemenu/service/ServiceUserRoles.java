package com.userrolemenu.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
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

}

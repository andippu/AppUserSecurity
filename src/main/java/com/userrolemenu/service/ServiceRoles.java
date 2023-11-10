package com.userrolemenu.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userrolemenu.model.ApplRoles;
import com.userrolemenu.repository.IApplRolesRepository;



@Service
public class ServiceRoles {
	@Autowired
	IApplRolesRepository repoRoles;

	public Optional<ApplRoles> getRoleName(Integer roleId) {
		return repoRoles.findById(roleId);
	}


}

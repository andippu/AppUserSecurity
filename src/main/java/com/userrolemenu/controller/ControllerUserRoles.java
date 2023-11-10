package com.userrolemenu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userrolemenu.model.ApplUserRoles;
import com.userrolemenu.model.ApplUsers;
import com.userrolemenu.service.ServiceUserRoles;

@RestController
public class ControllerUserRoles {
	@Autowired
	ServiceUserRoles serviceUserRoles;
	
	@GetMapping("/users/getuserroles")
	public List<ApplUserRoles> getUser(String userId){
		return serviceUserRoles.getUserById(userId);
	}

}

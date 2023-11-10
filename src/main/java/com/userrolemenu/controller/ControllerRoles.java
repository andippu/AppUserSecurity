package com.userrolemenu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userrolemenu.model.ApplRoles;
import com.userrolemenu.service.ServiceRoles;


@RestController
public class ControllerRoles {
	
	@Autowired
	ServiceRoles serviceRoles;
	
	@GetMapping("/role/getrolename")
	public Optional<ApplRoles>  getRoleName(Integer roleId) {
		return serviceRoles.getRoleName(roleId);
	}

}

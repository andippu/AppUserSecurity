package com.userrolemenu.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.userrolemenu.model.ApplUsers;
import com.userrolemenu.service.ServiceUsers;

@RestController
public class ControllerUser {
	@Autowired
	ServiceUsers serviceUsers;
	
	@GetMapping("/users/getusers")
	public List<ApplUsers> getUser(){
		return serviceUsers.getUsers();
	}
	
	@GetMapping("/users/checklogin")
	public String checkLogin(String userId, String userPass){
		String vstring = serviceUsers.checkLogin(userId, userPass);
		Integer vt=vstring.length();
		return vstring;
	}
	
	@GetMapping("/users/getuserbyid")
	public Optional<ApplUsers> getUserById(String userId){
		 return serviceUsers.getUserById(userId);
	}
	
	@PostMapping("/users/adduser")
	public ApplUsers addUser(@RequestBody ApplUsers data){
		return serviceUsers.addUser(data);
	}
	
	@DeleteMapping("/users/deleteuser")
	public void delUserById  (String id) {
		serviceUsers.delUserById(id);
	}
	
	
	

}







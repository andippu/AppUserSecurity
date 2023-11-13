package com.userrolemenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.userrolemenu.model.ApplUsers;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IApplUsersRepository extends JpaRepository<ApplUsers, String>{
	

	@Procedure(procedureName = "P_GX_CHECK_LOGIN")
	public String getCheckLogin(String userId, String userPass);

}

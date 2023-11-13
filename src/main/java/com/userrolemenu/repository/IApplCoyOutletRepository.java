package com.userrolemenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.userrolemenu.model.ApplCoyOutlet;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IApplCoyOutletRepository extends JpaRepository<ApplCoyOutlet, String>{
	
	@Query("select s.coyOutletName from ApplCoyOutlet s where coyOutletId =?1")
	public String getOutletName(String pass);
}

package com.userrolemenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.userrolemenu.model.ApplRoles;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IApplRolesRepository extends JpaRepository<ApplRoles, Integer>{

	@Query("select s.rolesName from ApplRoles s where rolesId =?1")
    public String getRoleNames(Integer rolesId);

}

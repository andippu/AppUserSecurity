package com.userrolemenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.userrolemenu.model.ApplRoles;

@Repository
public interface IApplRolesRepository extends JpaRepository<ApplRoles, Integer>{

	@Query("select s.roleName from ApplRoles s where rolesId =?1")
    public String getRoleNames(Integer rolesId);

}

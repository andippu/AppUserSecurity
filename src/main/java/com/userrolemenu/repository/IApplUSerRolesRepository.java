package com.userrolemenu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.userrolemenu.model.ApplUserRoles;

@Repository
public interface IApplUSerRolesRepository  extends JpaRepository<ApplUserRoles, String> {
	
	@Query("select s from ApplUserRoles s where userId =?1")
	public List<ApplUserRoles> findByUserId(String UserId);

}

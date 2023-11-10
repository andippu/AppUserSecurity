package com.userrolemenu.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.userrolemenu.model.ApplCoyOutlet;
import com.userrolemenu.repository.IApplCoyOutletRepository;

@Service
public class ServiceCoyOutlet {
	@Autowired
	IApplCoyOutletRepository repoCoyOutlet;
	
	public String getOutletName(String outletId) {
		return repoCoyOutlet.getOutletName(outletId);
	}

}

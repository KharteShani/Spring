package com.sk.service;

import com.sk.dao.EmployeeDAO;

public class EmployeeDAOServiceImpl implements EmployeeDAOService{
	
	EmployeeDAO dao=null;
	
	public EmployeeDAOServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}
			
	public int fetchEmployeeCount() {
        int count=0;
		count=dao.getEmployeeCount();
		//System.out.println(count);
		return count;
	}
}

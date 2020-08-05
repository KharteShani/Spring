package com.sk.service;

import com.sk.dao.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDAO dao;

	public EmployeeServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}

	public int fetchEmployeeCount() {
		int count = 0;
		count = dao.getEmpsCount();
		return count;
	}

}

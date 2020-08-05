package com.sk.dao;

import com.sk.bo.EmployeeBo;
import com.sk.bo.StudentBo;

public class ClgDaoImpl implements ClgDAO {
	
	@Override
	public int insertStud(StudentBo bo) {
		System.out.println("ClgDaoImpl.insertStud()::Inserting Data student data"+bo.toString());;
		return 1;
	}

	@Override
	public int insertEmp(EmployeeBo bo) {
		System.out.println("ClgDaoImpl.insertEmp()::Inserting Data Employee data"+bo.toString());
		return 1;
	}
}

package com.sk.service;

import org.springframework.beans.BeanUtils;

import com.sk.bo.EmployeeBo;
import com.sk.bo.StudentBo;
import com.sk.dao.ClgDAO;
import com.sk.dto.EmployeeDto;
import com.sk.dto.StudentDto;

public abstract class ClgMgmtServiceImpl implements ClgMgmtService {
	private ClgDAO dao;
	
	public ClgMgmtServiceImpl(ClgDAO dao) {
		System.out.println("ClgMgmtServiceImpl:: 0-param construtor");
		this.dao = dao;
	}
	
	public abstract StudentBo createStudentBO();
	public abstract EmployeeBo createEmployeeBO();
	
	@Override
	public String registerStud(StudentDto dto) {
		StudentBo bo=null;
		int count=0;
		//get StudentBO class object by using LMI
		bo=createStudentBO();
		//convert dto to bo
		BeanUtils.copyProperties(dto, bo);
		//use Dao
		count=dao.insertStud(bo);
		if(count==0)
			return "student Registration failed";
		else
			return"Student Registration Succeded";
	}

	@Override
	public String registerEmpl(EmployeeDto dto) {
		int count=0;
		EmployeeBo bo=null;
		//get StudentClass obj by using LMI
		bo=createEmployeeBO();
		//convert dto to bo
		BeanUtils.copyProperties(dto, bo);
		//use DAO
		count=dao.insertEmp(bo);
		if(count==0)
			return "Employee Registration failed";
		else
			return "Employee Registration Succeded";	
	}
}

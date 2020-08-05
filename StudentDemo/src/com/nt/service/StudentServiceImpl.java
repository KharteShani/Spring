package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao;
	
	public StudentServiceImpl(StudentDAO dao) {
		this.dao = dao;
	}

	@Override
	public String generateResult(StudentDTO dto)throws Exception {
		//write b.logic
		int total=dto.getM1()+dto.getM2()+dto.getM3();
		float avg=(float)total/3.0f;
		String result=null;
		
		if(avg<35)
			result="Fail";
		else
			result="pass";
		
		StudentBO bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		//we are passing Value through the setter method of insert(inside business obj class) of dao
		int cnt=dao.insert(bo);
		//taken from business object class for return the result and sno 
		if(cnt==0)
			return "Result:"+bo.getResult()+" "+bo.getSno()+"Registration Failed";
			else
			return "Result"+bo.getResult()+" "+bo.getSno()+"Registration Successed";
	}
}

package com.sk.service;

import com.sk.dto.EmployeeDto;
import com.sk.dto.StudentDto;

public interface ClgMgmtService {
	public String registerStud(StudentDto dto);
	public String registerEmpl(EmployeeDto dto);
}

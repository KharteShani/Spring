package com.sk.dao;

import com.sk.bo.EmployeeBo;
import com.sk.bo.StudentBo;

public interface ClgDAO {
	public int insertStud(StudentBo bo);
	public int insertEmp(EmployeeBo bo);
}

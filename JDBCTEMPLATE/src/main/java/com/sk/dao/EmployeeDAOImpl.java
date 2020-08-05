package com.sk.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMPS_COUNT="SELECT COUNT(*) FROM EMP";
	public JdbcTemplate  jt;
	
	public EmployeeDAOImpl(JdbcTemplate jt) {
		System.out.println("JdbcTemplate-Constructor");
		this.jt = jt;
	}

	public int getEmpsCount() {
		int count=0;
		count=jt.queryForObject(GET_EMPS_COUNT, Integer.class);
		return count;
	}

}

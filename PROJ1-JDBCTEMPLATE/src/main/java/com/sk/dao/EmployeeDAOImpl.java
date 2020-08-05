package com.sk.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMP_COUNT = "SELECT COUNT(*) FROM EMP";
	public JdbcTemplate jt=null;

	public EmployeeDAOImpl(JdbcTemplate jt) {
		System.out.println("EmployeeDAOImpl() :: JdbcTemplate");
		this.jt = jt;
	}

	public int getEmployeeCount() {
		int count = 0;
		count = jt.queryForObject(GET_EMP_COUNT, Integer.class);
		return count;
	}
}

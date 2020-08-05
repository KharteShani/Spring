package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO{
	private static final String STUDENT_INSERT_QUERY="INSERT INTO SP_STUDENT VALUES(?,?,?,?,?)";
	
	private DataSource ds;
	public StudentDAOImpl(DataSource ds) {
		System.out.println("StudentDAOImpl :: 1-param  constructor");
		this.ds=ds;
	}
	
	@Override
	public int insert(StudentBO bo) throws Exception {
			//Create the connection
			Connection con=ds.getConnection();
			//prepare the Statement
			PreparedStatement ps=con.prepareStatement(STUDENT_INSERT_QUERY);
			//set Query param values
			//take the processed values from business object class
			ps.setInt(1,bo.getSno());
			ps.setString(2,bo.getSname());
			ps.setInt(3, bo.getTotal());
			ps.setFloat(4,bo.getAvg());
			ps.setString(5,bo.getResult());
			//query will be executed
			int result=ps.executeUpdate();
			ps.close();
			con.close();
			return result;
		} 
}

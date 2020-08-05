package com.sk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.sk.bo.PassBO;

public class PassDAOImpl implements PassDAO {
	private static final String INSERT_VALUES="INSERT INTO RAILWAYPASS VALUES(?,?,?,?,?,?,?)";
	private DataSource ds;
	
	public PassDAOImpl(DataSource ds) {
		System.out.println("PassImpl :: 1-param constructor");
		this.ds = ds;
	}

	@Override
	public int insert(PassBO bo) throws Exception {
		//get the JDBC Connection
		Connection con=ds.getConnection();
		
		// create preparedStatement
		PreparedStatement ps=con.prepareStatement(INSERT_VALUES);
		
		//set the values to query param
		ps.setInt(1,bo.getTiketno());
		ps.setString(2, bo.getPassname());
		ps.setString(3, bo.getPassaddress() );
		ps.setInt(4, bo.getPassage());
		ps.setString(5, bo.getSourceplace());
		ps.setString(6, bo.getDestplace());
		ps.setFloat(7,bo.getTicketCharge());
	//	ps.setString(8,bo.getPassValidation());
		//execute Query
		int rs=ps.executeUpdate();
		
		if(rs==0) {
			System.out.println("Passenger ticket Data is not Inserted");
		}
		else {
			System.out.println("Passenger ticket data is inserted");
		}
		ps.close();
		con.close();
		return 0;
	}
}

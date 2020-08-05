package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;
import com.nt.bo.LaptopBO;

public class LaptopDAOImpl implements LaptopDAO {
	public static final String INSERT_QUERY = ("INSERT INTO laptopdetails(lapname,lapprice,laplength,lapweight) VALUES(?,?,?,?)");
	DataSource ds=null;
	
	public LaptopDAOImpl(DataSource ds) {
		this.ds=ds;
		System.out.println("LaptopDAOImpl:: 0-PARAM CONSTRUCTOR");
	}
	
	Connection con = null;

	PreparedStatement ps = null;
	String lapname;
	
	//float lapprice, laplength, lapweight;;
	int rs = 0;

	@Override
	public String insert(LaptopBO bo) throws Exception {
		
			// load the Driver
			//Class.forName("com.mysql.cj.jdbc.Driver");
			// Establish the Connection object
			con = ds.getConnection();
			// set the values
			if (con != null) {
				ps = con.prepareStatement(INSERT_QUERY);
				
				ps.setString(1, bo.getLapname());
				ps.setFloat(2, bo.getLapprice());
				ps.setFloat(3, bo.getLaplength());
				ps.setFloat(4, bo.getLapweight());
			}
			// execute the query
			if (ps != null) {
				rs = ps.executeUpdate();
			}

			if (rs == 0) {
				System.out.println("Data is not inserted");
			} else {
				System.out.println("Data is inserted");
			}
			
			ps.close();
			con.close();
		return null;
	}
}

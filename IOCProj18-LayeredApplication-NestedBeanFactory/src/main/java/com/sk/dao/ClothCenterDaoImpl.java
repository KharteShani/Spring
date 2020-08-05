package com.sk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.sk.bo.ClothCenterBo;

public class ClothCenterDaoImpl implements ClothCenterDao{
public static final String GET_CLOTHCENTERSTORE="SELECT STORENO,STORENAME,STOREADDRESS,CONTACTNO,BRAND,PRICE FROM CLOTHCENTER WHERE BRAND IN(?,?)";	
	private DataSource ds;
	
	public ClothCenterDaoImpl(DataSource ds) {
		this.ds=ds;
	}
	@Override
	public List<ClothCenterBo> getClothsByBrand(String brand1, String brand2) throws Exception {
		Connection con=null;	
		PreparedStatement ps=null;
		ResultSet rs=null; 
		List<ClothCenterBo> listBo=null;
		ClothCenterBo bo=null;
		try {
		//get Pooled jdbc con object
		con=ds.getConnection();
		//create PreparedStatement Object
		ps=con.prepareStatement(GET_CLOTHCENTERSTORE);
		//set Query parameter value
		ps.setString(1, brand1);
		ps.setString(2, brand2);
		//execute the Query
		rs=ps.executeQuery();
		//copy the ResultSet Object records List of Bo objs
		listBo=new ArrayList();
		
			while(rs.next()) {
				//copy each to one BO class object
				bo=new ClothCenterBo();
				bo.setStoreno(rs.getInt(1));
				bo.setStorename(rs.getString(2));
				bo.setStoreaddress(rs.getString(3));
				bo.setContactno(rs.getLong(4));
				bo.setBrandname(rs.getString(5));
				bo.setPrice(rs.getFloat(6));
				//add each object of bo class to ArrayList
				listBo.add(bo);
			}//while
		}//try
		catch(SQLException se) {
			throw se;
		}
		finally {
			//close the jdbc objs
			try {
				if(rs!=null)
					rs.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(ps!=null)
					ps.close();
			}
			catch(	SQLException se) {
				se.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}
			catch(	SQLException se) {
				se.printStackTrace();
			}
		}
		
		return listBo;
	}//method
}//class

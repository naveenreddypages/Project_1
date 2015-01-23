package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import com.bean.RegistrationBean;
import com.bean.orderBean;
import com.connection.myconnection;

public class Mydao {
	  
	static PreparedStatement ps;
	public static boolean register(RegistrationBean rb)
	{
		

	int res=0;
	try {
		Connection conn=myconnection.getConnection();
			ps=conn.prepareStatement(("INSERT INTO budget  VALUES (?,?,?,?,?,?,?)"));
			ps.setString(1, rb.getFname());
	        ps.setString(2, rb.getLname());
	        ps.setString(3, rb.getEmail());
	        ps.setString(4, rb.getPassword());
	        ps.setString(5, rb.getMno());
	        ps.setString(6, rb.getAdloc());
	        ps.setString(7, rb.getAdrs());
	       
	        res=ps.executeUpdate();
	        
	} catch (Exception e) {
		e.printStackTrace();
	}
	if(res>0)
		return true;
	else
		return false;
	
	}
	public static  boolean userlogin(RegistrationBean rb)
	{
		boolean status=false;
		try
		{
			
		Connection conn=myconnection.getConnection();
	
	 ps=conn.prepareStatement("SELECT * from budget where email =? and password=?");
	       ps.setString(1, rb.getEmail());
	       ps.setString(2, rb.getPassword());
		
		ResultSet rs=ps.executeQuery();
		    status=rs.next();
		  
		    
		    
		    System.out.println(status);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;
	}
	public static boolean validate(orderBean ob)
	{
		

	int res=0;
	try {
		Connection conn=myconnection.getConnection();
			ps=conn.prepareStatement(("INSERT INTO orders  VALUES (?,?,?,?,?)"));
			ps.setString(1, ob.getUsername());
	        ps.setString(2, ob.getDat());
	        ps.setString(3, ob.getTime() );
	        ps.setString(4, ob.getWeight());
	        ps.setString(5, ob.getStatus());
	       
	       
	        res=ps.executeUpdate();
	        
	} catch (Exception e) {
		e.printStackTrace();
	}
	if(res>0)
		return true;
	else
		return false;
	
	}
	

}

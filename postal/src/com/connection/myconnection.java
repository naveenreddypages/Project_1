package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class myconnection {
	static Connection con=null;
	public static Connection getConnection()
	{
		 try{
		        
			 Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE ","system","tiger");
				      	System.out.println("i am here");
	       
	}catch(Exception se)
    {
        se.printStackTrace();
    }
		 return con;
	}

}

package com.gmans.tryPack1;

import java.sql.*;

public class jdbcConnection {
	
	public static void main (String[] args){
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			System.out.println(con);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}

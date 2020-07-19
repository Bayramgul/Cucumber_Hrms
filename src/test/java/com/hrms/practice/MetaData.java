package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;


public class MetaData {
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
//	jdbc:java database connectivity
//jdbc:drivertype(mysql)://hostname(get it from sql):port/db name 
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	@Test
	public void dbMetaData() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
//	addtional info about our db
		DatabaseMetaData dbMetaData = conn.getMetaData();
		String driverName = dbMetaData.getDriverName();
		String dbVersion = dbMetaData.getDatabaseProductVersion();
		System.out.println(driverName);
		System.out.println(dbVersion);
	}

	@Test // query - display all the info about employee whose em_number is 14688
	public void rsMetaData() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from hs_hr_employees where emp_number=14688");
//	An object that can be used to get information about the types and properties of the columns in a ResultSet object.
	ResultSetMetaData rsMetadata=rs.getMetaData();
	int colnumber=rsMetadata.getColumnCount();
	System.out.println(colnumber);
	String colName1=rsMetadata.getColumnName(1);
	System.out.println(colName1);
	
	for(int i=1; i<=colnumber;i++){
		System.out.println(rsMetadata.getColumnName(i));
	}
	}
}

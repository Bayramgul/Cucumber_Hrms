package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Recap {

//	1.We need to build connection with db by using static getConnection() method of DriverManager Class-->
	public static Connection conn;
//	2.Create a statement
	public static Statement stat;
//	3.Get resultSet
	public static ResultSet resultSet;
//	4.get the resultsetmeta data
	public static ResultSetMetaData rsMetadt;
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String query = "select * from hs_hr_emp_skill";
// jdbc:drivertype(mysql)://hostname(get it from sql):port/db name
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	@Test
	public void getConnected() throws SQLException {
		conn=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
		DatabaseMetaData dbMetaData=conn.getMetaData();
		String dbName=dbMetaData.getDatabaseProductName();
		System.out.println(dbName);
		stat=conn.createStatement();
		resultSet=stat.executeQuery(query);
		rsMetadt=  resultSet.getMetaData();
		int colCount=rsMetadt.getColumnCount();
		for (int i = 1; i <= colCount; i++) {
			String colName=rsMetadt.getColumnName(i);
			System.out.println(" Column Name:"+colName);
		}
		String id;
		String name;
		while(resultSet.next()) {
			id=resultSet.getObject("skill_id").toString();
			System.out.println(id);
//			name=resultSet.getObject("years_of_exp").toString();
		}
	}
}

package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;


public class EnhancedDataStoring {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	String query="select * from ohrm_language";
	@Test
	public void stroreData() throws SQLException {
		Connection	conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement	stat = conn.createStatement();
		ResultSet	resultSet = stat.executeQuery(query);
		ResultSetMetaData rsMetaData=  resultSet.getMetaData();
		List<Map<String,String>> listData =new ArrayList<>();
		Map<String,String> mapData;
		
		while(resultSet.next()) {//while loop is for rows
			mapData=new LinkedHashMap<String, String>();
			for(int i=1; i<=rsMetaData.getColumnCount();i++) {//for loop is for columns
				mapData.put(rsMetaData.getColumnName(i), resultSet.getObject(i).toString());
				
			}
			listData.add(mapData);
		}
		System.out.println(listData);
	}
}

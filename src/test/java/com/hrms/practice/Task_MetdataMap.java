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

public class Task_MetdataMap {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	String query = "select id, name from ohrm_location";
	// display the information from nationality table, 
	//but display id “nationality id”, name = “nationality”
	@Test
	public void getAndStoreData() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement stat = conn.createStatement();
		ResultSet resultSet = stat.executeQuery(query);
		ResultSetMetaData metadata=resultSet.getMetaData();
		List<Map<String, String>> listOfData = new ArrayList<>();
		Map<String, String> mapData;
		
		while(resultSet.next()) {
			mapData=new LinkedHashMap<String, String>();
			for(int i=1; i<=metadata.getColumnCount();i++) {
				mapData.put("nationality id", resultSet.getObject(i).toString());//store column data as key(colname/header), value(data under header)  pair 
				mapData.put("nationality", resultSet.getObject(i).toString());
			}
			listOfData.add(mapData);
		}
		System.out.println(listOfData);
	}
}

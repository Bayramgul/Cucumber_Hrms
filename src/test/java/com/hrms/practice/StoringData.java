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


public class StoringData {
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	String query="select id,name,country_code from ohrm_location";
	@Test
	public void getAndStoreData() throws SQLException {
	Connection	conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
	Statement	stat = conn.createStatement();
	ResultSet	resultSet = stat.executeQuery(query);
	List<Map<String,String>> listOfData= new ArrayList<>();
	Map<String,String> mapData;
	while(resultSet.next()) {
		mapData=new LinkedHashMap<String, String>();//reason why we initalize the map inside  the while loop is bcuz we want same key but different value
		mapData.put("id", resultSet.getObject("id").toString());//so that our data do not get  overwritten 
		mapData.put("Office name", resultSet.getObject("name").toString());
		mapData.put("Country code", resultSet.getObject("Country_code").toString());
		listOfData.add(mapData);// storing list into our map 
//		resultSet.close();
//		stat.close();
//		conn.close();
		
	}
	System.out.println(listOfData);
	
	}
	@Test
	public void retrieveAndStroreDataEncanced() throws SQLException {
		Connection	conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement	stat = conn.createStatement();
		ResultSet	resultSet = stat.executeQuery("select * from ohrm_job_title");
		ResultSetMetaData metadata=resultSet.getMetaData();
		List<Map<String,String>> listData= new ArrayList<>();
		Map<String,String> mapData;
		while(resultSet.next()) {
			mapData=new LinkedHashMap<String, String>();
			for(int i=1; i<=metadata.getColumnCount();i++) {
				mapData.put(metadata.getColumnName(i), resultSet.getObject(i).toString());//store column data as key(colname/header), value(data under header)  pair 
			}
			listData.add(mapData);
		}
		System.out.println(listData);
	}
}

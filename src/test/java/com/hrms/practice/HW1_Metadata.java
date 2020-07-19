package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

// hw get the resultset metadata store it in the arraylist and retrieve it from arraylist 
// also get column type name, get the table names
public class HW1_Metadata {
//1.We need to build connection with db by using static getConnection() method of DriverManager Class-->
	public static Connection conn;
//	2.Create a statement
	public static Statement stat;
//	3.Get resultSet
	public static ResultSet resultSet;
//	4.get the resultsetmeta data
	public static ResultSetMetaData rsMetadt;
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String query = "select emp_number, emp_firstname,name "
			+ "from hs_hr_employees emp inner join ohrm_nationality nation\n" + "on emp.nation_code=nation.id\n"
			+ "where nation.name like ('a%')";
// jdbc:drivertype(mysql)://hostname(get it from sql):port/db name
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	@Test
	public void metaDataRs() throws SQLException {
		conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		stat = conn.createStatement();
		resultSet = stat.executeQuery(query);
		rsMetadt = resultSet.getMetaData();
		int colNum = rsMetadt.getColumnCount();
		System.out.println("________________________________________________");
		System.out.println("TABLE NAMES:  " + rsMetadt.getTableName(1) + " | " + rsMetadt.getTableName(3));
		System.out.println("________________________________________________");
		for (int i = 1; i <= colNum; i++) {
		System.out.println(rsMetadt.getColumnName(i) + " --> " + rsMetadt.getColumnTypeName(i));
		}
		System.out.println("________________________________________________");

		List<String> empName = new ArrayList<>();
		List<String> empNation = new ArrayList<>();
		List<Integer> empnum = new ArrayList<>();

		while (resultSet.next()) {
			empnum.add(resultSet.getInt("emp_number"));
			empName.add(resultSet.getObject("emp_firstname").toString());
			empNation.add(resultSet.getObject("name").toString());
		
		}
		for (int i = 1; i < empName.size(); i++) {
			System.out.println( empnum.get(i)+ "      " +empName.get(i) + "        " + empNation.get(i));

		}

	}

}

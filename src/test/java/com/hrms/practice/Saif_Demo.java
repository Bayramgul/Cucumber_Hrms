package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class Saif_Demo {
	public static Connection connection;
	public static Statement statement;
	public static ResultSet resultSet = null;
	public static String dbUsername = "syntax_hrm";
	public static String dbPassword = "syntaxhrm123";
	// JDBC: driver type:hostname:port/dbName
	public static String url = "jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
	@BeforeClass
	public static void DBConnection() {
		try {
			connection = DriverManager.getConnection(url, dbUsername, dbPassword);
			statement = connection.createStatement();
		} catch (SQLException e) {
			System.out.println("Connection NOT successful");
		}
	}
	public static void executeCode(String query)  {
			try {
				resultSet = statement.executeQuery(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static ResultSet getResultSet() {
		return resultSet;
	}
	@AfterClass
	public static void closeDB() {
		try {
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}

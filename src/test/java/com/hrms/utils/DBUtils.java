package com.hrms.utils;

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

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class DBUtils {
	private static Connection conn;
	private static Statement st;
	private static ResultSet rs;
	private static ResultSetMetaData metadata;
	private static List<Map<String, String>> listData;
	private static Map<String, String> mapdata;
	private static Map<String, String> mapData;

	/**
	 * this method will establish a connection with db
	 */
	@BeforeClass
	public static void getConnection() {
		try {
			conn = DriverManager.getConnection(ConfigsReader.getProperty("dbUrl"),
					ConfigsReader.getProperty("dbUsername"), ConfigsReader.getProperty("dbPassword"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method will create a Stetement
	 */
//	public static void createStatement() {
//		try {
//			st = conn.createStatement();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * This method will return resultset
	 */
//	public static ResultSet getResultSet(String query) {
//		try {
//			rs = st.executeQuery(query);
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return rs;
//	}

	/**
	 * This method will retrieve the data of resultset and will return the
	 * ResultSetMetaData
	 * 
	 * @return
	 */
//	public static ResultSetMetaData getRsMetaData() {
//		try {
//			metadata = rs.getMetaData();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return metadata;
//	}

	/**
	 * This method will store the column data as key and value pair and return
	 * List<Map<String,String>>
	 * 
	 * @return
	 */
	public static List<Map<String, String>> storeDataFromDB(String sqlQuery) {
		try {
			getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sqlQuery);
			ResultSetMetaData rsMetaData = rs.getMetaData();
			listData = new ArrayList<>();

			while (rs.next()) {
				Map<String, String> mapData = new LinkedHashMap<>();
				for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
					mapData.put(rsMetaData.getColumnName(i), rs.getObject(i).toString());
				}
				listData.add(mapData);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listData;
	}

	/**
	 * this method will close a connection with db
	 */
	public static Map<String,String> DataFromDB_AsMap(String sqlQuery) {
		try {
			getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sqlQuery);
			ResultSetMetaData rsMetaData = rs.getMetaData();

			while (rs.next()) {
				 mapData = new LinkedHashMap<>();
				for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
					mapData.put(rsMetaData.getColumnName(i), rs.getObject(i).toString());
				}
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return mapData;
	}
	@AfterClass
	public static void closeConnection() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (st != null) {
				rs.close();
			}
			if (conn != null) {
				rs.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

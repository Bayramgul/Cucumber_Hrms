package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TAsk {

	@Test
	public void task() throws SQLException{
		String dbUsername="syntax_hrm";
		String dbPassword="syntaxhrm123";
		String dbUrl="jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
		Connection conn= DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st=conn.createStatement();
		ResultSet rs =st.executeQuery("select * from ohrm_job_title");
		String titles = rs.getObject("job_title").toString();
		List<String> jobTitles=new ArrayList<>();
		while (rs.next()) {
			jobTitles.add(titles);
			
			
		}
		for (String jt : jobTitles) {
			System.out.println(jt);
		}
	}
}

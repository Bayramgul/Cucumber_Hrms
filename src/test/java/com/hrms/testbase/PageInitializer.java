package com.hrms.testbase;

import com.hrms.pages.AddEmployeePage;
import com.hrms.pages.DashBoardPage;
import com.hrms.pages.EmployeeListPage;
import com.hrms.pages.LoginPageElemements;
import com.hrms.pages.PredefinedReportPage;
import com.hrms.pages.ViewPersonalDetails;
import com.hrms.pages.sauceDemoLoginPage;

public class PageInitializer extends BaseClass {
	public static LoginPageElemements login;
	public static DashBoardPage dashboard;
	public static ViewPersonalDetails pdetails;
	public static AddEmployeePage addEmp;
	public static sauceDemoLoginPage demosauce;
	public static EmployeeListPage empList;
	public static PredefinedReportPage reports;
	public static void initialize() {
		login = new LoginPageElemements();
		dashboard = new DashBoardPage();
		pdetails = new ViewPersonalDetails();
		addEmp = new AddEmployeePage();
		demosauce = new sauceDemoLoginPage();
		empList=new EmployeeListPage();
		reports=new PredefinedReportPage();
	}

}

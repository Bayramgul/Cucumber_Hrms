package com.hrms.utils;

public class Constants {
	//first we are creating constants for the path for chrome and gecko driver,and path for configuration file
public static final  String CONFIGURATION_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/configs/privateinfo.properties";
public static final String EXCELDATA_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/TestData/TestData.xlsx";
public static final String REPORTER_FILEPATH=System.getProperty("user.dir")+"/html-report/HRMS.html";
public static final String SCREENSHOT_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/screenshots/";
public static final  int IMPLICIT_WAIT_TIME=10;
public static final int EXPLICIT_WAIT_TIME=25;

public static void main (String []args) {
	System.out.println(EXCELDATA_FILEPATH);
}
}
 
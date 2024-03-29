package com.training.constants;

public class Constants {
	
	//Executable constants
	public static final String CHROMEDRIVERPATH=System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";
	public static final String GECKODRIVERPATH=System.getProperty("user.dir")+"/src/test/resources/executables/geckodriver.exe";
	
	
	
	//File Path constants
	public static final String JSONFILEPATH = System.getProperty("user.dir")+"/src/test/resources/config/config.json";
	public static final String EXTENTREPORTPATH =System.getProperty("user.dir")+"/ExtentReports/index.html";
	public static final String EXTENTCONFIGFILEPATH= System.getProperty("user.dir")+"/src/test/resources/config/extent-config.xml";
	
	
	//Other constants
	public static final int IMPLICITWAIT = 20;
	public static final String CHROME= "chrome";
	public static final String FIREFOX = "firefox";
	public static final String MOZILLA = "mozilla";
}

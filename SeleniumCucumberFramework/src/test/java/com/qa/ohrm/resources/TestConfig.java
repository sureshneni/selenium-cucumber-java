package com.qa.ohrm.resources;

public class TestConfig {
	
	public static String qa_appUrl = "https://opensource-demo.orangehrmlive.com/";
	public static String stage_appUrl = "";
	public static String prod_appUrl = "";
	public static String qa_dashboard_url = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	
	public enum browserConfig {
		Chrome,
		Firefox,
		IE
	}
	
	public enum environment {
		QA,
		Stage,
		Prod
	}

}

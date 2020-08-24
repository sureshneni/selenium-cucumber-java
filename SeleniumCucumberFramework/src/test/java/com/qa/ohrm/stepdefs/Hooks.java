package com.qa.ohrm.stepdefs;


import org.testng.annotations.BeforeSuite;

import com.qa.ohrm.testbase.BaseTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public static BaseTest baseTest;
	
	@Before
	public static void driverCreation() {
		System.out.println("** Driver creation **");
		baseTest = new BaseTest();
		baseTest.initialize("Chrome");
	}
	
//	@BeforeSuite(alwaysRun = true)
//	public static void driverCreation() {
//		System.out.println("** Driver creation **");
//		baseTest = new BaseTest();
//		baseTest.initialize("Chrome");
//	}
	
	@After
	public void closeBrowser() {
		System.out.println("**close browser **");
		baseTest = new BaseTest();
		baseTest.tearDown();
	}

}

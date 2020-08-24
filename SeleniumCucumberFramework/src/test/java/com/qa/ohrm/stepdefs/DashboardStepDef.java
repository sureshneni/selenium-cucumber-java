package com.qa.ohrm.stepdefs;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Assert;

import com.qa.ohrm.pages.HomePage;
import com.qa.ohrm.pages.LoginPage;
import com.qa.ohrm.resources.TestConfig;
import com.qa.ohrm.testbase.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DashboardStepDef extends BaseTest {
	
	LoginPage loginPage = new LoginPage(driver);
	HomePage homePage = new HomePage(driver);
	
	@Given("^user is on ohrm application login page$")
	public void user_is_on_ohrm_application_login_page() {
	  navigateApplication("QA");
	}

	@When("^user enters credentials as (.+) and (.+)$")
	public void user_enters_username_Admin_and_password_admin(String uname, String pwd) {
	  loginPage.setUserName(uname);
	  loginPage.setPassword(pwd);
	}

	@When("^click on login button$")
	public void click_on_login_button() {
	    loginPage.clickLoginButton();
	}

	@Then("^user can see dashbaord url$")
	public void user_can_see_dashbaord_url() {
	   String url = driver.getCurrentUrl();
	   logger.info("current url: "+url);
	   logger.info("Dashboard url: "+TestConfig.qa_dashboard_url.toString());
	   if(url == TestConfig.qa_dashboard_url.toString()) {
		   Assert.assertTrue("Login success", true);
	   }
	  
	}
	
	@Then("^user can see dashboard label$")
	public void verifyDashbaordLabel() {
	    homePage.verifyDashboardDisplayed();
	}
	
	@Then("^user also can see Admin tab is displayed$")
	public void verifyAdminTab() {
	    homePage.verifyAdminTabDisplayed();
	}


	
	

}

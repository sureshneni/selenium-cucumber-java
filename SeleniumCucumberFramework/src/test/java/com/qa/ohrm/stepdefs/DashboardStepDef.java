package com.qa.ohrm.stepdefs;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DashboardStepDef {
	
	@Given("^user is on ohrm application login page$")
	public void user_is_on_ohrm_application_login_page() {
	    // Write code here that turns the phrase above into concrete actions

		System.out.println("Given demo");
	}

	@When("^user enters username Admin and password admin(\\d+)$")
	public void user_enters_username_Admin_and_password_admin(int arg1) {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("^click on login button$")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("^user can see dashbaord url$")
	public void user_can_see_dashbaord_url() {
	    // Write code here that turns the phrase above into concrete actions

		System.out.println("Then demo");
	}


	
	

}

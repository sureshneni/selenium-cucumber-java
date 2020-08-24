package com.qa.ohrm.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class HomePage {

	private WebDriver driver;
	
	@FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']")
	public WebElement adminTab;
	
	@FindBy(how = How.XPATH, using = "//div/h1[contains(text(),'Dashboard')]")
	public WebElement dashboardLable;
	
	/**
	 * Constructor to initialize the driver object.
	 * @param driver
	 */
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,  this);
	}
	
	/**
	 * 	Assertion gets pass if Admin Tab is displayed, else Assertion will gets fails.
	 */
	public void verifyAdminTabDisplayed() {
		Assert.assertTrue(adminTab.isDisplayed());
	}
	
	/**
	 * 	Assertion gets pass if Dashboard label is displayed, else Assertion will gets fails.
	 */
	public void verifyDashboardDisplayed() {
		Assert.assertTrue(dashboardLable.isDisplayed());
	}
	
	public void verifyDashbaordUrl() {
		
	}
}

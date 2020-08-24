package com.qa.ohrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy(how = How.ID, using = "txtUsername")
	public WebElement userName;
	
	@FindBy(how = How.ID, using = "txtPassword")
	public WebElement password;
	
	@FindBy(id = "btnLogin")
	public WebElement submit;
	
	
	/**
	 * Page constructor to initialize the driver object.
	 * @param driver
	 */
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * 
	 * @param uname user name comes from the feature file
	 * and this methods enters the username value in username field.
	 */
	public void setUserName(String uname) {
		userName.sendKeys(uname);
	}
	
	/**
	 * 
	 * @param pwd password comes from feature file
	 * And this method enters password value in password field.
	 */
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	/**
	 * click on submit button.
	 */
	public void clickLoginButton(){
		submit.click();
	}

}

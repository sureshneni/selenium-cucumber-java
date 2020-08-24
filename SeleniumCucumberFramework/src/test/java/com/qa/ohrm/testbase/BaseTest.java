package com.qa.ohrm.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.log4testng.Logger;

import com.qa.ohrm.resources.TestConfig;


public class BaseTest {
	
	public static WebDriver driver;
	protected static final Logger logger = Logger.getLogger(BaseTest.class);
	
	public void initialize(String browserName) {
		
		logger.info("Browser name: "+ browserName);
		if(browserName == TestConfig.browserConfig.Chrome.toString()) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//drivers//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if(browserName == TestConfig.browserConfig.Firefox.toString()) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//src//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
				
	}
	
	public void navigateApplication(String env) {
		logger.info("Navigate to application: " + env);
		if(env == TestConfig.environment.QA.toString()) {
			driver.navigate().to(TestConfig.qa_appUrl.toString());
		}else if(env == TestConfig.environment.Stage.toString()) {
			driver.navigate().to(TestConfig.stage_appUrl.toString());
		}else if(env == TestConfig.environment.Prod.toString()) {
			driver.navigate().to(TestConfig.prod_appUrl.toString());
		}
		
	}
	
	/**
	 * This will close the driver instantiated browser.+
	 */
	public void tearDown() { 
		driver.close();
	}

}

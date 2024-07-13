package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.CommonDataSetup;


public class LoginTest extends CommonDataSetup {

	@BeforeMethod
	public void loginToApplication() {
		System.out.println("Login to application");
	}
	
	@AfterMethod
	public void logoutFromApplication() {
		System.out.println("Logout from application");
	}
	
	@BeforeTest
	public void openBrowser() {
		System.out.println("Browser is opened");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	
	@Test (priority = 1, description = "This is a login test")
	 public void loginTest() {
		 
		 System.out.println ("Login is successful");
		 
	 }
	
	@Test (priority = 2, description = "This is a logout test")
	public void logoutTest() {
		 System.out.println ("Logout is successful"); 
	}
}

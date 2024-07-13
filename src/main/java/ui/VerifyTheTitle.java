package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTheTitle {

	
	@Test
	public void titleTest() {
		 
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/"); 
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
		
		
		
	}
}

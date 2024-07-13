package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTheTitleAndText {
	
	@Test(retryAnalyzer = common.Retry.class)
	public void titleTest() throws InterruptedException {
		 
		SoftAssert softassert = new SoftAssert();
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedText = "Sell";
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/"); 
		Thread.sleep(8000);
		String actualTitle = driver.getTitle();
		System.out.println("Verifying title");
		softassert.assertEquals(actualTitle, expectedTitle);
		String actualText = driver.findElement(By.id("gh-btn")).getAttribute("value");
		System.out.println("Verifying text");
		softassert.assertEquals(actualText, expectedText, "text verification failed");
		System.out.println("Closing browser");
		driver.close();
		softassert.assertAll();
		
		
	}
}

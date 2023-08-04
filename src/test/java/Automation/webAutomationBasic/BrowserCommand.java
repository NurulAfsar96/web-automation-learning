package Automation.webAutomationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
 Browser Commands List=> get(), getTitle(), getCurrentUrl(), getPageSource(), close(), quit();
 */
public class BrowserCommand extends BasicDriver {

	String URL ="https://www.w3schools.com/";
	@Test
	public void BrowserCommands() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get(URL);
		System.out.println("Initial Title: "+driver.getTitle());
		System.out.println("Initial URL: "+driver.getCurrentUrl());
		
		WebElement elementname = driver.findElement(By.linkText("CSS"));
		elementname.click();
		Thread.sleep(3000);
		System.out.println("After Click Title: "+driver.getTitle());
		System.out.println("After Click URL: "+driver.getCurrentUrl());
	}
	
}

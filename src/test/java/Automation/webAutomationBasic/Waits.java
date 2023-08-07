package Automation.webAutomationBasic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits extends BasicDriver{

	
// Waits()-> Selenium Wait is just a set of commands that wait for a specified period of time before executing test scripts on the elements.
// Two Types of Selenium Web Driver Waits()---- 1. Implicit, 2. Explicit
	
	//--------------------- Implicit Wait ------------------------------------------
//Implicit Wait- is used to tell the web driver to wait for a certain amount of time before it throws an Exception
	//----Exception for Implicit- “No Such Element Exception”
	
	//--------------------- Explicit Wait ------------------------------------------
//Explicit Wait-is used to tell the Web Driver to wait for certain conditions (Expected) or maximum time exceeded before throwing an exception.
	//----Exception for Explicit- 	“ElementNotVisibleException”
   public void waitsTest() throws InterruptedException
   {
	   driver.manage().window().maximize();
	   driver.get("https://demoqa.com/automation-practice-form");
	   
//Implicit Wait->Syntax-> driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
	  // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
//Explicit Wait Syntax->WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   WebElement blog = (WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]")));
	   blog.click();
	   Thread.sleep(5000);
   }
	
}

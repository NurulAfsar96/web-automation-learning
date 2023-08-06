package Automation.webAutomationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollHandling extends BasicDriver {
	
	String url = "https://www.amazon.in/";
	@Test
	public void Scroll() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get(url);
		
		//WebElement element = driver.findElement(By.xpath(""));
		
   //Scroll using JavaScript........
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//ScrollDOWN to the bottom--> "window.scrollBy(0,document.body.scrollHeight)"		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
//ScrollUP from bottom---> "window.scrollTo(0,0)""
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(3000);
//ScrollDOWN by pixel value
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
//ScrollUP by pixel value
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(2000);
		
//ScrollDown to an element 
		
		//Locating element by xpath and store in variable "Element"        		
        WebElement Element = driver.findElement(By.xpath("//span[contains(text(),'Top deals on mobile accessories')]"));		
        js.executeScript("arguments[0].scrollIntoView();", Element); // Scrolling down the page till the element is found
        Thread.sleep(4000);
   
//---------------> Scroll using Actions class <-----------------------------
        
		Actions action = new Actions(driver);
//ScrollDown
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(5000);
//ScrollUP
		action.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(5000);
		
	}
}

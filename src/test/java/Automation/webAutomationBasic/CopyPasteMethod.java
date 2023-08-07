package Automation.webAutomationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CopyPasteMethod extends BasicDriver {
	
	String url ="https://demoqa.com/automation-practice-form";
	@Test
	public void CopyPaste() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement fname = driver.findElement(By.xpath("//input[@id='firstName']"));
		//WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));
		fname.sendKeys("AfsarJony");
		Thread.sleep(3000);
		/*
		//-----------COPY-Method----------
		//Copy text from firstname field
		
		fname.sendKeys(Keys.CONTROL, "a"); //select all text
		Thread.sleep(3000);
		fname.sendKeys(Keys.CONTROL, "c"); //copy all text
		Thread.sleep(2000);
		
		//-------------> TAB <----------------
		// tab button for switch another field
		
		fname.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		
		//-----------PASTE-Method----------
		//Paste text from "FirstName" field to "LastName" field
		WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));	
		
		lname.sendKeys(Keys.CONTROL, "v"); //paste all text
		Thread.sleep(5000);
		
		*/
		/*---------------------Copy Paste Method Using Action Class ---------------------*/
		
		Actions act = new Actions(driver);
		
					//KeyDown-> happens when the key is pressed down.
					//KeyUP-> happens when the key is released.
	
		
//Select all Text		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
//Copy all Text
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
//Tab another field
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(3000);
		
//Paste all Text
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);

//Paste different location
		WebElement subject = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]"));
		subject.click();
		Thread.sleep(3000);
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		
		
	}

}

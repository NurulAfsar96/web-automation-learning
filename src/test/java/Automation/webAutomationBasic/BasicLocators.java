package Automation.webAutomationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasicLocators extends BasicDriver{
	
	@Test
	public void testLocators() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("https://www.shohoz.com/contact-us/e");
		Thread.sleep(5000);
		System.out.println(driver.getTitle()); // print the URL title
		/*
		// find element by id
		WebElement find = driver.findElement(By.id("purpose"));
		// if you want to click then follow format-> WebElement_InstanceName.click();
		find.click();
		Thread.sleep(5000);
		
		// find element by name
		WebElement find2 = driver.findElement(By.name("purpose"));
		find2.click();
		Thread.sleep(5000);
		
		// find element by linkText
		WebElement find3 = driver.findElement(By.linkText("Launch"));
		find3.click();
		Thread.sleep(5000);
		*/
		
		// find element by PartiallinkText
		WebElement find3 = driver.findElement(By.partialLinkText("Laun"));
		find3.click();
		Thread.sleep(5000);
		/*
		// find element by ClassName
		WebElement find4 = driver.findElement(By.className("submit-btn"));
		find4.click();
		Thread.sleep(5000);
		
		
	
		// find element by Xpath---Custom
		//------> //tagName[@type='value']
		//------> //tagName[contains(text(),'text')]
		//------> //*[contains(text(),'text')]----->to check text in whole page
		
		WebElement find5 = driver.findElement(By.xpath("//input[@type='email']"));
		find5.sendKeys("na1996@gmail.com");
		Thread.sleep(5000);
		*/
		
		//if any element more than once, follow below format
	
		//css -> elementName[attributeName='attributeValue']
		/*
		 //form[@id='form_contact_us']/div[3]/div[1]/label/span
		 */
		
		/*WebElement css = driver.findElement(By.cssSelector("input[name='dest_form']"));
		
		css.click();
	*/

		
	}
}

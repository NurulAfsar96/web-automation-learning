package Automation.webAutomationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FramesHandling extends BasicDriver {
	
	String url ="https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit";
	
	@Test
	public void IFrames() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get(url);
		
		//int iframeSize = driver.findElements(By.tagName("iframe")).size();
		//System.out.println(iframeSize);
		
		driver.switchTo().frame("iframeResult");
	
		WebElement frame = driver.findElement(By.id("fname"));
		frame.clear();
		Thread.sleep(5000);
		frame.sendKeys("Afsar");
		Thread.sleep(5000);
		
		//Switch to default/Root frame whenever an iframe is finished
		driver.switchTo().defaultContent();
	}
}

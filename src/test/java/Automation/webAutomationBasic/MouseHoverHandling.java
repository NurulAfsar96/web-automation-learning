package Automation.webAutomationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverHandling extends BasicDriver {
	
	String url = "https://www.daraz.com.bd/";
	@Test
	public void MouseHandle() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(4000);
		
// Action Class in Selenium is a built-in feature provided by the selenium for handling keyboard and mouse events.
		
	Actions action = new Actions(driver);
		
	WebElement devices= driver.findElement(By.xpath("//span[contains(text(),'Electronics Devices')]"));
//moveToElement(): Shifts the mouse pointer to the center of the element
	action.moveToElement(devices).perform();
	Thread.sleep(5000);
	
	WebElement submenu = driver.findElement(By.xpath("//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[6]/li[10]/a[1]/span[1]"));
	action.moveToElement(submenu).perform();
	Thread.sleep(5000);

	WebElement submenu2 = driver.findElement(By.xpath("//span[contains(text(),'HP')]"));
	submenu2.click();
	Thread.sleep(5000);
	
	
	}

}

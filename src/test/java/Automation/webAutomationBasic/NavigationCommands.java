package Automation.webAutomationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigationCommands extends BasicDriver {

	String URL ="https://www.w3schools.com/css/css_syntax.asp";
	@Test
	public void NavigationTest() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get(URL);
		
		WebElement nextpage = driver.findElement(By.linkText("CSS Selectors"));
		nextpage.click();
		Thread.sleep(3000);
		
		//NavigateBack-> driver_ObjctName.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000);
		//NavigateForward-> driver_ObjctName.navigate().forward();
		driver.navigate().forward();
		Thread.sleep(3000);
		//NavigateRefresh-> driver_ObjctName.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(3000);
		
	}
}

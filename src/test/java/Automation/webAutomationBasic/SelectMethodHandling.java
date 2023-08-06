package Automation.webAutomationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectMethodHandling extends BasicDriver {
	
	String url = "https://www.amazon.in/";
	@Test
	public void SelectMethod() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement searchBox = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select = new Select(searchBox);
//selectbyIndex
		select.selectByIndex(4);
		Thread.sleep(5000);
		
//selectbyValue		
		select.selectByValue("search-alias=automotive");
		Thread.sleep(5000);

//selectByVisibleText
		select.selectByVisibleText("Furniture");
		Thread.sleep(5000);
	}

}

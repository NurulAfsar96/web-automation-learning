package Automation.webAutomationBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertHandling extends BasicDriver {
	
	String url = "https://demoqa.com/alerts";
	@Test
	public void AlertsTest() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement click1 =driver.findElement(By.xpath("//button[@id='alertButton']"));
		click1.click();
		Thread.sleep(5000);
	//Alert class k object diye declare korbo. driver object diye switchTo kore alert() inferface access korte hobe
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);
		
		WebElement click2 =driver.findElement(By.xpath("//button[@id='confirmButton']"));
		click2.click();
		Thread.sleep(5000);
		System.out.println("Alert Message: "+alert.getText());
		alert.dismiss();
		Thread.sleep(5000);
		
		//button[@id='promtButton']
		WebElement click3 =driver.findElement(By.xpath("//button[@id='promtButton']"));
		click3.click();
		Thread.sleep(5000);
		alert.sendKeys("Nurul Afsar");
		Thread.sleep(5000);
		alert.accept();
		Thread.sleep(5000);
		//span[@id='promptResult']
		WebElement result =driver.findElement(By.xpath("//span[@id='promptResult']"));
		
		System.out.println("Input Result: "+result.getText());
	}

}

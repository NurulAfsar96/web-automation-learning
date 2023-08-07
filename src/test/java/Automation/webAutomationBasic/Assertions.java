package Automation.webAutomationBasic;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions extends BasicDriver {

	String url = "https://demoqa.com/automation-practice-form";
	@Test
	public void AssretionTest() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get(url);
		
		String ExpectedTitle = "DEMOQA";
		String ActualTitle = driver.getTitle();
		//Hard Assertion
		Assert.assertEquals(ActualTitle,ExpectedTitle);
		System.out.println("Passed");
		
		//Soft Assertion
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(ActualTitle,ExpectedTitle);
		System.out.println("Passed");
		Thread.sleep(3000);
	}
}

package Automation.webAutomationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementCommands extends BasicDriver {
	
	String url = "https://demoqa.com/automation-practice-form";
	@Test 
	public void WebElementsTest() throws InterruptedException
	{
	
		driver.manage().window().maximize();
		driver.get(url);
		//SendKeys()-->To send data;
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Nurul");
		Thread.sleep(5000);
		
		//Clear()-> clear the input field
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.clear(); //clear()used to clear any input field
		lastName.sendKeys("Afsar");
		Thread.sleep(5000);
		
		//Click()-> click on any field/option;
		WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
		dob.click();
		Thread.sleep(5000);
		
		//Get Attribute Value-> Check the attribute values (type, class, placeholder etc.) ​​of an input field
		//ObjectName.getAttribute("attributeName");
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		System.out.println("PlaceHolder: "+email.getAttribute("placeholder"));
		System.out.println("Type: "+email.getAttribute("type"));
		System.out.println("ID: "+email.getAttribute("id"));
		System.out.println("Class: "+email.getAttribute("class"));
		
		//Get Test-> To see what is written in a place;
		//ObjectName.getText();
		WebElement text = driver.findElement(By.xpath("//div[contains(text(),'Practice Form')]"));
		System.out.println("Text: "+text.getText());
		
		//Get CSS value-> We will use it when we want to know the CSS value of an element.
		//ObjectName.getCssValue("Css_Property_name");
		
		System.out.println(text.getCssValue("font-size"));
		
		WebElement labeltext = driver.findElement(By.xpath("//label[@id='userName-label']"));
		String username = labeltext.getText();
		System.out.println("Label Name: "+username);
		
		 //isDisplayed()->verifies if a certain element is present and displayed. If the element is displayed, then the value returned is true.
		
		if(email.isDisplayed())
		{
			email.sendKeys("afsar@outlook.com"); Thread.sleep(3000);
		}
		else {
			System.out.println("Element is not present");
			}
		
		//isSelected()-> method is often used on radio buttons, checkboxes or options in a menu. It is used to determine is an element is selected;
		
		WebElement chckbx = driver.findElement(By.xpath("//label[contains(text(),'Sports')]"));
		if(!chckbx.isSelected())
		{
			chckbx.click();
			Thread.sleep(3000);
		}
		else
		{
			System.out.println("Already Selected");
		}
		
		//isEnabled()->  method verifies if an element is enabled
		
		WebElement enablcity = driver.findElement(By.xpath("//div[@id='city']"));
		
		if(!enablcity.isEnabled())
		{
			System.out.println("Is not Enabled");
		}
		else
		{
			System.out.println("Already Enabled");
		}
		
		
	}

}

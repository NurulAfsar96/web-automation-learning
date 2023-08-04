package Automation.webAutomationBasic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGannotations {
		
// @BeforeSuite > @BeforeTest > @BeforeClass > @BeforeMethod > @Test > @AfterMethod > @AfterClass > @AfterTest > @AfterSuite
	@BeforeSuite
	public void beforeSuite() { System.out.println("--> This is BeforeSuite <--"); }
	@BeforeTest
	public void beforeTest() { System.out.println("--> This is BeforeTest <--"); }
	@BeforeClass
	public void beforeClass() { System.out.println("--> This is BeforeClass <--"); }
	@BeforeMethod
	public void beforeMethod() { System.out.println("--> This is BeforeMethod <--"); }
	@AfterMethod
	public void afterMethod() { System.out.println("--> This is AfterMethod <--"); }
	@AfterClass
	public void afterClass() { System.out.println("--> This is AfterClass <--"); }
	@AfterTest
	public void afterTest() { System.out.println("--> This is AfterTest <--"); }
	@AfterSuite
	public void afterSuite() { System.out.println("--> This is AfterSuite <--"); }
	//@Test(priority = ) used to prioritize the test, and the indexing start with 0;
	
	@Test(priority = 1)
	public void test1() { System.out.println(" First Test "); }
	@Test(priority = 3)
	public void test2() { System.out.println(" Second Test "); }
	@Test(priority = 0)
	public void test3() { System.out.println(" Third Test "); }


}

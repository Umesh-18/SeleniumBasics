package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class E_Annotations_BeforeTest_AfterTest_BeforeSuit_AfterSuit {
	
	@BeforeSuite//Before Suit
	public void beforeSuit() {
		System.out.println("Before Suit is running");
		
	}
	@BeforeTest//Before Test
	public void beforeTest() {
		System.out.println("Before Test is running");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class is running");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("before method", true);
	}
	
	@Test
	public void Testcase1() {
		Reporter.log("TC1", true);
	}
	
	@Test
	public void Testcase2() {
		Reporter.log("TC2", true);
	}
	
	@Test
	public void Testcase3() {
		Reporter.log("TC3", true);
	}
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("after method", true);
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class is running");
	}
	
	@AfterTest//After Test
	public void afterTest() {
		System.out.println("After Test is running");
	}
	
	@AfterSuite//After Suit
	public void afterSuite() {
		System.out.println("After Suit is running");
	}
}

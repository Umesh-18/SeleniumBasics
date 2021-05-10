package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class F1_TestNG_soft_hard_Assertion {
	
//1. Soft Assertion
	
	@Test(enabled = false)//To Ignore This Test
	public void loginWithSoftAssert() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
		
	driver.get("https://opensource-demo.orangehrmlive.com/");//redirect towards perticular url
		
	driver.manage().window().maximize();//to maximize the window
		
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin1");
	driver.findElement(By.id("btnLogin")).click();
	
	String loginError = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
	
	SoftAssert sa = new SoftAssert();//Object of SoftAssert Class
	
//	Assert.assertEquals(loginError, "Invalid credentialss", "text not matched and test failed");//For hard assert
	
	sa.assertEquals(loginError, "Invalid credentialss", "text not matched and test failed");//For SoftAssert

	
//	Operation to be performed after test case got failed
	System.out.println("Assertion test got executed");
	driver.navigate().refresh();
	driver.get("https://groww.in/");
	
	//To decide final state of test case
	sa.assertAll();//For SoftAssert
	}
	
//2. Hard assertion
	
	@Test
	public void testcase() {
//		Assert.assertTrue(10<1);					
		Assert.assertNotEquals(20.04, 11.34, "passed testcase");
	}
	
	@Test
	public void testcase1() {
		Assert.assertFalse(false, "failed testcase1");					
//		Assert.assertEquals(false, true);;
	}
	
	
	
	
	
}

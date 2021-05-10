package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.Utility_Webdriver_Chrome;

public class M1_Login extends Utility_Webdriver_Chrome {
	
	@Test(priority = 1)
	public void testcase1() {
		Reporter.log("testcase1",true);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin5123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Assert.assertEquals(true, false);
}
}
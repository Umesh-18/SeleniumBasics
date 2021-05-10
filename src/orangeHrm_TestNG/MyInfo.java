package orangeHrm_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MyInfo extends LoginToOrangeHrm {

	@Test(priority = 1)
	public static void myInfo() {
	//my info
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
}
	
	@Test(priority = 2)
	public static void personalDetails() {
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).sendKeys("U");
		
	}
	
}

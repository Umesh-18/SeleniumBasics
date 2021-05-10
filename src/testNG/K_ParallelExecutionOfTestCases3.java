package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class K_ParallelExecutionOfTestCases3 {

	@Test
	public static void testcase7() {
		Reporter.log("TC7",true);
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp-pc\\Downloads\\geckodriver\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver(); // to launch the browser
//		driver.get("https://www.facebook.com/");//redirect towards particular url
//		driver.manage().window().maximize();//to maximize the window
	}
	
	@Test
	public static void testcase8() {
		Reporter.log("TC8",true);
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp-pc\\Downloads\\geckodriver\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver(); // to launch the browser
//		driver.get("https://www.facebook.com/");//redirect towards particular url
//		driver.manage().window().maximize();//to maximize the window
	}
}

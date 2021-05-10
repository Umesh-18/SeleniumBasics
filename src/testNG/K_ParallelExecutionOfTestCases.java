package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class K_ParallelExecutionOfTestCases {

	@Test
	public void testcase1() {
		Reporter.log("TC1",true);
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver(); // to launch the browser
//		driver.get("https://www.google.com/");//redirect towards perticular url
//		driver.manage().window().maximize();//to maximize the window
	}
	
	@Test
	public void testcase2() {
		Reporter.log("TC2",true);
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver(); // to launch the browser
//		driver.get("https://www.google.com/");//redirect towards particular url
//		driver.manage().window().maximize();//to maximize the window
	}

}

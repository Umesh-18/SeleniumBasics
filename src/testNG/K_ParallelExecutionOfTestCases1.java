package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class K_ParallelExecutionOfTestCases1 {
	

	@Test
	public void testcase3() {
		Reporter.log("TC3",true);
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver(); // to launch the browser
//		driver.get("https://www.google.com/");//redirect towards perticular url
//		driver.manage().window().maximize();//to maximize the window
	}
	
	@Test
	public void testcase4() {
		Reporter.log("TC4",true);
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver(); // to launch the browser
//		driver.get("https://www.google.com/");//redirect towards perticular url
//		driver.manage().window().maximize();//to maximize the window
}
}
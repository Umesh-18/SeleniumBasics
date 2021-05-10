package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Utility_Webdriver_Chrome {

	public static WebDriver driver;
	@BeforeSuite
	public void inibrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterSuite
	public void quitbrowser() {
		driver.quit();
	}
}

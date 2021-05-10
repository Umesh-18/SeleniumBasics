package pomtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pompage.LoginPage;

public class BaseTest {

	//Prior Mandatory Methods or Operations
	 
	
	static WebDriver driver;
	public LoginPage lp;
	
	@BeforeSuite
	public void initDriver() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\New Chrome Driver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();//Object of ChromeOptions 
		options.addArguments("--start-maximized");//to maximize window at the start
//		options.addArguments("--headless");
//		options.addArguments("--incognito");
		driver = new ChromeDriver(options);//Object of ChromeDriver

		
		Properties prop = new Properties();//Object of Properties i.e configProperties
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\configProperties");
		prop.load(fis);
		
		driver.get(prop.getProperty("testsiteurl"));
	}
	
	
	
	@BeforeClass
	public void objectCreation() throws IOException{
		lp = new LoginPage(driver);
	}
	
	
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}

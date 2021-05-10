package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToOrangeWithConfig {

		public static void main(String[] args) throws IOException  {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		Properties prop = new Properties();//Object of Properties i.e configProperties

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\configProperties");
	
		prop.load(fis);
		
//	    to read the data from configproperties file

//		String url = prop.getProperty("testsiteurl");
//		System.out.println(url);

		//To get the value from configProperties file
		driver.get(prop.getProperty("testsiteurl"));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	

	}

}

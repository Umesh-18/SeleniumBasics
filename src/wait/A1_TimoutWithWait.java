package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_TimoutWithWait {
	public static void main(String[] args)  {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);//org.openqa.selenium.TimeoutException
		
		driver.get("https://groww.in/");
		
		driver.manage().window().maximize();
}
}
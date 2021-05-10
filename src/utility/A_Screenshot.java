package utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A_Screenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
			
		driver.get("https://opensource-demo.orangehrmlive.com/");//redirect towards perticular url
			
		driver.manage().window().maximize();//to maximize the window
			
		WebElement Username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Username.sendKeys("Admin");
		
		WebElement Password = driver.findElement(By.name("txtPassword"));
		Password.sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		//TO Take Screenshot
			TakesScreenshot ss = (TakesScreenshot)driver;
			File Source = ss.getScreenshotAs(OutputType.FILE);
			
			File Destination = new File("C:\\Users\\hp-pc\\Downloads\\Screenshot(Selenium)\\InvalidCredential.png");
			
			FileHandler.copy(Source,Destination);
		
			
}
	
}
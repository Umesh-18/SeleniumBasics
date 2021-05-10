package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class C_FluentWait {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.manage().window().maximize();
		 
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)//Fluent wait
				.withTimeout(50, TimeUnit.SECONDS)
				.pollingEvery(9, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
	
		//1) To Enable Button After 10 Seconds
		
		driver.findElement(By.xpath("//button[@id='enable-button']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='disable']")));
		driver.findElement(By.xpath("//button[@id='enable-button']")).click();
		
	}
}

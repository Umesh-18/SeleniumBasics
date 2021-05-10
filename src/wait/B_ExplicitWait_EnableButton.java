package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class B_ExplicitWait_EnableButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 60);//
		
		//1) To Enable Button After 10 Seconds
		
//		driver.findElement(By.xpath("//button[@id='enable-button']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='disable']")));
//		driver.findElement(By.xpath("//button[@id='enable-button']")).click();
		
		//2)To Open Alert After 5 Seconds and also to handle the alert
		
//		driver.findElement(By.xpath("//button[@id='alert']")).click();
//		wait.until(ExpectedConditions.alertIsPresent());
//	    driver.switchTo().alert().accept();
	    
	    //3)To change text to selenium Webdriver
	    
//	    driver.findElement(By.xpath("//button[@id='populate-text']")).click();
//	    wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='h2']"), "Selenium Webdriver"));
		
		//4) To display button after 10 seconds
		
//		driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
		
		//5) To check checkbox after 10 seconds
		
		driver.findElement(By.xpath("//button[@id='checkbox']")).click();
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='ch']")));
		driver.findElement(By.xpath("//input[@id='ch']")).click();
	}
}

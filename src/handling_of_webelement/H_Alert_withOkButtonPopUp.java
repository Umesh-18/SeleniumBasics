package handling_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_Alert_withOkButtonPopUp {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement alert = driver.findElement(By.xpath("//*[@name='alert']"));
		alert.click();
		
		String AlertText= driver.switchTo().alert().getText();
		System.out.println(AlertText); // To getText of an Alert Text PopUp
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept(); //To click  Accept/ok on Alert PopUP 
		
}		
}

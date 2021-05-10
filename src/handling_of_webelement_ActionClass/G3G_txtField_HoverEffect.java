package handling_of_webelement_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class G3G_txtField_HoverEffect {

	public static void main(String[] args) throws InterruptedException  {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act = new Actions (driver);
		
		WebElement subMenu = driver.findElement(By.xpath("//*[@class='dropbtn']"));
		act.moveToElement(subMenu).perform();
		Thread.sleep(2000);
		
		WebElement Link2 = driver.findElement(By.xpath("//*[@id='link2']"));
		act.moveToElement(Link2).perform();
		Link2.click();
		
		
		
}
}
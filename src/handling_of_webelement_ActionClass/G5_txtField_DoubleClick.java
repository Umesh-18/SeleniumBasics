package handling_of_webelement_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class G5_txtField_DoubleClick {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
			
		WebElement Double_Click = driver.findElement(By.xpath("//*[@id='double-click']"));
		
		Actions act = new Actions(driver);// //Actions Class
		
		act.doubleClick(Double_Click).perform();//Double Click
		
}
}
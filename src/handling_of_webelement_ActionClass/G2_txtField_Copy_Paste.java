package handling_of_webelement_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class G2_txtField_Copy_Paste {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mbasic.facebook.com/reg/?cid=102&privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjE3NjA2NjY1LCJjYWxsc2l0ZV9pZCI6NjkyMTI5MDA4Mzc1MTIxfQ%3D%3D&refid=9");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement Textfield = driver.findElement(By.xpath("//*[@name='firstname']"));
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);// //Actions Class
		
		act.sendKeys(Textfield,"Hatwate").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();// To Select perticular text
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyDown(Keys.CONTROL).build().perform();//To Copy perticular text
		
		driver.findElement(By.xpath("//*[@name='lastname']")).click();//To Click into different textfield
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();// To Paste copied text
		
	}
}

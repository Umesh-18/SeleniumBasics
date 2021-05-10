package handling_of_webelement_ActionClass;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class G_txtField_actionClass_Handling {
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://mbasic.facebook.com/reg/?cid=102&privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjE3NjA2NjY1LCJjYWxsc2l0ZV9pZCI6NjkyMTI5MDA4Mzc1MTIxfQ%3D%3D&refid=9");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Umesh");
			
			Actions act = new Actions(driver); //Actions Class
			
			act.sendKeys(Keys.TAB).sendKeys("Hatwate").sendKeys(Keys.TAB).sendKeys("7385723253").build().perform();
			
}
}
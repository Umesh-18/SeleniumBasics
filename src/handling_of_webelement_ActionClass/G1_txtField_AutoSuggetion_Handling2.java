package handling_of_webelement_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyUpAction;
import org.openqa.selenium.interactions.SendKeysAction;

public class G1_txtField_AutoSuggetion_Handling2 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement Textfield = driver.findElement(By.xpath("//*[@name='q']"));
		
		//Textfield.sendKeys("usai");// will get suggetions after entering few letters of words
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);//Actions Class
		
//		act.sendKeys(Textfield,Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();// select a perticular text from auto-suggetions
		
		act.sendKeys(Textfield,"Velocity").keyDown(Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL).sendKeys("x").build().perform();// select and cut perticlar text
}
}
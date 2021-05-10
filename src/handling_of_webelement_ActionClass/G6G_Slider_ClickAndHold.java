package handling_of_webelement_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class G6G_Slider_ClickAndHold  {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']")); //iframe
		driver.switchTo().frame(iframe);//to switch into iframe
		
		WebElement Slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		act.clickAndHold(Slider).moveToElement(Slider, 400, 0).click().build().perform();//To Click and Hold then to move slider at perticular point
		
		act.clickAndHold(Slider).moveByOffset(200, 0).build().perform();

	}
}

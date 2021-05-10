package handling_of_webelement_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class G6_txtField_ClickAndHold {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);//Action Class
		
		WebElement ElementA = driver.findElement(By.xpath("(//*[@id='sortable']//*[text()='A'])"));//For Letter A
		
		WebElement ElementC = driver.findElement(By.xpath("(//*[@id='sortable']//*[text()='C'])"));//For Letter C
		
		act.clickAndHold(ElementA).moveToElement(ElementC).build().perform();//To Click And Hold
		
}
}
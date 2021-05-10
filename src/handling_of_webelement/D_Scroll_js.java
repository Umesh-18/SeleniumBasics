package handling_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_Scroll_js {
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
		
	driver.get("https://opensource-demo.orangehrmlive.com/");//redirect towards perticular url
		
	driver.manage().window().maximize();//to maximize the window
		
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	
	
	driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	js.executeScript("window.scrollBy(0,1000)");//to scroll in the downward direction

	Thread.sleep(5000);
	
	js.executeScript("window.scrollBy(0,-800)");// to scroll in the upward direction


	
}
}

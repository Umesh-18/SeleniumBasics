package locators_in_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _get_Attribute {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
				
			driver.get("https://opensource-demo.orangehrmlive.com/");//redirect towards perticular url
				
			driver.manage().window().maximize();//to maximize the window
				
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			
			
			WebElement admin = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
			
			String attributevalue = admin.getAttribute("id");
			
			System.out.println(attributevalue);
			
			
}			
}

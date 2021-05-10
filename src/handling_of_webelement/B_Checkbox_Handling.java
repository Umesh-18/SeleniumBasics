package handling_of_webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_Checkbox_Handling {
	
public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
		
	driver.get("https://opensource-demo.orangehrmlive.com/");//redirect towards perticular url
		
	driver.manage().window().maximize();//to maximize the window
		
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	
	
	driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
	
    List<WebElement> checkbox= driver.findElements(By.xpath("//*[contains(@id, 'ohrmList_chkSelectRecord_')]"));

    //*[@id='ohrmList_chkSelectAll']
    //*[contains(@id, 'ohrmList_chkSelectRecord_')]
	    
    
    //for selecting all the check boxes
    
    
    for(WebElement check:checkbox) {
    	
    	check.click();
    }
		
 
}
}

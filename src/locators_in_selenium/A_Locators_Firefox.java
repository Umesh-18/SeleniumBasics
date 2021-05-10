package locators_in_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class A_Locators_Firefox {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp-pc\\Downloads\\geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); // to launch the browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement Username=driver.findElement(By.xpath("(//input[@type='text'])[2]"));//3)xpath
		//     contains:     //input[contains(@id,'txtU')]          //  input=*=<tagname>
		//     and/or:      //input[@id='txtUsername' and @name='txtUsername']
		Username.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement Password = driver.findElement(By.name("txtPassword"));//2)name
		Password.sendKeys("admin123");
		Thread.sleep(2000);
	
		
		WebElement Submit = driver.findElement(By.id("btnLogin"));//1)id
		Submit.click();
		Thread.sleep(2000);

		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/pim/viewMyDetails");
		Thread.sleep(2000);

		WebElement Edit = driver.findElement(By.id("btnSave"));
		Edit.click();
		Thread.sleep(2000);

		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);

		
		WebElement WelcomeIcon =driver.findElement(By.id("welcome"));
		WelcomeIcon.click();
		Thread.sleep(2000);

		WebElement	Logout = driver.findElement(By.xpath("//*[text()='Logout']"));//4)text()
		String text = Logout.getText();
		//getText method is to get the text which is available over the web element
		System.out.println(text);
		Logout.click();
		Thread.sleep(2000);
	
		driver.close();
		
		
	}
}

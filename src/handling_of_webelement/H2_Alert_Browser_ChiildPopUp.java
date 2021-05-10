package handling_of_webelement;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class H2_Alert_Browser_ChiildPopUp {

	public static void main(String[] args) throws InterruptedException  {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://groww.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement Login_Register= driver.findElement(By.xpath("//*[@class='absolute-center btn51ParentDimension']"));
		Login_Register.click();
		Thread.sleep(2000);
		
		WebElement LoginText =driver.findElement(By.xpath("//*[@id='login_email1']"));
		LoginText.sendKeys("hatwateumesh.21@gmail.com");
		Thread.sleep(2000);

		
		WebElement Continue = driver.findElement(By.xpath("//*[@class='lils382ContinueBtn']"));
		Continue.click();
		Thread.sleep(2000);
		
		WebElement Password = driver.findElement(By.xpath("//*[@id='login_password1']"));
		Password.sendKeys("Umesh@123");
		Thread.sleep(2000);

		WebElement Submit = driver.findElement(By.xpath("//*[text()='Submit']"));
		Submit.click();
		Thread.sleep(2000);
		
		WebElement GrowwPin = driver.findElement(By.xpath("//*[@ class='otpinput88item']"));
		
		Actions act = new Actions (driver);
		
//		act.sendKeys("4515").perform();
		             //or
		act.sendKeys(GrowwPin, "4515").perform();
	
//		WebElement Close= driver.findElement(By.xpath("//*[@class='rodal-close']"));
//		Close.click();
		

}
}
package handling_of_webelement_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class G7_frame_dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act = new Actions (driver);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);//To Switch into iframe
		
		WebElement Drag = driver.findElement(By.xpath("(//div[@id='draggable']//p[text()='Drag me to my target'])"));
		
		WebElement Drop = driver.findElement(By.xpath("(//div[@id='droppable']//p[text()='Drop here'])"));
		
		act.dragAndDrop(Drag, Drop).perform();//To Drap And Drop
		
		driver.switchTo().parentFrame();//To Switch into parent frame
		
		driver.findElement(By.linkText("Resizable")).click();
		
						//or
//		driver.findElement(By.xpath("//a[text()='Resizable']")).click();
			
	}
}

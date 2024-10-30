package seleniumexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://the-internet.herokuapp.com/iframe\r\n");
		WebElement we1=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		//intialize the driver
		driver.switchTo().frame(we1);
		Thread.sleep(2000);
	driver.findElement(By.xpath("//p[text()='Your content goes here.']")).sendKeys(" \" QA Automation, or Test Automation, integrates automation tools and processes into the overall Quality Assurance strategy\"");

	}

}

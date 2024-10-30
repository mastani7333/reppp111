package seleniumexample;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		//intialize alert
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		
		a.sendKeys("mastani");
		
		a.accept();
		

	}

}

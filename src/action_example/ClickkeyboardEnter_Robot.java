package action_example;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ClickkeyboardEnter_Robot {
public static WebDriver driver;
	public static void main(String[] args) throws AWTException 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);			
		r.keyRelease(KeyEvent.VK_ENTER);

		

	}

}

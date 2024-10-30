package screenig_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
 public static WebDriver driver;
	public static void main(String[] args)
	{
		
	driver= new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	driver.switchTo().frame(e1);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mastani");

	}

}

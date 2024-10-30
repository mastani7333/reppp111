package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_xpathAttribute {
public static WebDriver driver;
	public static void main(String[] args)
	{
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@class='form-control'][@id='name']")).sendKeys("syed mastani");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shaikmastani7333@gmail.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("kphp,phase2");
		WebElement we1=driver.findElement(By.xpath("//option[text()='India']"));
		we1.click();
		WebElement we2=driver.findElement(By.xpath("//input[contains(@id, 'datepicker')]"));
		we2.click();
		WebElement we3=driver.findElement(By.xpath("//option[starts-with(@value, 'yellow')]"));
		we3.click();
	}
		

}

package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_RelativePath {
public static WebDriver driver;
	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("syed mastani");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shaikmastani7333@gmail.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("kphp,phase2");
		WebElement we1=driver.findElement(By.xpath("//input[@id='female']"));
		we1.click();
		WebElement we2=driver.findElement(By.xpath("//input[@id='sunday']"));
		we2.click();
		WebElement we3=driver.findElement(By.xpath("//input[@id='saturday']"));
		we3.click();
		WebElement we4=driver.findElement(By.xpath("//option[@value='india']"));
		we4.click();
		WebElement we5=driver.findElement(By.xpath("//option[@value='blue']"));
		we5.click();
		WebElement we6=driver.findElement(By.xpath("//input[@id='datepicker']"));
		we6.click();
		//WebElement we7=driver.findElement(By.xpath("//input[@id='FSsubmit']"));
		//we7.click();
		
	}

}

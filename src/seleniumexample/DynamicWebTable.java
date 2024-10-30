package seleniumexample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{

		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://testautomationpractice.blogspot.com/");
		 List<WebElement>pages=	 driver.findElements(By.xpath("//ul[@id='pagination']/li/a"));
		 System.out.println(pages.size());
	 for(int i=1;i<pages.size();i++) 
	 {
		 List<WebElement> checkbox= driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td/input"));
		for(int o=0;o<checkbox.size();o++)
		{
			checkbox.get(o).click();
	        	
	        }
			Thread.sleep(6000);
			pages.get(i).click();
	 }
		 
		    
		 
	           
		 }
		

	}



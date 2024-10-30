package seleniumexample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestedDropDowns {
public  static WebDriver  driver;
	public static void main(String[] args) throws InterruptedException 
	
	{
		driver=new ChromeDriver();
		int height=1000;
		int width=1000;
		Dimension d=new Dimension(height,width);
		driver.manage().window().setSize(d);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bags");
		Thread.sleep(3000);
		//List<WebElement> options =driver.findElements(By.xpath("//div[contains(@class,'kRd8Cs')]/form/ul/li"));
		List<WebElement> options =driver.findElements(By.xpath("//div[contains(@class,'_3NorZ0 _3jeYYh')]/form/ul/li"));
		int size=options.size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			String data=options.get(i).getText();
			System.out.println(data);
			if(data.equals("bags men waterproof"))
			{
				options.get(i).click();
				break;
			}
		}
		
	}
}



package seleniumexample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_WithoutSelect {
	public static WebDriver driver;
	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu?authuser=0");
		List<WebElement>dropdown= driver.findElements(By.xpath("//select[@id='oldSelectMenu']/option"));
		int size=dropdown.size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			String option=dropdown.get(i).getText();
			if(option.equals("Green"))
			{
				dropdown.get(i).click();
			}
		}
		
	}

}

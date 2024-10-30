package seleniumexample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_WithoutSelect {
	public static WebDriver driver;
	public static void main(String[] args) 
{
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		List<WebElement>dropdown= driver.findElements(By.xpath("//select[@id='course']/option"));
		int size=dropdown.size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			String option=dropdown.get(i).getText();
			if(option.equals("Java"))
			{
				dropdown.get(i).click();
			}
		}
	
	List<WebElement>dropdown1= driver.findElements(By.xpath("//select[@id='ide']/option"));
	int size1=dropdown1.size();
	for(int j=0;j<size1;j++)
	{

		String option1=dropdown1.get(j).getText();
		if(option1.equals("Visual Studio"))
		{
			dropdown1.get(j).click();			
			}
	
	}
}
	
	
}



package seleniumexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask1 {
public static WebDriver driver;
	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement element=driver.findElement(By.id("course"));
		element.click();
		Select sc= new Select(element);
		sc.selectByVisibleText("Java");
		WebElement element1=driver.findElement(By.id("ide"));
		Select sc1= new Select(element1);
		element1.click();
		sc1.selectByIndex(2);
		
		
	}

}

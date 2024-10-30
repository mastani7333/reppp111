package seleniumexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask2 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		driver.get("https://demoqa.com/select-menu?authuser=0");
		WebElement element=driver.findElement(By.id("oldSelectMenu"));
		jse.executeScript("arguments[0].click();", element);
		//Thread.sleep(5000);
		//element.click();
		Select sc= new Select(element);
		sc.selectByVisibleText("Green");
		
		

	}

}

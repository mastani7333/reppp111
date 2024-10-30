package action_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static WebDriver driver;
	public static void main(String[] args)
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.orangehrm.com/");
WebElement ele1=driver.findElement(By.xpath("/html/body/nav/div/div[2]/div[2]/ul/li[1]/a/button"));
		
		Actions ac=new Actions(driver);
		//mouseHover action
		ac.moveToElement(ele1).click().perform();;

		
	}

}

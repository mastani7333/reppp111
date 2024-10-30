package action_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndCompare {
	public static WebDriver driver;
	public static void main(String[] args)
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("mastani");
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		ac.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		WebElement we1=driver.findElement(By.xpath("//div[text()='Compare!']"));
		ac.keyDown(we1,Keys.ENTER).keyUp(we1,Keys.ENTER).build().perform();





		
		
	}

}

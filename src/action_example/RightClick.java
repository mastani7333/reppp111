package action_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static WebDriver driver;
	public static void main(String[] args){
       driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.manage().window().maximize();
       driver.get("https://demoqa.com/buttons");
       WebElement ele1=driver.findElement(By.xpath("//button[text()='Right Click Me']"));
       Actions ac=new Actions(driver);
       ac.contextClick(ele1).build().perform();
		
		

	}

}

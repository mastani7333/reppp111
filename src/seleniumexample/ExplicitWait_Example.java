package seleniumexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Example {
public static WebDriver driver;
	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		//declaration of explicit wait
		//WebDriverWait wait=new WebDriverWait(driver,Duration.of seconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(10);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//usage of explicit wait
	   WebElement we1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
	   we1.sendKeys("Admin");
	   //usage of explicit wait
		WebElement we2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		we2.sendKeys("admin123");
		//usage of explicit wait
		WebElement explicit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		explicit.click();

		
		
	}

}

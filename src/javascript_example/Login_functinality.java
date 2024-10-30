package javascript_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// write script for Perform the login functionality by using JSE
//Application url: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
public class Login_functinality {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		//WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
//		Thread.sleep(2000);
//		jse.executeScript("arguments[0].setAttribute('value','Admin')", username);
//		
//		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
//		Thread.sleep(2000);
//		jse.executeScript("arguments[0].setAttribute('value','admin123')", password);
		WebElement button=driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		//Thread.sleep(2000);
		jse.executeScript("arguments[0].click();", button);

		
		
		
		

	}

}

package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateCommands {
public static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.navigate().to("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("mastanbi");
		driver.findElement(By.id("password")).sendKeys("Shannu@733");
		
		driver.findElement(By.id("login")).click();
		
		//backward 
		
		driver.navigate().back();
		
		//forward
		driver.navigate().forward();
		
		//refresh
		driver.navigate().refresh();
	}

}

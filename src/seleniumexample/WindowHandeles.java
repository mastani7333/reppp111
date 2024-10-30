package seleniumexample;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandeles {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("choclate");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Chocolate']")).click();
		Set<String> handel=driver.getWindowHandles();
		List<String>handel2=new ArrayList(handel);
		System.out.println(handel2);
		String parentWindow=handel2.get(0);
		String childWindow=handel2.get(1);
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='female']")).click();
	Thread.sleep(2000);
	driver.switchTo().window(childWindow);

	}

}

package javascript_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_pixelValue 
{
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.com/");
		
		//Thread.sleep(30000);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy(0,1450);", "");
		
		//System.out.println(jse.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(3000);
		
		WebElement signin = driver.findElement(By.xpath("//a[@class = 'action-button']"));
		
		jse.executeScript("arguments[0].scrollIntoView();", signin);
		
		//System.out.println(jse.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(3000);
		
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//System.out.println(jse.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(3000);
		
		jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		//System.out.println(jse.executeScript("return window.pageYOffset;"));	


		


}
}

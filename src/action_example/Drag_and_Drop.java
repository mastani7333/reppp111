package action_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement source1=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement source2=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target1=driver.findElement(By.xpath("//div[@id='shoppingCart4']/div/ol/li"));
		WebElement target2=driver.findElement(By.xpath("//div[@id='shoppingCart1']/div/ol/li"));
		WebElement source3=driver.findElement(By.xpath("//div[@id='products']//li[4]/a"));
		WebElement target3=driver.findElement(By.xpath("//ol[@id='amt8']/li"));
		WebElement source4=driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement target4=driver.findElement(By.xpath("//ol[@id='loan']/li"));
		Actions ac=new Actions(driver);
		//Thread.sleep(2000);
		ac.dragAndDrop(source1, target1).build().perform();
		Thread.sleep(2000);
		ac.dragAndDrop(source2, target2).build().perform();
		Thread.sleep(3000);
		ac.dragAndDrop(source3, target3).build().perform();
		Thread.sleep(3000);
		ac.dragAndDrop(source4, target4).build().perform();


	}

}

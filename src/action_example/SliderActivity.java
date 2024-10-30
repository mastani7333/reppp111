package action_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActivity {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
{
		int height=1000;
		int width=1000;
		Dimension d=new Dimension(width,height);
		driver=new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.manage().window().setSize(d);
	      driver.get("https://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
	  	driver.manage().window().maximize();
	  	
	  	WebElement darg1 = driver.findElement(By.xpath("//span[@class = 'ui-slider-handle ui-state-default ui-corner-all'][1]"));
	  	WebElement drag2 = driver.findElement(By.xpath("//span[@class = 'ui-slider-handle ui-state-default ui-corner-all'][2]"));
	  	Actions ac=new Actions(driver);
	  	ac.dragAndDropBy(darg1, -30, 0).build().perform();
	  	ac.dragAndDropBy(drag2, 250, 0).build().perform();
      
		
	}

}

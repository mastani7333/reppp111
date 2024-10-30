package seleniumexample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesignationCheckBox {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("http://testingmasters.weebly.com/webtables.html");
		List<WebElement>ele1=driver.findElements(By.xpath("//td[text()='Analyst']"));
		int size=ele1.size();
		System.out.println("Analyst designation name members count:"+size);
		
			 List<WebElement>num=driver.findElements(By.xpath("//td[text()='Analyst']//preceding-sibling::td[4]/input"));
			 for(int i=0;i<num.size();i++)
			 {
				 Thread.sleep(3000);
				 num.get(i).click();
			 }
		

	}

}

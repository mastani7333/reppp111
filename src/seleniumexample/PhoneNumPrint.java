package seleniumexample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoneNumPrint {
	public static WebDriver driver;
	public static void main(String[] args) 
	{
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("http://testingmasters.weebly.com/webtables.html");
		List<WebElement>ele1=driver.findElements(By.xpath("//td[text()='Avinash']"));
		int size=ele1.size();
		System.out.println("avinash name members count:"+size);
		
			 List<WebElement>num=driver.findElements(By.xpath("//td[text()='Avinash']//following-sibling::td[3]"));
			 for(int i=0;i<num.size();i++)
			 {
				 String number=num.get(i).getText();
				 System.out.println("Avinash number:"+number);
			 }
		 
		 ////table[@id='VisitingTable']//following-sibling::td[6]
	}
}

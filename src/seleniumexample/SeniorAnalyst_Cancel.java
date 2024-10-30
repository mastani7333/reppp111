package seleniumexample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeniorAnalyst_Cancel {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("http://testingmasters.weebly.com/webtables.html");
		List<WebElement>ele1=driver.findElements(By.xpath("//td[text()='Senior Analyst']"));
		int size=ele1.size();
		System.out.println(" Senior Analyst designation name members count:"+size);
		
			 List<WebElement>num=driver.findElements(By.xpath("//td[text()='Senior Analyst']//following-sibling::td[3]/select/option"));
			 for(int i=0;i<num.size();i++)
			 {
				 String data=num.get(i).getText();
				 if(data.equals("Cancelled"))
				 {
					 Thread.sleep(3000);
					 num.get(i).click();
				 }
				 //Thread.sleep(3000);
				 //num.get(i).click();
			 }

	}

}

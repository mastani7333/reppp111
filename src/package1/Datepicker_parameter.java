package package1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker_parameter {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement e1=driver.findElement(By.id("datepicker"));
		e1.click();
		String month="May";
		String year="2025";
		String date="25";
		while(true)
		{
			
			String monthPath=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yearPath=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(monthPath.equals(month)&&(yearPath.equals(year)))
			{
				break;
			}
			WebElement e2=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
			Thread.sleep(1000);
			e2.click();
		}
		List<WebElement>dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		int size=dates.size();
		for(int i=0;i<size;i++)
		{
			String data=dates.get(i).getText();
			if(data.equals(date))
			{
				dates.get(i).click();
			}
		}
		

	}

}

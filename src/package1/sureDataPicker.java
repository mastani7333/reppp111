package package1;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sureDataPicker 
{
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		WebElement f1= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(f1);
		Thread.sleep(3000);
	WebElement e1 =	driver.findElement(By.xpath("//input[@type='text']"));
	e1.click();
	String month = "May";
	String date = "25";
	String year = "2025";
	while(true){
		Thread.sleep(3000);
		String Months = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class=ui-datepicker-month]")).getText();
		String Years = driver.findElement(By.xpath("////div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText();
		if (Months.equals(month)&& (Years.equals(year))) {
			break;
		}
		WebElement button = driver.findElement(By.xpath("//span[text()='Next']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].click();", button);

	List<WebElement>Dates= driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr/td"));
	System.out.println(Dates.size());
	for(int i=0;i<=Dates.size();i++) {
		
		String values=Dates.get(i).getText();
		
		if(values.equals(date)) {
			Dates.get(i).click();
		}
	}

	}
		
	}


}

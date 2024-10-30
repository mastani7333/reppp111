package seleniumexample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {
public static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://testingmasters.weebly.com/webtables.html");
		driver.findElement(By.xpath("//table[@id='VisitingTable']"));
		//identify the number of rows
		int rowSize=driver.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr")).size();
		System.out.println("total rows present in the table is:"+rowSize);
		//identify the number of coloumns
		int colSize=driver.findElements(By.xpath("//table[@id='VisitingTable']/thead/tr/th")).size();
		System.out.println("total columns present in the table is:"+colSize);
		//get specific row data
		String getRow=driver.findElement(By.xpath("//table[@id='VisitingTable']/tbody/tr[4]")).getText();
		System.out.println("specific row data :"+getRow);
		//get whole table data
		List<WebElement> wholeData=driver.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr"));
		for(int i=0;i<wholeData.size();i++)
		{
			String data=wholeData.get(i).getText();
			System.out.println(data);
		
		}
		
	}

}

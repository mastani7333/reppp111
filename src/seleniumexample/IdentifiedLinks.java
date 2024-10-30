package seleniumexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifiedLinks 
{
		public static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			driver =new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			List<WebElement> links = driver.findElements(By.tagName("a"));
			int size=links.size();
			System.out.println(size);
			
			
			for (int i = 0;i<size;i++) {
				String linkvalues=links.get(i).getText();
				System.out.println(linkvalues);
			}

		}


		}



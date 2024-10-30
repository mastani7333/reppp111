package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLink2 {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(30000);
		driver.manage().window().maximize();
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int brokenlinks=0;
		
		for(WebElement link:links) {
			
			String hrefAttvalue=link.getAttribute("href");
			
			if(hrefAttvalue==null||hrefAttvalue.isEmpty()) {
				
				System.out.println("href att value is empty...");
				continue;
			}
			URL url=new URL(hrefAttvalue);
			HttpURLConnection connect=(HttpURLConnection)url.openConnection();
		   //connect the connection
			connect.connect();//create the connection
			
			if(connect.getResponseCode()>=400) {
				
				System.out.println(hrefAttvalue+"=> this is broken link");
				brokenlinks++;
			
			}else {
				
				System.out.println(hrefAttvalue+"=> this is not a broken link");
			}
		}
		
		System.out.println("number of broken links"+ brokenlinks);
		
	}


}

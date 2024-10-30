package seleniumexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("mastanbi");
		WebElement we3=driver.findElement(By.id("password"));
		we3.sendKeys("Shannu@7333");
		we3.clear();
		
		WebElement we2=driver.findElement(By.id("login"));
		System.out.println(we2.isDisplayed());
		we2.click();
		 List<WebElement> we1=driver.findElements(By.tagName("a"));
		 System.out.println(we1.size());
	}

}

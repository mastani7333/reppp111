package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands 
{
	public static WebDriver driver;

	public static void main(String[] args) {
		//Intialize the webdriver
		driver=new ChromeDriver();
		//browser commands or launching web application
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		//get title
		System.out.println(driver.getTitle() );
		//get attribute
		WebElement we1=driver.findElement(By.id("username")); 
		
		System.out.println(we1.getAttribute("class"));
		//get page source
		System.out.println(driver.getPageSource());
		//get current url
		System.out.println(driver.getCurrentUrl());

	}

}

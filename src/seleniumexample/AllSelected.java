package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class AllSelected 
{
	public static WebDriver Driver;
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		int height=1000;
		int weidth=1000;
		//driver.manage().window().maximize();
		Dimension d=new Dimension(weidth, height);
		driver.manage().window().setSize(d);
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html#google_vignette");

		// Find all check boxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		int size = checkboxes.size();
		System.out.println("Total checkboxes: " + size);
		
		
		//Select all check boxes
		for(int i=0;i<size;i++) {   
			checkboxes.get(i).click();


			


		}
	}

}

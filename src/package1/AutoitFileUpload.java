package package1;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoitFileUpload
{
	public static WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException, IOException 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.id("file-upload"));
		Actions ac=new Actions(driver);
		ac.moveToElement(button).click().build().perform();		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\shaik\\OneDrive\\Desktop\\Selinum videos\\autoitfileupload.exe"+" "+"\"C:\\Users\\shaik\\OneDrive\\Desktop\\Selinum videos\\notepad.txt\"");
		System.out.println("file uploading is done");

}
}  

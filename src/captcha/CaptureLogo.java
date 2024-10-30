package captcha;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureLogo {
public static WebDriver driver;
	public static void main(String[] args) throws IOException 
	{
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)driver;
		WebElement e1=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sorce=e1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\java automation workspace\\Seleniumprograms\\captchascreenshot\\logo.png");
		FileUtils.copyFile(sorce,destination);

		
		

	}
}

package captcha;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Captcha_screenshot {
public static WebDriver driver;
	public static void main(String[] args) throws IOException 
	{
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\java automation workspace\\Seleniumprograms\\captchascreenshot\\wholepage.png");
		FileUtils.copyFile(file,destination);

		
		

	}

}

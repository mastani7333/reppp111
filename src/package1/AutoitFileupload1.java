package package1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoitFileupload1 {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_file");
		driver.manage().window().maximize();
		 WebElement frame=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		 driver.switchTo().frame(frame);
		WebElement button=driver.findElement(By.id("myfile"));
		Actions ac=new Actions(driver);
		ac.moveToElement(button).click().build().perform();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("\"C:\\Users\\shaik\\OneDrive\\Desktop\\Selinum videos\\autoitfile1.exe\""+" "+"\"C:\\Users\\shaik\\OneDrive\\Desktop\\Selinum videos\\notepad.txt\"");
		System.out.println("file uploading is done");
		

	}

}

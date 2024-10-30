package seleniumexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		
	driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	WebElement we1=driver.findElement(By.xpath("//iframe[@id='frm1']"));
	driver.switchTo().frame(we1);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[text()='Java']")).click();
	driver.switchTo().defaultContent();
	WebElement we2=driver.findElement(By.xpath("//iframe[@id='frm2']"));
	driver.switchTo().frame(we2);
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("shaik");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("mastani");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='femalerb']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='englishchbx']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='hindichbx']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shaikmastani7333@gmail.com");
	driver.switchTo().defaultContent();
	WebElement we3=driver.findElement(By.xpath("//iframe[@id='frm3']"));
	driver.switchTo().frame(we3);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@id='selectnav1']/option[21]")).click();
	WebElement we4=driver.findElement(By.xpath("//iframe[@src='https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html']"));
	driver.switchTo().frame(we4);
	Thread.sleep(6000);
	driver.findElement(By.xpath("//select[@id='selectnav1']/option[19]")).click();

	}

}

package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_AbsolutePath {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div/div/div/div"
				+ "/div/div/div/div/div/div[2]/div/input[1]")).sendKeys("mastani");
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div/div"
						+ "/div/div/div/div/div/div/div/div[2]/div/input[2]")).sendKeys("shaikmastani7333@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]"
						+ "/div/div/div/div/div/div/div/div/div/div[2]/div/input[3]")).sendKeys("1234567890");
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div/div"
						+ "/div/div/div/div/div/div/div/div[2]/div/textarea")).sendKeys("kphp,shiva nagar");
				Thread.sleep(1000);
				WebElement we1=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div/div"
						+ "/div/div/div/div/div/div/div/div[2]/div[3]/div[2]/input"));
				we1.click();
				WebElement we2=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div/div/div/div/div/div"
						+ "/div/div/div/div[2]/div[4]/div/input[1]"));
				we2.click();
				WebElement we3=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]"
						+ "/div/div/div/div/div/div/div/div/div/div[2]/div[4]/div[2]/input[1]"));
				we3.click();
				WebElement we4=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]"
						+ "/div/div/div/div/div/div/div/div/div/div[2]/div[4]/div[3]/input[1]"));
				we4.click();
				WebElement we5=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]"
						+ "/div/div/div/div/div/div/div/div/div/div[2]/div[4]/div[4]/input[1]"));
				we5.click();
				WebElement we6=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]"
						+ "/div/div/div/div/div/div/div/div/div/div[2]/div[4]/div[5]/input[1]"));
				we6.click();
				WebElement we7=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div/div/div/div"
						+ "/div/div/div/div/div/div[2]/div[5]/select/option[10]"));
				we7.click();
				WebElement we8=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]"
						+ "/div/div/div/div/div/div/div/div/div/div[2]/div[6]/select/option[3]"));
				we8.click();
				WebElement we9=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]"
						+ "/div/div/div/div/div/div/div/div/div/div[2]/p/input[1]"));
				we9.click();
		
		
		
		



	}

}

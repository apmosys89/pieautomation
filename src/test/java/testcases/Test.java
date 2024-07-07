package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 // driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("https://pie.test-uat.com/");
		  
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("puma");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Testing@1234");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		  Thread.sleep(5000);
		 
	}

}

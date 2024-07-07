package testbase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Baseclass 
{
	public WebDriver driver;
	public Logger logger;
	public Properties p;
	
	  @Parameters({"os","browser"})
	  @BeforeClass
	  public void setup(String os,String br) throws InterruptedException, IOException
	  { 
		  FileReader file=new FileReader("D:\\Tester_New\\pieautomation\\src\\test\\resources\\config.properites");
		  p=new Properties();
		  p.load(file);
		
		  logger=LogManager.getLogger(this.logger);
		//  driver=new ChromeDriver();
		  
		  switch(br.toLowerCase())
			{
			case "chrome": 
			driver=new ChromeDriver(); 
			break;
			case "edge": 
			driver=new EdgeDriver(); 
			break;
			default: 
			System.out.println("No matching browser..");
			return;
			}
			
		 // driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get(p.getProperty("appurl"));
		  
		  driver.manage().window().maximize();
		  Thread.sleep(1000);
		  
	  }
	  @AfterClass
	  public void teardown()
	  {
		  driver.quit();
	  }
	  
	  public String randomeString()
		{
			String generatedString=RandomStringUtils.randomAlphabetic(5);
			return generatedString;
		}
		
		public String randomeNumber()
		{
			String generatedString=RandomStringUtils.randomNumeric(20);
			return generatedString;
		}
		
		public String randomAlphaNumeric()
		{
			String str=RandomStringUtils.randomAlphabetic(3);
			String num=RandomStringUtils.randomNumeric(3);
			
			return (str+"@"+num);
		}
}

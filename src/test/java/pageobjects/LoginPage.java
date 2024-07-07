package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testbase.BasePage;

public class LoginPage extends BasePage
{
    WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath ="//input[@id='UserName']")
	WebElement txtusername;
	
	@FindBy(xpath ="//*[@id=\"Password\"]")
	WebElement txtpassword;
	
	@FindBy(xpath ="//button[normalize-space()='Login']")
	
	WebElement btnsubmit;
	
	
	
	public void Username(String username)
	{ 
		txtusername.sendKeys(username);
	}
	public void Password(String pwd)
	{
		//wait.until(ExpectedConditions.visibilityOf(txtpassword));
		txtpassword.sendKeys(pwd);
	}
	public void Button()
	{
		//wait.until(ExpectedConditions.visibilityOf(btnsubmit));
		btnsubmit.click();
	}
	public DashboardPage getDashboardTitle() 
	{
		return new DashboardPage(driver);
   }
	
	
}

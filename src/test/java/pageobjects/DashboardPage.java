package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testbase.BasePage;

public class DashboardPage extends BasePage
{
   
	public DashboardPage(WebDriver driver)
	{
	   super(driver);
	   
	   
	}
	
		@FindBy(xpath = "//h2[normalize-space()='Home']")
		WebElement linkhomeimage;
		
		@FindBy(xpath = "//p[normalize-space()='Private Car Blaze Policy']")
		WebElement linkprivatecar;
		
		@FindBy(xpath ="//ul[@class='head-right']//img[@alt='Logout-icon']")
	    WebElement LogoutClick;
	
	public void Home_Image()
	{
		linkhomeimage.click();
	}
	public void Private_car() throws InterruptedException
	{
		System.out.println("Before Click");
		linkprivatecar.click();
		
		Thread.sleep(5000);
		System.out.println("After Click");
	}
	
	public boolean isMyAccountPageExists()   // MyAccount Page heading display status
	{
		try {
			return (linkhomeimage.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}

	public void clickLogout() {
		LogoutClick.click();

	}
	
	
	
}

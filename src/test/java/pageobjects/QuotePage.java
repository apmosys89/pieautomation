package pageobjects;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.Scrollable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import testbase.BasePage;

public class QuotePage extends BasePage
{
    public QuotePage(WebDriver driver) 
    {
    	super(driver);
	}
    
    @FindBy(xpath="//h2[normalize-space()='Quote - PRIVATE CAR POLICY'])[1]")
    WebElement QuoteImg;
    
    @FindBy(xpath="//div[@class='col-md-6 margin-bottom-5 padding-left-0 padding-right-5']//label[@id='option1']")
     WebElement Renewal;
    @FindBy(xpath="//div[@class='col-md-6 margin-bottom-5 padding-left-0 padding-right-5']//label[@id='option2']")
    WebElement Buynewcar;
    
    @FindBy(xpath="//div[@class='col-md-6 margin-bottom-5 padding-left-0 padding-right-5']//label[@id='option4']")
    WebElement Usedcar;
    @FindBy(xpath="//div[@class='col-md-6 margin-bottom-5 padding-left-0 padding-right-5']//label[@id='option3']")
    WebElement Rollover;
    
    @FindBy(xpath="//*[@id=\"ManufacturerName\"]")
    WebElement DDmanufacturename;
    
    @FindBy(xpath="//*[@id=\"ModelName\"]")
    WebElement DDModelName;
    
    @FindBy(xpath="//*[@id=\"RtoLocation\"]")
    WebElement DDRegistrationcity;
    
    @FindBy(xpath="//*[@id=\"Risk1\"]")
    WebElement calregistrationdate;
    
    @FindBy(xpath ="//*[@id=\"YearOfManufacturer\"]")
    WebElement DDmanufacturingyear;
    
    @FindBy(xpath ="//*[@id=\"EngineNumber\"]")
    WebElement txtEngineNumber;
    
    
    @FindBy(xpath ="//*[@id=\"ChassisNumber\"]")
    WebElement txtChassisNumber;
    
    @FindBy(xpath ="//p[normalize-space()='Premium Details']")
    WebElement calculatebtn;
    
    public void QuoteImg()
    {
    	QuoteImg.click();
    }
    
    public void Renewal()
    {
    	
    }
    
    public void Buynewcar()
    {
    	Buynewcar.click();
    }
    
    public void Rollover()
    {
    	
    }
    
    public void Usedcar()
    {
    	
    }
    
    public void DDmanufacturename() throws InterruptedException
    {
    	//Actions actions = new Actions(driver);
    	DDmanufacturename.click();
    	Thread.sleep(1000);
    	DDmanufacturename.sendKeys("Honda");
    	Thread.sleep(1000);
    	DDmanufacturename.sendKeys(Keys.ENTER);
    	
    	
		/*
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * 
		 * js.executeScript("Scroll(0, 150)")
		 */;
    	
    	
    }
    
    public void DDModelName() throws InterruptedException
    {
    	
    	DDModelName.click();
    	Thread.sleep(1000);
    	DDModelName.sendKeys("Amaze");
    	Thread.sleep(1000);
    	
    	DDModelName.sendKeys(Keys.ARROW_DOWN);
    	DDModelName.sendKeys(Keys.ENTER);
    	
    	Thread.sleep(1000);
    }
    
    public void DDRegistrationcity() throws InterruptedException
    {
    	
    	DDRegistrationcity.click();
    	Thread.sleep(1000);
    	DDRegistrationcity.sendKeys("MUM");
    	Thread.sleep(1000);
    	DDRegistrationcity.sendKeys(Keys.ARROW_DOWN);
    	DDRegistrationcity.sendKeys(Keys.ENTER);
    }
    
    public void Registrationdate()
    {
    	LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println(formattedDate);
        calregistrationdate.sendKeys(formattedDate);
        
    }
    public void manufacturingyear() throws InterruptedException
    {
    	

        
        Select dropdown = new Select(DDmanufacturingyear);

        
        dropdown.selectByVisibleText("2024");
        Thread.sleep(20000);
    }
    
    public void txtEngineNumber(String engineno)
    {
    	
    	txtEngineNumber.sendKeys(engineno);
    }
    
    public void txtChassisNumber(String chassisno)
    {
    	txtChassisNumber.sendKeys(chassisno);
    }
    
    public void calculatebtn()
    {
    	calculatebtn.click();
    }
    
    
    
    
    
}

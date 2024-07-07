package testcases;

import org.testng.annotations.Test;

import pageobjects.QuotePage;

public class TC_003_Quotepage extends TC002_DashboardPage
{

	@Test
   public  void VerifyQuotePage() throws InterruptedException
   {
		QuotePage quotepage=new QuotePage(driver);
		
		quotepage.Buynewcar();
		
		quotepage.DDmanufacturename();
		
		quotepage.DDModelName();
		
		quotepage.DDRegistrationcity();
		
		quotepage.Registrationdate();
		
		quotepage.manufacturingyear();
		
		quotepage.txtEngineNumber(randomeNumber());
		
		quotepage.txtChassisNumber(randomeNumber());
		
		quotepage.calculatebtn();
   }
 


}

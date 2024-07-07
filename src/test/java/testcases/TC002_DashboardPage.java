package testcases;

import org.testng.annotations.Test;

import pageobjects.DashboardPage;
import testbase.Baseclass;


public class TC002_DashboardPage extends TC001_Loginpage
{
	
	
	@Test
	
	
   public void verifyQuotePage() throws InterruptedException
   {   
		/*
		 * TC001_Loginpage TC1=new TC001_Loginpage(); TC1.verify_loginpage();
		 */
		
		  logger.info("***** Starting TC002_DashboardPage  ****");
		  logger.debug("This is a debug log message");
		
		DashboardPage dashboard=new DashboardPage(driver);
		
		dashboard.Home_Image();
		logger.info("======Home Page=================");
		
		dashboard.Private_car();
		
		logger.info("======Private Car Page=================");
		
   }
}

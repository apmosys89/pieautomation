package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.DashboardPage;
import pageobjects.LoginPage;
import testbase.Baseclass;
import utilities.DataProviders;

public class TC001_Loginpage extends Baseclass
{
  
	private Object Try;

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
  
  public void verify_loginpage(String username,String password,String exp) throws InterruptedException
  {
	  logger.info("***** Starting TC001_Loginpage  ****");
	 
	
      logger.debug("This is a debug log message");
	
		 
	//  try {
		LoginPage loginpage=new LoginPage(driver);
		 
		  
		//	loginpage.Username(p.getProperty("username"));
		      loginpage.Username(username);
			  logger.info("Enter User name.. ");
			
			  loginpage.Password(p.getProperty("password"));
			  logger.info("Enter Password==========");
			
			  loginpage.Button();
			  logger.info("Click Login Butto=[==========");
			  logger.debug("debug logs======");
			 
			/*DashboardPage ds=new DashboardPage(driver);
				boolean targetPage=ds.isMyAccountPageExists();
				
				if(exp.equalsIgnoreCase("Valid"))
				{
					if(targetPage==true)
					{
						ds.clickLogout();
						Assert.assertTrue(true);
					}
					else
					{
						Assert.assertTrue(false);
					}
				}
				
				if(exp.equalsIgnoreCase("Invalid"))
				{
					if(targetPage==true)
					{
						ds.clickLogout();
						Assert.assertTrue(false);
					}
					else
					{
						Assert.assertTrue(true);
					}
				}
			
			
			{
				Assert.fail("An exception occurred: ");
			}
			  
			  logger.info("validate message");
	} catch (Exception e) {
		
		e.printStackTrace();
	}
		 */
	 

  }	
	  
	  
  }
 

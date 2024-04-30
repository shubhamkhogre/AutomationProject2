package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RequestDemo_page;
import pages.Signup_page;
import utils.Driver_setup;

public class Request_a_demo 
{
	WebDriver driver;
    @Test
    public void Requesting_a_demo()  {
    	driver = Driver_setup.launch_Browser();
    	HomePage hp = new HomePage();
    	hp.navigate_to_swaglab_link(driver); 
    	hp.homepage_displayed(driver);
       
    	Signup_page sp = new Signup_page();
    	sp.Enter_correct_cred(driver);
    	
    	RequestDemo_page rdp = new RequestDemo_page();
    	rdp.Demo_form(driver);
    	rdp.Verify_thanks_for_req_msg_visible(driver);
       }
  }
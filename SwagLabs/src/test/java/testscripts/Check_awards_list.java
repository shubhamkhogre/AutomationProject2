package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Awards_list_page;
import pages.HomePage;
import pages.Signup_page;
import utils.Driver_setup;

public class Check_awards_list 
{
	WebDriver driver;
    @Test
    public void Checking_awards_list(){
    	driver = Driver_setup.launch_Browser();
    	HomePage hp = new HomePage();
    	hp.navigate_to_swaglab_link(driver); 
    	hp.homepage_displayed(driver);
       
    	Signup_page sp = new Signup_page();
    	sp.Enter_correct_cred(driver);
    	
    	Awards_list_page alp = new Awards_list_page();
    	alp.Awards_list(driver);
    	alp.Verify_awards_page_visible(driver);	
        }
  }
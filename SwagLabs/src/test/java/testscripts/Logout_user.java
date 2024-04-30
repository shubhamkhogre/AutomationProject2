package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Signup_page;
import utils.Driver_setup;

public class Logout_user 
 {
	 WebDriver driver;
	    @Test
	    public void Logout_process() {
	    	driver = Driver_setup.launch_Browser();
	    	HomePage hp = new HomePage();
	    	hp.navigate_to_swaglab_link(driver);
	    	hp.homepage_displayed(driver);
	    	
	    	Signup_page sp = new Signup_page();
	    	sp.Enter_correct_cred(driver);
	    	sp.Verify_homepage_visible(driver);
	    	sp.Logout(driver);
	    }
 }

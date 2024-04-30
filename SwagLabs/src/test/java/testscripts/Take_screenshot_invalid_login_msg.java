package test_scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Signup_page;
import utils.Driver_setup;

public class Take_screenshot_invalid_login_msg
{
	WebDriver driver;
    @Test
    public void Taking_screenshot_invalid_login_msg() throws IOException {
    	driver = Driver_setup.launch_Browser();
    	HomePage hp = new HomePage();
    	hp.navigate_to_swaglab_link(driver); 
    	hp.homepage_displayed(driver);
       
    	Signup_page sp = new Signup_page();
    	sp.Enter_incorrect_cred(driver);
    	sp.Verify_error_msg_txt_displayed(driver);
    	sp.Screenshot_of_invalid_credenial_login(driver);
        }
  }
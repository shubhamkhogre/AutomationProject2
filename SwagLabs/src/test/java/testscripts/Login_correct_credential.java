package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Signup_page;
import utils.Driver_setup;

public class Login_correct_credential 
 {
    WebDriver driver;
    @Test
    public void Login_with_correct_credential() {
    	driver = Driver_setup.launch_Browser();
    	HomePage hp = new HomePage();
    	hp.navigate_to_swaglab_link(driver);
    	hp.homepage_displayed(driver);
    	
    	Signup_page sp = new Signup_page();
    	sp.Enter_correct_cred(driver);
    	sp.Verify_homepage_visible(driver);
    }
 }
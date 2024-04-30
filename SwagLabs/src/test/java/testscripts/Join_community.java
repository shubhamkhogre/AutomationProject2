package test_scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.About_page;
import pages.HomePage;
import pages.Signup_page;
import utils.Driver_setup;

public class Join_community 
{
	WebDriver driver;
    @Test
    public void Joining_community() throws IOException {
    	driver = Driver_setup.launch_Browser();
    	HomePage hp = new HomePage();
    	hp.navigate_to_swaglab_link(driver); 
    	hp.homepage_displayed(driver);
       
    	Signup_page sp = new Signup_page();
    	sp.Enter_correct_cred(driver);
    	
    	About_page ap = new About_page();
    	ap.Join_community(driver);
    	ap.Join_community_form(driver);
    	
        }
}
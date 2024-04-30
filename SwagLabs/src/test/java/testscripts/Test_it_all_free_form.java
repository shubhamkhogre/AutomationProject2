package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Signup_page;
import pages.Test_it_all_free_page;
import utils.Driver_setup;

public class Test_it_all_free_form 
{
	WebDriver driver;
    @Test
    public void Filling_form_of_test_it_all_free() {
    	driver = Driver_setup.launch_Browser();
    	HomePage hp = new HomePage();
    	hp.navigate_to_swaglab_link(driver); 
    	hp.homepage_displayed(driver);
       
    	Signup_page sp = new Signup_page();
    	sp.Enter_correct_cred(driver);
    	
    	Test_it_all_free_page tfp = new Test_it_all_free_page();
    	tfp.Test_it_all_free_form_fillup(driver);
    	tfp.Form_fill(driver);
       }
}
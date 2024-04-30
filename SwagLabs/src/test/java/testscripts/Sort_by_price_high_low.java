package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Signup_page;
import pages.Sorting;
import utils.Driver_setup;

public class Sort_by_price_high_low 
{
	WebDriver driver;
    @Test
    public void Sorting_filter_by_price_high_low() {
    	driver = Driver_setup.launch_Browser();
    	HomePage hp = new HomePage();
    	hp.navigate_to_swaglab_link(driver);
    	hp.homepage_displayed(driver);
       
    	Signup_page sp = new Signup_page();
    	sp.Enter_correct_cred(driver);
    	
    	Sorting s = new Sorting();
    	s.Sorting_by_value_High_Low(driver);
        s.Verify_Page_updated_By_value_High_Low(driver);       
        }
}

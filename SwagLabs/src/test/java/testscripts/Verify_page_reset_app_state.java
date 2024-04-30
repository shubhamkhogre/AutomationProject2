package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Product_page;
import pages.Resest_app_state;
import pages.Signup_page;
import utils.Driver_setup;

public class Verify_page_reset_app_state 
{
	WebDriver driver;
    @Test
    public void Verifying_page_reset_app_state(){
    	driver = Driver_setup.launch_Browser();
    	HomePage hp = new HomePage();
    	hp.navigate_to_swaglab_link(driver); 
    	hp.homepage_displayed(driver);
       
    	Signup_page sp = new Signup_page();
    	sp.Enter_correct_cred(driver);
        
    	Product_page pp = new Product_page();
    	pp.add_products_to_cart(driver);
    	pp.Verify_products_added_cart_details_visible(driver);
    	
    	Resest_app_state ras = new Resest_app_state();
    	ras.Reset_products_from_cart(driver);
    	ras.Verify_products_removed_from_cart(driver);
        }
}
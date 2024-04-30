package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Product_page;
import pages.Signup_page;
import utils.Driver_setup;

public class Place_order 
{
	WebDriver driver;
    @Test
    public void Placing_order() {
    	driver = Driver_setup.launch_Browser();
    	HomePage hp = new HomePage();
    	hp.navigate_to_swaglab_link(driver); 
    	hp.homepage_displayed(driver);
       
    	Signup_page sp = new Signup_page();
    	sp.Enter_correct_cred(driver);
    	
    	Product_page pp = new Product_page();
    	pp.add_products_to_cart(driver);
    	pp.Verify_products_added_cart_details_visible(driver); 
    	pp.Place_order(driver);
    	pp.Verify_before_checkout_overview_details_visible(driver);
    	pp.Verify_checkout_complete_page_visible(driver);
    	
    	sp.Logout(driver);
        }
 }
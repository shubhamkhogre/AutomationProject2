package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Product_page;
import pages.Signup_page;
import utils.Driver_setup;

public class Add_products_in_cart
{
	WebDriver driver;
    @Test
    public void Adding_pro_in_cart() {
    	driver = Driver_setup.launch_Browser();
    	HomePage hp = new HomePage();
    	hp.navigate_to_swaglab_link(driver);
    	hp.homepage_displayed(driver);
       
    	Signup_page sp = new Signup_page();
    	sp.Enter_correct_cred(driver);
       
    	Product_page pp = new Product_page();
    	pp.add_products_to_cart(driver);
    	pp.Verify_products_added_cart_details_visible(driver); 
    	sp.Logout(driver);
       }
}
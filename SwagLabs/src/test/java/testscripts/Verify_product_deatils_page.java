package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Product_page;
import pages.Signup_page;
import utils.Driver_setup;

public class Verify_product_deatils_page
{
	WebDriver driver;
    @Test
    public void Verifying_product_deatils_page() {
    	driver = Driver_setup.launch_Browser();
    	HomePage hp = new HomePage();
    	hp.navigate_to_swaglab_link(driver);
    	hp.homepage_displayed(driver);
       
    	Signup_page sp = new Signup_page();
    	sp.Enter_correct_cred(driver);
    	
    	Product_page pp = new Product_page();
    	pp.product_btn(driver);
    	pp.Verify_product_page_details_visible(driver);
    	
       }
  }
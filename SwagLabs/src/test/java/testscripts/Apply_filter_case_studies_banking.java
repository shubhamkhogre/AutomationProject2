package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Case_studies;
import pages.HomePage;
import pages.Signup_page;
import utils.Driver_setup;

public class Apply_filter_case_studies_banking 
{
	WebDriver driver;
    @Test
    public void Applying_filters_In_case_studies_banking(){
    	driver = Driver_setup.launch_Browser();
    	HomePage hp = new HomePage();
    	hp.navigate_to_swaglab_link(driver); 
    	hp.homepage_displayed(driver);
       
    	Signup_page sp = new Signup_page();
    	sp.Enter_correct_cred(driver);
    	
    	Case_studies cs = new Case_studies();
    	cs.case_studies(driver);
        }
 }
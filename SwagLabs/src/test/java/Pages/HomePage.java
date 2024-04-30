package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage 
{
	  //*****************************Methods*****************************//		
		public void navigate_to_swaglab_link(WebDriver driver) {
		  driver.manage().window().maximize();
		  driver.get("https://www.saucedemo.com");
		}
		public void homepage_displayed(WebDriver driver) {
		  String homepage_act = driver.getTitle();
		  String homepage_exp = "Swag Labs";
		  Assert.assertEquals(homepage_act, homepage_exp,"Homepage not displayed correctly");
		}	
}

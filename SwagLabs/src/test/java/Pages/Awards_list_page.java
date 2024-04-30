package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Awards_list_page 
{
	    //*****************************Locators*****************************//
	       private By menu_btn = By.id("react-burger-menu-btn");
           private By abt_btn = By.id("about_sidebar_link");
           private By award_btn = By.xpath("//a[@href='/company/awards']");
	       private By page = By.xpath("//h2[text()='Awards and recognition']");	
	
	    //*****************************Methods*****************************//
		   public void Awards_list(WebDriver driver) {			 
			 driver.findElement(menu_btn).click();
			 driver.findElement(abt_btn).click();
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,2000)", ""); 
			 driver.findElement(award_btn).click();  			 
		   }
	       public void Verify_awards_page_visible(WebDriver driver) {
	    	 WebElement page_txt = driver.findElement(page);
	    	 Assert.assertTrue(page_txt.isDisplayed(), "Awards page is not visible");
	    	 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,1000)", "");
			 js.executeScript("window.scrollBy(0,1400)", "");			 
	       }	      
      }
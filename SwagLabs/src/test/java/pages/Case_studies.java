package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Case_studies 
{
	   //*****************************Locators*****************************//
	      private By menu_btn = By.id("react-burger-menu-btn");
          private By abt_btn = By.id("about_sidebar_link");
	      private By resource_btn = By.xpath("//*[@id=\"__next\"]/header/div/div/div[1]/div[2]/div/div[5]/div[1]/div[1]/span");
	      private By case_studies = By.xpath("//span[text()='Case studies']");
	      private By filter_btn = By.xpath("//div[text()='Filter']");
	      private By bank_btn = By.xpath("//span[text()='Banking']"); 
	      private By apply_filter = By.xpath("//button[text()='Apply Filters']");
	      private By result = By.xpath("/html/body/div[10]/div[3]/button/svg/path");
	      
	   //*****************************Methods*****************************//
	      public void case_studies(WebDriver driver) {
	    	 driver.findElement(menu_btn).click();
	    	 driver.findElement(abt_btn).click();
	    	 driver.findElement(resource_btn).click();
	    	 driver.findElement(case_studies).click();
	    	 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,500)", "");
			 driver.findElement(filter_btn).click();
			 driver.findElement(bank_btn).click();
			 driver.findElement(apply_filter).click();
	      }
	      public void Verify_filter_result_found_visible(WebDriver driver) {
	    	 WebElement reult = driver.findElement(result);
	    	 Assert.assertTrue(reult.isDisplayed(), "Filter results is not visible");
	      }        
   }
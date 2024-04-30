package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Product_page 
{
	     //*****************************Locators*****************************//
	       private By pro1 = By.xpath("//div[text()='Sauce Labs Backpack']");
	       private By pro_page = By.xpath("//div[@class='inventory_details_desc_container']"); 
	       private By pro1_atc = By.id("add-to-cart");
	       private By back_to_pro = By.id("back-to-products");
	       
	       private By pro2 = By.xpath("//div[text()='Sauce Labs Bike Light']");
	       private By pro2_atc = By.id("add-to-cart");
	       
	       private By cart_container = By.id("shopping_cart_container");
	       private By your_cart = By.xpath("//span[text()='Your Cart']");
	    		   
	       private By remove_pro1 = By.id("remove-sauce-labs-backpack");
	       private By remove_pro2 = By.id("remove-sauce-labs-bike-light");
	       
	       private By chkout_btn = By.id("checkout");
	       private By fname = By.id("first-name");
	       private By lname = By.id("last-name");
	       private By zipcode = By.id("postal-code");
	       private By cont_btn = By.id("continue");
	       private By pro_chkout_page = By.xpath("//span[text()='Checkout: Overview']");
	       private By finish_btn = By.xpath("//button[@name='finish']");
	       private By chkot_complete = By.xpath("//span[text()='Checkout: Complete!']");
	
	    //*****************************Methods*****************************//
	       public void product_btn(WebDriver driver) {
	    	  driver.findElement(pro1).click();
	       }
	       public void Verify_product_page_details_visible(WebDriver driver) {
		      WebElement deatils_page = driver.findElement(pro_page);
		      Assert.assertTrue(deatils_page.isDisplayed(), "Product deatil page is not displayed");
		   }
	       public void add_products_to_cart(WebDriver driver) {
	    	   driver.findElement(pro1).click();
	    	   driver.findElement(pro1_atc).click();
	    	   driver.findElement(back_to_pro).click();
	    	   driver.findElement(pro2).click();
	    	   driver.findElement(pro2_atc).click();
	    	   driver.findElement(cart_container).click();
	    	}
	       public void Verify_products_added_cart_details_visible(WebDriver driver) {
			   WebElement products_details = driver.findElement(your_cart);
			   Assert.assertTrue(products_details.isDisplayed(), "Products added to cart deatils page is not displayed");
		   }
	       public void Remove_products_from_cart(WebDriver driver) {
	    	   driver.findElement(remove_pro1).click();
	    	   driver.findElement(remove_pro2).click();
	       }
	       public void Place_order(WebDriver driver){
	    	   driver.findElement(chkout_btn).click();
	    	   driver.findElement(fname).sendKeys("ajinkya");
	    	   driver.findElement(lname).sendKeys("patil");
	    	   driver.findElement(zipcode).sendKeys("411046");
	    	   driver.findElement(cont_btn).click();	    	    
	       }
	       public void Verify_before_checkout_overview_details_visible(WebDriver driver) {
			   WebElement chkout_details = driver.findElement(pro_chkout_page);
			   Assert.assertTrue(chkout_details.isDisplayed(), "checkout overview deatils page is not displayed");
			   driver.findElement(finish_btn).click();
	       }
	       public void Verify_checkout_complete_page_visible(WebDriver driver) {
			   WebElement chkout_complete = driver.findElement(chkot_complete);
			   Assert.assertTrue(chkout_complete.isDisplayed(), "checkout complete page is not displayed");
	       }
     }       
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Resest_app_state
{
	   //*****************************Locators*****************************//		    	    
         private By cont_btn = By.id("continue-shopping");
         private By menu_btn = By.id("react-burger-menu-btn");
         private By reset_btn = By.id("reset_sidebar_link");
         private By your_cart = By.id("cart_contents_container");
         private By cart_container = By.id("shopping_cart_container");

       //*****************************Methods*****************************//
         public void Reset_products_from_cart(WebDriver driver) {
			driver.findElement(cont_btn).click();
			driver.findElement(menu_btn).click();
			driver.findElement(reset_btn).click();
			driver.findElement(cart_container).click();
		 }
         public void Verify_products_removed_from_cart(WebDriver driver) {
        	WebElement pro_removed = driver.findElement(your_cart);
 			Assert.assertTrue(pro_removed.isDisplayed(), "Products removed from cart is displayed"); 
         }
}
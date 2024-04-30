package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RequestDemo_page 
{
	     //*****************************Locators*****************************//
	       private By menu_btn = By.id("react-burger-menu-btn");
           private By abt_btn = By.id("about_sidebar_link");
	       private By req_demo_btn = By.linkText("Request a demo");
           private By bmail = By.id("Email");
           private By cphnno = By.id("Phone");
           private By intrest = By.id("Solution_Interest__c");
           private By cmnts = By.id("Sales_Contact_Comments__c");  
           private By submit = By.xpath("//button[text()='Get a Demo']");
           private By arrow = By.xpath("//*[@id=\"root\"]/div/button");
           private By verfiy_msg = By.xpath("//h2[text()='Thank you for your request.']");

         //*****************************Methods*****************************// 
           public void Demo_form(WebDriver driver) {
        	 driver.findElement(menu_btn).click();
        	 driver.findElement(abt_btn).click();
        	 driver.findElement(req_demo_btn).click();
        	 driver.findElement(bmail).sendKeys("abc@aa.com");
        	 driver.findElement(cphnno).sendKeys("1234567890");        	 
        	 
        	 Select dropdown = new Select(driver.findElement(By.id("State")));
        	 dropdown.selectByVisibleText("IN");         	
        	 
        	 driver.findElement(intrest).sendKeys("Test Analytics ");
        	 driver.findElement(cmnts).sendKeys("Hii selenium");
        	 driver.findElement(submit).click();     	 
        	 driver.findElement(arrow).click();       	  
           }
           public void Verify_thanks_for_req_msg_visible(WebDriver driver) {
        	 WebElement msg = driver.findElement(verfiy_msg);
        	 Assert.assertTrue(msg.isDisplayed(), "Thanks msg is not displayed");
           }
      }
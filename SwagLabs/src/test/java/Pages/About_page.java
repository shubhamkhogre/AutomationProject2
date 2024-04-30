package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class About_page 
{
	   //*****************************Locators*****************************//
	     private By menu_btn = By.id("react-burger-menu-btn");
	     private By abt_btn = By.id("about_sidebar_link");
	     private By arrow = By.xpath("//*[@id=\"__next\"]/header/div/div/div[1]/div[2]/div/div[5]/div[1]/div[2]/span/img");
	     private By blog_btn = By.xpath("//a[@href='/resources/blog']//child::div[1]");
	     private By read_blog = By.xpath("//span[text()='Read the blog']");	     
	    
	     private By system = By.xpath("//span[text()='Systems status']");
	     private By email = By.id("email");
	     private By sub = By.id("subscribe-btn-email");
	     
	     private By dev_btn = By.xpath("//*[@id=\"__next\"]/header/div/div/div[1]/div[2]/div/div[4]/div[1]/div[1]/span");
	     private By support_btn = By.xpath("//*[@id=\"__next\"]/header/div/div/div[1]/div[2]/div/div[4]/div[2]/div/div[1]/div[1]/div[2]/div[2]/div[3]/a/div");
	     private By search_option = By.xpath("//input[@placeholder='How can we help?']");
	     private By seach_logo = By.xpath("//button[@class='slds-button slds-button_brand search-button']");
	     
	     private By commnty = By.xpath("//a[@href='/resources/community']");
	     private By ok = By.id("onetrust-accept-btn-handler");
	     private By join_btn = By.xpath("//a[@href='https://info.saucelabs.com/get-your-sauce.html']");
	     
	     private By fname = By.id("FirstName");
	     private By lname = By.id("LastName");
	     private By mail = By.id("Email");
	     private By jobtitle = By.id("Title");
	     private By chkbox = By.id("mktoCheckbox_39136_0");
	     private By submit = By.xpath("//button[@type='submit']");	    
	     
	   //*****************************Methods*****************************//     
	      public void SauceLab_blog(WebDriver driver) {
	    	driver.findElement(menu_btn).click();
	    	driver.findElement(abt_btn).click();
	    	driver.findElement(arrow).click();
	    	driver.findElement(blog_btn).click();
	        driver.findElement(read_blog).click();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,600)", ""); 
	      }
	      public void subscription(WebDriver driver) {
	    	driver.findElement(menu_btn).click();
	    	driver.findElement(abt_btn).click();
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,4000)", ""); 
	    	driver.findElement(system).click();	    	
	      }
	      public void subscription_system_status(WebDriver driver) {
		    driver.findElement(menu_btn).click();
		    driver.findElement(abt_btn).click();
		    JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,4000)", ""); 
		    driver.findElement(system).click();	    	
		    driver.findElement(email).sendKeys("aju@gmail.com");
		    driver.findElement(sub).click();
		      }
	      public void Verify_system_status_page_visible(WebDriver driver) {
	        String status = driver.getTitle();
	        System.out.println(status);
	      }
	      public void Support_center_page(WebDriver driver) {
	    	driver.findElement(menu_btn).click();
		    driver.findElement(abt_btn).click();
		    driver.findElement(dev_btn).click();
		    driver.findElement(support_btn).click();
	      }  
		  public void search_data(WebDriver driver) {  
	    	WebElement search = driver.findElement(search_option);
	    	search.click();
	    	driver.findElement(search_option).sendKeys("selenium");
	    	driver.findElement(seach_logo).click();
	      }
		  public void Join_community(WebDriver driver) {
			driver.findElement(menu_btn).click();
			driver.findElement(abt_btn).click();
			driver.findElement(dev_btn).click(); 
			driver.findElement(commnty).click();
	        driver.findElement(ok).click();
			driver.findElement(join_btn).click();			
		  }
		  public void Join_community_form(WebDriver driver) {
			 driver.findElement(fname).sendKeys("ajinkya");
			 driver.findElement(lname).sendKeys("patil");
			 driver.findElement(mail).sendKeys("abc@aa.com");
			 driver.findElement(jobtitle).sendKeys("QA");
			 Select dropdown = new Select(driver.findElement(By.id("State")));
        	 dropdown.selectByVisibleText("India");     
			 driver.findElement(chkbox).click();
			 driver.findElement(submit).click();
		  }
   }
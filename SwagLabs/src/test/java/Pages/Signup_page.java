package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

public class Signup_page
{
	//*****************************Locators*****************************//
	
	  private By username_btn = By.id("user-name");
	  private By pass_btn = By.id("password");
	  private By login_btn = By.id("login-button");	  
	  private By homepage = By.xpath("//div[text()='Swag Labs']");
	  
	  private By menu_btn = By.id("react-burger-menu-btn");
	  private By logout_btn = By.id("logout_sidebar_link");
	  
    //*****************************Methods*****************************//
	
	  public void Enter_correct_cred(WebDriver driver) {
		driver.findElement(username_btn).sendKeys("standard_user");
		driver.findElement(pass_btn).sendKeys("secret_sauce");
		driver.findElement(login_btn).click();  
	  } 
	  public void Verify_homepage_visible(WebDriver driver) {
			WebElement Homepage = driver.findElement(homepage);
			Assert.assertTrue(Homepage.isDisplayed(), "Homepage is not displayed");
	  }	
	  public void Logout(WebDriver driver) {
		    driver.findElement(menu_btn).click();
		    driver.findElement(logout_btn).click();    
	  }
	  public void Enter_incorrect_cred(WebDriver driver) {
			driver.findElement(username_btn).sendKeys("standard_user");
			driver.findElement(pass_btn).sendKeys("secret");
			driver.findElement(login_btn).click();  
	  }
	  public void Verify_error_msg_txt_displayed(WebDriver driver) {
			WebElement Homepage = driver.findElement(homepage);
			Assert.assertTrue(Homepage.isDisplayed(), "Homepage is not displayed");
	  }
	  public void Screenshot_of_invalid_credenial_login(WebDriver driver) throws IOException {
		  TakesScreenshot ss= (TakesScreenshot)driver;
			File source=ss.getScreenshotAs(OutputType.FILE);
			File destination=new File("D:\\Screenshot\\Invalid credential.png");
			FileHandler.copy(source, destination);
	  }
 }
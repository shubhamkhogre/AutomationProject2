package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_it_all_free_page
{
	   //*****************************Locators*****************************//
	     private By menu_btn = By.id("react-burger-menu-btn");
         private By abt_btn = By.id("about_sidebar_link");
	     private By testit = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[1]/div[1]/div/div[4]/div[1]/a/button");
	     private By signUp = By.xpath("//span[text()='Sign up with email']");
	     private By mail = By.id("email");
	     private By name = By.id("username");
	     private By pass = By.id("password");
	     private By chkbox = By.id("subscription");
	     private By submit = By.id("//*[@id=\"__next\"]/div/main/div[1]/form/button");

	   //*****************************Methods*****************************//	
	     public void Test_it_all_free_form_fillup(WebDriver driver) {
	       driver.findElement(menu_btn).click();
	       driver.findElement(abt_btn).click();
	       driver.findElement(testit).click();
	       driver.findElement(signUp).click();
	     }
	     public void Form_fill(WebDriver driver) {
	       driver.findElement(mail).sendKeys("aiaudk@bvj.com");
	       driver.findElement(name).sendKeys("aju");
	       driver.findElement(pass).sendKeys("Aju1.com");
	       driver.findElement(chkbox).click();
	       driver.findElement(submit).click();
	     }	     
}
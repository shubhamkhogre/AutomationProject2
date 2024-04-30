package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Sorting 
{
	  //*****************************Locators*****************************//
	private By option_A_Z = By.xpath("//span[@class='select_container']");
	private By option_Z_A = By.xpath("//option[@value='za']");	
	private By option_H_L = By.xpath("//option[@value='hilo']");
	
	private By page_chng = By.xpath("//div[@class='inventory_list']");	
	
	  //*****************************Methods*****************************//
	public void Sorting_by_name_Z_A(WebDriver driver) {
		driver.findElement(option_A_Z).click();	
		driver.findElement(option_Z_A).click();
	}
	public void Verify_Page_updated_By_name_Z_A(WebDriver driver) {
		WebElement page = driver.findElement(page_chng);
		Assert.assertTrue(page.isDisplayed(), "Page is not updated by name Z-A");
	}
	
	public void Sorting_by_value_High_Low(WebDriver driver) {		
		driver.findElement(option_A_Z).click();	
		driver.findElement(option_H_L).click();
	}
	public void Verify_Page_updated_By_value_High_Low(WebDriver driver) {
		WebElement page = driver.findElement(page_chng);
		Assert.assertTrue(page.isDisplayed(), "Page is not updated by value High-Low");
	}
}

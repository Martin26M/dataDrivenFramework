package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class ShoppingCartPage extends TestBase {

	
	
	
	@FindBy(xpath="//div[@class='buttons clearfix']/div[1]")
	WebElement button;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']/li[4]")
	WebElement Mp3Players;
	
	@FindBy (id="input-sort")
	WebElement DropDown;
	
	public ShoppingCartPage()
	
	{
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void clickbuttonShoppingCart() {
		
		
		 button.click();
		
	}
	
	public void clickMP3PLayer() {
		
		Mp3Players.click();
		
		
	}
	
	public WebElement clickDropDown() {
		
		
		   WebElement e= DropDown;
		   Select s1 = new Select(e);
	      s1.selectByVisibleText("Name (A - Z)");
		  return e;
	}
	
	
}

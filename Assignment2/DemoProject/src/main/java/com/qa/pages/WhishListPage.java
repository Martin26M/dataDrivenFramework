package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;



public class WhishListPage extends TestBase  {
	
	@FindBy(xpath="//input[@name='email']")
	
	WebElement clickemail;
	
	
	
	@FindBy(xpath="//input[@tyoe='password']")
	WebElement clickpassword;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submitButton;

	
      public WhishListPage()
	
	  {
		
		PageFactory.initElements(driver, this);
	
		
		
	}
	
	public void clickemail()
	{
		
		clickemail.sendKeys("Martin");
		
		
	}
	
	public void password()
	{
		
		clickpassword.sendKeys("M@rtin26");
		
		
	}
	
	
	public void LoginButton()
	{
		
		submitButton.click();
		
		
	}
	
	
	
	
	
	
	
	

}

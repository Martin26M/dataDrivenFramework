package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy (xpath="//a[@title='Shopping Cart']")
	@CacheLookup
	WebElement clickcart;
	
	
	@FindBy(id="wishlist-total")
	@CacheLookup
	WebElement clickWishList;
	
	@FindBy(xpath = "//ul[@class='list-inline']/li[2]")
	@CacheLookup
	WebElement clickMyAccount;
	
	@FindBy(xpath="//a[text()='MacBook']//parent::h4//parent::div[@class='caption']//following-sibling::div/button[1]")
	@CacheLookup
	WebElement AddToCart;
	
	@FindBy(id="cart")
	WebElement cartTotal;
	
	@FindBy(xpath="//i[contains(@class,'fa fa-share')]//parent::strong//parent::a")
	WebElement checkoutbutton;
	
	public HomePage() {
		
		
		PageFactory.initElements(driver, this);
	}
	
	
	public ShoppingCartPage   clickShoppingCart() {
		
		
		  clickcart.click();
		  return new ShoppingCartPage();
		
		 
	}
	

	public String  clickWhishList() {
		
        return  clickWishList.getText();
		
	
	
	
	}
	  
	public WhishListPage  clickOnWhishList() {
		
		clickWishList.click();
	
		  return new WhishListPage();
	
	}
	
     public String clickMyAccount() {
		
         return  clickMyAccount.getText();
		
	
		
	}

     public boolean AddtoCart() {
    	 
    	 
    	 AddToCart.click();
    	 return true;
    	 
     }
     
     public void clckCartTotal() {
    	 
    	 WebDriverWait w = new WebDriverWait(driver, 10);
    	 w.until(ExpectedConditions.visibilityOf(cartTotal));
    	 cartTotal.click();
    	 WebDriverWait w1 = new WebDriverWait(driver, 10);
    	 w1.until(ExpectedConditions.visibilityOf(checkoutbutton));
    	 checkoutbutton.click();
    	 
     }
	
	
}

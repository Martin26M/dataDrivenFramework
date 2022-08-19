package com.qa.testcases;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.ShoppingCartPage;
import com.qa.utils.TestUtil;

import junit.framework.Assert;

public class CartPageTest extends TestBase {
	
	ShoppingCartPage sp;
	HomePage hp;
	TestUtil util;
	
	public CartPageTest() {
		
		
		super();
	}
	
	
	@BeforeTest
public void setUp() {
		
		Intialize() ;
		hp = new HomePage();
	     hp.clickShoppingCart();
		 sp = new ShoppingCartPage();
		 util= new TestUtil();
	}


@Test

public void clickcontinueTest() {
	
	
//     sp.clickbuttonShoppingCart();
//     sp.clickMP3PLayer();
//     sp.clickDropDown();
//
//     util.reports();
	
	Assert.assertEquals(true, false);
}


}


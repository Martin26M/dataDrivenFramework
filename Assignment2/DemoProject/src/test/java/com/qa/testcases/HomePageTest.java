package com.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.ShoppingCartPage;
import com.qa.pages.WhishListPage;
import com.qa.utils.TestUtil;

import junit.framework.Assert;

public class HomePageTest  extends TestBase {
	
	HomePage hm;
	ShoppingCartPage sp;
	TestUtil util;
	
	SoftAssert softassert = new SoftAssert();
	
public HomePageTest() throws IOException {
		
		super();
		
	}
	
	@BeforeTest
	
	
	public void setUp() throws IOException {
		
		Intialize() ;
		hm  = new HomePage();
		util.readExcel("Sheet1");
	}
	
//	@Test(priority=2)
//	
//	public void MyAccountTest() {
//		
//	String s = hm.clickMyAccount();
//
//	Assert.assertEquals(s, "My Account");
//
//	}
	
    @Test(priority=1)
	
	public void WhisListTest() {
    	
 String s1=   hm.clickWhishList();
     Assert.assertEquals(s1, "Wish List (0)");
	
	}
    
//    @Test (priority=3)
//    
//    public void ClickShoppingCartTest() {
//    	
//   	
//    	sp=hm.clickShoppingCart();
//    	
//    }
    
    @Test(priority=4)
    
    public void AddingtoCartTest() {
    	JavascriptExecutor js =  (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,800)");
    	
    
    	for (int i=0;i<3;i++) {
    	hm.AddtoCart();
    	Assert.assertTrue(true);
    	
    	softassert.assertTrue(true);// checking with softassert
    	
    	
    	hm.clckCartTotal();
    	softassert.assertAll();// need to give this if we want to show that the test case has failed.
    	
    	}
    }
//
//@AfterTest 
//
//public void tearDown() {
//	
//	driver.close();
//
//	
//}
}

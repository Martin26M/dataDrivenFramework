package com.qa.testcases;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.WhishListPage;
import com.qa.utils.TestUtil;

public class WishListTest extends TestBase {
	
	HomePage hm;
	WhishListPage wp;
	Map<String, String> map;
	TestUtil util;
	
	
	
	public  WishListTest()  {
	    super();
	    
	}
	
	@BeforeTest
	public void SetUp() throws IOException {
		
		
		Intialize() ;
		
		hm= new HomePage();
		hm.clickOnWhishList();
		wp= new WhishListPage();
		util= new TestUtil();
		map=util.readExcel("Test");
	
	}
	
	
	@Test
	public void ReturningCustomer () {
		System.out.println(map.get("Name"));
//		wp.clickemail();
//		wp.password();
//		wp.LoginButton();
		
	}
	
	
	

}

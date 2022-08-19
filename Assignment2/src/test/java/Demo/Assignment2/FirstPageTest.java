package Demo.Assignment2;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class FirstPageTest extends TestBase{

	FirstPage fp;
	
	public FirstPageTest() throws IOException {
		super();
		
	}
	
	@BeforeTest
	
    public void firstPage() throws IOException {
		
		Intialize() ;
		fp= new FirstPage();
		
		
	}
	
	
//	@Test
//	
//	public void firstcase() {
//		
//		
//   fp.clickonIfRame();
//	}
	
//	@Test
//	public void SecondCase() {
//		
//		fp.clickonIfRame();
//		
//	String text= 	fp.checkText();
//	
//	 Assert.assertEquals("TinyMCE", text);
//  
//  
//		
//	}
	

//	@Test
//	
//	public void ThirdCase() {
//		
//	fp.clickonIfRame();
//		fp.clearText();
//		
//	}

//	@Test
//	
//	public void FourthCase() {
//		
//		fp.clickonIfRame();
//		String text = fp.getboxText();
//		Assert.assertEquals("File", text);
//		
//	}
	
////	
//	@Test
//	
//	public void FifthTest() {
//		fp.clickonIfRame();
//		fp.sendText();
//		
//	}
	
	
	@Test
	
	public void SixthTest() {
		
		fp.clickonIfRame();
		fp.sendText();
	 
		fp.HoverMenu();
		
	}
	
	
//	@Test
//	
//	public void SeventhTest() {
//		fp.clickonIfRame();
//	String url  =	fp.checkElement();
//		
//	Assert.assertEquals(url, "http://elementalselenium.com/ ");
//	}
	
//	
//	@Test
//	
//	public void navigate() {
//		
//		fp.clickonIfRame();
//		
//		fp.navigatingBack();
//	}

	
	@AfterTest
	
	public void TearDown() {
		
		driver.close();
	}
}

package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utils.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public  TestBase()  {
		
		try {
	  prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\DemoProject\\src\\main\\java\\com\\qa\\base\\data.properties");
		
	  
		prop.load(fis);
		}
		
		catch(FileNotFoundException e ){
			
			e.printStackTrace();
			
		}
		catch (IOException e)
		{
			
			e.printStackTrace();
		}
	}
		
		public static void Intialize() 
		
		{
	   String BrowserName = 	prop.getProperty("browser");
		
		if(BrowserName.equalsIgnoreCase("Chrome"))
			
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			  driver = new ChromeDriver();
			
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicitly_wait, TimeUnit.SECONDS);// This is coming from Testutil class.
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	
	
	


}

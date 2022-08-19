package Demo.Assignment2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static Properties prop;
	
	public static WebDriver driver;
	public TestBase() throws IOException {
		
		prop  = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\data.properties");
		
	 	prop.load(fis);
		
	}
	
	public void Intialize() {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	

}

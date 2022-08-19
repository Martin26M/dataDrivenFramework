package Demo.Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickCheck {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.id("username")).sendKeys("Martin");
		driver.findElement(By.id("username")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		driver.findElement(By.id("username")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.id("password")).sendKeys(Keys.chord(Keys.CONTROL,"v"));

	}

}

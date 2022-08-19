package Demo.Assignment2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class resizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
		Set<String> windows  = driver.getWindowHandles();
		
		
	Iterator<String> it = 	windows.iterator();
		
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		
		String success =driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText();
		
		System.out.println(success);
	
	}

}

package Demo.Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/slider");
		
		WebElement ele = driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
	//	WebElement val = driver.findElement(By.id("sliderValue"));
	 //  driver.findElement(By.xpath(""))args.
		Actions a = new Actions(driver);
   a.dragAndDropBy(ele, 0, 50).build().perform();
		
	}

}

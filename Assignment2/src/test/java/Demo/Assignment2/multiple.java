package Demo.Assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoqa.com/radio-button");
		
	List<WebElement> radio = driver.findElements(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']"));
	
	for (int i = 0 ; i< radio.size(); i ++) {
		
		
		WebElement button = radio.get(i);
		
		if (button.getText().equalsIgnoreCase("Impressive")) {
			
			button.click();
			
		}
		
		
	}

	}

}

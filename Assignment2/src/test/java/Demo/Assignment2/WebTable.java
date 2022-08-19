package Demo.Assignment2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoqa.com/webtables");
		List<WebElement> rows= driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
		int rowsize=  rows.size();
		
		
		List<WebElement> cols =	driver.findElements(By.xpath("//div[@class='rt-tr-group']/div/div"));
		
	
	
		
	
		for (WebElement data : cols) {
			
	
			String datas = data.getText();
		
		System.out.print(datas+" ");
		}
		System.out.println("");
	
		
	
		
	}

}

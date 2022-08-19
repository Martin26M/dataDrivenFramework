package Demo.Assignment2;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.interactions.Actions;
public class FirstPage extends TestBase{
	
	public FirstPage() throws IOException{
		
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//a[text()='iFrame']")
	WebElement iFrame;
	
	@FindBy(xpath="//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']")
	WebElement getText;
	
	
	@FindBy (xpath="//a[text()='Elemental Selenium']")
	WebElement sel;
	
	@FindBy (xpath ="//div[@class='tox-menubar']")
	
	WebElement menubar;
	
	public void clickonIfRame() {
		
		iFrame.click();
		
	}
	
	public String checkText() {
		
		String s ="";
		String m =getText.getText();
		
		if (m.contains("TinyMCE")) {
			
			s+="TinyMCE";
		}
		return s;
	}
	
	public void clearText() {
		
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.xpath("//p[text()='Your content goes here.']")).clear();
		driver.findElement(By.id("tinymce")).sendKeys(System.getProperty("text"));
	}
	
	public String  getboxText() {
		
		String s="";
		String menu = driver.findElement(By.xpath("//div[@role='menubar']")).getText();
		
		if (menu.contains("File")) {
			
			 s = "File";
		}
		return s;
	}
	
	public void sendText() {
		
		
			
			driver.switchTo().frame("mce_0_ifr");
			driver.findElement(By.xpath("//p[text()='Your content goes here.']")).clear();
			driver.findElement(By.xpath("//body[@class='mce-content-body ']")).sendKeys("check");
			
		
	}
	
	public void HoverMenu() {
		
	
		WebElement e= driver.findElement( By.xpath("//span[text()='Format']"));
	   WebDriverWait w = new WebDriverWait(driver, 100);
		w.until(ExpectedConditions.visibilityOf(e));
		
		driver.findElement( By.xpath("//span[text()='Format']")).click();
		
		
//		Actions a = new Actions (driver);
//		
//	   a.moveToElement(driver.findElement(By.xpath("//div[text()='Formats']"))).build().perform();
//		a.moveToElement(driver.findElement(By.xpath("//div[text()='Headings']"))).build().perform();
//		driver.findElement(By.xpath("//h1[text()='Heading 1']")).click();
		
	}
	
	public String checkElement() {
		
		
		sel.click();
		String url =driver.getCurrentUrl();
		return url;
	
	}
	
	public void  navigatingBack() {
		
		sel.click();
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it= windows.iterator();
		
		String parentid = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		driver.close();
		
		driver.switchTo().window(parentid);
		driver.navigate().back();
		
	}

}

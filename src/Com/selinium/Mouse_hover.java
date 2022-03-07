package Com.selinium;

import java.awt.AWTException;  
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) throws AWTException, InterruptedException {
		


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement sign = driver.findElement(By.id("nav-link-accountList")); 
		Actions web = new Actions(driver);
		web.moveToElement(sign).perform();
		Thread.sleep(2000);
	
		WebElement account = driver.findElement(By.linkText("Your Account"));
		Actions element = new Actions(driver);
	    element.contextClick(account).perform();
		Thread.sleep(2000);
	    
	    Robot r = new Robot();
	    
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);		
	    Thread.sleep(2000);
//	    
//	    r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);

        r.keyPress(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	
	  
	    
	    
	}
}

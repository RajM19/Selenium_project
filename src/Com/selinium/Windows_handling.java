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

public class Windows_handling {
	
     
	public static void main(String[] args) throws InterruptedException, AWTException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		
		WebElement account = driver.findElement(By.linkText("Live Scores"));
		Actions element = new Actions(driver);
	    element.contextClick(account).perform();
		
		Robot r = new Robot();
	    
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);		
	    r.keyPress(KeyEvent.VK_ENTER);

        Set<String> handle = driver.getWindowHandles();
	    
	    ArrayList<String> a = new ArrayList<String>(handle);
	    String page = driver.switchTo().window(a.get(0)).getCurrentUrl();
	    System.out.println(page);
		
		
	}

}

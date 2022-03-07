
package Com.selinium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Concept {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.id("email"));
		
		user.sendKeys("muthurajmv2@gmail.com");

		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		
		pass.sendKeys("Muthuraj@07");
		
		Thread.sleep(2000);

		WebElement login = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		
		login.click();
		
		Thread.sleep(3000);
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\vigne\\eclipse-workspace\\Selenium_project\\Screenshot\\faceook.png");
	
		FileUtils.copyFile(screenshot, path);
		
		
		
	}
	
	

}

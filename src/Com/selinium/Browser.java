package Com.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com");
		
		driver.navigate().back();
		
		driver.navigate().to("https://www.amazon.in");

		driver.navigate().forward();
		
		driver.navigate().to("https://www.instagram.com");
		
		driver.navigate().to("https://reddit.com");
		
		driver.navigate().to("https://facebook.com");
	
	
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("muthuraj");
		
		
     	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("password");
		
		
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		
       String currentUrl = driver.getCurrentUrl();
       System.out.println(currentUrl);
	
       String pageSource = driver.getPageSource();
       System.out.println(pageSource);
       
       String title = driver.getTitle();
       System.out.println(title);
       
       driver.close();
       
	}
}
  
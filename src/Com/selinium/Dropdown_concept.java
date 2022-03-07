package Com.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_concept {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("Muthuraj");
		Thread.sleep(2000);
		
		WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		surname.sendKeys("M");		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("7530016613");
		
		driver.findElement(By.id("password_step_input")).sendKeys("password");
		
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
	//	d.selectByIndex(20);
	//	d.selectByValue("19");
		d.selectByVisibleText("19");
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByIndex(0);
	//	m.selectByValue("1");
	//	m.selectByVisibleText("Jan");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByIndex(24);
//		y.selectByValue("1998");
//		y.selectByVisibleText("1998");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}

}

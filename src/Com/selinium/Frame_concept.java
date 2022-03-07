package Com.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_concept {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		WebElement single = driver.findElement(By.id("singleframe"));
		
		driver.switchTo().frame(single);
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='text']"));
		
		pass.sendKeys("Arigato");
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement iframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		
		iframe.click();
		
		
		WebElement next = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		
		driver.switchTo().frame(next);
		
		Thread.sleep(2000);
		
		WebElement next2 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		
		driver.switchTo().frame(next2);
		
		Thread.sleep(2000);
		
		WebElement pass2 = driver.findElement(By.xpath("//input[@type='text']"));
		
		pass2.sendKeys("Good Day");
		
		
		
	}
}

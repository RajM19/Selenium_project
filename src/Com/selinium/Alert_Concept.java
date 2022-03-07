package Com.selinium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Concept {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vigne\\\\eclipse-workspace\\\\Selenium_project\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		//Simple
		
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		// Confirm alert
		
	    driver.findElement(By.linkText("Alert with OK & Cancel")).click();
				
		WebElement confirmation = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		
		confirmation.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		// Prompt ALert
		
		WebElement textbox = driver.findElement(By.linkText("Alert with Textbox"));
		
		textbox.click();
		
		Thread.sleep(2000);
		
		//WebElement get = driver.findElement(By.linkText("click the button to demonstrate the prompt box"));
		
		WebElement get = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		
		get.click();
		
		Thread.sleep(2000);
		
	
		
		Alert a = driver.switchTo().alert();
		a.sendKeys("Batman");
		a.accept();

		
			
		
	}

}

package Com.selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		
		WebElement multiple = driver.findElement(By.id("multi-select"));
		Select s = new Select(multiple);
		boolean m = s.isMultiple();
		System.out.println("Multiple Dropdown: "+m);
		
		System.out.println("-----------------------------All Options--------------------------");
				
		List<WebElement> alloptions = s.getOptions();
		for (WebElement web : alloptions) {
		System.out.println(web.getText());
		}
		
		System.out.println("----------------------------Size----------------------------");
		
		int size = alloptions.size();
		System.out.println(size);
		
		for (int i = 0; i < size; i++) {
			if (i==1 || i==3 || i==6) {
			s.selectByIndex(i);
				}
			}
		
		System.out.println("------------------------------Selected Options--------------------------");
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement web : allSelectedOptions) {
				System.out.println(web.getText());
		}
		
	}
}

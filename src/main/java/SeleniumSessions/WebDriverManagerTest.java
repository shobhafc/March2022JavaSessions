package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {
	static WebDriver driver;

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com");
	String title = driver.getTitle();
	System.out.println("Page Title:" + title);
	
	
	
	
	
	
	
	
	
	

	}

}

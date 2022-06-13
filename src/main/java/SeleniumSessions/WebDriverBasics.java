package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
	//1.Launch browser : Chrome
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//Launch Browser
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println("Page Title:" + title);
		
		//checkpoint/verification/expected Vs actual result
		
		if (title.equals("Google")) {
			System.out.println("Correct title");
		}else
		{
			System.out.println("Incorrect title");
		}
	
		//automation testing --> Automation steps + Verification

	}

}

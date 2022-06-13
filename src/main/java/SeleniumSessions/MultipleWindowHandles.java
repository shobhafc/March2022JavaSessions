package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		String parentWindowId = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.com");
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on facebook']")).click();

	}

}

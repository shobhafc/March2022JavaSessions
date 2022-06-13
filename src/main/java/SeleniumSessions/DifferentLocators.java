package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class DifferentLocators {
  static WebDriver driver;
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		By email = By.name("email");
		By password = By.name("Password");
		By loginBtn = By.name("//*[@id=\"content\"]/div/div[2]/div/form/input");
		doSendKeys(email,"test@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"])")).sendKeys("test@gmail");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	
		doSendKeys(email,"test@gmail.com");
		doSendKeys(password,"test");
		doClick(loginBtn);
		
		//driver.findElement(loginBtn) Selector = #input-email
		
			//	#content > div > div:nth-child(2) > div > form > input
				
			//	/html/body/div[2]/div/div/div/div[2]/div/form/input
		
		driver.findElement(By.linkText("Register")).click();
		
		String text = driver.findElement(By.linkText("Register")).getText();
		System.out.println(text);
		
		By RegisterLink = By.linkText("Register");
		if(doGetText(RegisterLink).equals("Register")){
			System.out.println("PASS");
		};
		
		driver.findElement(By.partialLinkText("Forgotten")).click();
	}
	
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	
		
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	
}

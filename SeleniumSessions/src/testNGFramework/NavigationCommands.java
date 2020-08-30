package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommands {
	WebDriver driver;

	@Test
	public void a_pageLoad() {
	System.setProperty("webdriver.chrome.driver", "chromedriver");
    driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	}
	
	//Registration
		@Test
		public void b_navigation() throws InterruptedException 
		{
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);
		driver.navigate().to("https://www.google.co.in/");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		}
}

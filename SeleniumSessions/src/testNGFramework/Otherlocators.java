package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Otherlocators {

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
	public void b_login() throws InterruptedException 
	{
	driver.findElement(By.linkText("Sign in")).click();
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("#email")).sendKeys("august12098@yopmail.com");
	driver.findElement(By.cssSelector("#passwd")).sendKeys("Passw0rd$123");
	driver.findElement(By.id("SubmitLogin")).click();
	}
}

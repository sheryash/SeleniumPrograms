package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoStore {
WebDriver driver;

//PageLoad//

@Test
public void a_pageLoad() {
	System.setProperty("webdriver.chrome.driver", "chromedriver");
	driver = new ChromeDriver();
	driver.get("https://demostore.x-cart.com");
	driver.manage().window().maximize();
}

@Test
public void b_signUp() {
	driver.findElement(By.xpath("(//span[contains(text(),'Sign in')])[2]")).click();
	//driver.findElement(By.xpath("//a[@class='popup-button default-popup-button create-account-link']")).click();
}
}

package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_m")).sendKeys("aug3mon@yopmail.com");
		driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("Password");
		driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("1234567890");
	
		driver.findElement(By.id("password_step_input")).sendKeys("Hello");
		Select date = new Select(driver.findElement(By.id(("day"))));
		date.selectByVisibleText("15");
		Select month = new Select(driver.findElement(By.id(("month"))));
		month.selectByVisibleText("Dec");
		Select year = new Select(driver.findElement(By.id(("year"))));
		year.selectByVisibleText("2010");
		WebElement gender= driver.findElement(By.id("u_0_9"));
		gender.click();
		WebElement signup= driver.findElement(By.id("u_0_13"));
		signup.click();
		
	}

}

package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DBankDemo {
	WebDriver driver;
	// PageLoad//

	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("http://dbankdemo.com/login");
		driver.manage().window().maximize();
	}

	@Test
	public void b_SignUp() {
		driver.findElement(By.xpath("//a[contains(text(),' Sign Up Here')]")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test
	public void c_EnteringDetails() throws InterruptedException {
		Select title = new Select(driver.findElement(By.id("title")));
		title.selectByVisibleText("Mrs.");
		driver.findElement(By.id("firstName")).sendKeys("Ashwin");
		driver.findElement(By.id("lastName")).sendKeys("Kutty");
		WebElement gender = driver.findElement(By.id("gender"));
		gender.click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB, "30/12/2000").build().perform();
		act.sendKeys(Keys.TAB, "327-45-6789").build().perform();
		act.sendKeys(Keys.TAB, "aug176@yopmail.com").build().perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.TAB, "Aug14yop").build().perform();
		act.sendKeys(Keys.TAB, "Aug14yop").build().perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.ENTER).build().perform();
		act.sendKeys(Keys.TAB,"343 hello street").build().perform();
		act.sendKeys(Keys.TAB, "Madras City").build().perform();
		act.sendKeys(Keys.TAB, "TN").build().perform();
		act.sendKeys(Keys.TAB, "23456").build().perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.TAB, "US").build().perform();
		act.sendKeys(Keys.TAB, "(767) 392-5436").build().perform();
		act.sendKeys(Keys.TAB, "(717) 692-5436").build().perform();
		Thread.sleep(5000);
	}
	
	//@Test
	//public void d_registrationNextPage() throws InterruptedException
	//{
	//Thread.sleep(5000);
	//Actions act1 = new Actions(driver);
	//act1.sendKeys(Keys.SPACE).build().perform();
	//act1.sendKeys(Keys.ENTER).build().perform();
//}
}

package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GoogleExplicitWait {
	WebDriver driver;

	// pageLoad//

	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver", "ChromeDriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}

	@Test
	public void b_searchPage() throws InterruptedException {
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Ashwin");
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();

	}

	@Test
	public void c_navigatetoPage() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'Ravichandran Ashwin Profile - ICC Ranking, Age, Ca')]"))).click();
	}

}

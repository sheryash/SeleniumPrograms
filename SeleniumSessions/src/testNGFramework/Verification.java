package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verification {
	WebDriver driver;

	// pageLoad//

	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver", "ChromeDriver");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/default.aspx");
		driver.manage().window().maximize();
	}

	//VerifyRadioButton//
	
	@Test
	public void b_Verification() throws InterruptedException {
		Thread.sleep(10000);
		Boolean radiocheck = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled();
        System.out.println(radiocheck);	
        WebElement round = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		round.click();
		Boolean Roundtripcheck = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled();
		System.out.println(Roundtripcheck);
		WebElement Student = driver.findElement(By.xpath("//label[contains(text(),'Student')]"));
		Student.click();
		Thread.sleep(5000);
		Boolean Student1 = Student.isEnabled();
		System.out.println(Student1);
		Boolean Print = driver.findElement(By.className("text-label")).isDisplayed();
		System.out.println(Print);
		String covid = driver.findElement(By.className("text-label")).getText();
		System.out.println(covid);
		
		Thread.sleep(5000);
		driver.quit();
		
	
	}
		
}
